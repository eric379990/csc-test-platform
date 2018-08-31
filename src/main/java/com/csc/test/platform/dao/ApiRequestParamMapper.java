package com.csc.test.platform.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.csc.test.platform.model.ApiRequestParam;
import com.csc.test.platform.model.ApiRequestParamExample;

public interface ApiRequestParamMapper {
    long countByExample(ApiRequestParamExample example);

    int deleteByExample(ApiRequestParamExample example);

    int deleteByPrimaryKey(Integer paramid);

    int insert(ApiRequestParam record);

    int insertSelective(ApiRequestParam record);

    List<ApiRequestParam> selectByExampleWithBLOBs(ApiRequestParamExample example);

    List<ApiRequestParam> selectByExample(ApiRequestParamExample example);

    ApiRequestParam selectByPrimaryKey(Integer paramid);

    int updateByExampleSelective(@Param("record") ApiRequestParam record, @Param("example") ApiRequestParamExample example);

    int updateByExampleWithBLOBs(@Param("record") ApiRequestParam record, @Param("example") ApiRequestParamExample example);

    int updateByExample(@Param("record") ApiRequestParam record, @Param("example") ApiRequestParamExample example);

    int updateByPrimaryKeySelective(ApiRequestParam record);

    int updateByPrimaryKeyWithBLOBs(ApiRequestParam record);

    int updateByPrimaryKey(ApiRequestParam record);
}