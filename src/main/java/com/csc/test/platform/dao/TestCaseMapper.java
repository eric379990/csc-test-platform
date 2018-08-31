package com.csc.test.platform.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.csc.test.platform.model.TestCase;
import com.csc.test.platform.model.TestCaseExample;
import com.csc.test.platform.model.TestCaseKey;

public interface TestCaseMapper {
    long countByExample(TestCaseExample example);

    int deleteByExample(TestCaseExample example);

    int deleteByPrimaryKey(TestCaseKey key);

    int insert(TestCase record);

    int insertSelective(TestCase record);

    List<TestCase> selectByExampleWithBLOBs(TestCaseExample example);

    List<TestCase> selectByExample(TestCaseExample example);

    TestCase selectByPrimaryKey(TestCaseKey key);

    int updateByExampleSelective(@Param("record") TestCase record, @Param("example") TestCaseExample example);

    int updateByExampleWithBLOBs(@Param("record") TestCase record, @Param("example") TestCaseExample example);

    int updateByExample(@Param("record") TestCase record, @Param("example") TestCaseExample example);

    int updateByPrimaryKeySelective(TestCase record);

    int updateByPrimaryKeyWithBLOBs(TestCase record);

    int updateByPrimaryKey(TestCase record);
}