package com.csc.test.platform.model;

public class ApiEnv extends ApiEnvKey {
    private String envname;

    private String url;

    private String port;

    public String getEnvname() {
        return envname;
    }

    public void setEnvname(String envname) {
        this.envname = envname == null ? null : envname.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port == null ? null : port.trim();
    }
}