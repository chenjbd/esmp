package com.cc.app.core.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WgImgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WgImgExample() {
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

        public Criteria andBusiIdIsNull() {
            addCriterion("BUSI_ID is null");
            return (Criteria) this;
        }

        public Criteria andBusiIdIsNotNull() {
            addCriterion("BUSI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBusiIdEqualTo(String value) {
            addCriterion("BUSI_ID =", value, "busiId");
            return (Criteria) this;
        }

        public Criteria andBusiIdNotEqualTo(String value) {
            addCriterion("BUSI_ID <>", value, "busiId");
            return (Criteria) this;
        }

        public Criteria andBusiIdGreaterThan(String value) {
            addCriterion("BUSI_ID >", value, "busiId");
            return (Criteria) this;
        }

        public Criteria andBusiIdGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_ID >=", value, "busiId");
            return (Criteria) this;
        }

        public Criteria andBusiIdLessThan(String value) {
            addCriterion("BUSI_ID <", value, "busiId");
            return (Criteria) this;
        }

        public Criteria andBusiIdLessThanOrEqualTo(String value) {
            addCriterion("BUSI_ID <=", value, "busiId");
            return (Criteria) this;
        }

        public Criteria andBusiIdLike(String value) {
            addCriterion("BUSI_ID like", value, "busiId");
            return (Criteria) this;
        }

        public Criteria andBusiIdNotLike(String value) {
            addCriterion("BUSI_ID not like", value, "busiId");
            return (Criteria) this;
        }

        public Criteria andBusiIdIn(List<String> values) {
            addCriterion("BUSI_ID in", values, "busiId");
            return (Criteria) this;
        }

        public Criteria andBusiIdNotIn(List<String> values) {
            addCriterion("BUSI_ID not in", values, "busiId");
            return (Criteria) this;
        }

        public Criteria andBusiIdBetween(String value1, String value2) {
            addCriterion("BUSI_ID between", value1, value2, "busiId");
            return (Criteria) this;
        }

        public Criteria andBusiIdNotBetween(String value1, String value2) {
            addCriterion("BUSI_ID not between", value1, value2, "busiId");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNull() {
            addCriterion("IMG_URL is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("IMG_URL is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("IMG_URL =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("IMG_URL <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("IMG_URL >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("IMG_URL >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("IMG_URL <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("IMG_URL <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("IMG_URL like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("IMG_URL not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("IMG_URL in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("IMG_URL not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("IMG_URL between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("IMG_URL not between", value1, value2, "imgUrl");
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

        public Criteria andSeqnoIsNull() {
            addCriterion("SEQNO is null");
            return (Criteria) this;
        }

        public Criteria andSeqnoIsNotNull() {
            addCriterion("SEQNO is not null");
            return (Criteria) this;
        }

        public Criteria andSeqnoEqualTo(Integer value) {
            addCriterion("SEQNO =", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoNotEqualTo(Integer value) {
            addCriterion("SEQNO <>", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoGreaterThan(Integer value) {
            addCriterion("SEQNO >", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEQNO >=", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoLessThan(Integer value) {
            addCriterion("SEQNO <", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoLessThanOrEqualTo(Integer value) {
            addCriterion("SEQNO <=", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoIn(List<Integer> values) {
            addCriterion("SEQNO in", values, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoNotIn(List<Integer> values) {
            addCriterion("SEQNO not in", values, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoBetween(Integer value1, Integer value2) {
            addCriterion("SEQNO between", value1, value2, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoNotBetween(Integer value1, Integer value2) {
            addCriterion("SEQNO not between", value1, value2, "seqno");
            return (Criteria) this;
        }

        public Criteria andIsOutIsNull() {
            addCriterion("IS_OUT is null");
            return (Criteria) this;
        }

        public Criteria andIsOutIsNotNull() {
            addCriterion("IS_OUT is not null");
            return (Criteria) this;
        }

        public Criteria andIsOutEqualTo(String value) {
            addCriterion("IS_OUT =", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutNotEqualTo(String value) {
            addCriterion("IS_OUT <>", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutGreaterThan(String value) {
            addCriterion("IS_OUT >", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutGreaterThanOrEqualTo(String value) {
            addCriterion("IS_OUT >=", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutLessThan(String value) {
            addCriterion("IS_OUT <", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutLessThanOrEqualTo(String value) {
            addCriterion("IS_OUT <=", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutLike(String value) {
            addCriterion("IS_OUT like", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutNotLike(String value) {
            addCriterion("IS_OUT not like", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutIn(List<String> values) {
            addCriterion("IS_OUT in", values, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutNotIn(List<String> values) {
            addCriterion("IS_OUT not in", values, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutBetween(String value1, String value2) {
            addCriterion("IS_OUT between", value1, value2, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutNotBetween(String value1, String value2) {
            addCriterion("IS_OUT not between", value1, value2, "isOut");
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