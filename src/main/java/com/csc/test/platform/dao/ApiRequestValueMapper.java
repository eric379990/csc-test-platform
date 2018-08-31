package com.csc.test.platform.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.csc.test.platform.model.ApiRequestValue;
import com.csc.test.platform.model.ApiRequestValueExample;

public interface ApiRequestValueMapper {
    long countByExample(ApiRequestValueExample example);

    int deleteByExample(ApiRequestValueExample example);

    int deleteByPrimaryKey(Integer valueid);

    int insert(ApiRequestValue record);

    int insertSelective(ApiRequestValue record);

    List<ApiRequestValue> selectByExampleWithBLOBs(ApiRequestValueExample example);

    List<ApiRequestValue> selectByExample(ApiRequestValueExample example);

    ApiRequestValue selectByPrimaryKey(Integer valueid);

    int updateByExampleSelective(@Param("record") ApiRequestValue record, @Param("example") ApiRequestValueExample example);

    int updateByExampleWithBLOBs(@Param("record") ApiRequestValue record, @Param("example") ApiRequestValueExample example);

    int updateByExample(@Param("record") ApiRequestValue record, @Param("example") ApiRequestValueExample example);

    int updateByPrimaryKeySelective(ApiRequestValue record);

    int updateByPrimaryKeyWithBLOBs(ApiRequestValue record);

    int updateByPrimaryKey(ApiRequestValue record);
}