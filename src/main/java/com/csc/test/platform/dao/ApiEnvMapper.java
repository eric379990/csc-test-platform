package com.csc.test.platform.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.csc.test.platform.model.ApiEnv;
import com.csc.test.platform.model.ApiEnvExample;
import com.csc.test.platform.model.ApiEnvKey;

public interface ApiEnvMapper {
    long countByExample(ApiEnvExample example);

    int deleteByExample(ApiEnvExample example);

    int deleteByPrimaryKey(ApiEnvKey key);

    int insert(ApiEnv record);

    int insertSelective(ApiEnv record);

    List<ApiEnv> selectByExample(ApiEnvExample example);

    ApiEnv selectByPrimaryKey(ApiEnvKey key);

    int updateByExampleSelective(@Param("record") ApiEnv record, @Param("example") ApiEnvExample example);

    int updateByExample(@Param("record") ApiEnv record, @Param("example") ApiEnvExample example);

    int updateByPrimaryKeySelective(ApiEnv record);

    int updateByPrimaryKey(ApiEnv record);
}