package com.csc.test.platform.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.csc.test.platform.model.ApiGroup;
import com.csc.test.platform.model.ApiGroupExample;
import com.csc.test.platform.model.ApiGroupKey;

public interface ApiGroupMapper {
    long countByExample(ApiGroupExample example);

    int deleteByExample(ApiGroupExample example);

    int deleteByPrimaryKey(ApiGroupKey key);

    int insert(ApiGroup record);

    int insertSelective(ApiGroup record);

    List<ApiGroup> selectByExample(ApiGroupExample example);

    ApiGroup selectByPrimaryKey(ApiGroupKey key);

    int updateByExampleSelective(@Param("record") ApiGroup record, @Param("example") ApiGroupExample example);

    int updateByExample(@Param("record") ApiGroup record, @Param("example") ApiGroupExample example);

    int updateByPrimaryKeySelective(ApiGroup record);

    int updateByPrimaryKey(ApiGroup record);
}