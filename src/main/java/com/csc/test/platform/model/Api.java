package com.csc.test.platform.model;

import java.util.Date;

public class Api extends ApiKey {
    private String apiname;

    private Byte apiprotocol;

    private Byte apirequesttype;

    private Byte apisuccessmocktype;

    private Byte apifailuremocktype;

    private Byte apistatus;

    private Date apiupdatetime;

    private Integer projectid;

    private Byte starred;

    private Byte removed;

    private Date removetime;

    private Byte apinotetype;

    private Byte apirequestparamtype;

    private Integer updateuserid;

    private String apisuccessstatuscode;

    private String apifailurestatuscode;

    public String getApiname() {
        return apiname;
    }

    public void setApiname(String apiname) {
        this.apiname = apiname == null ? null : apiname.trim();
    }

    public Byte getApiprotocol() {
        return apiprotocol;
    }

    public void setApiprotocol(Byte apiprotocol) {
        this.apiprotocol = apiprotocol;
    }

    public Byte getApirequesttype() {
        return apirequesttype;
    }

    public void setApirequesttype(Byte apirequesttype) {
        this.apirequesttype = apirequesttype;
    }

    public Byte getApisuccessmocktype() {
        return apisuccessmocktype;
    }

    public void setApisuccessmocktype(Byte apisuccessmocktype) {
        this.apisuccessmocktype = apisuccessmocktype;
    }

    public Byte getApifailuremocktype() {
        return apifailuremocktype;
    }

    public void setApifailuremocktype(Byte apifailuremocktype) {
        this.apifailuremocktype = apifailuremocktype;
    }

    public Byte getApistatus() {
        return apistatus;
    }

    public void setApistatus(Byte apistatus) {
        this.apistatus = apistatus;
    }

    public Date getApiupdatetime() {
        return apiupdatetime;
    }

    public void setApiupdatetime(Date apiupdatetime) {
        this.apiupdatetime = apiupdatetime;
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public Byte getStarred() {
        return starred;
    }

    public void setStarred(Byte starred) {
        this.starred = starred;
    }

    public Byte getRemoved() {
        return removed;
    }

    public void setRemoved(Byte removed) {
        this.removed = removed;
    }

    public Date getRemovetime() {
        return removetime;
    }

    public void setRemovetime(Date removetime) {
        this.removetime = removetime;
    }

    public Byte getApinotetype() {
        return apinotetype;
    }

    public void setApinotetype(Byte apinotetype) {
        this.apinotetype = apinotetype;
    }

    public Byte getApirequestparamtype() {
        return apirequestparamtype;
    }

    public void setApirequestparamtype(Byte apirequestparamtype) {
        this.apirequestparamtype = apirequestparamtype;
    }

    public Integer getUpdateuserid() {
        return updateuserid;
    }

    public void setUpdateuserid(Integer updateuserid) {
        this.updateuserid = updateuserid;
    }

    public String getApisuccessstatuscode() {
        return apisuccessstatuscode;
    }

    public void setApisuccessstatuscode(String apisuccessstatuscode) {
        this.apisuccessstatuscode = apisuccessstatuscode == null ? null : apisuccessstatuscode.trim();
    }

    public String getApifailurestatuscode() {
        return apifailurestatuscode;
    }

    public void setApifailurestatuscode(String apifailurestatuscode) {
        this.apifailurestatuscode = apifailurestatuscode == null ? null : apifailurestatuscode.trim();
    }
}