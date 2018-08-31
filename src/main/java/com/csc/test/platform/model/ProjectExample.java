package com.csc.test.platform.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
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

        public Criteria andProjecttypeIsNull() {
            addCriterion("projectType is null");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIsNotNull() {
            addCriterion("projectType is not null");
            return (Criteria) this;
        }

        public Criteria andProjecttypeEqualTo(Byte value) {
            addCriterion("projectType =", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeNotEqualTo(Byte value) {
            addCriterion("projectType <>", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeGreaterThan(Byte value) {
            addCriterion("projectType >", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("projectType >=", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeLessThan(Byte value) {
            addCriterion("projectType <", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeLessThanOrEqualTo(Byte value) {
            addCriterion("projectType <=", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIn(List<Byte> values) {
            addCriterion("projectType in", values, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeNotIn(List<Byte> values) {
            addCriterion("projectType not in", values, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeBetween(Byte value1, Byte value2) {
            addCriterion("projectType between", value1, value2, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeNotBetween(Byte value1, Byte value2) {
            addCriterion("projectType not between", value1, value2, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNull() {
            addCriterion("projectName is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("projectName is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("projectName =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("projectName <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("projectName >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("projectName >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("projectName <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("projectName <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("projectName like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("projectName not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("projectName in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("projectName not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("projectName between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("projectName not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectupdatetimeIsNull() {
            addCriterion("projectUpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andProjectupdatetimeIsNotNull() {
            addCriterion("projectUpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andProjectupdatetimeEqualTo(Date value) {
            addCriterion("projectUpdateTime =", value, "projectupdatetime");
            return (Criteria) this;
        }

        public Criteria andProjectupdatetimeNotEqualTo(Date value) {
            addCriterion("projectUpdateTime <>", value, "projectupdatetime");
            return (Criteria) this;
        }

        public Criteria andProjectupdatetimeGreaterThan(Date value) {
            addCriterion("projectUpdateTime >", value, "projectupdatetime");
            return (Criteria) this;
        }

        public Criteria andProjectupdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("projectUpdateTime >=", value, "projectupdatetime");
            return (Criteria) this;
        }

        public Criteria andProjectupdatetimeLessThan(Date value) {
            addCriterion("projectUpdateTime <", value, "projectupdatetime");
            return (Criteria) this;
        }

        public Criteria andProjectupdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("projectUpdateTime <=", value, "projectupdatetime");
            return (Criteria) this;
        }

        public Criteria andProjectupdatetimeIn(List<Date> values) {
            addCriterion("projectUpdateTime in", values, "projectupdatetime");
            return (Criteria) this;
        }

        public Criteria andProjectupdatetimeNotIn(List<Date> values) {
            addCriterion("projectUpdateTime not in", values, "projectupdatetime");
            return (Criteria) this;
        }

        public Criteria andProjectupdatetimeBetween(Date value1, Date value2) {
            addCriterion("projectUpdateTime between", value1, value2, "projectupdatetime");
            return (Criteria) this;
        }

        public Criteria andProjectupdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("projectUpdateTime not between", value1, value2, "projectupdatetime");
            return (Criteria) this;
        }

        public Criteria andProjectversionIsNull() {
            addCriterion("projectVersion is null");
            return (Criteria) this;
        }

        public Criteria andProjectversionIsNotNull() {
            addCriterion("projectVersion is not null");
            return (Criteria) this;
        }

        public Criteria andProjectversionEqualTo(String value) {
            addCriterion("projectVersion =", value, "projectversion");
            return (Criteria) this;
        }

        public Criteria andProjectversionNotEqualTo(String value) {
            addCriterion("projectVersion <>", value, "projectversion");
            return (Criteria) this;
        }

        public Criteria andProjectversionGreaterThan(String value) {
            addCriterion("projectVersion >", value, "projectversion");
            return (Criteria) this;
        }

        public Criteria andProjectversionGreaterThanOrEqualTo(String value) {
            addCriterion("projectVersion >=", value, "projectversion");
            return (Criteria) this;
        }

        public Criteria andProjectversionLessThan(String value) {
            addCriterion("projectVersion <", value, "projectversion");
            return (Criteria) this;
        }

        public Criteria andProjectversionLessThanOrEqualTo(String value) {
            addCriterion("projectVersion <=", value, "projectversion");
            return (Criteria) this;
        }

        public Criteria andProjectversionLike(String value) {
            addCriterion("projectVersion like", value, "projectversion");
            return (Criteria) this;
        }

        public Criteria andProjectversionNotLike(String value) {
            addCriterion("projectVersion not like", value, "projectversion");
            return (Criteria) this;
        }

        public Criteria andProjectversionIn(List<String> values) {
            addCriterion("projectVersion in", values, "projectversion");
            return (Criteria) this;
        }

        public Criteria andProjectversionNotIn(List<String> values) {
            addCriterion("projectVersion not in", values, "projectversion");
            return (Criteria) this;
        }

        public Criteria andProjectversionBetween(String value1, String value2) {
            addCriterion("projectVersion between", value1, value2, "projectversion");
            return (Criteria) this;
        }

        public Criteria andProjectversionNotBetween(String value1, String value2) {
            addCriterion("projectVersion not between", value1, value2, "projectversion");
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