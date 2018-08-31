package com.csc.test.platform.model;

public class TestSql {
    private Integer sqlid;

    private String comments;

    private Byte scripttype;

    private Integer dbid;

    private String script;

    public Integer getSqlid() {
        return sqlid;
    }

    public void setSqlid(Integer sqlid) {
        this.sqlid = sqlid;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public Byte getScripttype() {
        return scripttype;
    }

    public void setScripttype(Byte scripttype) {
        this.scripttype = scripttype;
    }

    public Integer getDbid() {
        return dbid;
    }

    public void setDbid(Integer dbid) {
        this.dbid = dbid;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script == null ? null : script.trim();
    }
}