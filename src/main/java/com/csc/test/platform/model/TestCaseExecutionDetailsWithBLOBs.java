package com.csc.test.platform.model;

public class TestCaseExecutionDetailsWithBLOBs extends TestCaseExecutionDetails {
    private String requestinfo;

    private String result;

    public String getRequestinfo() {
        return requestinfo;
    }

    public void setRequestinfo(String requestinfo) {
        this.requestinfo = requestinfo == null ? null : requestinfo.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }
}