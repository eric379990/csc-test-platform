package com.csc.test.platform.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestCaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestCaseExample() {
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

        public Criteria andCaseidIsNull() {
            addCriterion("caseID is null");
            return (Criteria) this;
        }

        public Criteria andCaseidIsNotNull() {
            addCriterion("caseID is not null");
            return (Criteria) this;
        }

        public Criteria andCaseidEqualTo(Integer value) {
            addCriterion("caseID =", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidNotEqualTo(Integer value) {
            addCriterion("caseID <>", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidGreaterThan(Integer value) {
            addCriterion("caseID >", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("caseID >=", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidLessThan(Integer value) {
            addCriterion("caseID <", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidLessThanOrEqualTo(Integer value) {
            addCriterion("caseID <=", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidIn(List<Integer> values) {
            addCriterion("caseID in", values, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidNotIn(List<Integer> values) {
            addCriterion("caseID not in", values, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidBetween(Integer value1, Integer value2) {
            addCriterion("caseID between", value1, value2, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidNotBetween(Integer value1, Integer value2) {
            addCriterion("caseID not between", value1, value2, "caseid");
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

        public Criteria andUseridIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andCasenameIsNull() {
            addCriterion("caseName is null");
            return (Criteria) this;
        }

        public Criteria andCasenameIsNotNull() {
            addCriterion("caseName is not null");
            return (Criteria) this;
        }

        public Criteria andCasenameEqualTo(String value) {
            addCriterion("caseName =", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameNotEqualTo(String value) {
            addCriterion("caseName <>", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameGreaterThan(String value) {
            addCriterion("caseName >", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameGreaterThanOrEqualTo(String value) {
            addCriterion("caseName >=", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameLessThan(String value) {
            addCriterion("caseName <", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameLessThanOrEqualTo(String value) {
            addCriterion("caseName <=", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameLike(String value) {
            addCriterion("caseName like", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameNotLike(String value) {
            addCriterion("caseName not like", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameIn(List<String> values) {
            addCriterion("caseName in", values, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameNotIn(List<String> values) {
            addCriterion("caseName not in", values, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameBetween(String value1, String value2) {
            addCriterion("caseName between", value1, value2, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameNotBetween(String value1, String value2) {
            addCriterion("caseName not between", value1, value2, "casename");
            return (Criteria) this;
        }

        public Criteria andCasedescIsNull() {
            addCriterion("caseDesc is null");
            return (Criteria) this;
        }

        public Criteria andCasedescIsNotNull() {
            addCriterion("caseDesc is not null");
            return (Criteria) this;
        }

        public Criteria andCasedescEqualTo(String value) {
            addCriterion("caseDesc =", value, "casedesc");
            return (Criteria) this;
        }

        public Criteria andCasedescNotEqualTo(String value) {
            addCriterion("caseDesc <>", value, "casedesc");
            return (Criteria) this;
        }

        public Criteria andCasedescGreaterThan(String value) {
            addCriterion("caseDesc >", value, "casedesc");
            return (Criteria) this;
        }

        public Criteria andCasedescGreaterThanOrEqualTo(String value) {
            addCriterion("caseDesc >=", value, "casedesc");
            return (Criteria) this;
        }

        public Criteria andCasedescLessThan(String value) {
            addCriterion("caseDesc <", value, "casedesc");
            return (Criteria) this;
        }

        public Criteria andCasedescLessThanOrEqualTo(String value) {
            addCriterion("caseDesc <=", value, "casedesc");
            return (Criteria) this;
        }

        public Criteria andCasedescLike(String value) {
            addCriterion("caseDesc like", value, "casedesc");
            return (Criteria) this;
        }

        public Criteria andCasedescNotLike(String value) {
            addCriterion("caseDesc not like", value, "casedesc");
            return (Criteria) this;
        }

        public Criteria andCasedescIn(List<String> values) {
            addCriterion("caseDesc in", values, "casedesc");
            return (Criteria) this;
        }

        public Criteria andCasedescNotIn(List<String> values) {
            addCriterion("caseDesc not in", values, "casedesc");
            return (Criteria) this;
        }

        public Criteria andCasedescBetween(String value1, String value2) {
            addCriterion("caseDesc between", value1, value2, "casedesc");
            return (Criteria) this;
        }

        public Criteria andCasedescNotBetween(String value1, String value2) {
            addCriterion("caseDesc not between", value1, value2, "casedesc");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
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

        public Criteria andCasetypeIsNull() {
            addCriterion("caseType is null");
            return (Criteria) this;
        }

        public Criteria andCasetypeIsNotNull() {
            addCriterion("caseType is not null");
            return (Criteria) this;
        }

        public Criteria andCasetypeEqualTo(Byte value) {
            addCriterion("caseType =", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeNotEqualTo(Byte value) {
            addCriterion("caseType <>", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeGreaterThan(Byte value) {
            addCriterion("caseType >", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("caseType >=", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeLessThan(Byte value) {
            addCriterion("caseType <", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeLessThanOrEqualTo(Byte value) {
            addCriterion("caseType <=", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeIn(List<Byte> values) {
            addCriterion("caseType in", values, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeNotIn(List<Byte> values) {
            addCriterion("caseType not in", values, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeBetween(Byte value1, Byte value2) {
            addCriterion("caseType between", value1, value2, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeNotBetween(Byte value1, Byte value2) {
            addCriterion("caseType not between", value1, value2, "casetype");
            return (Criteria) this;
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

        public Criteria andSqlidIsNull() {
            addCriterion("sqlID is null");
            return (Criteria) this;
        }

        public Criteria andSqlidIsNotNull() {
            addCriterion("sqlID is not null");
            return (Criteria) this;
        }

        public Criteria andSqlidEqualTo(Integer value) {
            addCriterion("sqlID =", value, "sqlid");
            return (Criteria) this;
        }

        public Criteria andSqlidNotEqualTo(Integer value) {
            addCriterion("sqlID <>", value, "sqlid");
            return (Criteria) this;
        }

        public Criteria andSqlidGreaterThan(Integer value) {
            addCriterion("sqlID >", value, "sqlid");
            return (Criteria) this;
        }

        public Criteria andSqlidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sqlID >=", value, "sqlid");
            return (Criteria) this;
        }

        public Criteria andSqlidLessThan(Integer value) {
            addCriterion("sqlID <", value, "sqlid");
            return (Criteria) this;
        }

        public Criteria andSqlidLessThanOrEqualTo(Integer value) {
            addCriterion("sqlID <=", value, "sqlid");
            return (Criteria) this;
        }

        public Criteria andSqlidIn(List<Integer> values) {
            addCriterion("sqlID in", values, "sqlid");
            return (Criteria) this;
        }

        public Criteria andSqlidNotIn(List<Integer> values) {
            addCriterion("sqlID not in", values, "sqlid");
            return (Criteria) this;
        }

        public Criteria andSqlidBetween(Integer value1, Integer value2) {
            addCriterion("sqlID between", value1, value2, "sqlid");
            return (Criteria) this;
        }

        public Criteria andSqlidNotBetween(Integer value1, Integer value2) {
            addCriterion("sqlID not between", value1, value2, "sqlid");
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