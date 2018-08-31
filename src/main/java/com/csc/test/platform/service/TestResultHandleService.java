package com.csc.test.platform.service;

import javax.validation.constraints.NotNull;

import com.github.fge.jsonschema.core.report.ProcessingReport;

public interface TestResultHandleService {

    public ProcessingReport resultValidation(@NotNull String actualResult, @NotNull int schemaId);
}
