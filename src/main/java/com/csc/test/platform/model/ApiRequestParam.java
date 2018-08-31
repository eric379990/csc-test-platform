package com.csc.test.platform.model;

public class ApiRequestParam {
    private Integer paramid;

    private String paramname;

    private String paramkey;

    private Byte paramtype;

    private String paramlimit;

    private Integer apiid;

    private Byte paramnotnull;

    private String paramvalue;

    public Integer getParamid() {
        return paramid;
    }

    public void setParamid(Integer paramid) {
        this.paramid = paramid;
    }

    public String getParamname() {
        return paramname;
    }

    public void setParamname(String paramname) {
        this.paramname = paramname == null ? null : paramname.trim();
    }

    public String getParamkey() {
        return paramkey;
    }

    public void setParamkey(String paramkey) {
        this.paramkey = paramkey == null ? null : paramkey.trim();
    }

    public Byte getParamtype() {
        return paramtype;
    }

    public void setParamtype(Byte paramtype) {
        this.paramtype = paramtype;
    }

    public String getParamlimit() {
        return paramlimit;
    }

    public void setParamlimit(String paramlimit) {
        this.paramlimit = paramlimit == null ? null : paramlimit.trim();
    }

    public Integer getApiid() {
        return apiid;
    }

    public void setApiid(Integer apiid) {
        this.apiid = apiid;
    }

    public Byte getParamnotnull() {
        return paramnotnull;
    }

    public void setParamnotnull(Byte paramnotnull) {
        this.paramnotnull = paramnotnull;
    }

    public String getParamvalue() {
        return paramvalue;
    }

    public void setParamvalue(String paramvalue) {
        this.paramvalue = paramvalue == null ? null : paramvalue.trim();
    }
}