package com.csc.test.platform.model;

public class ApiRequestValue {
    private Integer valueid;

    private String valuedescription;

    private Integer paramid;

    private Integer rowno;

    private String value;

    public Integer getValueid() {
        return valueid;
    }

    public void setValueid(Integer valueid) {
        this.valueid = valueid;
    }

    public String getValuedescription() {
        return valuedescription;
    }

    public void setValuedescription(String valuedescription) {
        this.valuedescription = valuedescription == null ? null : valuedescription.trim();
    }

    public Integer getParamid() {
        return paramid;
    }

    public void setParamid(Integer paramid) {
        this.paramid = paramid;
    }

    public Integer getRowno() {
        return rowno;
    }

    public void setRowno(Integer rowno) {
        this.rowno = rowno;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}