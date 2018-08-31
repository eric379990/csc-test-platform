package com.csc.test.platform.controller;

import org.springframework.web.bind.annotation.RestController;

import com.csc.test.platform.service.TestExecutionService;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TestController {

    @Autowired
    private TestExecutionService testExecutionService;

    @SuppressWarnings("unchecked")
    @RequestMapping("/")
    public String index() throws ParseException {
        Map<String, List<Integer>> testIds = new HashMap<String, List<Integer>>();
        List<Integer> groupId = new ArrayList<Integer>();
        groupId.add(1);
        testIds.put("group", groupId);
        testExecutionService.testExecute(1, 1, 1, testIds, null);
        return "Hello from test agent!";
    }

}
