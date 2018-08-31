package com.csc.test.platform.model;

public class ApiWithBLOBs extends Api {
    private String apifailuremock;

    private String apisuccessmock;

    private String apinoteraw;

    private String apinote;

    private String apirequestraw;

    private String mockrule;

    private String mockresult;

    private String mockconfig;

    private String beforeinject;

    private String afterinject;

    public String getApifailuremock() {
        return apifailuremock;
    }

    public void setApifailuremock(String apifailuremock) {
        this.apifailuremock = apifailuremock == null ? null : apifailuremock.trim();
    }

    public String getApisuccessmock() {
        return apisuccessmock;
    }

    public void setApisuccessmock(String apisuccessmock) {
        this.apisuccessmock = apisuccessmock == null ? null : apisuccessmock.trim();
    }

    public String getApinoteraw() {
        return apinoteraw;
    }

    public void setApinoteraw(String apinoteraw) {
        this.apinoteraw = apinoteraw == null ? null : apinoteraw.trim();
    }

    public String getApinote() {
        return apinote;
    }

    public void setApinote(String apinote) {
        this.apinote = apinote == null ? null : apinote.trim();
    }

    public String getApirequestraw() {
        return apirequestraw;
    }

    public void setApirequestraw(String apirequestraw) {
        this.apirequestraw = apirequestraw == null ? null : apirequestraw.trim();
    }

    public String getMockrule() {
        return mockrule;
    }

    public void setMockrule(String mockrule) {
        this.mockrule = mockrule == null ? null : mockrule.trim();
    }

    public String getMockresult() {
        return mockresult;
    }

    public void setMockresult(String mockresult) {
        this.mockresult = mockresult == null ? null : mockresult.trim();
    }

    public String getMockconfig() {
        return mockconfig;
    }

    public void setMockconfig(String mockconfig) {
        this.mockconfig = mockconfig == null ? null : mockconfig.trim();
    }

    public String getBeforeinject() {
        return beforeinject;
    }

    public void setBeforeinject(String beforeinject) {
        this.beforeinject = beforeinject == null ? null : beforeinject.trim();
    }

    public String getAfterinject() {
        return afterinject;
    }

    public void setAfterinject(String afterinject) {
        this.afterinject = afterinject == null ? null : afterinject.trim();
    }
}