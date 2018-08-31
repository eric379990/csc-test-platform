package com.csc.test.platform.model;

import java.util.ArrayList;
import java.util.List;

public class ApiHeaderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApiHeaderExample() {
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

        public Criteria andHeaderidIsNull() {
            addCriterion("headerID is null");
            return (Criteria) this;
        }

        public Criteria andHeaderidIsNotNull() {
            addCriterion("headerID is not null");
            return (Criteria) this;
        }

        public Criteria andHeaderidEqualTo(Integer value) {
            addCriterion("headerID =", value, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidNotEqualTo(Integer value) {
            addCriterion("headerID <>", value, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidGreaterThan(Integer value) {
            addCriterion("headerID >", value, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("headerID >=", value, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidLessThan(Integer value) {
            addCriterion("headerID <", value, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidLessThanOrEqualTo(Integer value) {
            addCriterion("headerID <=", value, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidIn(List<Integer> values) {
            addCriterion("headerID in", values, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidNotIn(List<Integer> values) {
            addCriterion("headerID not in", values, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidBetween(Integer value1, Integer value2) {
            addCriterion("headerID between", value1, value2, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidNotBetween(Integer value1, Integer value2) {
            addCriterion("headerID not between", value1, value2, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeadernameIsNull() {
            addCriterion("headerName is null");
            return (Criteria) this;
        }

        public Criteria andHeadernameIsNotNull() {
            addCriterion("headerName is not null");
            return (Criteria) this;
        }

        public Criteria andHeadernameEqualTo(String value) {
            addCriterion("headerName =", value, "headername");
            return (Criteria) this;
        }

        public Criteria andHeadernameNotEqualTo(String value) {
            addCriterion("headerName <>", value, "headername");
            return (Criteria) this;
        }

        public Criteria andHeadernameGreaterThan(String value) {
            addCriterion("headerName >", value, "headername");
            return (Criteria) this;
        }

        public Criteria andHeadernameGreaterThanOrEqualTo(String value) {
            addCriterion("headerName >=", value, "headername");
            return (Criteria) this;
        }

        public Criteria andHeadernameLessThan(String value) {
            addCriterion("headerName <", value, "headername");
            return (Criteria) this;
        }

        public Criteria andHeadernameLessThanOrEqualTo(String value) {
            addCriterion("headerName <=", value, "headername");
            return (Criteria) this;
        }

        public Criteria andHeadernameLike(String value) {
            addCriterion("headerName like", value, "headername");
            return (Criteria) this;
        }

        public Criteria andHeadernameNotLike(String value) {
            addCriterion("headerName not like", value, "headername");
            return (Criteria) this;
        }

        public Criteria andHeadernameIn(List<String> values) {
            addCriterion("headerName in", values, "headername");
            return (Criteria) this;
        }

        public Criteria andHeadernameNotIn(List<String> values) {
            addCriterion("headerName not in", values, "headername");
            return (Criteria) this;
        }

        public Criteria andHeadernameBetween(String value1, String value2) {
            addCriterion("headerName between", value1, value2, "headername");
            return (Criteria) this;
        }

        public Criteria andHeadernameNotBetween(String value1, String value2) {
            addCriterion("headerName not between", value1, value2, "headername");
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