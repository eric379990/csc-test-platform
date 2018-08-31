package com.csc.test.platform.model;

public class ApiGroup extends ApiGroupKey {
    private String groupname;

    private Integer parentgroupid;

    private Byte ischild;

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }

    public Integer getParentgroupid() {
        return parentgroupid;
    }

    public void setParentgroupid(Integer parentgroupid) {
        this.parentgroupid = parentgroupid;
    }

    public Byte getIschild() {
        return ischild;
    }

    public void setIschild(Byte ischild) {
        this.ischild = ischild;
    }
}