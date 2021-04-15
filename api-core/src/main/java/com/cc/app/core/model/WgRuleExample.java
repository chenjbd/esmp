package com.cc.app.core.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WgRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WgRuleExample() {
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

        public Criteria andRuleNoIsNull() {
            addCriterion("RULE_NO is null");
            return (Criteria) this;
        }

        public Criteria andRuleNoIsNotNull() {
            addCriterion("RULE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRuleNoEqualTo(String value) {
            addCriterion("RULE_NO =", value, "ruleNo");
            return (Criteria) this;
        }

        public Criteria andRuleNoNotEqualTo(String value) {
            addCriterion("RULE_NO <>", value, "ruleNo");
            return (Criteria) this;
        }

        public Criteria andRuleNoGreaterThan(String value) {
            addCriterion("RULE_NO >", value, "ruleNo");
            return (Criteria) this;
        }

        public Criteria andRuleNoGreaterThanOrEqualTo(String value) {
            addCriterion("RULE_NO >=", value, "ruleNo");
            return (Criteria) this;
        }

        public Criteria andRuleNoLessThan(String value) {
            addCriterion("RULE_NO <", value, "ruleNo");
            return (Criteria) this;
        }

        public Criteria andRuleNoLessThanOrEqualTo(String value) {
            addCriterion("RULE_NO <=", value, "ruleNo");
            return (Criteria) this;
        }

        public Criteria andRuleNoLike(String value) {
            addCriterion("RULE_NO like", value, "ruleNo");
            return (Criteria) this;
        }

        public Criteria andRuleNoNotLike(String value) {
            addCriterion("RULE_NO not like", value, "ruleNo");
            return (Criteria) this;
        }

        public Criteria andRuleNoIn(List<String> values) {
            addCriterion("RULE_NO in", values, "ruleNo");
            return (Criteria) this;
        }

        public Criteria andRuleNoNotIn(List<String> values) {
            addCriterion("RULE_NO not in", values, "ruleNo");
            return (Criteria) this;
        }

        public Criteria andRuleNoBetween(String value1, String value2) {
            addCriterion("RULE_NO between", value1, value2, "ruleNo");
            return (Criteria) this;
        }

        public Criteria andRuleNoNotBetween(String value1, String value2) {
            addCriterion("RULE_NO not between", value1, value2, "ruleNo");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNull() {
            addCriterion("RULE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNotNull() {
            addCriterion("RULE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRuleNameEqualTo(String value) {
            addCriterion("RULE_NAME =", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotEqualTo(String value) {
            addCriterion("RULE_NAME <>", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThan(String value) {
            addCriterion("RULE_NAME >", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("RULE_NAME >=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThan(String value) {
            addCriterion("RULE_NAME <", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThanOrEqualTo(String value) {
            addCriterion("RULE_NAME <=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLike(String value) {
            addCriterion("RULE_NAME like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotLike(String value) {
            addCriterion("RULE_NAME not like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameIn(List<String> values) {
            addCriterion("RULE_NAME in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotIn(List<String> values) {
            addCriterion("RULE_NAME not in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameBetween(String value1, String value2) {
            addCriterion("RULE_NAME between", value1, value2, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotBetween(String value1, String value2) {
            addCriterion("RULE_NAME not between", value1, value2, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleDescIsNull() {
            addCriterion("RULE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andRuleDescIsNotNull() {
            addCriterion("RULE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andRuleDescEqualTo(String value) {
            addCriterion("RULE_DESC =", value, "ruleDesc");
            return (Criteria) this;
        }

        public Criteria andRuleDescNotEqualTo(String value) {
            addCriterion("RULE_DESC <>", value, "ruleDesc");
            return (Criteria) this;
        }

        public Criteria andRuleDescGreaterThan(String value) {
            addCriterion("RULE_DESC >", value, "ruleDesc");
            return (Criteria) this;
        }

        public Criteria andRuleDescGreaterThanOrEqualTo(String value) {
            addCriterion("RULE_DESC >=", value, "ruleDesc");
            return (Criteria) this;
        }

        public Criteria andRuleDescLessThan(String value) {
            addCriterion("RULE_DESC <", value, "ruleDesc");
            return (Criteria) this;
        }

        public Criteria andRuleDescLessThanOrEqualTo(String value) {
            addCriterion("RULE_DESC <=", value, "ruleDesc");
            return (Criteria) this;
        }

        public Criteria andRuleDescLike(String value) {
            addCriterion("RULE_DESC like", value, "ruleDesc");
            return (Criteria) this;
        }

        public Criteria andRuleDescNotLike(String value) {
            addCriterion("RULE_DESC not like", value, "ruleDesc");
            return (Criteria) this;
        }

        public Criteria andRuleDescIn(List<String> values) {
            addCriterion("RULE_DESC in", values, "ruleDesc");
            return (Criteria) this;
        }

        public Criteria andRuleDescNotIn(List<String> values) {
            addCriterion("RULE_DESC not in", values, "ruleDesc");
            return (Criteria) this;
        }

        public Criteria andRuleDescBetween(String value1, String value2) {
            addCriterion("RULE_DESC between", value1, value2, "ruleDesc");
            return (Criteria) this;
        }

        public Criteria andRuleDescNotBetween(String value1, String value2) {
            addCriterion("RULE_DESC not between", value1, value2, "ruleDesc");
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

        public Criteria andCrtTimeIsNull() {
            addCriterion("CRT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIsNotNull() {
            addCriterion("CRT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCrtTimeEqualTo(Date value) {
            addCriterion("CRT_TIME =", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotEqualTo(Date value) {
            addCriterion("CRT_TIME <>", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThan(Date value) {
            addCriterion("CRT_TIME >", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CRT_TIME >=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThan(Date value) {
            addCriterion("CRT_TIME <", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThanOrEqualTo(Date value) {
            addCriterion("CRT_TIME <=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIn(List<Date> values) {
            addCriterion("CRT_TIME in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotIn(List<Date> values) {
            addCriterion("CRT_TIME not in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeBetween(Date value1, Date value2) {
            addCriterion("CRT_TIME between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotBetween(Date value1, Date value2) {
            addCriterion("CRT_TIME not between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtOprIsNull() {
            addCriterion("CRT_OPR is null");
            return (Criteria) this;
        }

        public Criteria andCrtOprIsNotNull() {
            addCriterion("CRT_OPR is not null");
            return (Criteria) this;
        }

        public Criteria andCrtOprEqualTo(String value) {
            addCriterion("CRT_OPR =", value, "crtOpr");
            return (Criteria) this;
        }

        public Criteria andCrtOprNotEqualTo(String value) {
            addCriterion("CRT_OPR <>", value, "crtOpr");
            return (Criteria) this;
        }

        public Criteria andCrtOprGreaterThan(String value) {
            addCriterion("CRT_OPR >", value, "crtOpr");
            return (Criteria) this;
        }

        public Criteria andCrtOprGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_OPR >=", value, "crtOpr");
            return (Criteria) this;
        }

        public Criteria andCrtOprLessThan(String value) {
            addCriterion("CRT_OPR <", value, "crtOpr");
            return (Criteria) this;
        }

        public Criteria andCrtOprLessThanOrEqualTo(String value) {
            addCriterion("CRT_OPR <=", value, "crtOpr");
            return (Criteria) this;
        }

        public Criteria andCrtOprLike(String value) {
            addCriterion("CRT_OPR like", value, "crtOpr");
            return (Criteria) this;
        }

        public Criteria andCrtOprNotLike(String value) {
            addCriterion("CRT_OPR not like", value, "crtOpr");
            return (Criteria) this;
        }

        public Criteria andCrtOprIn(List<String> values) {
            addCriterion("CRT_OPR in", values, "crtOpr");
            return (Criteria) this;
        }

        public Criteria andCrtOprNotIn(List<String> values) {
            addCriterion("CRT_OPR not in", values, "crtOpr");
            return (Criteria) this;
        }

        public Criteria andCrtOprBetween(String value1, String value2) {
            addCriterion("CRT_OPR between", value1, value2, "crtOpr");
            return (Criteria) this;
        }

        public Criteria andCrtOprNotBetween(String value1, String value2) {
            addCriterion("CRT_OPR not between", value1, value2, "crtOpr");
            return (Criteria) this;
        }

        public Criteria andLstTimeIsNull() {
            addCriterion("LST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLstTimeIsNotNull() {
            addCriterion("LST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLstTimeEqualTo(Date value) {
            addCriterion("LST_TIME =", value, "lstTime");
            return (Criteria) this;
        }

        public Criteria andLstTimeNotEqualTo(Date value) {
            addCriterion("LST_TIME <>", value, "lstTime");
            return (Criteria) this;
        }

        public Criteria andLstTimeGreaterThan(Date value) {
            addCriterion("LST_TIME >", value, "lstTime");
            return (Criteria) this;
        }

        public Criteria andLstTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LST_TIME >=", value, "lstTime");
            return (Criteria) this;
        }

        public Criteria andLstTimeLessThan(Date value) {
            addCriterion("LST_TIME <", value, "lstTime");
            return (Criteria) this;
        }

        public Criteria andLstTimeLessThanOrEqualTo(Date value) {
            addCriterion("LST_TIME <=", value, "lstTime");
            return (Criteria) this;
        }

        public Criteria andLstTimeIn(List<Date> values) {
            addCriterion("LST_TIME in", values, "lstTime");
            return (Criteria) this;
        }

        public Criteria andLstTimeNotIn(List<Date> values) {
            addCriterion("LST_TIME not in", values, "lstTime");
            return (Criteria) this;
        }

        public Criteria andLstTimeBetween(Date value1, Date value2) {
            addCriterion("LST_TIME between", value1, value2, "lstTime");
            return (Criteria) this;
        }

        public Criteria andLstTimeNotBetween(Date value1, Date value2) {
            addCriterion("LST_TIME not between", value1, value2, "lstTime");
            return (Criteria) this;
        }

        public Criteria andLstOprIsNull() {
            addCriterion("LST_OPR is null");
            return (Criteria) this;
        }

        public Criteria andLstOprIsNotNull() {
            addCriterion("LST_OPR is not null");
            return (Criteria) this;
        }

        public Criteria andLstOprEqualTo(String value) {
            addCriterion("LST_OPR =", value, "lstOpr");
            return (Criteria) this;
        }

        public Criteria andLstOprNotEqualTo(String value) {
            addCriterion("LST_OPR <>", value, "lstOpr");
            return (Criteria) this;
        }

        public Criteria andLstOprGreaterThan(String value) {
            addCriterion("LST_OPR >", value, "lstOpr");
            return (Criteria) this;
        }

        public Criteria andLstOprGreaterThanOrEqualTo(String value) {
            addCriterion("LST_OPR >=", value, "lstOpr");
            return (Criteria) this;
        }

        public Criteria andLstOprLessThan(String value) {
            addCriterion("LST_OPR <", value, "lstOpr");
            return (Criteria) this;
        }

        public Criteria andLstOprLessThanOrEqualTo(String value) {
            addCriterion("LST_OPR <=", value, "lstOpr");
            return (Criteria) this;
        }

        public Criteria andLstOprLike(String value) {
            addCriterion("LST_OPR like", value, "lstOpr");
            return (Criteria) this;
        }

        public Criteria andLstOprNotLike(String value) {
            addCriterion("LST_OPR not like", value, "lstOpr");
            return (Criteria) this;
        }

        public Criteria andLstOprIn(List<String> values) {
            addCriterion("LST_OPR in", values, "lstOpr");
            return (Criteria) this;
        }

        public Criteria andLstOprNotIn(List<String> values) {
            addCriterion("LST_OPR not in", values, "lstOpr");
            return (Criteria) this;
        }

        public Criteria andLstOprBetween(String value1, String value2) {
            addCriterion("LST_OPR between", value1, value2, "lstOpr");
            return (Criteria) this;
        }

        public Criteria andLstOprNotBetween(String value1, String value2) {
            addCriterion("LST_OPR not between", value1, value2, "lstOpr");
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