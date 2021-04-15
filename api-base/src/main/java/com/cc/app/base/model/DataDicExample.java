package com.cc.app.base.model;

import java.util.ArrayList;
import java.util.List;

public class DataDicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataDicExample() {
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

        public Criteria andDicIdIsNull() {
            addCriterion("DIC_ID is null");
            return (Criteria) this;
        }

        public Criteria andDicIdIsNotNull() {
            addCriterion("DIC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDicIdEqualTo(Integer value) {
            addCriterion("DIC_ID =", value, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicIdNotEqualTo(Integer value) {
            addCriterion("DIC_ID <>", value, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicIdGreaterThan(Integer value) {
            addCriterion("DIC_ID >", value, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DIC_ID >=", value, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicIdLessThan(Integer value) {
            addCriterion("DIC_ID <", value, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicIdLessThanOrEqualTo(Integer value) {
            addCriterion("DIC_ID <=", value, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicIdIn(List<Integer> values) {
            addCriterion("DIC_ID in", values, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicIdNotIn(List<Integer> values) {
            addCriterion("DIC_ID not in", values, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicIdBetween(Integer value1, Integer value2) {
            addCriterion("DIC_ID between", value1, value2, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DIC_ID not between", value1, value2, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicNameIsNull() {
            addCriterion("DIC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDicNameIsNotNull() {
            addCriterion("DIC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDicNameEqualTo(String value) {
            addCriterion("DIC_NAME =", value, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameNotEqualTo(String value) {
            addCriterion("DIC_NAME <>", value, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameGreaterThan(String value) {
            addCriterion("DIC_NAME >", value, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameGreaterThanOrEqualTo(String value) {
            addCriterion("DIC_NAME >=", value, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameLessThan(String value) {
            addCriterion("DIC_NAME <", value, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameLessThanOrEqualTo(String value) {
            addCriterion("DIC_NAME <=", value, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameLike(String value) {
            addCriterion("DIC_NAME like", value, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameNotLike(String value) {
            addCriterion("DIC_NAME not like", value, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameIn(List<String> values) {
            addCriterion("DIC_NAME in", values, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameNotIn(List<String> values) {
            addCriterion("DIC_NAME not in", values, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameBetween(String value1, String value2) {
            addCriterion("DIC_NAME between", value1, value2, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNameNotBetween(String value1, String value2) {
            addCriterion("DIC_NAME not between", value1, value2, "dicName");
            return (Criteria) this;
        }

        public Criteria andDicNoIsNull() {
            addCriterion("DIC_NO is null");
            return (Criteria) this;
        }

        public Criteria andDicNoIsNotNull() {
            addCriterion("DIC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDicNoEqualTo(String value) {
            addCriterion("DIC_NO =", value, "dicNo");
            return (Criteria) this;
        }

        public Criteria andDicNoNotEqualTo(String value) {
            addCriterion("DIC_NO <>", value, "dicNo");
            return (Criteria) this;
        }

        public Criteria andDicNoGreaterThan(String value) {
            addCriterion("DIC_NO >", value, "dicNo");
            return (Criteria) this;
        }

        public Criteria andDicNoGreaterThanOrEqualTo(String value) {
            addCriterion("DIC_NO >=", value, "dicNo");
            return (Criteria) this;
        }

        public Criteria andDicNoLessThan(String value) {
            addCriterion("DIC_NO <", value, "dicNo");
            return (Criteria) this;
        }

        public Criteria andDicNoLessThanOrEqualTo(String value) {
            addCriterion("DIC_NO <=", value, "dicNo");
            return (Criteria) this;
        }

        public Criteria andDicNoLike(String value) {
            addCriterion("DIC_NO like", value, "dicNo");
            return (Criteria) this;
        }

        public Criteria andDicNoNotLike(String value) {
            addCriterion("DIC_NO not like", value, "dicNo");
            return (Criteria) this;
        }

        public Criteria andDicNoIn(List<String> values) {
            addCriterion("DIC_NO in", values, "dicNo");
            return (Criteria) this;
        }

        public Criteria andDicNoNotIn(List<String> values) {
            addCriterion("DIC_NO not in", values, "dicNo");
            return (Criteria) this;
        }

        public Criteria andDicNoBetween(String value1, String value2) {
            addCriterion("DIC_NO between", value1, value2, "dicNo");
            return (Criteria) this;
        }

        public Criteria andDicNoNotBetween(String value1, String value2) {
            addCriterion("DIC_NO not between", value1, value2, "dicNo");
            return (Criteria) this;
        }

        public Criteria andDicKeyIsNull() {
            addCriterion("DIC_KEY is null");
            return (Criteria) this;
        }

        public Criteria andDicKeyIsNotNull() {
            addCriterion("DIC_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andDicKeyEqualTo(String value) {
            addCriterion("DIC_KEY =", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyNotEqualTo(String value) {
            addCriterion("DIC_KEY <>", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyGreaterThan(String value) {
            addCriterion("DIC_KEY >", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyGreaterThanOrEqualTo(String value) {
            addCriterion("DIC_KEY >=", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyLessThan(String value) {
            addCriterion("DIC_KEY <", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyLessThanOrEqualTo(String value) {
            addCriterion("DIC_KEY <=", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyLike(String value) {
            addCriterion("DIC_KEY like", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyNotLike(String value) {
            addCriterion("DIC_KEY not like", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyIn(List<String> values) {
            addCriterion("DIC_KEY in", values, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyNotIn(List<String> values) {
            addCriterion("DIC_KEY not in", values, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyBetween(String value1, String value2) {
            addCriterion("DIC_KEY between", value1, value2, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyNotBetween(String value1, String value2) {
            addCriterion("DIC_KEY not between", value1, value2, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicValueIsNull() {
            addCriterion("DIC_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andDicValueIsNotNull() {
            addCriterion("DIC_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andDicValueEqualTo(String value) {
            addCriterion("DIC_VALUE =", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueNotEqualTo(String value) {
            addCriterion("DIC_VALUE <>", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueGreaterThan(String value) {
            addCriterion("DIC_VALUE >", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueGreaterThanOrEqualTo(String value) {
            addCriterion("DIC_VALUE >=", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueLessThan(String value) {
            addCriterion("DIC_VALUE <", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueLessThanOrEqualTo(String value) {
            addCriterion("DIC_VALUE <=", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueLike(String value) {
            addCriterion("DIC_VALUE like", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueNotLike(String value) {
            addCriterion("DIC_VALUE not like", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueIn(List<String> values) {
            addCriterion("DIC_VALUE in", values, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueNotIn(List<String> values) {
            addCriterion("DIC_VALUE not in", values, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueBetween(String value1, String value2) {
            addCriterion("DIC_VALUE between", value1, value2, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueNotBetween(String value1, String value2) {
            addCriterion("DIC_VALUE not between", value1, value2, "dicValue");
            return (Criteria) this;
        }

        public Criteria andSeqIsNull() {
            addCriterion("SEQ is null");
            return (Criteria) this;
        }

        public Criteria andSeqIsNotNull() {
            addCriterion("SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andSeqEqualTo(Integer value) {
            addCriterion("SEQ =", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotEqualTo(Integer value) {
            addCriterion("SEQ <>", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThan(Integer value) {
            addCriterion("SEQ >", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEQ >=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThan(Integer value) {
            addCriterion("SEQ <", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThanOrEqualTo(Integer value) {
            addCriterion("SEQ <=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqIn(List<Integer> values) {
            addCriterion("SEQ in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotIn(List<Integer> values) {
            addCriterion("SEQ not in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqBetween(Integer value1, Integer value2) {
            addCriterion("SEQ between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("SEQ not between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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