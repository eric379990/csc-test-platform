package com.csc.test.platform.model;

import java.util.Date;

public class TestCase extends TestCaseKey {
    private String casename;

    private String casedesc;

    private Date createtime;

    private Date updatetime;

    private Integer groupid;

    private Byte casetype;

    private Integer apiid;

    private Integer sqlid;

    private String casecode;

    public String getCasename() {
        return casename;
    }

    public void setCasename(String casename) {
        this.casename = casename == null ? null : casename.trim();
    }

    public String getCasedesc() {
        return casedesc;
    }

    public void setCasedesc(String casedesc) {
        this.casedesc = casedesc == null ? null : casedesc.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public Byte getCasetype() {
        return casetype;
    }

    public void setCasetype(Byte casetype) {
        this.casetype = casetype;
    }

    public Integer getApiid() {
        return apiid;
    }

    public void setApiid(Integer apiid) {
        this.apiid = apiid;
    }

    public Integer getSqlid() {
        return sqlid;
    }

    public void setSqlid(Integer sqlid) {
        this.sqlid = sqlid;
    }

    public String getCasecode() {
        return casecode;
    }

    public void setCasecode(String casecode) {
        this.casecode = casecode == null ? null : casecode.trim();
    }
}