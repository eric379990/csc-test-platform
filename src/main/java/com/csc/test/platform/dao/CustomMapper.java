package com.csc.test.platform.dao;

import java.util.List;
import java.util.Map;

import com.csc.test.platform.model.Api;
import com.csc.test.platform.model.ApiEnv;

public interface CustomMapper {

    Api selectApiInfoByApiId(int apiId);

    ApiEnv selectEnvInfoByEnvId(int envId);

    List<Map<String, Object>> selectTestCaseDataByApiId(int apiId);

    List<Integer> selectTestCaseIdsByGroupIds(List<Integer> groupIds);
}