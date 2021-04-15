package com.cc.app.core.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventSubExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EventSubExample() {
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

        public Criteria andEventIdIsNull() {
            addCriterion("EVENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNotNull() {
            addCriterion("EVENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEventIdEqualTo(String value) {
            addCriterion("EVENT_ID =", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotEqualTo(String value) {
            addCriterion("EVENT_ID <>", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThan(String value) {
            addCriterion("EVENT_ID >", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThanOrEqualTo(String value) {
            addCriterion("EVENT_ID >=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThan(String value) {
            addCriterion("EVENT_ID <", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThanOrEqualTo(String value) {
            addCriterion("EVENT_ID <=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLike(String value) {
            addCriterion("EVENT_ID like", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotLike(String value) {
            addCriterion("EVENT_ID not like", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdIn(List<String> values) {
            addCriterion("EVENT_ID in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotIn(List<String> values) {
            addCriterion("EVENT_ID not in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdBetween(String value1, String value2) {
            addCriterion("EVENT_ID between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotBetween(String value1, String value2) {
            addCriterion("EVENT_ID not between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventTypeIsNull() {
            addCriterion("EVENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEventTypeIsNotNull() {
            addCriterion("EVENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEventTypeEqualTo(String value) {
            addCriterion("EVENT_TYPE =", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotEqualTo(String value) {
            addCriterion("EVENT_TYPE <>", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeGreaterThan(String value) {
            addCriterion("EVENT_TYPE >", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeGreaterThanOrEqualTo(String value) {
            addCriterion("EVENT_TYPE >=", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeLessThan(String value) {
            addCriterion("EVENT_TYPE <", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeLessThanOrEqualTo(String value) {
            addCriterion("EVENT_TYPE <=", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeLike(String value) {
            addCriterion("EVENT_TYPE like", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotLike(String value) {
            addCriterion("EVENT_TYPE not like", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeIn(List<String> values) {
            addCriterion("EVENT_TYPE in", values, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotIn(List<String> values) {
            addCriterion("EVENT_TYPE not in", values, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeBetween(String value1, String value2) {
            addCriterion("EVENT_TYPE between", value1, value2, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotBetween(String value1, String value2) {
            addCriterion("EVENT_TYPE not between", value1, value2, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventNameIsNull() {
            addCriterion("EVENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEventNameIsNotNull() {
            addCriterion("EVENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEventNameEqualTo(String value) {
            addCriterion("EVENT_NAME =", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotEqualTo(String value) {
            addCriterion("EVENT_NAME <>", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameGreaterThan(String value) {
            addCriterion("EVENT_NAME >", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameGreaterThanOrEqualTo(String value) {
            addCriterion("EVENT_NAME >=", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLessThan(String value) {
            addCriterion("EVENT_NAME <", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLessThanOrEqualTo(String value) {
            addCriterion("EVENT_NAME <=", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLike(String value) {
            addCriterion("EVENT_NAME like", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotLike(String value) {
            addCriterion("EVENT_NAME not like", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameIn(List<String> values) {
            addCriterion("EVENT_NAME in", values, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotIn(List<String> values) {
            addCriterion("EVENT_NAME not in", values, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameBetween(String value1, String value2) {
            addCriterion("EVENT_NAME between", value1, value2, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotBetween(String value1, String value2) {
            addCriterion("EVENT_NAME not between", value1, value2, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventDestIsNull() {
            addCriterion("EVENT_DEST is null");
            return (Criteria) this;
        }

        public Criteria andEventDestIsNotNull() {
            addCriterion("EVENT_DEST is not null");
            return (Criteria) this;
        }

        public Criteria andEventDestEqualTo(String value) {
            addCriterion("EVENT_DEST =", value, "eventDest");
            return (Criteria) this;
        }

        public Criteria andEventDestNotEqualTo(String value) {
            addCriterion("EVENT_DEST <>", value, "eventDest");
            return (Criteria) this;
        }

        public Criteria andEventDestGreaterThan(String value) {
            addCriterion("EVENT_DEST >", value, "eventDest");
            return (Criteria) this;
        }

        public Criteria andEventDestGreaterThanOrEqualTo(String value) {
            addCriterion("EVENT_DEST >=", value, "eventDest");
            return (Criteria) this;
        }

        public Criteria andEventDestLessThan(String value) {
            addCriterion("EVENT_DEST <", value, "eventDest");
            return (Criteria) this;
        }

        public Criteria andEventDestLessThanOrEqualTo(String value) {
            addCriterion("EVENT_DEST <=", value, "eventDest");
            return (Criteria) this;
        }

        public Criteria andEventDestLike(String value) {
            addCriterion("EVENT_DEST like", value, "eventDest");
            return (Criteria) this;
        }

        public Criteria andEventDestNotLike(String value) {
            addCriterion("EVENT_DEST not like", value, "eventDest");
            return (Criteria) this;
        }

        public Criteria andEventDestIn(List<String> values) {
            addCriterion("EVENT_DEST in", values, "eventDest");
            return (Criteria) this;
        }

        public Criteria andEventDestNotIn(List<String> values) {
            addCriterion("EVENT_DEST not in", values, "eventDest");
            return (Criteria) this;
        }

        public Criteria andEventDestBetween(String value1, String value2) {
            addCriterion("EVENT_DEST between", value1, value2, "eventDest");
            return (Criteria) this;
        }

        public Criteria andEventDestNotBetween(String value1, String value2) {
            addCriterion("EVENT_DEST not between", value1, value2, "eventDest");
            return (Criteria) this;
        }

        public Criteria andSubTypeIsNull() {
            addCriterion("SUB_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSubTypeIsNotNull() {
            addCriterion("SUB_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSubTypeEqualTo(String value) {
            addCriterion("SUB_TYPE =", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeNotEqualTo(String value) {
            addCriterion("SUB_TYPE <>", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeGreaterThan(String value) {
            addCriterion("SUB_TYPE >", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SUB_TYPE >=", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeLessThan(String value) {
            addCriterion("SUB_TYPE <", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeLessThanOrEqualTo(String value) {
            addCriterion("SUB_TYPE <=", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeLike(String value) {
            addCriterion("SUB_TYPE like", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeNotLike(String value) {
            addCriterion("SUB_TYPE not like", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeIn(List<String> values) {
            addCriterion("SUB_TYPE in", values, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeNotIn(List<String> values) {
            addCriterion("SUB_TYPE not in", values, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeBetween(String value1, String value2) {
            addCriterion("SUB_TYPE between", value1, value2, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeNotBetween(String value1, String value2) {
            addCriterion("SUB_TYPE not between", value1, value2, "subType");
            return (Criteria) this;
        }

        public Criteria andEventLvlIsNull() {
            addCriterion("EVENT_LVL is null");
            return (Criteria) this;
        }

        public Criteria andEventLvlIsNotNull() {
            addCriterion("EVENT_LVL is not null");
            return (Criteria) this;
        }

        public Criteria andEventLvlEqualTo(String value) {
            addCriterion("EVENT_LVL =", value, "eventLvl");
            return (Criteria) this;
        }

        public Criteria andEventLvlNotEqualTo(String value) {
            addCriterion("EVENT_LVL <>", value, "eventLvl");
            return (Criteria) this;
        }

        public Criteria andEventLvlGreaterThan(String value) {
            addCriterion("EVENT_LVL >", value, "eventLvl");
            return (Criteria) this;
        }

        public Criteria andEventLvlGreaterThanOrEqualTo(String value) {
            addCriterion("EVENT_LVL >=", value, "eventLvl");
            return (Criteria) this;
        }

        public Criteria andEventLvlLessThan(String value) {
            addCriterion("EVENT_LVL <", value, "eventLvl");
            return (Criteria) this;
        }

        public Criteria andEventLvlLessThanOrEqualTo(String value) {
            addCriterion("EVENT_LVL <=", value, "eventLvl");
            return (Criteria) this;
        }

        public Criteria andEventLvlLike(String value) {
            addCriterion("EVENT_LVL like", value, "eventLvl");
            return (Criteria) this;
        }

        public Criteria andEventLvlNotLike(String value) {
            addCriterion("EVENT_LVL not like", value, "eventLvl");
            return (Criteria) this;
        }

        public Criteria andEventLvlIn(List<String> values) {
            addCriterion("EVENT_LVL in", values, "eventLvl");
            return (Criteria) this;
        }

        public Criteria andEventLvlNotIn(List<String> values) {
            addCriterion("EVENT_LVL not in", values, "eventLvl");
            return (Criteria) this;
        }

        public Criteria andEventLvlBetween(String value1, String value2) {
            addCriterion("EVENT_LVL between", value1, value2, "eventLvl");
            return (Criteria) this;
        }

        public Criteria andEventLvlNotBetween(String value1, String value2) {
            addCriterion("EVENT_LVL not between", value1, value2, "eventLvl");
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