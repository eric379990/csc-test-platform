package com.csc.test.platform.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.csc.test.platform.model.ApiSchema;
import com.csc.test.platform.model.ApiSchemaExample;

public interface ApiSchemaMapper {
    long countByExample(ApiSchemaExample example);

    int deleteByExample(ApiSchemaExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(ApiSchema record);

    int insertSelective(ApiSchema record);

    List<ApiSchema> selectByExampleWithBLOBs(ApiSchemaExample example);

    List<ApiSchema> selectByExample(ApiSchemaExample example);

    ApiSchema selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") ApiSchema record, @Param("example") ApiSchemaExample example);

    int updateByExampleWithBLOBs(@Param("record") ApiSchema record, @Param("example") ApiSchemaExample example);

    int updateByExample(@Param("record") ApiSchema record, @Param("example") ApiSchemaExample example);

    int updateByPrimaryKeySelective(ApiSchema record);

    int updateByPrimaryKeyWithBLOBs(ApiSchema record);

    int updateByPrimaryKey(ApiSchema record);
}