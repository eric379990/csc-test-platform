package com.csc.test.platform.service;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import com.csc.test.platform.model.ApiEnv;
import com.csc.test.platform.model.TestCase;

public interface TestExecutionService {

    /**
     * @param userId
     * @param projectId
     * @param envId
     * @param idMap
     * @param comments
     * @return execution status
     * @throws ParseException
     */
    public int testExecute(int userId, int projectId, int envId, Map<String, List<Integer>> idMap, 
            String comments) throws ParseException;

    /**
     * @param tc
     * @param env
     * @param exeId
     * @param userId
     * @throws ParseException
     */
    public void executeTestCase(TestCase tc, ApiEnv env, int exeId, int userId) throws ParseException;
}
