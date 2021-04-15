package com.cc.app.pms.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountInfoExample() {
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

        public Criteria andAccIdIsNull() {
            addCriterion("ACC_ID is null");
            return (Criteria) this;
        }

        public Criteria andAccIdIsNotNull() {
            addCriterion("ACC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAccIdEqualTo(String value) {
            addCriterion("ACC_ID =", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdNotEqualTo(String value) {
            addCriterion("ACC_ID <>", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdGreaterThan(String value) {
            addCriterion("ACC_ID >", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdGreaterThanOrEqualTo(String value) {
            addCriterion("ACC_ID >=", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdLessThan(String value) {
            addCriterion("ACC_ID <", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdLessThanOrEqualTo(String value) {
            addCriterion("ACC_ID <=", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdLike(String value) {
            addCriterion("ACC_ID like", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdNotLike(String value) {
            addCriterion("ACC_ID not like", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdIn(List<String> values) {
            addCriterion("ACC_ID in", values, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdNotIn(List<String> values) {
            addCriterion("ACC_ID not in", values, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdBetween(String value1, String value2) {
            addCriterion("ACC_ID between", value1, value2, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdNotBetween(String value1, String value2) {
            addCriterion("ACC_ID not between", value1, value2, "accId");
            return (Criteria) this;
        }

        public Criteria andAccNameIsNull() {
            addCriterion("ACC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAccNameIsNotNull() {
            addCriterion("ACC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAccNameEqualTo(String value) {
            addCriterion("ACC_NAME =", value, "accName");
            return (Criteria) this;
        }

        public Criteria andAccNameNotEqualTo(String value) {
            addCriterion("ACC_NAME <>", value, "accName");
            return (Criteria) this;
        }

        public Criteria andAccNameGreaterThan(String value) {
            addCriterion("ACC_NAME >", value, "accName");
            return (Criteria) this;
        }

        public Criteria andAccNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACC_NAME >=", value, "accName");
            return (Criteria) this;
        }

        public Criteria andAccNameLessThan(String value) {
            addCriterion("ACC_NAME <", value, "accName");
            return (Criteria) this;
        }

        public Criteria andAccNameLessThanOrEqualTo(String value) {
            addCriterion("ACC_NAME <=", value, "accName");
            return (Criteria) this;
        }

        public Criteria andAccNameLike(String value) {
            addCriterion("ACC_NAME like", value, "accName");
            return (Criteria) this;
        }

        public Criteria andAccNameNotLike(String value) {
            addCriterion("ACC_NAME not like", value, "accName");
            return (Criteria) this;
        }

        public Criteria andAccNameIn(List<String> values) {
            addCriterion("ACC_NAME in", values, "accName");
            return (Criteria) this;
        }

        public Criteria andAccNameNotIn(List<String> values) {
            addCriterion("ACC_NAME not in", values, "accName");
            return (Criteria) this;
        }

        public Criteria andAccNameBetween(String value1, String value2) {
            addCriterion("ACC_NAME between", value1, value2, "accName");
            return (Criteria) this;
        }

        public Criteria andAccNameNotBetween(String value1, String value2) {
            addCriterion("ACC_NAME not between", value1, value2, "accName");
            return (Criteria) this;
        }

        public Criteria andAccPwdIsNull() {
            addCriterion("ACC_PWD is null");
            return (Criteria) this;
        }

        public Criteria andAccPwdIsNotNull() {
            addCriterion("ACC_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andAccPwdEqualTo(String value) {
            addCriterion("ACC_PWD =", value, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdNotEqualTo(String value) {
            addCriterion("ACC_PWD <>", value, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdGreaterThan(String value) {
            addCriterion("ACC_PWD >", value, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdGreaterThanOrEqualTo(String value) {
            addCriterion("ACC_PWD >=", value, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdLessThan(String value) {
            addCriterion("ACC_PWD <", value, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdLessThanOrEqualTo(String value) {
            addCriterion("ACC_PWD <=", value, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdLike(String value) {
            addCriterion("ACC_PWD like", value, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdNotLike(String value) {
            addCriterion("ACC_PWD not like", value, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdIn(List<String> values) {
            addCriterion("ACC_PWD in", values, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdNotIn(List<String> values) {
            addCriterion("ACC_PWD not in", values, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdBetween(String value1, String value2) {
            addCriterion("ACC_PWD between", value1, value2, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdNotBetween(String value1, String value2) {
            addCriterion("ACC_PWD not between", value1, value2, "accPwd");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("JOB is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("JOB is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("JOB =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("JOB <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("JOB >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("JOB >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("JOB <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("JOB <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("JOB like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("JOB not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("JOB in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("JOB not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("JOB between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("JOB not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andAccRoleIsNull() {
            addCriterion("ACC_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andAccRoleIsNotNull() {
            addCriterion("ACC_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andAccRoleEqualTo(String value) {
            addCriterion("ACC_ROLE =", value, "accRole");
            return (Criteria) this;
        }

        public Criteria andAccRoleNotEqualTo(String value) {
            addCriterion("ACC_ROLE <>", value, "accRole");
            return (Criteria) this;
        }

        public Criteria andAccRoleGreaterThan(String value) {
            addCriterion("ACC_ROLE >", value, "accRole");
            return (Criteria) this;
        }

        public Criteria andAccRoleGreaterThanOrEqualTo(String value) {
            addCriterion("ACC_ROLE >=", value, "accRole");
            return (Criteria) this;
        }

        public Criteria andAccRoleLessThan(String value) {
            addCriterion("ACC_ROLE <", value, "accRole");
            return (Criteria) this;
        }

        public Criteria andAccRoleLessThanOrEqualTo(String value) {
            addCriterion("ACC_ROLE <=", value, "accRole");
            return (Criteria) this;
        }

        public Criteria andAccRoleLike(String value) {
            addCriterion("ACC_ROLE like", value, "accRole");
            return (Criteria) this;
        }

        public Criteria andAccRoleNotLike(String value) {
            addCriterion("ACC_ROLE not like", value, "accRole");
            return (Criteria) this;
        }

        public Criteria andAccRoleIn(List<String> values) {
            addCriterion("ACC_ROLE in", values, "accRole");
            return (Criteria) this;
        }

        public Criteria andAccRoleNotIn(List<String> values) {
            addCriterion("ACC_ROLE not in", values, "accRole");
            return (Criteria) this;
        }

        public Criteria andAccRoleBetween(String value1, String value2) {
            addCriterion("ACC_ROLE between", value1, value2, "accRole");
            return (Criteria) this;
        }

        public Criteria andAccRoleNotBetween(String value1, String value2) {
            addCriterion("ACC_ROLE not between", value1, value2, "accRole");
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

        public Criteria andUnitNoIsNull() {
            addCriterion("UNIT_NO is null");
            return (Criteria) this;
        }

        public Criteria andUnitNoIsNotNull() {
            addCriterion("UNIT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNoEqualTo(String value) {
            addCriterion("UNIT_NO =", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoNotEqualTo(String value) {
            addCriterion("UNIT_NO <>", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoGreaterThan(String value) {
            addCriterion("UNIT_NO >", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT_NO >=", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoLessThan(String value) {
            addCriterion("UNIT_NO <", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoLessThanOrEqualTo(String value) {
            addCriterion("UNIT_NO <=", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoLike(String value) {
            addCriterion("UNIT_NO like", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoNotLike(String value) {
            addCriterion("UNIT_NO not like", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoIn(List<String> values) {
            addCriterion("UNIT_NO in", values, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoNotIn(List<String> values) {
            addCriterion("UNIT_NO not in", values, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoBetween(String value1, String value2) {
            addCriterion("UNIT_NO between", value1, value2, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoNotBetween(String value1, String value2) {
            addCriterion("UNIT_NO not between", value1, value2, "unitNo");
            return (Criteria) this;
        }

        public Criteria andKsIsNull() {
            addCriterion("KS is null");
            return (Criteria) this;
        }

        public Criteria andKsIsNotNull() {
            addCriterion("KS is not null");
            return (Criteria) this;
        }

        public Criteria andKsEqualTo(String value) {
            addCriterion("KS =", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsNotEqualTo(String value) {
            addCriterion("KS <>", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsGreaterThan(String value) {
            addCriterion("KS >", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsGreaterThanOrEqualTo(String value) {
            addCriterion("KS >=", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsLessThan(String value) {
            addCriterion("KS <", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsLessThanOrEqualTo(String value) {
            addCriterion("KS <=", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsLike(String value) {
            addCriterion("KS like", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsNotLike(String value) {
            addCriterion("KS not like", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsIn(List<String> values) {
            addCriterion("KS in", values, "ks");
            return (Criteria) this;
        }

        public Criteria andKsNotIn(List<String> values) {
            addCriterion("KS not in", values, "ks");
            return (Criteria) this;
        }

        public Criteria andKsBetween(String value1, String value2) {
            addCriterion("KS between", value1, value2, "ks");
            return (Criteria) this;
        }

        public Criteria andKsNotBetween(String value1, String value2) {
            addCriterion("KS not between", value1, value2, "ks");
            return (Criteria) this;
        }

        public Criteria andAddrIsNull() {
            addCriterion("ADDR is null");
            return (Criteria) this;
        }

        public Criteria andAddrIsNotNull() {
            addCriterion("ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andAddrEqualTo(String value) {
            addCriterion("ADDR =", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotEqualTo(String value) {
            addCriterion("ADDR <>", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThan(String value) {
            addCriterion("ADDR >", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR >=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThan(String value) {
            addCriterion("ADDR <", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThanOrEqualTo(String value) {
            addCriterion("ADDR <=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLike(String value) {
            addCriterion("ADDR like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotLike(String value) {
            addCriterion("ADDR not like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrIn(List<String> values) {
            addCriterion("ADDR in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotIn(List<String> values) {
            addCriterion("ADDR not in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrBetween(String value1, String value2) {
            addCriterion("ADDR between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotBetween(String value1, String value2) {
            addCriterion("ADDR not between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("OPEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("OPEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("OPEN_ID =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("OPEN_ID <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("OPEN_ID >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_ID >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("OPEN_ID <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("OPEN_ID <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("OPEN_ID like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("OPEN_ID not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("OPEN_ID in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("OPEN_ID not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("OPEN_ID between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("OPEN_ID not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andUnionIdIsNull() {
            addCriterion("UNION_ID is null");
            return (Criteria) this;
        }

        public Criteria andUnionIdIsNotNull() {
            addCriterion("UNION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUnionIdEqualTo(String value) {
            addCriterion("UNION_ID =", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotEqualTo(String value) {
            addCriterion("UNION_ID <>", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThan(String value) {
            addCriterion("UNION_ID >", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThanOrEqualTo(String value) {
            addCriterion("UNION_ID >=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThan(String value) {
            addCriterion("UNION_ID <", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThanOrEqualTo(String value) {
            addCriterion("UNION_ID <=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLike(String value) {
            addCriterion("UNION_ID like", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotLike(String value) {
            addCriterion("UNION_ID not like", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdIn(List<String> values) {
            addCriterion("UNION_ID in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotIn(List<String> values) {
            addCriterion("UNION_ID not in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdBetween(String value1, String value2) {
            addCriterion("UNION_ID between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotBetween(String value1, String value2) {
            addCriterion("UNION_ID not between", value1, value2, "unionId");
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