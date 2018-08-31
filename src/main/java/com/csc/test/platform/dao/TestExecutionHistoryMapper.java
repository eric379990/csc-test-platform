package com.csc.test.platform.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.csc.test.platform.model.TestExecutionHistory;
import com.csc.test.platform.model.TestExecutionHistoryExample;

public interface TestExecutionHistoryMapper {
    long countByExample(TestExecutionHistoryExample example);

    int deleteByExample(TestExecutionHistoryExample example);

    int deleteByPrimaryKey(Integer executionid);

    int insert(TestExecutionHistory record);

    int insertSelective(TestExecutionHistory record);

    List<TestExecutionHistory> selectByExampleWithBLOBs(TestExecutionHistoryExample example);

    List<TestExecutionHistory> selectByExample(TestExecutionHistoryExample example);

    TestExecutionHistory selectByPrimaryKey(Integer executionid);

    int updateByExampleSelective(@Param("record") TestExecutionHistory record, @Param("example") TestExecutionHistoryExample example);

    int updateByExampleWithBLOBs(@Param("record") TestExecutionHistory record, @Param("example") TestExecutionHistoryExample example);

    int updateByExample(@Param("record") TestExecutionHistory record, @Param("example") TestExecutionHistoryExample example);

    int updateByPrimaryKeySelective(TestExecutionHistory record);

    int updateByPrimaryKeyWithBLOBs(TestExecutionHistory record);

    int updateByPrimaryKey(TestExecutionHistory record);
}