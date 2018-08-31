package com.csc.test.platform.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApiExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andApiidIsNull() {
            addCriterion("apiID is null");
            return (Criteria) this;
        }

        public Criteria andApiidIsNotNull() {
            addCriterion("apiID is not null");
            return (Criteria) this;
        }

        public Criteria andApiidEqualTo(Integer value) {
            addCriterion("apiID =", value, "apiid");
            return (Criteria) this;
        }

        public Criteria andApiidNotEqualTo(Integer value) {
            addCriterion("apiID <>", value, "apiid");
            return (Criteria) this;
        }

        public Criteria andApiidGreaterThan(Integer value) {
            addCriterion("apiID >", value, "apiid");
            return (Criteria) this;
        }

        public Criteria andApiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("apiID >=", value, "apiid");
            return (Criteria) this;
        }

        public Criteria andApiidLessThan(Integer value) {
            addCriterion("apiID <", value, "apiid");
            return (Criteria) this;
        }

        public Criteria andApiidLessThanOrEqualTo(Integer value) {
            addCriterion("apiID <=", value, "apiid");
            return (Criteria) this;
        }

        public Criteria andApiidIn(List<Integer> values) {
            addCriterion("apiID in", values, "apiid");
            return (Criteria) this;
        }

        public Criteria andApiidNotIn(List<Integer> values) {
            addCriterion("apiID not in", values, "apiid");
            return (Criteria) this;
        }

        public Criteria andApiidBetween(Integer value1, Integer value2) {
            addCriterion("apiID between", value1, value2, "apiid");
            return (Criteria) this;
        }

        public Criteria andApiidNotBetween(Integer value1, Integer value2) {
            addCriterion("apiID not between", value1, value2, "apiid");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNull() {
            addCriterion("groupID is null");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNotNull() {
            addCriterion("groupID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupidEqualTo(Integer value) {
            addCriterion("groupID =", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotEqualTo(Integer value) {
            addCriterion("groupID <>", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThan(Integer value) {
            addCriterion("groupID >", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("groupID >=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThan(Integer value) {
            addCriterion("groupID <", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThanOrEqualTo(Integer value) {
            addCriterion("groupID <=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidIn(List<Integer> values) {
            addCriterion("groupID in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotIn(List<Integer> values) {
            addCriterion("groupID not in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidBetween(Integer value1, Integer value2) {
            addCriterion("groupID between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("groupID not between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andApiuriIsNull() {
            addCriterion("apiURI is null");
            return (Criteria) this;
        }

        public Criteria andApiuriIsNotNull() {
            addCriterion("apiURI is not null");
            return (Criteria) this;
        }

        public Criteria andApiuriEqualTo(String value) {
            addCriterion("apiURI =", value, "apiuri");
            return (Criteria) this;
        }

        public Criteria andApiuriNotEqualTo(String value) {
            addCriterion("apiURI <>", value, "apiuri");
            return (Criteria) this;
        }

        public Criteria andApiuriGreaterThan(String value) {
            addCriterion("apiURI >", value, "apiuri");
            return (Criteria) this;
        }

        public Criteria andApiuriGreaterThanOrEqualTo(String value) {
            addCriterion("apiURI >=", value, "apiuri");
            return (Criteria) this;
        }

        public Criteria andApiuriLessThan(String value) {
            addCriterion("apiURI <", value, "apiuri");
            return (Criteria) this;
        }

        public Criteria andApiuriLessThanOrEqualTo(String value) {
            addCriterion("apiURI <=", value, "apiuri");
            return (Criteria) this;
        }

        public Criteria andApiuriLike(String value) {
            addCriterion("apiURI like", value, "apiuri");
            return (Criteria) this;
        }

        public Criteria andApiuriNotLike(String value) {
            addCriterion("apiURI not like", value, "apiuri");
            return (Criteria) this;
        }

        public Criteria andApiuriIn(List<String> values) {
            addCriterion("apiURI in", values, "apiuri");
            return (Criteria) this;
        }

        public Criteria andApiuriNotIn(List<String> values) {
            addCriterion("apiURI not in", values, "apiuri");
            return (Criteria) this;
        }

        public Criteria andApiuriBetween(String value1, String value2) {
            addCriterion("apiURI between", value1, value2, "apiuri");
            return (Criteria) this;
        }

        public Criteria andApiuriNotBetween(String value1, String value2) {
            addCriterion("apiURI not between", value1, value2, "apiuri");
            return (Criteria) this;
        }

        public Criteria andApinameIsNull() {
            addCriterion("apiName is null");
            return (Criteria) this;
        }

        public Criteria andApinameIsNotNull() {
            addCriterion("apiName is not null");
            return (Criteria) this;
        }

        public Criteria andApinameEqualTo(String value) {
            addCriterion("apiName =", value, "apiname");
            return (Criteria) this;
        }

        public Criteria andApinameNotEqualTo(String value) {
            addCriterion("apiName <>", value, "apiname");
            return (Criteria) this;
        }

        public Criteria andApinameGreaterThan(String value) {
            addCriterion("apiName >", value, "apiname");
            return (Criteria) this;
        }

        public Criteria andApinameGreaterThanOrEqualTo(String value) {
            addCriterion("apiName >=", value, "apiname");
            return (Criteria) this;
        }

        public Criteria andApinameLessThan(String value) {
            addCriterion("apiName <", value, "apiname");
            return (Criteria) this;
        }

        public Criteria andApinameLessThanOrEqualTo(String value) {
            addCriterion("apiName <=", value, "apiname");
            return (Criteria) this;
        }

        public Criteria andApinameLike(String value) {
            addCriterion("apiName like", value, "apiname");
            return (Criteria) this;
        }

        public Criteria andApinameNotLike(String value) {
            addCriterion("apiName not like", value, "apiname");
            return (Criteria) this;
        }

        public Criteria andApinameIn(List<String> values) {
            addCriterion("apiName in", values, "apiname");
            return (Criteria) this;
        }

        public Criteria andApinameNotIn(List<String> values) {
            addCriterion("apiName not in", values, "apiname");
            return (Criteria) this;
        }

        public Criteria andApinameBetween(String value1, String value2) {
            addCriterion("apiName between", value1, value2, "apiname");
            return (Criteria) this;
        }

        public Criteria andApinameNotBetween(String value1, String value2) {
            addCriterion("apiName not between", value1, value2, "apiname");
            return (Criteria) this;
        }

        public Criteria andApiprotocolIsNull() {
            addCriterion("apiProtocol is null");
            return (Criteria) this;
        }

        public Criteria andApiprotocolIsNotNull() {
            addCriterion("apiProtocol is not null");
            return (Criteria) this;
        }

        public Criteria andApiprotocolEqualTo(Byte value) {
            addCriterion("apiProtocol =", value, "apiprotocol");
            return (Criteria) this;
        }

        public Criteria andApiprotocolNotEqualTo(Byte value) {
            addCriterion("apiProtocol <>", value, "apiprotocol");
            return (Criteria) this;
        }

        public Criteria andApiprotocolGreaterThan(Byte value) {
            addCriterion("apiProtocol >", value, "apiprotocol");
            return (Criteria) this;
        }

        public Criteria andApiprotocolGreaterThanOrEqualTo(Byte value) {
            addCriterion("apiProtocol >=", value, "apiprotocol");
            return (Criteria) this;
        }

        public Criteria andApiprotocolLessThan(Byte value) {
            addCriterion("apiProtocol <", value, "apiprotocol");
            return (Criteria) this;
        }

        public Criteria andApiprotocolLessThanOrEqualTo(Byte value) {
            addCriterion("apiProtocol <=", value, "apiprotocol");
            return (Criteria) this;
        }

        public Criteria andApiprotocolIn(List<Byte> values) {
            addCriterion("apiProtocol in", values, "apiprotocol");
            return (Criteria) this;
        }

        public Criteria andApiprotocolNotIn(List<Byte> values) {
            addCriterion("apiProtocol not in", values, "apiprotocol");
            return (Criteria) this;
        }

        public Criteria andApiprotocolBetween(Byte value1, Byte value2) {
            addCriterion("apiProtocol between", value1, value2, "apiprotocol");
            return (Criteria) this;
        }

        public Criteria andApiprotocolNotBetween(Byte value1, Byte value2) {
            addCriterion("apiProtocol not between", value1, value2, "apiprotocol");
            return (Criteria) this;
        }

        public Criteria andApirequesttypeIsNull() {
            addCriterion("apiRequestType is null");
            return (Criteria) this;
        }

        public Criteria andApirequesttypeIsNotNull() {
            addCriterion("apiRequestType is not null");
            return (Criteria) this;
        }

        public Criteria andApirequesttypeEqualTo(Byte value) {
            addCriterion("apiRequestType =", value, "apirequesttype");
            return (Criteria) this;
        }

        public Criteria andApirequesttypeNotEqualTo(Byte value) {
            addCriterion("apiRequestType <>", value, "apirequesttype");
            return (Criteria) this;
        }

        public Criteria andApirequesttypeGreaterThan(Byte value) {
            addCriterion("apiRequestType >", value, "apirequesttype");
            return (Criteria) this;
        }

        public Criteria andApirequesttypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("apiRequestType >=", value, "apirequesttype");
            return (Criteria) this;
        }

        public Criteria andApirequesttypeLessThan(Byte value) {
            addCriterion("apiRequestType <", value, "apirequesttype");
            return (Criteria) this;
        }

        public Criteria andApirequesttypeLessThanOrEqualTo(Byte value) {
            addCriterion("apiRequestType <=", value, "apirequesttype");
            return (Criteria) this;
        }

        public Criteria andApirequesttypeIn(List<Byte> values) {
            addCriterion("apiRequestType in", values, "apirequesttype");
            return (Criteria) this;
        }

        public Criteria andApirequesttypeNotIn(List<Byte> values) {
            addCriterion("apiRequestType not in", values, "apirequesttype");
            return (Criteria) this;
        }

        public Criteria andApirequesttypeBetween(Byte value1, Byte value2) {
            addCriterion("apiRequestType between", value1, value2, "apirequesttype");
            return (Criteria) this;
        }

        public Criteria andApirequesttypeNotBetween(Byte value1, Byte value2) {
            addCriterion("apiRequestType not between", value1, value2, "apirequesttype");
            return (Criteria) this;
        }

        public Criteria andApisuccessmocktypeIsNull() {
            addCriterion("apiSuccessMockType is null");
            return (Criteria) this;
        }

        public Criteria andApisuccessmocktypeIsNotNull() {
            addCriterion("apiSuccessMockType is not null");
            return (Criteria) this;
        }

        public Criteria andApisuccessmocktypeEqualTo(Byte value) {
            addCriterion("apiSuccessMockType =", value, "apisuccessmocktype");
            return (Criteria) this;
        }

        public Criteria andApisuccessmocktypeNotEqualTo(Byte value) {
            addCriterion("apiSuccessMockType <>", value, "apisuccessmocktype");
            return (Criteria) this;
        }

        public Criteria andApisuccessmocktypeGreaterThan(Byte value) {
            addCriterion("apiSuccessMockType >", value, "apisuccessmocktype");
            return (Criteria) this;
        }

        public Criteria andApisuccessmocktypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("apiSuccessMockType >=", value, "apisuccessmocktype");
            return (Criteria) this;
        }

        public Criteria andApisuccessmocktypeLessThan(Byte value) {
            addCriterion("apiSuccessMockType <", value, "apisuccessmocktype");
            return (Criteria) this;
        }

        public Criteria andApisuccessmocktypeLessThanOrEqualTo(Byte value) {
            addCriterion("apiSuccessMockType <=", value, "apisuccessmocktype");
            return (Criteria) this;
        }

        public Criteria andApisuccessmocktypeIn(List<Byte> values) {
            addCriterion("apiSuccessMockType in", values, "apisuccessmocktype");
            return (Criteria) this;
        }

        public Criteria andApisuccessmocktypeNotIn(List<Byte> values) {
            addCriterion("apiSuccessMockType not in", values, "apisuccessmocktype");
            return (Criteria) this;
        }

        public Criteria andApisuccessmocktypeBetween(Byte value1, Byte value2) {
            addCriterion("apiSuccessMockType between", value1, value2, "apisuccessmocktype");
            return (Criteria) this;
        }

        public Criteria andApisuccessmocktypeNotBetween(Byte value1, Byte value2) {
            addCriterion("apiSuccessMockType not between", value1, value2, "apisuccessmocktype");
            return (Criteria) this;
        }

        public Criteria andApifailuremocktypeIsNull() {
            addCriterion("apiFailureMockType is null");
            return (Criteria) this;
        }

        public Criteria andApifailuremocktypeIsNotNull() {
            addCriterion("apiFailureMockType is not null");
            return (Criteria) this;
        }

        public Criteria andApifailuremocktypeEqualTo(Byte value) {
            addCriterion("apiFailureMockType =", value, "apifailuremocktype");
            return (Criteria) this;
        }

        public Criteria andApifailuremocktypeNotEqualTo(Byte value) {
            addCriterion("apiFailureMockType <>", value, "apifailuremocktype");
            return (Criteria) this;
        }

        public Criteria andApifailuremocktypeGreaterThan(Byte value) {
            addCriterion("apiFailureMockType >", value, "apifailuremocktype");
            return (Criteria) this;
        }

        public Criteria andApifailuremocktypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("apiFailureMockType >=", value, "apifailuremocktype");
            return (Criteria) this;
        }

        public Criteria andApifailuremocktypeLessThan(Byte value) {
            addCriterion("apiFailureMockType <", value, "apifailuremocktype");
            return (Criteria) this;
        }

        public Criteria andApifailuremocktypeLessThanOrEqualTo(Byte value) {
            addCriterion("apiFailureMockType <=", value, "apifailuremocktype");
            return (Criteria) this;
        }

        public Criteria andApifailuremocktypeIn(List<Byte> values) {
            addCriterion("apiFailureMockType in", values, "apifailuremocktype");
            return (Criteria) this;
        }

        public Criteria andApifailuremocktypeNotIn(List<Byte> values) {
            addCriterion("apiFailureMockType not in", values, "apifailuremocktype");
            return (Criteria) this;
        }

        public Criteria andApifailuremocktypeBetween(Byte value1, Byte value2) {
            addCriterion("apiFailureMockType between", value1, value2, "apifailuremocktype");
            return (Criteria) this;
        }

        public Criteria andApifailuremocktypeNotBetween(Byte value1, Byte value2) {
            addCriterion("apiFailureMockType not between", value1, value2, "apifailuremocktype");
            return (Criteria) this;
        }

        public Criteria andApistatusIsNull() {
            addCriterion("apiStatus is null");
            return (Criteria) this;
        }

        public Criteria andApistatusIsNotNull() {
            addCriterion("apiStatus is not null");
            return (Criteria) this;
        }

        public Criteria andApistatusEqualTo(Byte value) {
            addCriterion("apiStatus =", value, "apistatus");
            return (Criteria) this;
        }

        public Criteria andApistatusNotEqualTo(Byte value) {
            addCriterion("apiStatus <>", value, "apistatus");
            return (Criteria) this;
        }

        public Criteria andApistatusGreaterThan(Byte value) {
            addCriterion("apiStatus >", value, "apistatus");
            return (Criteria) this;
        }

        public Criteria andApistatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("apiStatus >=", value, "apistatus");
            return (Criteria) this;
        }

        public Criteria andApistatusLessThan(Byte value) {
            addCriterion("apiStatus <", value, "apistatus");
            return (Criteria) this;
        }

        public Criteria andApistatusLessThanOrEqualTo(Byte value) {
            addCriterion("apiStatus <=", value, "apistatus");
            return (Criteria) this;
        }

        public Criteria andApistatusIn(List<Byte> values) {
            addCriterion("apiStatus in", values, "apistatus");
            return (Criteria) this;
        }

        public Criteria andApistatusNotIn(List<Byte> values) {
            addCriterion("apiStatus not in", values, "apistatus");
            return (Criteria) this;
        }

        public Criteria andApistatusBetween(Byte value1, Byte value2) {
            addCriterion("apiStatus between", value1, value2, "apistatus");
            return (Criteria) this;
        }

        public Criteria andApistatusNotBetween(Byte value1, Byte value2) {
            addCriterion("apiStatus not between", value1, value2, "apistatus");
            return (Criteria) this;
        }

        public Criteria andApiupdatetimeIsNull() {
            addCriterion("apiUpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andApiupdatetimeIsNotNull() {
            addCriterion("apiUpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andApiupdatetimeEqualTo(Date value) {
            addCriterion("apiUpdateTime =", value, "apiupdatetime");
            return (Criteria) this;
        }

        public Criteria andApiupdatetimeNotEqualTo(Date value) {
            addCriterion("apiUpdateTime <>", value, "apiupdatetime");
            return (Criteria) this;
        }

        public Criteria andApiupdatetimeGreaterThan(Date value) {
            addCriterion("apiUpdateTime >", value, "apiupdatetime");
            return (Criteria) this;
        }

        public Criteria andApiupdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apiUpdateTime >=", value, "apiupdatetime");
            return (Criteria) this;
        }

        public Criteria andApiupdatetimeLessThan(Date value) {
            addCriterion("apiUpdateTime <", value, "apiupdatetime");
            return (Criteria) this;
        }

        public Criteria andApiupdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("apiUpdateTime <=", value, "apiupdatetime");
            return (Criteria) this;
        }

        public Criteria andApiupdatetimeIn(List<Date> values) {
            addCriterion("apiUpdateTime in", values, "apiupdatetime");
            return (Criteria) this;
        }

        public Criteria andApiupdatetimeNotIn(List<Date> values) {
            addCriterion("apiUpdateTime not in", values, "apiupdatetime");
            return (Criteria) this;
        }

        public Criteria andApiupdatetimeBetween(Date value1, Date value2) {
            addCriterion("apiUpdateTime between", value1, value2, "apiupdatetime");
            return (Criteria) this;
        }

        public Criteria andApiupdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("apiUpdateTime not between", value1, value2, "apiupdatetime");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNull() {
            addCriterion("projectID is null");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNotNull() {
            addCriterion("projectID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectidEqualTo(Integer value) {
            addCriterion("projectID =", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotEqualTo(Integer value) {
            addCriterion("projectID <>", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThan(Integer value) {
            addCriterion("projectID >", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("projectID >=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThan(Integer value) {
            addCriterion("projectID <", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThanOrEqualTo(Integer value) {
            addCriterion("projectID <=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidIn(List<Integer> values) {
            addCriterion("projectID in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotIn(List<Integer> values) {
            addCriterion("projectID not in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidBetween(Integer value1, Integer value2) {
            addCriterion("projectID between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("projectID not between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andStarredIsNull() {
            addCriterion("starred is null");
            return (Criteria) this;
        }

        public Criteria andStarredIsNotNull() {
            addCriterion("starred is not null");
            return (Criteria) this;
        }

        public Criteria andStarredEqualTo(Byte value) {
            addCriterion("starred =", value, "starred");
            return (Criteria) this;
        }

        public Criteria andStarredNotEqualTo(Byte value) {
            addCriterion("starred <>", value, "starred");
            return (Criteria) this;
        }

        public Criteria andStarredGreaterThan(Byte value) {
            addCriterion("starred >", value, "starred");
            return (Criteria) this;
        }

        public Criteria andStarredGreaterThanOrEqualTo(Byte value) {
            addCriterion("starred >=", value, "starred");
            return (Criteria) this;
        }

        public Criteria andStarredLessThan(Byte value) {
            addCriterion("starred <", value, "starred");
            return (Criteria) this;
        }

        public Criteria andStarredLessThanOrEqualTo(Byte value) {
            addCriterion("starred <=", value, "starred");
            return (Criteria) this;
        }

        public Criteria andStarredIn(List<Byte> values) {
            addCriterion("starred in", values, "starred");
            return (Criteria) this;
        }

        public Criteria andStarredNotIn(List<Byte> values) {
            addCriterion("starred not in", values, "starred");
            return (Criteria) this;
        }

        public Criteria andStarredBetween(Byte value1, Byte value2) {
            addCriterion("starred between", value1, value2, "starred");
            return (Criteria) this;
        }

        public Criteria andStarredNotBetween(Byte value1, Byte value2) {
            addCriterion("starred not between", value1, value2, "starred");
            return (Criteria) this;
        }

        public Criteria andRemovedIsNull() {
            addCriterion("removed is null");
            return (Criteria) this;
        }

        public Criteria andRemovedIsNotNull() {
            addCriterion("removed is not null");
            return (Criteria) this;
        }

        public Criteria andRemovedEqualTo(Byte value) {
            addCriterion("removed =", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedNotEqualTo(Byte value) {
            addCriterion("removed <>", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedGreaterThan(Byte value) {
            addCriterion("removed >", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedGreaterThanOrEqualTo(Byte value) {
            addCriterion("removed >=", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedLessThan(Byte value) {
            addCriterion("removed <", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedLessThanOrEqualTo(Byte value) {
            addCriterion("removed <=", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedIn(List<Byte> values) {
            addCriterion("removed in", values, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedNotIn(List<Byte> values) {
            addCriterion("removed not in", values, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedBetween(Byte value1, Byte value2) {
            addCriterion("removed between", value1, value2, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedNotBetween(Byte value1, Byte value2) {
            addCriterion("removed not between", value1, value2, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovetimeIsNull() {
            addCriterion("removeTime is null");
            return (Criteria) this;
        }

        public Criteria andRemovetimeIsNotNull() {
            addCriterion("removeTime is not null");
            return (Criteria) this;
        }

        public Criteria andRemovetimeEqualTo(Date value) {
            addCriterion("removeTime =", value, "removetime");
            return (Criteria) this;
        }

        public Criteria andRemovetimeNotEqualTo(Date value) {
            addCriterion("removeTime <>", value, "removetime");
            return (Criteria) this;
        }

        public Criteria andRemovetimeGreaterThan(Date value) {
            addCriterion("removeTime >", value, "removetime");
            return (Criteria) this;
        }

        public Criteria andRemovetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("removeTime >=", value, "removetime");
            return (Criteria) this;
        }

        public Criteria andRemovetimeLessThan(Date value) {
            addCriterion("removeTime <", value, "removetime");
            return (Criteria) this;
        }

        public Criteria andRemovetimeLessThanOrEqualTo(Date value) {
            addCriterion("removeTime <=", value, "removetime");
            return (Criteria) this;
        }

        public Criteria andRemovetimeIn(List<Date> values) {
            addCriterion("removeTime in", values, "removetime");
            return (Criteria) this;
        }

        public Criteria andRemovetimeNotIn(List<Date> values) {
            addCriterion("removeTime not in", values, "removetime");
            return (Criteria) this;
        }

        public Criteria andRemovetimeBetween(Date value1, Date value2) {
            addCriterion("removeTime between", value1, value2, "removetime");
            return (Criteria) this;
        }

        public Criteria andRemovetimeNotBetween(Date value1, Date value2) {
            addCriterion("removeTime not between", value1, value2, "removetime");
            return (Criteria) this;
        }

        public Criteria andApinotetypeIsNull() {
            addCriterion("apiNoteType is null");
            return (Criteria) this;
        }

        public Criteria andApinotetypeIsNotNull() {
            addCriterion("apiNoteType is not null");
            return (Criteria) this;
        }

        public Criteria andApinotetypeEqualTo(Byte value) {
            addCriterion("apiNoteType =", value, "apinotetype");
            return (Criteria) this;
        }

        public Criteria andApinotetypeNotEqualTo(Byte value) {
            addCriterion("apiNoteType <>", value, "apinotetype");
            return (Criteria) this;
        }

        public Criteria andApinotetypeGreaterThan(Byte value) {
            addCriterion("apiNoteType >", value, "apinotetype");
            return (Criteria) this;
        }

        public Criteria andApinotetypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("apiNoteType >=", value, "apinotetype");
            return (Criteria) this;
        }

        public Criteria andApinotetypeLessThan(Byte value) {
            addCriterion("apiNoteType <", value, "apinotetype");
            return (Criteria) this;
        }

        public Criteria andApinotetypeLessThanOrEqualTo(Byte value) {
            addCriterion("apiNoteType <=", value, "apinotetype");
            return (Criteria) this;
        }

        public Criteria andApinotetypeIn(List<Byte> values) {
            addCriterion("apiNoteType in", values, "apinotetype");
            return (Criteria) this;
        }

        public Criteria andApinotetypeNotIn(List<Byte> values) {
            addCriterion("apiNoteType not in", values, "apinotetype");
            return (Criteria) this;
        }

        public Criteria andApinotetypeBetween(Byte value1, Byte value2) {
            addCriterion("apiNoteType between", value1, value2, "apinotetype");
            return (Criteria) this;
        }

        public Criteria andApinotetypeNotBetween(Byte value1, Byte value2) {
            addCriterion("apiNoteType not between", value1, value2, "apinotetype");
            return (Criteria) this;
        }

        public Criteria andApirequestparamtypeIsNull() {
            addCriterion("apiRequestParamType is null");
            return (Criteria) this;
        }

        public Criteria andApirequestparamtypeIsNotNull() {
            addCriterion("apiRequestParamType is not null");
            return (Criteria) this;
        }

        public Criteria andApirequestparamtypeEqualTo(Byte value) {
            addCriterion("apiRequestParamType =", value, "apirequestparamtype");
            return (Criteria) this;
        }

        public Criteria andApirequestparamtypeNotEqualTo(Byte value) {
            addCriterion("apiRequestParamType <>", value, "apirequestparamtype");
            return (Criteria) this;
        }

        public Criteria andApirequestparamtypeGreaterThan(Byte value) {
            addCriterion("apiRequestParamType >", value, "apirequestparamtype");
            return (Criteria) this;
        }

        public Criteria andApirequestparamtypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("apiRequestParamType >=", value, "apirequestparamtype");
            return (Criteria) this;
        }

        public Criteria andApirequestparamtypeLessThan(Byte value) {
            addCriterion("apiRequestParamType <", value, "apirequestparamtype");
            return (Criteria) this;
        }

        public Criteria andApirequestparamtypeLessThanOrEqualTo(Byte value) {
            addCriterion("apiRequestParamType <=", value, "apirequestparamtype");
            return (Criteria) this;
        }

        public Criteria andApirequestparamtypeIn(List<Byte> values) {
            addCriterion("apiRequestParamType in", values, "apirequestparamtype");
            return (Criteria) this;
        }

        public Criteria andApirequestparamtypeNotIn(List<Byte> values) {
            addCriterion("apiRequestParamType not in", values, "apirequestparamtype");
            return (Criteria) this;
        }

        public Criteria andApirequestparamtypeBetween(Byte value1, Byte value2) {
            addCriterion("apiRequestParamType between", value1, value2, "apirequestparamtype");
            return (Criteria) this;
        }

        public Criteria andApirequestparamtypeNotBetween(Byte value1, Byte value2) {
            addCriterion("apiRequestParamType not between", value1, value2, "apirequestparamtype");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIsNull() {
            addCriterion("updateUserID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIsNotNull() {
            addCriterion("updateUserID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridEqualTo(Integer value) {
            addCriterion("updateUserID =", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotEqualTo(Integer value) {
            addCriterion("updateUserID <>", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridGreaterThan(Integer value) {
            addCriterion("updateUserID >", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("updateUserID >=", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLessThan(Integer value) {
            addCriterion("updateUserID <", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLessThanOrEqualTo(Integer value) {
            addCriterion("updateUserID <=", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIn(List<Integer> values) {
            addCriterion("updateUserID in", values, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotIn(List<Integer> values) {
            addCriterion("updateUserID not in", values, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridBetween(Integer value1, Integer value2) {
            addCriterion("updateUserID between", value1, value2, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("updateUserID not between", value1, value2, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andApisuccessstatuscodeIsNull() {
            addCriterion("apiSuccessStatusCode is null");
            return (Criteria) this;
        }

        public Criteria andApisuccessstatuscodeIsNotNull() {
            addCriterion("apiSuccessStatusCode is not null");
            return (Criteria) this;
        }

        public Criteria andApisuccessstatuscodeEqualTo(String value) {
            addCriterion("apiSuccessStatusCode =", value, "apisuccessstatuscode");
            return (Criteria) this;
        }

        public Criteria andApisuccessstatuscodeNotEqualTo(String value) {
            addCriterion("apiSuccessStatusCode <>", value, "apisuccessstatuscode");
            return (Criteria) this;
        }

        public Criteria andApisuccessstatuscodeGreaterThan(String value) {
            addCriterion("apiSuccessStatusCode >", value, "apisuccessstatuscode");
            return (Criteria) this;
        }

        public Criteria andApisuccessstatuscodeGreaterThanOrEqualTo(String value) {
            addCriterion("apiSuccessStatusCode >=", value, "apisuccessstatuscode");
            return (Criteria) this;
        }

        public Criteria andApisuccessstatuscodeLessThan(String value) {
            addCriterion("apiSuccessStatusCode <", value, "apisuccessstatuscode");
            return (Criteria) this;
        }

        public Criteria andApisuccessstatuscodeLessThanOrEqualTo(String value) {
            addCriterion("apiSuccessStatusCode <=", value, "apisuccessstatuscode");
            return (Criteria) this;
        }

        public Criteria andApisuccessstatuscodeLike(String value) {
            addCriterion("apiSuccessStatusCode like", value, "apisuccessstatuscode");
            return (Criteria) this;
        }

        public Criteria andApisuccessstatuscodeNotLike(String value) {
            addCriterion("apiSuccessStatusCode not like", value, "apisuccessstatuscode");
            return (Criteria) this;
        }

        public Criteria andApisuccessstatuscodeIn(List<String> values) {
            addCriterion("apiSuccessStatusCode in", values, "apisuccessstatuscode");
            return (Criteria) this;
        }

        public Criteria andApisuccessstatuscodeNotIn(List<String> values) {
            addCriterion("apiSuccessStatusCode not in", values, "apisuccessstatuscode");
            return (Criteria) this;
        }

        public Criteria andApisuccessstatuscodeBetween(String value1, String value2) {
            addCriterion("apiSuccessStatusCode between", value1, value2, "apisuccessstatuscode");
            return (Criteria) this;
        }

        public Criteria andApisuccessstatuscodeNotBetween(String value1, String value2) {
            addCriterion("apiSuccessStatusCode not between", value1, value2, "apisuccessstatuscode");
            return (Criteria) this;
        }

        public Criteria andApifailurestatuscodeIsNull() {
            addCriterion("apiFailureStatusCode is null");
            return (Criteria) this;
        }

        public Criteria andApifailurestatuscodeIsNotNull() {
            addCriterion("apiFailureStatusCode is not null");
            return (Criteria) this;
        }

        public Criteria andApifailurestatuscodeEqualTo(String value) {
            addCriterion("apiFailureStatusCode =", value, "apifailurestatuscode");
            return (Criteria) this;
        }

        public Criteria andApifailurestatuscodeNotEqualTo(String value) {
            addCriterion("apiFailureStatusCode <>", value, "apifailurestatuscode");
            return (Criteria) this;
        }

        public Criteria andApifailurestatuscodeGreaterThan(String value) {
            addCriterion("apiFailureStatusCode >", value, "apifailurestatuscode");
            return (Criteria) this;
        }

        public Criteria andApifailurestatuscodeGreaterThanOrEqualTo(String value) {
            addCriterion("apiFailureStatusCode >=", value, "apifailurestatuscode");
            return (Criteria) this;
        }

        public Criteria andApifailurestatuscodeLessThan(String value) {
            addCriterion("apiFailureStatusCode <", value, "apifailurestatuscode");
            return (Criteria) this;
        }

        public Criteria andApifailurestatuscodeLessThanOrEqualTo(String value) {
            addCriterion("apiFailureStatusCode <=", value, "apifailurestatuscode");
            return (Criteria) this;
        }

        public Criteria andApifailurestatuscodeLike(String value) {
            addCriterion("apiFailureStatusCode like", value, "apifailurestatuscode");
            return (Criteria) this;
        }

        public Criteria andApifailurestatuscodeNotLike(String value) {
            addCriterion("apiFailureStatusCode not like", value, "apifailurestatuscode");
            return (Criteria) this;
        }

        public Criteria andApifailurestatuscodeIn(List<String> values) {
            addCriterion("apiFailureStatusCode in", values, "apifailurestatuscode");
            return (Criteria) this;
        }

        public Criteria andApifailurestatuscodeNotIn(List<String> values) {
            addCriterion("apiFailureStatusCode not in", values, "apifailurestatuscode");
            return (Criteria) this;
        }

        public Criteria andApifailurestatuscodeBetween(String value1, String value2) {
            addCriterion("apiFailureStatusCode between", value1, value2, "apifailurestatuscode");
            return (Criteria) this;
        }

        public Criteria andApifailurestatuscodeNotBetween(String value1, String value2) {
            addCriterion("apiFailureStatusCode not between", value1, value2, "apifailurestatuscode");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}