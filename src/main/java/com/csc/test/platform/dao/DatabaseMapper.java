package com.csc.test.platform.dao;

import com.csc.test.platform.model.Database;
import com.csc.test.platform.model.DatabaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DatabaseMapper {
    long countByExample(DatabaseExample example);

    int deleteByExample(DatabaseExample example);

    int deleteByPrimaryKey(Integer dbid);

    int insert(Database record);

    int insertSelective(Database record);

    List<Database> selectByExample(DatabaseExample example);

    Database selectByPrimaryKey(Integer dbid);

    int updateByExampleSelective(@Param("record") Database record, @Param("example") DatabaseExample example);

    int updateByExample(@Param("record") Database record, @Param("example") DatabaseExample example);

    int updateByPrimaryKeySelective(Database record);

    int updateByPrimaryKey(Database record);
}