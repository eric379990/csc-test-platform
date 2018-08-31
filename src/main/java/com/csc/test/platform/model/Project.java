package com.csc.test.platform.model;

import java.util.Date;

public class Project {
    private Integer projectid;

    private Byte projecttype;

    private String projectname;

    private Date projectupdatetime;

    private String projectversion;

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public Byte getProjecttype() {
        return projecttype;
    }

    public void setProjecttype(Byte projecttype) {
        this.projecttype = projecttype;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public Date getProjectupdatetime() {
        return projectupdatetime;
    }

    public void setProjectupdatetime(Date projectupdatetime) {
        this.projectupdatetime = projectupdatetime;
    }

    public String getProjectversion() {
        return projectversion;
    }

    public void setProjectversion(String projectversion) {
        this.projectversion = projectversion == null ? null : projectversion.trim();
    }
}