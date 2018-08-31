package com.csc.test.platform.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.csc.test.platform.model.ApiHeader;
import com.csc.test.platform.model.ApiHeaderExample;

public interface ApiHeaderMapper {
    long countByExample(ApiHeaderExample example);

    int deleteByExample(ApiHeaderExample example);

    int deleteByPrimaryKey(Integer headerid);

    int insert(ApiHeader record);

    int insertSelective(ApiHeader record);

    List<ApiHeader> selectByExampleWithBLOBs(ApiHeaderExample example);

    List<ApiHeader> selectByExample(ApiHeaderExample example);

    ApiHeader selectByPrimaryKey(Integer headerid);

    int updateByExampleSelective(@Param("record") ApiHeader record, @Param("example") ApiHeaderExample example);

    int updateByExampleWithBLOBs(@Param("record") ApiHeader record, @Param("example") ApiHeaderExample example);

    int updateByExample(@Param("record") ApiHeader record, @Param("example") ApiHeaderExample example);

    int updateByPrimaryKeySelective(ApiHeader record);

    int updateByPrimaryKeyWithBLOBs(ApiHeader record);

    int updateByPrimaryKey(ApiHeader record);
}