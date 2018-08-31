package com.csc.test.platform.model;

import java.util.Date;

public class TestExecutionHistory {
    private Integer executionid;

    private Date testtime;

    private Byte status;

    private Integer userid;

    private Integer projectid;

    private String comments;

    public Integer getExecutionid() {
        return executionid;
    }

    public void setExecutionid(Integer executionid) {
        this.executionid = executionid;
    }

    public Date getTesttime() {
        return testtime;
    }

    public void setTesttime(Date testtime) {
        this.testtime = testtime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }
}