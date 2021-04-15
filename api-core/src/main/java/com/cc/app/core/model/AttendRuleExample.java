package com.cc.app.core.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttendRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttendRuleExample() {
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

        public Criteria andAttendNameIsNull() {
            addCriterion("ATTEND_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAttendNameIsNotNull() {
            addCriterion("ATTEND_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAttendNameEqualTo(String value) {
            addCriterion("ATTEND_NAME =", value, "attendName");
            return (Criteria) this;
        }

        public Criteria andAttendNameNotEqualTo(String value) {
            addCriterion("ATTEND_NAME <>", value, "attendName");
            return (Criteria) this;
        }

        public Criteria andAttendNameGreaterThan(String value) {
            addCriterion("ATTEND_NAME >", value, "attendName");
            return (Criteria) this;
        }

        public Criteria andAttendNameGreaterThanOrEqualTo(String value) {
            addCriterion("ATTEND_NAME >=", value, "attendName");
            return (Criteria) this;
        }

        public Criteria andAttendNameLessThan(String value) {
            addCriterion("ATTEND_NAME <", value, "attendName");
            return (Criteria) this;
        }

        public Criteria andAttendNameLessThanOrEqualTo(String value) {
            addCriterion("ATTEND_NAME <=", value, "attendName");
            return (Criteria) this;
        }

        public Criteria andAttendNameLike(String value) {
            addCriterion("ATTEND_NAME like", value, "attendName");
            return (Criteria) this;
        }

        public Criteria andAttendNameNotLike(String value) {
            addCriterion("ATTEND_NAME not like", value, "attendName");
            return (Criteria) this;
        }

        public Criteria andAttendNameIn(List<String> values) {
            addCriterion("ATTEND_NAME in", values, "attendName");
            return (Criteria) this;
        }

        public Criteria andAttendNameNotIn(List<String> values) {
            addCriterion("ATTEND_NAME not in", values, "attendName");
            return (Criteria) this;
        }

        public Criteria andAttendNameBetween(String value1, String value2) {
            addCriterion("ATTEND_NAME between", value1, value2, "attendName");
            return (Criteria) this;
        }

        public Criteria andAttendNameNotBetween(String value1, String value2) {
            addCriterion("ATTEND_NAME not between", value1, value2, "attendName");
            return (Criteria) this;
        }

        public Criteria andOnTimeIsNull() {
            addCriterion("ON_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOnTimeIsNotNull() {
            addCriterion("ON_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOnTimeEqualTo(String value) {
            addCriterion("ON_TIME =", value, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeNotEqualTo(String value) {
            addCriterion("ON_TIME <>", value, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeGreaterThan(String value) {
            addCriterion("ON_TIME >", value, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ON_TIME >=", value, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeLessThan(String value) {
            addCriterion("ON_TIME <", value, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeLessThanOrEqualTo(String value) {
            addCriterion("ON_TIME <=", value, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeLike(String value) {
            addCriterion("ON_TIME like", value, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeNotLike(String value) {
            addCriterion("ON_TIME not like", value, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeIn(List<String> values) {
            addCriterion("ON_TIME in", values, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeNotIn(List<String> values) {
            addCriterion("ON_TIME not in", values, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeBetween(String value1, String value2) {
            addCriterion("ON_TIME between", value1, value2, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeNotBetween(String value1, String value2) {
            addCriterion("ON_TIME not between", value1, value2, "onTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeIsNull() {
            addCriterion("OFF_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOffTimeIsNotNull() {
            addCriterion("OFF_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOffTimeEqualTo(String value) {
            addCriterion("OFF_TIME =", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeNotEqualTo(String value) {
            addCriterion("OFF_TIME <>", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeGreaterThan(String value) {
            addCriterion("OFF_TIME >", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeGreaterThanOrEqualTo(String value) {
            addCriterion("OFF_TIME >=", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeLessThan(String value) {
            addCriterion("OFF_TIME <", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeLessThanOrEqualTo(String value) {
            addCriterion("OFF_TIME <=", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeLike(String value) {
            addCriterion("OFF_TIME like", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeNotLike(String value) {
            addCriterion("OFF_TIME not like", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeIn(List<String> values) {
            addCriterion("OFF_TIME in", values, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeNotIn(List<String> values) {
            addCriterion("OFF_TIME not in", values, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeBetween(String value1, String value2) {
            addCriterion("OFF_TIME between", value1, value2, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeNotBetween(String value1, String value2) {
            addCriterion("OFF_TIME not between", value1, value2, "offTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNull() {
            addCriterion("WORK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNotNull() {
            addCriterion("WORK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeEqualTo(Integer value) {
            addCriterion("WORK_TIME =", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotEqualTo(Integer value) {
            addCriterion("WORK_TIME <>", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThan(Integer value) {
            addCriterion("WORK_TIME >", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("WORK_TIME >=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThan(Integer value) {
            addCriterion("WORK_TIME <", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThanOrEqualTo(Integer value) {
            addCriterion("WORK_TIME <=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIn(List<Integer> values) {
            addCriterion("WORK_TIME in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotIn(List<Integer> values) {
            addCriterion("WORK_TIME not in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeBetween(Integer value1, Integer value2) {
            addCriterion("WORK_TIME between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("WORK_TIME not between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andSeriousLateMinIsNull() {
            addCriterion("SERIOUS_LATE_MIN is null");
            return (Criteria) this;
        }

        public Criteria andSeriousLateMinIsNotNull() {
            addCriterion("SERIOUS_LATE_MIN is not null");
            return (Criteria) this;
        }

        public Criteria andSeriousLateMinEqualTo(Integer value) {
            addCriterion("SERIOUS_LATE_MIN =", value, "seriousLateMin");
            return (Criteria) this;
        }

        public Criteria andSeriousLateMinNotEqualTo(Integer value) {
            addCriterion("SERIOUS_LATE_MIN <>", value, "seriousLateMin");
            return (Criteria) this;
        }

        public Criteria andSeriousLateMinGreaterThan(Integer value) {
            addCriterion("SERIOUS_LATE_MIN >", value, "seriousLateMin");
            return (Criteria) this;
        }

        public Criteria andSeriousLateMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("SERIOUS_LATE_MIN >=", value, "seriousLateMin");
            return (Criteria) this;
        }

        public Criteria andSeriousLateMinLessThan(Integer value) {
            addCriterion("SERIOUS_LATE_MIN <", value, "seriousLateMin");
            return (Criteria) this;
        }

        public Criteria andSeriousLateMinLessThanOrEqualTo(Integer value) {
            addCriterion("SERIOUS_LATE_MIN <=", value, "seriousLateMin");
            return (Criteria) this;
        }

        public Criteria andSeriousLateMinIn(List<Integer> values) {
            addCriterion("SERIOUS_LATE_MIN in", values, "seriousLateMin");
            return (Criteria) this;
        }

        public Criteria andSeriousLateMinNotIn(List<Integer> values) {
            addCriterion("SERIOUS_LATE_MIN not in", values, "seriousLateMin");
            return (Criteria) this;
        }

        public Criteria andSeriousLateMinBetween(Integer value1, Integer value2) {
            addCriterion("SERIOUS_LATE_MIN between", value1, value2, "seriousLateMin");
            return (Criteria) this;
        }

        public Criteria andSeriousLateMinNotBetween(Integer value1, Integer value2) {
            addCriterion("SERIOUS_LATE_MIN not between", value1, value2, "seriousLateMin");
            return (Criteria) this;
        }

        public Criteria andAbsentMinIsNull() {
            addCriterion("ABSENT_MIN is null");
            return (Criteria) this;
        }

        public Criteria andAbsentMinIsNotNull() {
            addCriterion("ABSENT_MIN is not null");
            return (Criteria) this;
        }

        public Criteria andAbsentMinEqualTo(Integer value) {
            addCriterion("ABSENT_MIN =", value, "absentMin");
            return (Criteria) this;
        }

        public Criteria andAbsentMinNotEqualTo(Integer value) {
            addCriterion("ABSENT_MIN <>", value, "absentMin");
            return (Criteria) this;
        }

        public Criteria andAbsentMinGreaterThan(Integer value) {
            addCriterion("ABSENT_MIN >", value, "absentMin");
            return (Criteria) this;
        }

        public Criteria andAbsentMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("ABSENT_MIN >=", value, "absentMin");
            return (Criteria) this;
        }

        public Criteria andAbsentMinLessThan(Integer value) {
            addCriterion("ABSENT_MIN <", value, "absentMin");
            return (Criteria) this;
        }

        public Criteria andAbsentMinLessThanOrEqualTo(Integer value) {
            addCriterion("ABSENT_MIN <=", value, "absentMin");
            return (Criteria) this;
        }

        public Criteria andAbsentMinIn(List<Integer> values) {
            addCriterion("ABSENT_MIN in", values, "absentMin");
            return (Criteria) this;
        }

        public Criteria andAbsentMinNotIn(List<Integer> values) {
            addCriterion("ABSENT_MIN not in", values, "absentMin");
            return (Criteria) this;
        }

        public Criteria andAbsentMinBetween(Integer value1, Integer value2) {
            addCriterion("ABSENT_MIN between", value1, value2, "absentMin");
            return (Criteria) this;
        }

        public Criteria andAbsentMinNotBetween(Integer value1, Integer value2) {
            addCriterion("ABSENT_MIN not between", value1, value2, "absentMin");
            return (Criteria) this;
        }

        public Criteria andLateMinIsNull() {
            addCriterion("LATE_MIN is null");
            return (Criteria) this;
        }

        public Criteria andLateMinIsNotNull() {
            addCriterion("LATE_MIN is not null");
            return (Criteria) this;
        }

        public Criteria andLateMinEqualTo(Integer value) {
            addCriterion("LATE_MIN =", value, "lateMin");
            return (Criteria) this;
        }

        public Criteria andLateMinNotEqualTo(Integer value) {
            addCriterion("LATE_MIN <>", value, "lateMin");
            return (Criteria) this;
        }

        public Criteria andLateMinGreaterThan(Integer value) {
            addCriterion("LATE_MIN >", value, "lateMin");
            return (Criteria) this;
        }

        public Criteria andLateMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("LATE_MIN >=", value, "lateMin");
            return (Criteria) this;
        }

        public Criteria andLateMinLessThan(Integer value) {
            addCriterion("LATE_MIN <", value, "lateMin");
            return (Criteria) this;
        }

        public Criteria andLateMinLessThanOrEqualTo(Integer value) {
            addCriterion("LATE_MIN <=", value, "lateMin");
            return (Criteria) this;
        }

        public Criteria andLateMinIn(List<Integer> values) {
            addCriterion("LATE_MIN in", values, "lateMin");
            return (Criteria) this;
        }

        public Criteria andLateMinNotIn(List<Integer> values) {
            addCriterion("LATE_MIN not in", values, "lateMin");
            return (Criteria) this;
        }

        public Criteria andLateMinBetween(Integer value1, Integer value2) {
            addCriterion("LATE_MIN between", value1, value2, "lateMin");
            return (Criteria) this;
        }

        public Criteria andLateMinNotBetween(Integer value1, Integer value2) {
            addCriterion("LATE_MIN not between", value1, value2, "lateMin");
            return (Criteria) this;
        }

        public Criteria andEarlyMinIsNull() {
            addCriterion("EARLY_MIN is null");
            return (Criteria) this;
        }

        public Criteria andEarlyMinIsNotNull() {
            addCriterion("EARLY_MIN is not null");
            return (Criteria) this;
        }

        public Criteria andEarlyMinEqualTo(Integer value) {
            addCriterion("EARLY_MIN =", value, "earlyMin");
            return (Criteria) this;
        }

        public Criteria andEarlyMinNotEqualTo(Integer value) {
            addCriterion("EARLY_MIN <>", value, "earlyMin");
            return (Criteria) this;
        }

        public Criteria andEarlyMinGreaterThan(Integer value) {
            addCriterion("EARLY_MIN >", value, "earlyMin");
            return (Criteria) this;
        }

        public Criteria andEarlyMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("EARLY_MIN >=", value, "earlyMin");
            return (Criteria) this;
        }

        public Criteria andEarlyMinLessThan(Integer value) {
            addCriterion("EARLY_MIN <", value, "earlyMin");
            return (Criteria) this;
        }

        public Criteria andEarlyMinLessThanOrEqualTo(Integer value) {
            addCriterion("EARLY_MIN <=", value, "earlyMin");
            return (Criteria) this;
        }

        public Criteria andEarlyMinIn(List<Integer> values) {
            addCriterion("EARLY_MIN in", values, "earlyMin");
            return (Criteria) this;
        }

        public Criteria andEarlyMinNotIn(List<Integer> values) {
            addCriterion("EARLY_MIN not in", values, "earlyMin");
            return (Criteria) this;
        }

        public Criteria andEarlyMinBetween(Integer value1, Integer value2) {
            addCriterion("EARLY_MIN between", value1, value2, "earlyMin");
            return (Criteria) this;
        }

        public Criteria andEarlyMinNotBetween(Integer value1, Integer value2) {
            addCriterion("EARLY_MIN not between", value1, value2, "earlyMin");
            return (Criteria) this;
        }

        public Criteria andAddressNameIsNull() {
            addCriterion("ADDRESS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAddressNameIsNotNull() {
            addCriterion("ADDRESS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAddressNameEqualTo(String value) {
            addCriterion("ADDRESS_NAME =", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameNotEqualTo(String value) {
            addCriterion("ADDRESS_NAME <>", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameGreaterThan(String value) {
            addCriterion("ADDRESS_NAME >", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_NAME >=", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameLessThan(String value) {
            addCriterion("ADDRESS_NAME <", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_NAME <=", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameLike(String value) {
            addCriterion("ADDRESS_NAME like", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameNotLike(String value) {
            addCriterion("ADDRESS_NAME not like", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameIn(List<String> values) {
            addCriterion("ADDRESS_NAME in", values, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameNotIn(List<String> values) {
            addCriterion("ADDRESS_NAME not in", values, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameBetween(String value1, String value2) {
            addCriterion("ADDRESS_NAME between", value1, value2, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameNotBetween(String value1, String value2) {
            addCriterion("ADDRESS_NAME not between", value1, value2, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("LONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("LONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("LONGITUDE =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("LONGITUDE <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("LONGITUDE >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("LONGITUDE >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("LONGITUDE <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("LONGITUDE <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("LONGITUDE like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("LONGITUDE not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("LONGITUDE in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("LONGITUDE not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("LONGITUDE between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("LONGITUDE not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("LATITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("LATITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("LATITUDE =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("LATITUDE <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("LATITUDE >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("LATITUDE >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("LATITUDE <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("LATITUDE <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("LATITUDE like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("LATITUDE not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("LATITUDE in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("LATITUDE not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("LATITUDE between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("LATITUDE not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andRadiusIsNull() {
            addCriterion("RADIUS is null");
            return (Criteria) this;
        }

        public Criteria andRadiusIsNotNull() {
            addCriterion("RADIUS is not null");
            return (Criteria) this;
        }

        public Criteria andRadiusEqualTo(Integer value) {
            addCriterion("RADIUS =", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotEqualTo(Integer value) {
            addCriterion("RADIUS <>", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusGreaterThan(Integer value) {
            addCriterion("RADIUS >", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusGreaterThanOrEqualTo(Integer value) {
            addCriterion("RADIUS >=", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusLessThan(Integer value) {
            addCriterion("RADIUS <", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusLessThanOrEqualTo(Integer value) {
            addCriterion("RADIUS <=", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusIn(List<Integer> values) {
            addCriterion("RADIUS in", values, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotIn(List<Integer> values) {
            addCriterion("RADIUS not in", values, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusBetween(Integer value1, Integer value2) {
            addCriterion("RADIUS between", value1, value2, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotBetween(Integer value1, Integer value2) {
            addCriterion("RADIUS not between", value1, value2, "radius");
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