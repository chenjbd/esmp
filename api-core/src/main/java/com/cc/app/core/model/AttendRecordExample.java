package com.cc.app.core.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttendRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttendRecordExample() {
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

        public Criteria andAttendDateIsNull() {
            addCriterion("ATTEND_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAttendDateIsNotNull() {
            addCriterion("ATTEND_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAttendDateEqualTo(String value) {
            addCriterion("ATTEND_DATE =", value, "attendDate");
            return (Criteria) this;
        }

        public Criteria andAttendDateNotEqualTo(String value) {
            addCriterion("ATTEND_DATE <>", value, "attendDate");
            return (Criteria) this;
        }

        public Criteria andAttendDateGreaterThan(String value) {
            addCriterion("ATTEND_DATE >", value, "attendDate");
            return (Criteria) this;
        }

        public Criteria andAttendDateGreaterThanOrEqualTo(String value) {
            addCriterion("ATTEND_DATE >=", value, "attendDate");
            return (Criteria) this;
        }

        public Criteria andAttendDateLessThan(String value) {
            addCriterion("ATTEND_DATE <", value, "attendDate");
            return (Criteria) this;
        }

        public Criteria andAttendDateLessThanOrEqualTo(String value) {
            addCriterion("ATTEND_DATE <=", value, "attendDate");
            return (Criteria) this;
        }

        public Criteria andAttendDateLike(String value) {
            addCriterion("ATTEND_DATE like", value, "attendDate");
            return (Criteria) this;
        }

        public Criteria andAttendDateNotLike(String value) {
            addCriterion("ATTEND_DATE not like", value, "attendDate");
            return (Criteria) this;
        }

        public Criteria andAttendDateIn(List<String> values) {
            addCriterion("ATTEND_DATE in", values, "attendDate");
            return (Criteria) this;
        }

        public Criteria andAttendDateNotIn(List<String> values) {
            addCriterion("ATTEND_DATE not in", values, "attendDate");
            return (Criteria) this;
        }

        public Criteria andAttendDateBetween(String value1, String value2) {
            addCriterion("ATTEND_DATE between", value1, value2, "attendDate");
            return (Criteria) this;
        }

        public Criteria andAttendDateNotBetween(String value1, String value2) {
            addCriterion("ATTEND_DATE not between", value1, value2, "attendDate");
            return (Criteria) this;
        }

        public Criteria andCheckOprIsNull() {
            addCriterion("CHECK_OPR is null");
            return (Criteria) this;
        }

        public Criteria andCheckOprIsNotNull() {
            addCriterion("CHECK_OPR is not null");
            return (Criteria) this;
        }

        public Criteria andCheckOprEqualTo(String value) {
            addCriterion("CHECK_OPR =", value, "checkOpr");
            return (Criteria) this;
        }

        public Criteria andCheckOprNotEqualTo(String value) {
            addCriterion("CHECK_OPR <>", value, "checkOpr");
            return (Criteria) this;
        }

        public Criteria andCheckOprGreaterThan(String value) {
            addCriterion("CHECK_OPR >", value, "checkOpr");
            return (Criteria) this;
        }

        public Criteria andCheckOprGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_OPR >=", value, "checkOpr");
            return (Criteria) this;
        }

        public Criteria andCheckOprLessThan(String value) {
            addCriterion("CHECK_OPR <", value, "checkOpr");
            return (Criteria) this;
        }

        public Criteria andCheckOprLessThanOrEqualTo(String value) {
            addCriterion("CHECK_OPR <=", value, "checkOpr");
            return (Criteria) this;
        }

        public Criteria andCheckOprLike(String value) {
            addCriterion("CHECK_OPR like", value, "checkOpr");
            return (Criteria) this;
        }

        public Criteria andCheckOprNotLike(String value) {
            addCriterion("CHECK_OPR not like", value, "checkOpr");
            return (Criteria) this;
        }

        public Criteria andCheckOprIn(List<String> values) {
            addCriterion("CHECK_OPR in", values, "checkOpr");
            return (Criteria) this;
        }

        public Criteria andCheckOprNotIn(List<String> values) {
            addCriterion("CHECK_OPR not in", values, "checkOpr");
            return (Criteria) this;
        }

        public Criteria andCheckOprBetween(String value1, String value2) {
            addCriterion("CHECK_OPR between", value1, value2, "checkOpr");
            return (Criteria) this;
        }

        public Criteria andCheckOprNotBetween(String value1, String value2) {
            addCriterion("CHECK_OPR not between", value1, value2, "checkOpr");
            return (Criteria) this;
        }

        public Criteria andCheckOnTimeIsNull() {
            addCriterion("CHECK_ON_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCheckOnTimeIsNotNull() {
            addCriterion("CHECK_ON_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCheckOnTimeEqualTo(Date value) {
            addCriterion("CHECK_ON_TIME =", value, "checkOnTime");
            return (Criteria) this;
        }

        public Criteria andCheckOnTimeNotEqualTo(Date value) {
            addCriterion("CHECK_ON_TIME <>", value, "checkOnTime");
            return (Criteria) this;
        }

        public Criteria andCheckOnTimeGreaterThan(Date value) {
            addCriterion("CHECK_ON_TIME >", value, "checkOnTime");
            return (Criteria) this;
        }

        public Criteria andCheckOnTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CHECK_ON_TIME >=", value, "checkOnTime");
            return (Criteria) this;
        }

        public Criteria andCheckOnTimeLessThan(Date value) {
            addCriterion("CHECK_ON_TIME <", value, "checkOnTime");
            return (Criteria) this;
        }

        public Criteria andCheckOnTimeLessThanOrEqualTo(Date value) {
            addCriterion("CHECK_ON_TIME <=", value, "checkOnTime");
            return (Criteria) this;
        }

        public Criteria andCheckOnTimeIn(List<Date> values) {
            addCriterion("CHECK_ON_TIME in", values, "checkOnTime");
            return (Criteria) this;
        }

        public Criteria andCheckOnTimeNotIn(List<Date> values) {
            addCriterion("CHECK_ON_TIME not in", values, "checkOnTime");
            return (Criteria) this;
        }

        public Criteria andCheckOnTimeBetween(Date value1, Date value2) {
            addCriterion("CHECK_ON_TIME between", value1, value2, "checkOnTime");
            return (Criteria) this;
        }

        public Criteria andCheckOnTimeNotBetween(Date value1, Date value2) {
            addCriterion("CHECK_ON_TIME not between", value1, value2, "checkOnTime");
            return (Criteria) this;
        }

        public Criteria andCheckOffTimeIsNull() {
            addCriterion("CHECK_OFF_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCheckOffTimeIsNotNull() {
            addCriterion("CHECK_OFF_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCheckOffTimeEqualTo(Date value) {
            addCriterion("CHECK_OFF_TIME =", value, "checkOffTime");
            return (Criteria) this;
        }

        public Criteria andCheckOffTimeNotEqualTo(Date value) {
            addCriterion("CHECK_OFF_TIME <>", value, "checkOffTime");
            return (Criteria) this;
        }

        public Criteria andCheckOffTimeGreaterThan(Date value) {
            addCriterion("CHECK_OFF_TIME >", value, "checkOffTime");
            return (Criteria) this;
        }

        public Criteria andCheckOffTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CHECK_OFF_TIME >=", value, "checkOffTime");
            return (Criteria) this;
        }

        public Criteria andCheckOffTimeLessThan(Date value) {
            addCriterion("CHECK_OFF_TIME <", value, "checkOffTime");
            return (Criteria) this;
        }

        public Criteria andCheckOffTimeLessThanOrEqualTo(Date value) {
            addCriterion("CHECK_OFF_TIME <=", value, "checkOffTime");
            return (Criteria) this;
        }

        public Criteria andCheckOffTimeIn(List<Date> values) {
            addCriterion("CHECK_OFF_TIME in", values, "checkOffTime");
            return (Criteria) this;
        }

        public Criteria andCheckOffTimeNotIn(List<Date> values) {
            addCriterion("CHECK_OFF_TIME not in", values, "checkOffTime");
            return (Criteria) this;
        }

        public Criteria andCheckOffTimeBetween(Date value1, Date value2) {
            addCriterion("CHECK_OFF_TIME between", value1, value2, "checkOffTime");
            return (Criteria) this;
        }

        public Criteria andCheckOffTimeNotBetween(Date value1, Date value2) {
            addCriterion("CHECK_OFF_TIME not between", value1, value2, "checkOffTime");
            return (Criteria) this;
        }

        public Criteria andIsLateIsNull() {
            addCriterion("IS_LATE is null");
            return (Criteria) this;
        }

        public Criteria andIsLateIsNotNull() {
            addCriterion("IS_LATE is not null");
            return (Criteria) this;
        }

        public Criteria andIsLateEqualTo(String value) {
            addCriterion("IS_LATE =", value, "isLate");
            return (Criteria) this;
        }

        public Criteria andIsLateNotEqualTo(String value) {
            addCriterion("IS_LATE <>", value, "isLate");
            return (Criteria) this;
        }

        public Criteria andIsLateGreaterThan(String value) {
            addCriterion("IS_LATE >", value, "isLate");
            return (Criteria) this;
        }

        public Criteria andIsLateGreaterThanOrEqualTo(String value) {
            addCriterion("IS_LATE >=", value, "isLate");
            return (Criteria) this;
        }

        public Criteria andIsLateLessThan(String value) {
            addCriterion("IS_LATE <", value, "isLate");
            return (Criteria) this;
        }

        public Criteria andIsLateLessThanOrEqualTo(String value) {
            addCriterion("IS_LATE <=", value, "isLate");
            return (Criteria) this;
        }

        public Criteria andIsLateLike(String value) {
            addCriterion("IS_LATE like", value, "isLate");
            return (Criteria) this;
        }

        public Criteria andIsLateNotLike(String value) {
            addCriterion("IS_LATE not like", value, "isLate");
            return (Criteria) this;
        }

        public Criteria andIsLateIn(List<String> values) {
            addCriterion("IS_LATE in", values, "isLate");
            return (Criteria) this;
        }

        public Criteria andIsLateNotIn(List<String> values) {
            addCriterion("IS_LATE not in", values, "isLate");
            return (Criteria) this;
        }

        public Criteria andIsLateBetween(String value1, String value2) {
            addCriterion("IS_LATE between", value1, value2, "isLate");
            return (Criteria) this;
        }

        public Criteria andIsLateNotBetween(String value1, String value2) {
            addCriterion("IS_LATE not between", value1, value2, "isLate");
            return (Criteria) this;
        }

        public Criteria andIsEarlyIsNull() {
            addCriterion("IS_EARLY is null");
            return (Criteria) this;
        }

        public Criteria andIsEarlyIsNotNull() {
            addCriterion("IS_EARLY is not null");
            return (Criteria) this;
        }

        public Criteria andIsEarlyEqualTo(String value) {
            addCriterion("IS_EARLY =", value, "isEarly");
            return (Criteria) this;
        }

        public Criteria andIsEarlyNotEqualTo(String value) {
            addCriterion("IS_EARLY <>", value, "isEarly");
            return (Criteria) this;
        }

        public Criteria andIsEarlyGreaterThan(String value) {
            addCriterion("IS_EARLY >", value, "isEarly");
            return (Criteria) this;
        }

        public Criteria andIsEarlyGreaterThanOrEqualTo(String value) {
            addCriterion("IS_EARLY >=", value, "isEarly");
            return (Criteria) this;
        }

        public Criteria andIsEarlyLessThan(String value) {
            addCriterion("IS_EARLY <", value, "isEarly");
            return (Criteria) this;
        }

        public Criteria andIsEarlyLessThanOrEqualTo(String value) {
            addCriterion("IS_EARLY <=", value, "isEarly");
            return (Criteria) this;
        }

        public Criteria andIsEarlyLike(String value) {
            addCriterion("IS_EARLY like", value, "isEarly");
            return (Criteria) this;
        }

        public Criteria andIsEarlyNotLike(String value) {
            addCriterion("IS_EARLY not like", value, "isEarly");
            return (Criteria) this;
        }

        public Criteria andIsEarlyIn(List<String> values) {
            addCriterion("IS_EARLY in", values, "isEarly");
            return (Criteria) this;
        }

        public Criteria andIsEarlyNotIn(List<String> values) {
            addCriterion("IS_EARLY not in", values, "isEarly");
            return (Criteria) this;
        }

        public Criteria andIsEarlyBetween(String value1, String value2) {
            addCriterion("IS_EARLY between", value1, value2, "isEarly");
            return (Criteria) this;
        }

        public Criteria andIsEarlyNotBetween(String value1, String value2) {
            addCriterion("IS_EARLY not between", value1, value2, "isEarly");
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