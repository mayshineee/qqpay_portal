package com.base.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User_StatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public User_StatusExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andOperationTimesIsNull() {
            addCriterion("OPERATION_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andOperationTimesIsNotNull() {
            addCriterion("OPERATION_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTimesEqualTo(Integer value) {
            addCriterion("OPERATION_TIMES =", value, "operationTimes");
            return (Criteria) this;
        }

        public Criteria andOperationTimesNotEqualTo(Integer value) {
            addCriterion("OPERATION_TIMES <>", value, "operationTimes");
            return (Criteria) this;
        }

        public Criteria andOperationTimesGreaterThan(Integer value) {
            addCriterion("OPERATION_TIMES >", value, "operationTimes");
            return (Criteria) this;
        }

        public Criteria andOperationTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("OPERATION_TIMES >=", value, "operationTimes");
            return (Criteria) this;
        }

        public Criteria andOperationTimesLessThan(Integer value) {
            addCriterion("OPERATION_TIMES <", value, "operationTimes");
            return (Criteria) this;
        }

        public Criteria andOperationTimesLessThanOrEqualTo(Integer value) {
            addCriterion("OPERATION_TIMES <=", value, "operationTimes");
            return (Criteria) this;
        }

        public Criteria andOperationTimesIn(List<Integer> values) {
            addCriterion("OPERATION_TIMES in", values, "operationTimes");
            return (Criteria) this;
        }

        public Criteria andOperationTimesNotIn(List<Integer> values) {
            addCriterion("OPERATION_TIMES not in", values, "operationTimes");
            return (Criteria) this;
        }

        public Criteria andOperationTimesBetween(Integer value1, Integer value2) {
            addCriterion("OPERATION_TIMES between", value1, value2, "operationTimes");
            return (Criteria) this;
        }

        public Criteria andOperationTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("OPERATION_TIMES not between", value1, value2, "operationTimes");
            return (Criteria) this;
        }

        public Criteria andLastOperationTimeIsNull() {
            addCriterion("LAST_OPERATION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastOperationTimeIsNotNull() {
            addCriterion("LAST_OPERATION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastOperationTimeEqualTo(Date value) {
            addCriterion("LAST_OPERATION_TIME =", value, "lastOperationTime");
            return (Criteria) this;
        }

        public Criteria andLastOperationTimeNotEqualTo(Date value) {
            addCriterion("LAST_OPERATION_TIME <>", value, "lastOperationTime");
            return (Criteria) this;
        }

        public Criteria andLastOperationTimeGreaterThan(Date value) {
            addCriterion("LAST_OPERATION_TIME >", value, "lastOperationTime");
            return (Criteria) this;
        }

        public Criteria andLastOperationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_OPERATION_TIME >=", value, "lastOperationTime");
            return (Criteria) this;
        }

        public Criteria andLastOperationTimeLessThan(Date value) {
            addCriterion("LAST_OPERATION_TIME <", value, "lastOperationTime");
            return (Criteria) this;
        }

        public Criteria andLastOperationTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_OPERATION_TIME <=", value, "lastOperationTime");
            return (Criteria) this;
        }

        public Criteria andLastOperationTimeIn(List<Date> values) {
            addCriterion("LAST_OPERATION_TIME in", values, "lastOperationTime");
            return (Criteria) this;
        }

        public Criteria andLastOperationTimeNotIn(List<Date> values) {
            addCriterion("LAST_OPERATION_TIME not in", values, "lastOperationTime");
            return (Criteria) this;
        }

        public Criteria andLastOperationTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_OPERATION_TIME between", value1, value2, "lastOperationTime");
            return (Criteria) this;
        }

        public Criteria andLastOperationTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_OPERATION_TIME not between", value1, value2, "lastOperationTime");
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