package com.csc.test.platform.model;

public class ApiKey {
    private Integer apiid;

    private Integer groupid;

    private String apiuri;

    public Integer getApiid() {
        return apiid;
    }

    public void setApiid(Integer apiid) {
        this.apiid = apiid;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public String getApiuri() {
        return apiuri;
    }

    public void setApiuri(String apiuri) {
        this.apiuri = apiuri == null ? null : apiuri.trim();
    }
}