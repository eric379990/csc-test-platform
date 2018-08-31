package com.csc.test.platform.dao;

import com.csc.test.platform.model.TestSql;
import com.csc.test.platform.model.TestSqlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestSqlMapper {
    long countByExample(TestSqlExample example);

    int deleteByExample(TestSqlExample example);

    int deleteByPrimaryKey(Integer sqlid);

    int insert(TestSql record);

    int insertSelective(TestSql record);

    List<TestSql> selectByExampleWithBLOBs(TestSqlExample example);

    List<TestSql> selectByExample(TestSqlExample example);

    TestSql selectByPrimaryKey(Integer sqlid);

    int updateByExampleSelective(@Param("record") TestSql record, @Param("example") TestSqlExample example);

    int updateByExampleWithBLOBs(@Param("record") TestSql record, @Param("example") TestSqlExample example);

    int updateByExample(@Param("record") TestSql record, @Param("example") TestSqlExample example);

    int updateByPrimaryKeySelective(TestSql record);

    int updateByPrimaryKeyWithBLOBs(TestSql record);

    int updateByPrimaryKey(TestSql record);
}