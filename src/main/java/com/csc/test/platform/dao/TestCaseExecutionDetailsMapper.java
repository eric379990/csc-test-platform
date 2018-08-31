package com.csc.test.platform.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.csc.test.platform.model.TestCaseExecutionDetails;
import com.csc.test.platform.model.TestCaseExecutionDetailsExample;
import com.csc.test.platform.model.TestCaseExecutionDetailsWithBLOBs;

public interface TestCaseExecutionDetailsMapper {
    long countByExample(TestCaseExecutionDetailsExample example);

    int deleteByExample(TestCaseExecutionDetailsExample example);

    int deleteByPrimaryKey(Integer testid);

    int insert(TestCaseExecutionDetailsWithBLOBs record);

    int insertSelective(TestCaseExecutionDetailsWithBLOBs record);

    List<TestCaseExecutionDetailsWithBLOBs> selectByExampleWithBLOBs(TestCaseExecutionDetailsExample example);

    List<TestCaseExecutionDetails> selectByExample(TestCaseExecutionDetailsExample example);

    TestCaseExecutionDetailsWithBLOBs selectByPrimaryKey(Integer testid);

    int updateByExampleSelective(@Param("record") TestCaseExecutionDetailsWithBLOBs record, @Param("example") TestCaseExecutionDetailsExample example);

    int updateByExampleWithBLOBs(@Param("record") TestCaseExecutionDetailsWithBLOBs record, @Param("example") TestCaseExecutionDetailsExample example);

    int updateByExample(@Param("record") TestCaseExecutionDetails record, @Param("example") TestCaseExecutionDetailsExample example);

    int updateByPrimaryKeySelective(TestCaseExecutionDetailsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TestCaseExecutionDetailsWithBLOBs record);

    int updateByPrimaryKey(TestCaseExecutionDetails record);
}