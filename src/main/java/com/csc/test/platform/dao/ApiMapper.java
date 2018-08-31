package com.csc.test.platform.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.csc.test.platform.model.Api;
import com.csc.test.platform.model.ApiExample;
import com.csc.test.platform.model.ApiKey;
import com.csc.test.platform.model.ApiWithBLOBs;

public interface ApiMapper {
    long countByExample(ApiExample example);

    int deleteByExample(ApiExample example);

    int deleteByPrimaryKey(ApiKey key);

    int insert(ApiWithBLOBs record);

    int insertSelective(ApiWithBLOBs record);

    List<ApiWithBLOBs> selectByExampleWithBLOBs(ApiExample example);

    List<Api> selectByExample(ApiExample example);

    ApiWithBLOBs selectByPrimaryKey(ApiKey key);

    int updateByExampleSelective(@Param("record") ApiWithBLOBs record, @Param("example") ApiExample example);

    int updateByExampleWithBLOBs(@Param("record") ApiWithBLOBs record, @Param("example") ApiExample example);

    int updateByExample(@Param("record") Api record, @Param("example") ApiExample example);

    int updateByPrimaryKeySelective(ApiWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ApiWithBLOBs record);

    int updateByPrimaryKey(Api record);
}