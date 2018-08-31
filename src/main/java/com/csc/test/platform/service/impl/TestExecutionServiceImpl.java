package com.csc.test.platform.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.csc.test.platform.constants.TestExecutionConstants;
import com.csc.test.platform.dao.ApiHeaderMapper;
import com.csc.test.platform.dao.CustomMapper;
import com.csc.test.platform.dao.DatabaseMapper;
import com.csc.test.platform.dao.TestCaseExecutionDetailsMapper;
import com.csc.test.platform.dao.TestCaseGroupMapper;
import com.csc.test.platform.dao.TestCaseMapper;
import com.csc.test.platform.dao.TestExecutionHistoryMapper;
import com.csc.test.platform.dao.TestSqlMapper;
import com.csc.test.platform.model.Api;
import com.csc.test.platform.model.ApiEnv;
import com.csc.test.platform.model.ApiHeader;
import com.csc.test.platform.model.ApiHeaderExample;
import com.csc.test.platform.model.Database;
import com.csc.test.platform.model.DatabaseExample;
import com.csc.test.platform.model.TestCase;
import com.csc.test.platform.model.TestCaseExample;
import com.csc.test.platform.model.TestCaseExecutionDetailsWithBLOBs;
import com.csc.test.platform.model.TestCaseGroup;
import com.csc.test.platform.model.TestCaseGroupExample;
import com.csc.test.platform.model.TestExecutionHistory;
import com.csc.test.platform.model.TestSql;
import com.csc.test.platform.model.TestSqlExample;
import com.csc.test.platform.service.TestExecutionService;
import com.csc.test.platform.service.TestResultHandleService;
import com.csc.test.platform.utils.DbUtils;
import com.csc.test.platform.utils.NetworkUtils;
import com.github.fge.jsonschema.core.report.ProcessingReport;

@Service
public class TestExecutionServiceImpl implements TestExecutionService{

    private static final Logger LOGGER = LoggerFactory.getLogger(TestExecutionServiceImpl.class);

    @Autowired
    private TestResultHandleService testResultHandleService;

    @Autowired
    private ApiHeaderMapper apiHeaderMapper;
    
    @Autowired
    private TestCaseMapper testCaseMapper;

    @Autowired
    private TestSqlMapper testSqlMapper;

    @Autowired
    private DatabaseMapper databaseMapper;

    @Autowired
    private TestCaseGroupMapper testCaseGroupMapper;

    @Autowired
    private TestCaseExecutionDetailsMapper testCaseExecutionDetailsMapper;

    @Autowired
    private TestExecutionHistoryMapper testExecutionHistoryMapper;

    @Autowired
    private CustomMapper customMapper;

    private SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式

    public int testExecute(int userId, int projectId, int envId, 
            Map<String, List<Integer>> idMap, String comments) throws ParseException {
        if(userId>0 && projectId>0 && envId>0 && !idMap.isEmpty()) {
            //Create test execution history
            TestExecutionHistory history = new TestExecutionHistory();
            history.setProjectid(projectId);
            history.setTesttime(df.parse(df.format(new Date())));
            history.setUserid(userId);
            history.setComments(comments);
            testExecutionHistoryMapper.insert(history);
            if(history.getExecutionid()==null) {
                LOGGER.error("Create test history record error!");
                return 1;
            }

            //Get the environment info
            ApiEnv env = customMapper.selectEnvInfoByEnvId(envId);
            if(env==null||env.getUrl().isEmpty()) {
                LOGGER.error("Environment error: "+env);
                return 1;
            }

            //Execute group cases
            if(idMap.containsKey("group")) {
                List<Integer> groupIds = idMap.get("group");
                if(groupIds!=null && !groupIds.isEmpty()) {
                    for(int id : groupIds) {
                        executeGroupTest(id, env, history.getExecutionid(), userId);
                    }
                }
            }
            //Execute single cases
            if(idMap.containsKey("case")) {
                List<Integer> caseIds = idMap.get("case");
                if(caseIds!=null && !caseIds.isEmpty()) {
                    TestCaseExample example = new TestCaseExample();
                    TestCaseExample.Criteria criteria = example.createCriteria();
                    criteria.andCaseidIn(caseIds);
                    List<TestCase> caseList = testCaseMapper.selectByExample(example);
                    if(caseList!=null && !caseList.isEmpty())
                        for(TestCase tc : caseList) {
                            executeTestCase(tc, env, history.getExecutionid(), userId);
                        }
                }
            }
        }else {
            LOGGER.error("Test execution error, userId:"+userId+", projectId:"+projectId+", envId:"+envId+","
                    + " idMap:"+idMap);
            return 1;
        }
        return 0;
    }

    /**
     * Execute the test group
     * @param groupID
     * @throws ParseException 
     */
    private void executeGroupTest(int groupID, ApiEnv env, int exeId, int userId) throws ParseException {
        LOGGER.info("Start to execute the test group groupid:"+groupID+" environment:"+env.getUrl()+" userId:"+userId);
        TestCaseGroupExample ex1 = new TestCaseGroupExample();
        TestCaseGroupExample.Criteria cr1 = ex1.createCriteria();
        cr1.andGroupidEqualTo(groupID);
        List<TestCaseGroup> groupList = testCaseGroupMapper.selectByExample(ex1);
        if(groupList!=null&&!groupList.isEmpty()) {
            TestCaseGroup group = groupList.get(0);
            if(group.getSqlid()>0) {
                LOGGER.info("Execute group sql setup script, group id: "+group.getGroupid()+"; sqlId:"+group.getSqlid());
                executeSqlScript(group.getSqlid());
            }

            TestCaseExample example = new TestCaseExample();
            TestCaseExample.Criteria criteria = example.createCriteria();
            criteria.andGroupidEqualTo(groupID);
            List<TestCase> caseList = testCaseMapper.selectByExample(example);
            for(TestCase tc : caseList) {
                executeTestCase(tc, env, exeId, userId);
            }

            TestCaseGroupExample ex2 = new TestCaseGroupExample();
            TestCaseGroupExample.Criteria cr2 = ex2.createCriteria();
            cr2.andParentgroupidEqualTo(groupID);
            List<TestCaseGroup> subGroupList = testCaseGroupMapper.selectByExample(ex2);
            if(subGroupList!=null&&!subGroupList.isEmpty()) {
                for(TestCaseGroup subGroup : subGroupList) {
                    //Recursion call to execute sub group test cases
                    executeGroupTest(subGroup.getGroupid(), env, exeId, userId);
                }
            }
        }
    }

    /**
     * Execute setup sql script
     * @param sql
     */
    private boolean executeSqlScript(int sqlId) {
        TestSql sql = testSqlMapper.selectByPrimaryKey(sqlId);
        if(sql!=null&&sql.getScript()!=null&&sql.getDbid()>0) {
            Database db = databaseMapper.selectByPrimaryKey(sql.getDbid());
            //Execute sql script in db
            if(sql.getScripttype() == 1&db!=null) {
                String sqlScript = sql.getScript();
                return DbUtils.executeSql(db.getUrl(), db.getUsername(), db.getPassword(), sqlScript);
            }
            //Execute sql script in source folder
            else if(sql.getScripttype() == 2) {
                return true;
            }
        }
        return false;
    }

    public void executeTestCase(TestCase tc, ApiEnv env, int exeId, int userId) throws ParseException {
        if(tc!=null && env!=null && exeId>0 && tc.getApiid()>0 && !env.getUrl().isEmpty()) {
            //Get Api info
            Api api = customMapper.selectApiInfoByApiId(tc.getApiid());
            String url = NetworkUtils.formatUrl(env, api);
            List<ApiHeader> headerList = getApiHeaderListByApiId(api.getApiid());

            if(tc.getSqlid()!=null && tc.getSqlid()>0) {
                LOGGER.info("Execute testcase sql setup script, testCase id: "+tc.getCaseid()+"; sqlId:"+tc.getSqlid());
                executeSqlScript(tc.getSqlid());
            }

            //Get test data
            List<List<Map<String, String>>> testDataList = getAllTestDataOfApi(api.getApiid());
            if(testDataList!=null&&!testDataList.isEmpty()) {
                for(List<Map<String, String>> params : testDataList) {
                    //Create test case execution record
                    TestCaseExecutionDetailsWithBLOBs caseExe = new TestCaseExecutionDetailsWithBLOBs();
                    caseExe.setExecutionid(exeId);
                    caseExe.setGroupid(tc.getGroupid());
                    caseExe.setProjectid(tc.getProjectid());
                    caseExe.setApiid(tc.getApiid());
                    caseExe.setUserid(userId);
                    caseExe.setCaseid(tc.getCaseid());
                    caseExe.setStarttime(df.parse(df.format(new Date())));
                    testCaseExecutionDetailsMapper.insert(caseExe);

                    Map<String, Object> result = NetworkUtils.sendHttpRequest(TestExecutionConstants.HttpRequestType.getName(api.getApirequesttype()), 
                            url, headerList, params);
                    if(result!=null&&!result.isEmpty()) {
                        result.containsKey("schemaId");
                        Map<String, Object> testResult = (Map<String, Object>) result.get("testResult");
                        String body = (String) testResult.get("body");
                        int schemaId = (int) result.get("schemaId");
                        ProcessingReport report = testResultHandleService.resultValidation(body, schemaId);
                        caseExe.setRequestinfo((String) result.get("request"));
                        JSONObject resultJson = new JSONObject();
                        resultJson.put("responseBody", body);
                        if(report!=null&&report.isSuccess()) {
                            resultJson.put("result", "SUCCESS");
                            caseExe.setStatus((byte)1);
                            caseExe.setResult(resultJson.toJSONString());
                        }else {
                            resultJson.put("result", "FAIL");
                            resultJson.put("errormsg", report.toString().substring(report.toString().indexOf("--- BEGIN MESSAGES ---")+23,
                                    report.toString().indexOf("---  END MESSAGES  ---")-1));
                            caseExe.setStatus((byte)2);
                            caseExe.setResult(resultJson.toJSONString());
                        }
                    }
                    caseExe.setEndtime(df.parse(df.format(new Date())));
                    testCaseExecutionDetailsMapper.updateByPrimaryKeySelective(caseExe);
                }
            }else {
                LOGGER.error("No test data defined for case id:" + tc.getCaseid());
            }
        }else {
            LOGGER.error("No api defined for the test case or environment not set.");
        }
    }

    private List<TestCase> getTestCaseListByTestCaseGroupId(int testCaseGroupId){
        TestCaseExample example = new TestCaseExample();
        TestCaseExample.Criteria criteria = example.createCriteria();
        criteria.andGroupidEqualTo(testCaseGroupId);
        return testCaseMapper.selectByExample(example);
    }

    private List<ApiHeader> getApiHeaderListByApiId(int apiId){
        ApiHeaderExample example = new ApiHeaderExample();
        ApiHeaderExample.Criteria criteria = example.createCriteria();
        criteria.andApiidEqualTo(apiId);
        return apiHeaderMapper.selectByExample(example);
    }

    private List<List<Map<String, String>>> getAllTestDataOfApi(Integer apiID) {
        List<Map<String, Object>> caseDataList = customMapper.selectTestCaseDataByApiId(apiID);
        List<List<Map<String, String>>> resultList = new ArrayList<>();
        if(caseDataList!=null && !caseDataList.isEmpty()) {
            int currentRow = (int) caseDataList.get(0).get("rowNo");
            List<Map<String, String>> paramList = new ArrayList<>();
            for(Map<String, Object> map : caseDataList) {
                int rowNo = (int) map.get("rowNo");
                Map<String, String> paramMap = new HashMap<String, String>();
                paramMap.put("key", (String) map.get("paramKey"));
                paramMap.put("value", (String) map.get("value"));
                if(rowNo == currentRow) {
                    paramList.add(paramMap);
                }else {
                    resultList.add(paramList);
                    paramList = new ArrayList<>();
                    paramList.add(paramMap);
                    currentRow = rowNo;
                }
            }
            resultList.add(paramList);
        }
        return resultList;
    }

}
