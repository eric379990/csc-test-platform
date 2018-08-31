package com.csc.test.platform.model;

public class TestCaseGroup extends TestCaseGroupKey {
    private String groupname;

    private Byte ischild;

    private Integer sqlid;

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }

    public Byte getIschild() {
        return ischild;
    }

    public void setIschild(Byte ischild) {
        this.ischild = ischild;
    }

    public Integer getSqlid() {
        return sqlid;
    }

    public void setSqlid(Integer sqlid) {
        this.sqlid = sqlid;
    }
}