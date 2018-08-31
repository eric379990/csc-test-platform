package com.csc.test.platform.model;

import java.util.ArrayList;
import java.util.List;

public class TestSqlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestSqlExample() {
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

        public Criteria andCommentsIsNull() {
            addCriterion("comments is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("comments is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("comments =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("comments <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("comments >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("comments >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("comments <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("comments <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("comments like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("comments not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("comments in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("comments not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("comments between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("comments not between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andScripttypeIsNull() {
            addCriterion("scriptType is null");
            return (Criteria) this;
        }

        public Criteria andScripttypeIsNotNull() {
            addCriterion("scriptType is not null");
            return (Criteria) this;
        }

        public Criteria andScripttypeEqualTo(Byte value) {
            addCriterion("scriptType =", value, "scripttype");
            return (Criteria) this;
        }

        public Criteria andScripttypeNotEqualTo(Byte value) {
            addCriterion("scriptType <>", value, "scripttype");
            return (Criteria) this;
        }

        public Criteria andScripttypeGreaterThan(Byte value) {
            addCriterion("scriptType >", value, "scripttype");
            return (Criteria) this;
        }

        public Criteria andScripttypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("scriptType >=", value, "scripttype");
            return (Criteria) this;
        }

        public Criteria andScripttypeLessThan(Byte value) {
            addCriterion("scriptType <", value, "scripttype");
            return (Criteria) this;
        }

        public Criteria andScripttypeLessThanOrEqualTo(Byte value) {
            addCriterion("scriptType <=", value, "scripttype");
            return (Criteria) this;
        }

        public Criteria andScripttypeIn(List<Byte> values) {
            addCriterion("scriptType in", values, "scripttype");
            return (Criteria) this;
        }

        public Criteria andScripttypeNotIn(List<Byte> values) {
            addCriterion("scriptType not in", values, "scripttype");
            return (Criteria) this;
        }

        public Criteria andScripttypeBetween(Byte value1, Byte value2) {
            addCriterion("scriptType between", value1, value2, "scripttype");
            return (Criteria) this;
        }

        public Criteria andScripttypeNotBetween(Byte value1, Byte value2) {
            addCriterion("scriptType not between", value1, value2, "scripttype");
            return (Criteria) this;
        }

        public Criteria andDbidIsNull() {
            addCriterion("dbID is null");
            return (Criteria) this;
        }

        public Criteria andDbidIsNotNull() {
            addCriterion("dbID is not null");
            return (Criteria) this;
        }

        public Criteria andDbidEqualTo(Integer value) {
            addCriterion("dbID =", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidNotEqualTo(Integer value) {
            addCriterion("dbID <>", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidGreaterThan(Integer value) {
            addCriterion("dbID >", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dbID >=", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidLessThan(Integer value) {
            addCriterion("dbID <", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidLessThanOrEqualTo(Integer value) {
            addCriterion("dbID <=", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidIn(List<Integer> values) {
            addCriterion("dbID in", values, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidNotIn(List<Integer> values) {
            addCriterion("dbID not in", values, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidBetween(Integer value1, Integer value2) {
            addCriterion("dbID between", value1, value2, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidNotBetween(Integer value1, Integer value2) {
            addCriterion("dbID not between", value1, value2, "dbid");
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