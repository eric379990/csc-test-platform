package com.csc.test.platform.model;

import java.util.ArrayList;
import java.util.List;

public class ApiRequestValueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApiRequestValueExample() {
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

        public Criteria andValueidIsNull() {
            addCriterion("valueID is null");
            return (Criteria) this;
        }

        public Criteria andValueidIsNotNull() {
            addCriterion("valueID is not null");
            return (Criteria) this;
        }

        public Criteria andValueidEqualTo(Integer value) {
            addCriterion("valueID =", value, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidNotEqualTo(Integer value) {
            addCriterion("valueID <>", value, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidGreaterThan(Integer value) {
            addCriterion("valueID >", value, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidGreaterThanOrEqualTo(Integer value) {
            addCriterion("valueID >=", value, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidLessThan(Integer value) {
            addCriterion("valueID <", value, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidLessThanOrEqualTo(Integer value) {
            addCriterion("valueID <=", value, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidIn(List<Integer> values) {
            addCriterion("valueID in", values, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidNotIn(List<Integer> values) {
            addCriterion("valueID not in", values, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidBetween(Integer value1, Integer value2) {
            addCriterion("valueID between", value1, value2, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidNotBetween(Integer value1, Integer value2) {
            addCriterion("valueID not between", value1, value2, "valueid");
            return (Criteria) this;
        }

        public Criteria andValuedescriptionIsNull() {
            addCriterion("valueDescription is null");
            return (Criteria) this;
        }

        public Criteria andValuedescriptionIsNotNull() {
            addCriterion("valueDescription is not null");
            return (Criteria) this;
        }

        public Criteria andValuedescriptionEqualTo(String value) {
            addCriterion("valueDescription =", value, "valuedescription");
            return (Criteria) this;
        }

        public Criteria andValuedescriptionNotEqualTo(String value) {
            addCriterion("valueDescription <>", value, "valuedescription");
            return (Criteria) this;
        }

        public Criteria andValuedescriptionGreaterThan(String value) {
            addCriterion("valueDescription >", value, "valuedescription");
            return (Criteria) this;
        }

        public Criteria andValuedescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("valueDescription >=", value, "valuedescription");
            return (Criteria) this;
        }

        public Criteria andValuedescriptionLessThan(String value) {
            addCriterion("valueDescription <", value, "valuedescription");
            return (Criteria) this;
        }

        public Criteria andValuedescriptionLessThanOrEqualTo(String value) {
            addCriterion("valueDescription <=", value, "valuedescription");
            return (Criteria) this;
        }

        public Criteria andValuedescriptionLike(String value) {
            addCriterion("valueDescription like", value, "valuedescription");
            return (Criteria) this;
        }

        public Criteria andValuedescriptionNotLike(String value) {
            addCriterion("valueDescription not like", value, "valuedescription");
            return (Criteria) this;
        }

        public Criteria andValuedescriptionIn(List<String> values) {
            addCriterion("valueDescription in", values, "valuedescription");
            return (Criteria) this;
        }

        public Criteria andValuedescriptionNotIn(List<String> values) {
            addCriterion("valueDescription not in", values, "valuedescription");
            return (Criteria) this;
        }

        public Criteria andValuedescriptionBetween(String value1, String value2) {
            addCriterion("valueDescription between", value1, value2, "valuedescription");
            return (Criteria) this;
        }

        public Criteria andValuedescriptionNotBetween(String value1, String value2) {
            addCriterion("valueDescription not between", value1, value2, "valuedescription");
            return (Criteria) this;
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

        public Criteria andRownoIsNull() {
            addCriterion("rowNo is null");
            return (Criteria) this;
        }

        public Criteria andRownoIsNotNull() {
            addCriterion("rowNo is not null");
            return (Criteria) this;
        }

        public Criteria andRownoEqualTo(Integer value) {
            addCriterion("rowNo =", value, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoNotEqualTo(Integer value) {
            addCriterion("rowNo <>", value, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoGreaterThan(Integer value) {
            addCriterion("rowNo >", value, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoGreaterThanOrEqualTo(Integer value) {
            addCriterion("rowNo >=", value, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoLessThan(Integer value) {
            addCriterion("rowNo <", value, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoLessThanOrEqualTo(Integer value) {
            addCriterion("rowNo <=", value, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoIn(List<Integer> values) {
            addCriterion("rowNo in", values, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoNotIn(List<Integer> values) {
            addCriterion("rowNo not in", values, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoBetween(Integer value1, Integer value2) {
            addCriterion("rowNo between", value1, value2, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoNotBetween(Integer value1, Integer value2) {
            addCriterion("rowNo not between", value1, value2, "rowno");
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