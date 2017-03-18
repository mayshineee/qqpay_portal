package com.base.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class PowerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PowerExample() {
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

        public Criteria andPowerIdIsNull() {
            addCriterion("POWER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPowerIdIsNotNull() {
            addCriterion("POWER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPowerIdEqualTo(String value) {
            addCriterion("POWER_ID =", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotEqualTo(String value) {
            addCriterion("POWER_ID <>", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdGreaterThan(String value) {
            addCriterion("POWER_ID >", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdGreaterThanOrEqualTo(String value) {
            addCriterion("POWER_ID >=", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdLessThan(String value) {
            addCriterion("POWER_ID <", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdLessThanOrEqualTo(String value) {
            addCriterion("POWER_ID <=", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdLike(String value) {
            addCriterion("POWER_ID like", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotLike(String value) {
            addCriterion("POWER_ID not like", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdIn(List<String> values) {
            addCriterion("POWER_ID in", values, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotIn(List<String> values) {
            addCriterion("POWER_ID not in", values, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdBetween(String value1, String value2) {
            addCriterion("POWER_ID between", value1, value2, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotBetween(String value1, String value2) {
            addCriterion("POWER_ID not between", value1, value2, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerUrlIsNull() {
            addCriterion("POWER_URL is null");
            return (Criteria) this;
        }

        public Criteria andPowerUrlIsNotNull() {
            addCriterion("POWER_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPowerUrlEqualTo(String value) {
            addCriterion("POWER_URL =", value, "powerUrl");
            return (Criteria) this;
        }

        public Criteria andPowerUrlNotEqualTo(String value) {
            addCriterion("POWER_URL <>", value, "powerUrl");
            return (Criteria) this;
        }

        public Criteria andPowerUrlGreaterThan(String value) {
            addCriterion("POWER_URL >", value, "powerUrl");
            return (Criteria) this;
        }

        public Criteria andPowerUrlGreaterThanOrEqualTo(String value) {
            addCriterion("POWER_URL >=", value, "powerUrl");
            return (Criteria) this;
        }

        public Criteria andPowerUrlLessThan(String value) {
            addCriterion("POWER_URL <", value, "powerUrl");
            return (Criteria) this;
        }

        public Criteria andPowerUrlLessThanOrEqualTo(String value) {
            addCriterion("POWER_URL <=", value, "powerUrl");
            return (Criteria) this;
        }

        public Criteria andPowerUrlLike(String value) {
            addCriterion("POWER_URL like", value, "powerUrl");
            return (Criteria) this;
        }

        public Criteria andPowerUrlNotLike(String value) {
            addCriterion("POWER_URL not like", value, "powerUrl");
            return (Criteria) this;
        }

        public Criteria andPowerUrlIn(List<String> values) {
            addCriterion("POWER_URL in", values, "powerUrl");
            return (Criteria) this;
        }

        public Criteria andPowerUrlNotIn(List<String> values) {
            addCriterion("POWER_URL not in", values, "powerUrl");
            return (Criteria) this;
        }

        public Criteria andPowerUrlBetween(String value1, String value2) {
            addCriterion("POWER_URL between", value1, value2, "powerUrl");
            return (Criteria) this;
        }

        public Criteria andPowerUrlNotBetween(String value1, String value2) {
            addCriterion("POWER_URL not between", value1, value2, "powerUrl");
            return (Criteria) this;
        }

        public Criteria andPowerDescriptionIsNull() {
            addCriterion("POWER_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andPowerDescriptionIsNotNull() {
            addCriterion("POWER_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andPowerDescriptionEqualTo(String value) {
            addCriterion("POWER_DESCRIPTION =", value, "powerDescription");
            return (Criteria) this;
        }

        public Criteria andPowerDescriptionNotEqualTo(String value) {
            addCriterion("POWER_DESCRIPTION <>", value, "powerDescription");
            return (Criteria) this;
        }

        public Criteria andPowerDescriptionGreaterThan(String value) {
            addCriterion("POWER_DESCRIPTION >", value, "powerDescription");
            return (Criteria) this;
        }

        public Criteria andPowerDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("POWER_DESCRIPTION >=", value, "powerDescription");
            return (Criteria) this;
        }

        public Criteria andPowerDescriptionLessThan(String value) {
            addCriterion("POWER_DESCRIPTION <", value, "powerDescription");
            return (Criteria) this;
        }

        public Criteria andPowerDescriptionLessThanOrEqualTo(String value) {
            addCriterion("POWER_DESCRIPTION <=", value, "powerDescription");
            return (Criteria) this;
        }

        public Criteria andPowerDescriptionLike(String value) {
            addCriterion("POWER_DESCRIPTION like", value, "powerDescription");
            return (Criteria) this;
        }

        public Criteria andPowerDescriptionNotLike(String value) {
            addCriterion("POWER_DESCRIPTION not like", value, "powerDescription");
            return (Criteria) this;
        }

        public Criteria andPowerDescriptionIn(List<String> values) {
            addCriterion("POWER_DESCRIPTION in", values, "powerDescription");
            return (Criteria) this;
        }

        public Criteria andPowerDescriptionNotIn(List<String> values) {
            addCriterion("POWER_DESCRIPTION not in", values, "powerDescription");
            return (Criteria) this;
        }

        public Criteria andPowerDescriptionBetween(String value1, String value2) {
            addCriterion("POWER_DESCRIPTION between", value1, value2, "powerDescription");
            return (Criteria) this;
        }

        public Criteria andPowerDescriptionNotBetween(String value1, String value2) {
            addCriterion("POWER_DESCRIPTION not between", value1, value2, "powerDescription");
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