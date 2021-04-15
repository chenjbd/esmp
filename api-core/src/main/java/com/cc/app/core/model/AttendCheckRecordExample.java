package com.cc.app.core.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttendCheckRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttendCheckRecordExample() {
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

        public Criteria andCheckTypeIsNull() {
            addCriterion("CHECK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCheckTypeIsNotNull() {
            addCriterion("CHECK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTypeEqualTo(String value) {
            addCriterion("CHECK_TYPE =", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotEqualTo(String value) {
            addCriterion("CHECK_TYPE <>", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeGreaterThan(String value) {
            addCriterion("CHECK_TYPE >", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_TYPE >=", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeLessThan(String value) {
            addCriterion("CHECK_TYPE <", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeLessThanOrEqualTo(String value) {
            addCriterion("CHECK_TYPE <=", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeLike(String value) {
            addCriterion("CHECK_TYPE like", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotLike(String value) {
            addCriterion("CHECK_TYPE not like", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeIn(List<String> values) {
            addCriterion("CHECK_TYPE in", values, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotIn(List<String> values) {
            addCriterion("CHECK_TYPE not in", values, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeBetween(String value1, String value2) {
            addCriterion("CHECK_TYPE between", value1, value2, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotBetween(String value1, String value2) {
            addCriterion("CHECK_TYPE not between", value1, value2, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("CHECK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("CHECK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(Date value) {
            addCriterion("CHECK_TIME =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(Date value) {
            addCriterion("CHECK_TIME <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(Date value) {
            addCriterion("CHECK_TIME >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CHECK_TIME >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(Date value) {
            addCriterion("CHECK_TIME <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("CHECK_TIME <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<Date> values) {
            addCriterion("CHECK_TIME in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<Date> values) {
            addCriterion("CHECK_TIME not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(Date value1, Date value2) {
            addCriterion("CHECK_TIME between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("CHECK_TIME not between", value1, value2, "checkTime");
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

        public Criteria andCheckRemarkIsNull() {
            addCriterion("CHECK_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkIsNotNull() {
            addCriterion("CHECK_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkEqualTo(String value) {
            addCriterion("CHECK_REMARK =", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkNotEqualTo(String value) {
            addCriterion("CHECK_REMARK <>", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkGreaterThan(String value) {
            addCriterion("CHECK_REMARK >", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_REMARK >=", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkLessThan(String value) {
            addCriterion("CHECK_REMARK <", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkLessThanOrEqualTo(String value) {
            addCriterion("CHECK_REMARK <=", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkLike(String value) {
            addCriterion("CHECK_REMARK like", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkNotLike(String value) {
            addCriterion("CHECK_REMARK not like", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkIn(List<String> values) {
            addCriterion("CHECK_REMARK in", values, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkNotIn(List<String> values) {
            addCriterion("CHECK_REMARK not in", values, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkBetween(String value1, String value2) {
            addCriterion("CHECK_REMARK between", value1, value2, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkNotBetween(String value1, String value2) {
            addCriterion("CHECK_REMARK not between", value1, value2, "checkRemark");
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

        public Criteria andBaseCheckTimeIsNull() {
            addCriterion("BASE_CHECK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBaseCheckTimeIsNotNull() {
            addCriterion("BASE_CHECK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBaseCheckTimeEqualTo(Date value) {
            addCriterion("BASE_CHECK_TIME =", value, "baseCheckTime");
            return (Criteria) this;
        }

        public Criteria andBaseCheckTimeNotEqualTo(Date value) {
            addCriterion("BASE_CHECK_TIME <>", value, "baseCheckTime");
            return (Criteria) this;
        }

        public Criteria andBaseCheckTimeGreaterThan(Date value) {
            addCriterion("BASE_CHECK_TIME >", value, "baseCheckTime");
            return (Criteria) this;
        }

        public Criteria andBaseCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BASE_CHECK_TIME >=", value, "baseCheckTime");
            return (Criteria) this;
        }

        public Criteria andBaseCheckTimeLessThan(Date value) {
            addCriterion("BASE_CHECK_TIME <", value, "baseCheckTime");
            return (Criteria) this;
        }

        public Criteria andBaseCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("BASE_CHECK_TIME <=", value, "baseCheckTime");
            return (Criteria) this;
        }

        public Criteria andBaseCheckTimeIn(List<Date> values) {
            addCriterion("BASE_CHECK_TIME in", values, "baseCheckTime");
            return (Criteria) this;
        }

        public Criteria andBaseCheckTimeNotIn(List<Date> values) {
            addCriterion("BASE_CHECK_TIME not in", values, "baseCheckTime");
            return (Criteria) this;
        }

        public Criteria andBaseCheckTimeBetween(Date value1, Date value2) {
            addCriterion("BASE_CHECK_TIME between", value1, value2, "baseCheckTime");
            return (Criteria) this;
        }

        public Criteria andBaseCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("BASE_CHECK_TIME not between", value1, value2, "baseCheckTime");
            return (Criteria) this;
        }

        public Criteria andCheckResultIsNull() {
            addCriterion("CHECK_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andCheckResultIsNotNull() {
            addCriterion("CHECK_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andCheckResultEqualTo(String value) {
            addCriterion("CHECK_RESULT =", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultNotEqualTo(String value) {
            addCriterion("CHECK_RESULT <>", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultGreaterThan(String value) {
            addCriterion("CHECK_RESULT >", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_RESULT >=", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultLessThan(String value) {
            addCriterion("CHECK_RESULT <", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultLessThanOrEqualTo(String value) {
            addCriterion("CHECK_RESULT <=", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultLike(String value) {
            addCriterion("CHECK_RESULT like", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultNotLike(String value) {
            addCriterion("CHECK_RESULT not like", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultIn(List<String> values) {
            addCriterion("CHECK_RESULT in", values, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultNotIn(List<String> values) {
            addCriterion("CHECK_RESULT not in", values, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultBetween(String value1, String value2) {
            addCriterion("CHECK_RESULT between", value1, value2, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultNotBetween(String value1, String value2) {
            addCriterion("CHECK_RESULT not between", value1, value2, "checkResult");
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