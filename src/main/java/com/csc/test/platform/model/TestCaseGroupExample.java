package com.csc.test.platform.model;

import java.util.ArrayList;
import java.util.List;

public class TestCaseGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestCaseGroupExample() {
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

        public Criteria andParentgroupidIsNull() {
            addCriterion("parentGroupID is null");
            return (Criteria) this;
        }

        public Criteria andParentgroupidIsNotNull() {
            addCriterion("parentGroupID is not null");
            return (Criteria) this;
        }

        public Criteria andParentgroupidEqualTo(Integer value) {
            addCriterion("parentGroupID =", value, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andParentgroupidNotEqualTo(Integer value) {
            addCriterion("parentGroupID <>", value, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andParentgroupidGreaterThan(Integer value) {
            addCriterion("parentGroupID >", value, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andParentgroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentGroupID >=", value, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andParentgroupidLessThan(Integer value) {
            addCriterion("parentGroupID <", value, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andParentgroupidLessThanOrEqualTo(Integer value) {
            addCriterion("parentGroupID <=", value, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andParentgroupidIn(List<Integer> values) {
            addCriterion("parentGroupID in", values, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andParentgroupidNotIn(List<Integer> values) {
            addCriterion("parentGroupID not in", values, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andParentgroupidBetween(Integer value1, Integer value2) {
            addCriterion("parentGroupID between", value1, value2, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andParentgroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentGroupID not between", value1, value2, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNull() {
            addCriterion("groupName is null");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNotNull() {
            addCriterion("groupName is not null");
            return (Criteria) this;
        }

        public Criteria andGroupnameEqualTo(String value) {
            addCriterion("groupName =", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotEqualTo(String value) {
            addCriterion("groupName <>", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThan(String value) {
            addCriterion("groupName >", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThanOrEqualTo(String value) {
            addCriterion("groupName >=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThan(String value) {
            addCriterion("groupName <", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThanOrEqualTo(String value) {
            addCriterion("groupName <=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLike(String value) {
            addCriterion("groupName like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotLike(String value) {
            addCriterion("groupName not like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameIn(List<String> values) {
            addCriterion("groupName in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotIn(List<String> values) {
            addCriterion("groupName not in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameBetween(String value1, String value2) {
            addCriterion("groupName between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotBetween(String value1, String value2) {
            addCriterion("groupName not between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andIschildIsNull() {
            addCriterion("isChild is null");
            return (Criteria) this;
        }

        public Criteria andIschildIsNotNull() {
            addCriterion("isChild is not null");
            return (Criteria) this;
        }

        public Criteria andIschildEqualTo(Byte value) {
            addCriterion("isChild =", value, "ischild");
            return (Criteria) this;
        }

        public Criteria andIschildNotEqualTo(Byte value) {
            addCriterion("isChild <>", value, "ischild");
            return (Criteria) this;
        }

        public Criteria andIschildGreaterThan(Byte value) {
            addCriterion("isChild >", value, "ischild");
            return (Criteria) this;
        }

        public Criteria andIschildGreaterThanOrEqualTo(Byte value) {
            addCriterion("isChild >=", value, "ischild");
            return (Criteria) this;
        }

        public Criteria andIschildLessThan(Byte value) {
            addCriterion("isChild <", value, "ischild");
            return (Criteria) this;
        }

        public Criteria andIschildLessThanOrEqualTo(Byte value) {
            addCriterion("isChild <=", value, "ischild");
            return (Criteria) this;
        }

        public Criteria andIschildIn(List<Byte> values) {
            addCriterion("isChild in", values, "ischild");
            return (Criteria) this;
        }

        public Criteria andIschildNotIn(List<Byte> values) {
            addCriterion("isChild not in", values, "ischild");
            return (Criteria) this;
        }

        public Criteria andIschildBetween(Byte value1, Byte value2) {
            addCriterion("isChild between", value1, value2, "ischild");
            return (Criteria) this;
        }

        public Criteria andIschildNotBetween(Byte value1, Byte value2) {
            addCriterion("isChild not between", value1, value2, "ischild");
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