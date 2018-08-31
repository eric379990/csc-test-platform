package com.csc.test.platform.dao;

import com.csc.test.platform.model.TestCaseGroup;
import com.csc.test.platform.model.TestCaseGroupExample;
import com.csc.test.platform.model.TestCaseGroupKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestCaseGroupMapper {
    long countByExample(TestCaseGroupExample example);

    int deleteByExample(TestCaseGroupExample example);

    int deleteByPrimaryKey(TestCaseGroupKey key);

    int insert(TestCaseGroup record);

    int insertSelective(TestCaseGroup record);

    List<TestCaseGroup> selectByExample(TestCaseGroupExample example);

    TestCaseGroup selectByPrimaryKey(TestCaseGroupKey key);

    int updateByExampleSelective(@Param("record") TestCaseGroup record, @Param("example") TestCaseGroupExample example);

    int updateByExample(@Param("record") TestCaseGroup record, @Param("example") TestCaseGroupExample example);

    int updateByPrimaryKeySelective(TestCaseGroup record);

    int updateByPrimaryKey(TestCaseGroup record);
}