package com.csc.test.platform.model;

import java.util.ArrayList;
import java.util.List;

public class ApiRequestParamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApiRequestParamExample() {
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

        public Criteria andParamidIsNull() {
            addCriterion("paramID is null");
            return (Criteria) this;
        }

        public Criteria andParamidIsNotNull() {
            addCriterion("paramID is not null");
            return (Criteria) this;
        }

        public Criteria andParamidEqualTo(Integer value) {
            addCriterion("paramID =", value, "paramid");
            return (Criteria) this;
        }

        public Criteria andParamidNotEqualTo(Integer value) {
            addCriterion("paramID <>", value, "paramid");
            return (Criteria) this;
        }

        public Criteria andParamidGreaterThan(Integer value) {
            addCriterion("paramID >", value, "paramid");
            return (Criteria) this;
        }

        public Criteria andParamidGreaterThanOrEqualTo(Integer value) {
            addCriterion("paramID >=", value, "paramid");
            return (Criteria) this;
        }

        public Criteria andParamidLessThan(Integer value) {
            addCriterion("paramID <", value, "paramid");
            return (Criteria) this;
        }

        public Criteria andParamidLessThanOrEqualTo(Integer value) {
            addCriterion("paramID <=", value, "paramid");
            return (Criteria) this;
        }

        public Criteria andParamidIn(List<Integer> values) {
            addCriterion("paramID in", values, "paramid");
            return (Criteria) this;
        }

        public Criteria andParamidNotIn(List<Integer> values) {
            addCriterion("paramID not in", values, "paramid");
            return (Criteria) this;
        }

        public Criteria andParamidBetween(Integer value1, Integer value2) {
            addCriterion("paramID between", value1, value2, "paramid");
            return (Criteria) this;
        }

        public Criteria andParamidNotBetween(Integer value1, Integer value2) {
            addCriterion("paramID not between", value1, value2, "paramid");
            return (Criteria) this;
        }

        public Criteria andParamnameIsNull() {
            addCriterion("paramName is null");
            return (Criteria) this;
        }

        public Criteria andParamnameIsNotNull() {
            addCriterion("paramName is not null");
            return (Criteria) this;
        }

        public Criteria andParamnameEqualTo(String value) {
            addCriterion("paramName =", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameNotEqualTo(String value) {
            addCriterion("paramName <>", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameGreaterThan(String value) {
            addCriterion("paramName >", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameGreaterThanOrEqualTo(String value) {
            addCriterion("paramName >=", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameLessThan(String value) {
            addCriterion("paramName <", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameLessThanOrEqualTo(String value) {
            addCriterion("paramName <=", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameLike(String value) {
            addCriterion("paramName like", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameNotLike(String value) {
            addCriterion("paramName not like", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameIn(List<String> values) {
            addCriterion("paramName in", values, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameNotIn(List<String> values) {
            addCriterion("paramName not in", values, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameBetween(String value1, String value2) {
            addCriterion("paramName between", value1, value2, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameNotBetween(String value1, String value2) {
            addCriterion("paramName not between", value1, value2, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamkeyIsNull() {
            addCriterion("paramKey is null");
            return (Criteria) this;
        }

        public Criteria andParamkeyIsNotNull() {
            addCriterion("paramKey is not null");
            return (Criteria) this;
        }

        public Criteria andParamkeyEqualTo(String value) {
            addCriterion("paramKey =", value, "paramkey");
            return (Criteria) this;
        }

        public Criteria andParamkeyNotEqualTo(String value) {
            addCriterion("paramKey <>", value, "paramkey");
            return (Criteria) this;
        }

        public Criteria andParamkeyGreaterThan(String value) {
            addCriterion("paramKey >", value, "paramkey");
            return (Criteria) this;
        }

        public Criteria andParamkeyGreaterThanOrEqualTo(String value) {
            addCriterion("paramKey >=", value, "paramkey");
            return (Criteria) this;
        }

        public Criteria andParamkeyLessThan(String value) {
            addCriterion("paramKey <", value, "paramkey");
            return (Criteria) this;
        }

        public Criteria andParamkeyLessThanOrEqualTo(String value) {
            addCriterion("paramKey <=", value, "paramkey");
            return (Criteria) this;
        }

        public Criteria andParamkeyLike(String value) {
            addCriterion("paramKey like", value, "paramkey");
            return (Criteria) this;
        }

        public Criteria andParamkeyNotLike(String value) {
            addCriterion("paramKey not like", value, "paramkey");
            return (Criteria) this;
        }

        public Criteria andParamkeyIn(List<String> values) {
            addCriterion("paramKey in", values, "paramkey");
            return (Criteria) this;
        }

        public Criteria andParamkeyNotIn(List<String> values) {
            addCriterion("paramKey not in", values, "paramkey");
            return (Criteria) this;
        }

        public Criteria andParamkeyBetween(String value1, String value2) {
            addCriterion("paramKey between", value1, value2, "paramkey");
            return (Criteria) this;
        }

        public Criteria andParamkeyNotBetween(String value1, String value2) {
            addCriterion("paramKey not between", value1, value2, "paramkey");
            return (Criteria) this;
        }

        public Criteria andParamtypeIsNull() {
            addCriterion("paramType is null");
            return (Criteria) this;
        }

        public Criteria andParamtypeIsNotNull() {
            addCriterion("paramType is not null");
            return (Criteria) this;
        }

        public Criteria andParamtypeEqualTo(Byte value) {
            addCriterion("paramType =", value, "paramtype");
            return (Criteria) this;
        }

        public Criteria andParamtypeNotEqualTo(Byte value) {
            addCriterion("paramType <>", value, "paramtype");
            return (Criteria) this;
        }

        public Criteria andParamtypeGreaterThan(Byte value) {
            addCriterion("paramType >", value, "paramtype");
            return (Criteria) this;
        }

        public Criteria andParamtypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("paramType >=", value, "paramtype");
            return (Criteria) this;
        }

        public Criteria andParamtypeLessThan(Byte value) {
            addCriterion("paramType <", value, "paramtype");
            return (Criteria) this;
        }

        public Criteria andParamtypeLessThanOrEqualTo(Byte value) {
            addCriterion("paramType <=", value, "paramtype");
            return (Criteria) this;
        }

        public Criteria andParamtypeIn(List<Byte> values) {
            addCriterion("paramType in", values, "paramtype");
            return (Criteria) this;
        }

        public Criteria andParamtypeNotIn(List<Byte> values) {
            addCriterion("paramType not in", values, "paramtype");
            return (Criteria) this;
        }

        public Criteria andParamtypeBetween(Byte value1, Byte value2) {
            addCriterion("paramType between", value1, value2, "paramtype");
            return (Criteria) this;
        }

        public Criteria andParamtypeNotBetween(Byte value1, Byte value2) {
            addCriterion("paramType not between", value1, value2, "paramtype");
            return (Criteria) this;
        }

        public Criteria andParamlimitIsNull() {
            addCriterion("paramLimit is null");
            return (Criteria) this;
        }

        public Criteria andParamlimitIsNotNull() {
            addCriterion("paramLimit is not null");
            return (Criteria) this;
        }

        public Criteria andParamlimitEqualTo(String value) {
            addCriterion("paramLimit =", value, "paramlimit");
            return (Criteria) this;
        }

        public Criteria andParamlimitNotEqualTo(String value) {
            addCriterion("paramLimit <>", value, "paramlimit");
            return (Criteria) this;
        }

        public Criteria andParamlimitGreaterThan(String value) {
            addCriterion("paramLimit >", value, "paramlimit");
            return (Criteria) this;
        }

        public Criteria andParamlimitGreaterThanOrEqualTo(String value) {
            addCriterion("paramLimit >=", value, "paramlimit");
            return (Criteria) this;
        }

        public Criteria andParamlimitLessThan(String value) {
            addCriterion("paramLimit <", value, "paramlimit");
            return (Criteria) this;
        }

        public Criteria andParamlimitLessThanOrEqualTo(String value) {
            addCriterion("paramLimit <=", value, "paramlimit");
            return (Criteria) this;
        }

        public Criteria andParamlimitLike(String value) {
            addCriterion("paramLimit like", value, "paramlimit");
            return (Criteria) this;
        }

        public Criteria andParamlimitNotLike(String value) {
            addCriterion("paramLimit not like", value, "paramlimit");
            return (Criteria) this;
        }

        public Criteria andParamlimitIn(List<String> values) {
            addCriterion("paramLimit in", values, "paramlimit");
            return (Criteria) this;
        }

        public Criteria andParamlimitNotIn(List<String> values) {
            addCriterion("paramLimit not in", values, "paramlimit");
            return (Criteria) this;
        }

        public Criteria andParamlimitBetween(String value1, String value2) {
            addCriterion("paramLimit between", value1, value2, "paramlimit");
            return (Criteria) this;
        }

        public Criteria andParamlimitNotBetween(String value1, String value2) {
            addCriterion("paramLimit not between", value1, value2, "paramlimit");
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

        public Criteria andParamnotnullIsNull() {
            addCriterion("paramNotNull is null");
            return (Criteria) this;
        }

        public Criteria andParamnotnullIsNotNull() {
            addCriterion("paramNotNull is not null");
            return (Criteria) this;
        }

        public Criteria andParamnotnullEqualTo(Byte value) {
            addCriterion("paramNotNull =", value, "paramnotnull");
            return (Criteria) this;
        }

        public Criteria andParamnotnullNotEqualTo(Byte value) {
            addCriterion("paramNotNull <>", value, "paramnotnull");
            return (Criteria) this;
        }

        public Criteria andParamnotnullGreaterThan(Byte value) {
            addCriterion("paramNotNull >", value, "paramnotnull");
            return (Criteria) this;
        }

        public Criteria andParamnotnullGreaterThanOrEqualTo(Byte value) {
            addCriterion("paramNotNull >=", value, "paramnotnull");
            return (Criteria) this;
        }

        public Criteria andParamnotnullLessThan(Byte value) {
            addCriterion("paramNotNull <", value, "paramnotnull");
            return (Criteria) this;
        }

        public Criteria andParamnotnullLessThanOrEqualTo(Byte value) {
            addCriterion("paramNotNull <=", value, "paramnotnull");
            return (Criteria) this;
        }

        public Criteria andParamnotnullIn(List<Byte> values) {
            addCriterion("paramNotNull in", values, "paramnotnull");
            return (Criteria) this;
        }

        public Criteria andParamnotnullNotIn(List<Byte> values) {
            addCriterion("paramNotNull not in", values, "paramnotnull");
            return (Criteria) this;
        }

        public Criteria andParamnotnullBetween(Byte value1, Byte value2) {
            addCriterion("paramNotNull between", value1, value2, "paramnotnull");
            return (Criteria) this;
        }

        public Criteria andParamnotnullNotBetween(Byte value1, Byte value2) {
            addCriterion("paramNotNull not between", value1, value2, "paramnotnull");
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