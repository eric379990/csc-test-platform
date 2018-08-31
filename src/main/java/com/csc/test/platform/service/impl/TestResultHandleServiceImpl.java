package com.csc.test.platform.service.impl;

import java.io.IOException;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc.test.platform.dao.ApiSchemaMapper;
import com.csc.test.platform.model.ApiSchema;
import com.csc.test.platform.model.ApiSchemaKey;
import com.csc.test.platform.service.TestResultHandleService;
import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jackson.JsonLoader;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

@Service
public class TestResultHandleServiceImpl implements TestResultHandleService{

    private final static JsonSchemaFactory factory = JsonSchemaFactory.byDefault();

    @Autowired
    ApiSchemaMapper apiSchemaMapper;

    public ProcessingReport resultValidation(@NotNull String actualResult, @NotNull int schemaId) {
        try {
            ApiSchema schema = apiSchemaMapper.selectByPrimaryKey(schemaId);
            JsonNode mainNode = JsonLoader.fromString(schema.getContent());
            JsonNode instanceNode = JsonLoader.fromString(actualResult);
            JsonSchema jsonSchema = factory.getJsonSchema(mainNode);
            ProcessingReport processingReport = jsonSchema.validate(instanceNode);
            return processingReport;
        } catch (ProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

}
