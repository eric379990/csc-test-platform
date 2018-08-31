package com.csc.test.platform.model;

public class ApiHeader {
    private Integer headerid;

    private String headername;

    private Integer apiid;

    private String headervalue;

    public Integer getHeaderid() {
        return headerid;
    }

    public void setHeaderid(Integer headerid) {
        this.headerid = headerid;
    }

    public String getHeadername() {
        return headername;
    }

    public void setHeadername(String headername) {
        this.headername = headername == null ? null : headername.trim();
    }

    public Integer getApiid() {
        return apiid;
    }

    public void setApiid(Integer apiid) {
        this.apiid = apiid;
    }

    public String getHeadervalue() {
        return headervalue;
    }

    public void setHeadervalue(String headervalue) {
        this.headervalue = headervalue == null ? null : headervalue.trim();
    }
}