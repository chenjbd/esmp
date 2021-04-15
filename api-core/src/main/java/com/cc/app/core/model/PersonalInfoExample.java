package com.cc.app.core.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonalInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonalInfoExample() {
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

        public Criteria andUIdIsNull() {
            addCriterion("U_ID is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("U_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(String value) {
            addCriterion("U_ID =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(String value) {
            addCriterion("U_ID <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(String value) {
            addCriterion("U_ID >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(String value) {
            addCriterion("U_ID >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(String value) {
            addCriterion("U_ID <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(String value) {
            addCriterion("U_ID <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLike(String value) {
            addCriterion("U_ID like", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotLike(String value) {
            addCriterion("U_ID not like", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<String> values) {
            addCriterion("U_ID in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<String> values) {
            addCriterion("U_ID not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(String value1, String value2) {
            addCriterion("U_ID between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(String value1, String value2) {
            addCriterion("U_ID not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("CUSTOMER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("CUSTOMER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("CUSTOMER_NAME =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("CUSTOMER_NAME >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("CUSTOMER_NAME <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("CUSTOMER_NAME like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("CUSTOMER_NAME not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("CUSTOMER_NAME in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("CUSTOMER_NAME not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andPaperTypeIsNull() {
            addCriterion("PAPER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPaperTypeIsNotNull() {
            addCriterion("PAPER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPaperTypeEqualTo(String value) {
            addCriterion("PAPER_TYPE =", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeNotEqualTo(String value) {
            addCriterion("PAPER_TYPE <>", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeGreaterThan(String value) {
            addCriterion("PAPER_TYPE >", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAPER_TYPE >=", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeLessThan(String value) {
            addCriterion("PAPER_TYPE <", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeLessThanOrEqualTo(String value) {
            addCriterion("PAPER_TYPE <=", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeLike(String value) {
            addCriterion("PAPER_TYPE like", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeNotLike(String value) {
            addCriterion("PAPER_TYPE not like", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeIn(List<String> values) {
            addCriterion("PAPER_TYPE in", values, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeNotIn(List<String> values) {
            addCriterion("PAPER_TYPE not in", values, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeBetween(String value1, String value2) {
            addCriterion("PAPER_TYPE between", value1, value2, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeNotBetween(String value1, String value2) {
            addCriterion("PAPER_TYPE not between", value1, value2, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperNoIsNull() {
            addCriterion("PAPER_NO is null");
            return (Criteria) this;
        }

        public Criteria andPaperNoIsNotNull() {
            addCriterion("PAPER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPaperNoEqualTo(String value) {
            addCriterion("PAPER_NO =", value, "paperNo");
            return (Criteria) this;
        }

        public Criteria andPaperNoNotEqualTo(String value) {
            addCriterion("PAPER_NO <>", value, "paperNo");
            return (Criteria) this;
        }

        public Criteria andPaperNoGreaterThan(String value) {
            addCriterion("PAPER_NO >", value, "paperNo");
            return (Criteria) this;
        }

        public Criteria andPaperNoGreaterThanOrEqualTo(String value) {
            addCriterion("PAPER_NO >=", value, "paperNo");
            return (Criteria) this;
        }

        public Criteria andPaperNoLessThan(String value) {
            addCriterion("PAPER_NO <", value, "paperNo");
            return (Criteria) this;
        }

        public Criteria andPaperNoLessThanOrEqualTo(String value) {
            addCriterion("PAPER_NO <=", value, "paperNo");
            return (Criteria) this;
        }

        public Criteria andPaperNoLike(String value) {
            addCriterion("PAPER_NO like", value, "paperNo");
            return (Criteria) this;
        }

        public Criteria andPaperNoNotLike(String value) {
            addCriterion("PAPER_NO not like", value, "paperNo");
            return (Criteria) this;
        }

        public Criteria andPaperNoIn(List<String> values) {
            addCriterion("PAPER_NO in", values, "paperNo");
            return (Criteria) this;
        }

        public Criteria andPaperNoNotIn(List<String> values) {
            addCriterion("PAPER_NO not in", values, "paperNo");
            return (Criteria) this;
        }

        public Criteria andPaperNoBetween(String value1, String value2) {
            addCriterion("PAPER_NO between", value1, value2, "paperNo");
            return (Criteria) this;
        }

        public Criteria andPaperNoNotBetween(String value1, String value2) {
            addCriterion("PAPER_NO not between", value1, value2, "paperNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIsNull() {
            addCriterion("PHONE_NO is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIsNotNull() {
            addCriterion("PHONE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNoEqualTo(String value) {
            addCriterion("PHONE_NO =", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotEqualTo(String value) {
            addCriterion("PHONE_NO <>", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoGreaterThan(String value) {
            addCriterion("PHONE_NO >", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE_NO >=", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLessThan(String value) {
            addCriterion("PHONE_NO <", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLessThanOrEqualTo(String value) {
            addCriterion("PHONE_NO <=", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLike(String value) {
            addCriterion("PHONE_NO like", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotLike(String value) {
            addCriterion("PHONE_NO not like", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIn(List<String> values) {
            addCriterion("PHONE_NO in", values, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotIn(List<String> values) {
            addCriterion("PHONE_NO not in", values, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoBetween(String value1, String value2) {
            addCriterion("PHONE_NO between", value1, value2, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotBetween(String value1, String value2) {
            addCriterion("PHONE_NO not between", value1, value2, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("GENDER =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("GENDER <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("GENDER >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("GENDER >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("GENDER <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("GENDER <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("GENDER like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("GENDER not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("GENDER in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("GENDER not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("GENDER between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("GENDER not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andPersonTypeIsNull() {
            addCriterion("PERSON_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPersonTypeIsNotNull() {
            addCriterion("PERSON_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPersonTypeEqualTo(String value) {
            addCriterion("PERSON_TYPE =", value, "personType");
            return (Criteria) this;
        }

        public Criteria andPersonTypeNotEqualTo(String value) {
            addCriterion("PERSON_TYPE <>", value, "personType");
            return (Criteria) this;
        }

        public Criteria andPersonTypeGreaterThan(String value) {
            addCriterion("PERSON_TYPE >", value, "personType");
            return (Criteria) this;
        }

        public Criteria andPersonTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PERSON_TYPE >=", value, "personType");
            return (Criteria) this;
        }

        public Criteria andPersonTypeLessThan(String value) {
            addCriterion("PERSON_TYPE <", value, "personType");
            return (Criteria) this;
        }

        public Criteria andPersonTypeLessThanOrEqualTo(String value) {
            addCriterion("PERSON_TYPE <=", value, "personType");
            return (Criteria) this;
        }

        public Criteria andPersonTypeLike(String value) {
            addCriterion("PERSON_TYPE like", value, "personType");
            return (Criteria) this;
        }

        public Criteria andPersonTypeNotLike(String value) {
            addCriterion("PERSON_TYPE not like", value, "personType");
            return (Criteria) this;
        }

        public Criteria andPersonTypeIn(List<String> values) {
            addCriterion("PERSON_TYPE in", values, "personType");
            return (Criteria) this;
        }

        public Criteria andPersonTypeNotIn(List<String> values) {
            addCriterion("PERSON_TYPE not in", values, "personType");
            return (Criteria) this;
        }

        public Criteria andPersonTypeBetween(String value1, String value2) {
            addCriterion("PERSON_TYPE between", value1, value2, "personType");
            return (Criteria) this;
        }

        public Criteria andPersonTypeNotBetween(String value1, String value2) {
            addCriterion("PERSON_TYPE not between", value1, value2, "personType");
            return (Criteria) this;
        }

        public Criteria andDeptNoIsNull() {
            addCriterion("DEPT_NO is null");
            return (Criteria) this;
        }

        public Criteria andDeptNoIsNotNull() {
            addCriterion("DEPT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNoEqualTo(String value) {
            addCriterion("DEPT_NO =", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoNotEqualTo(String value) {
            addCriterion("DEPT_NO <>", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoGreaterThan(String value) {
            addCriterion("DEPT_NO >", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_NO >=", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoLessThan(String value) {
            addCriterion("DEPT_NO <", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoLessThanOrEqualTo(String value) {
            addCriterion("DEPT_NO <=", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoLike(String value) {
            addCriterion("DEPT_NO like", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoNotLike(String value) {
            addCriterion("DEPT_NO not like", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoIn(List<String> values) {
            addCriterion("DEPT_NO in", values, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoNotIn(List<String> values) {
            addCriterion("DEPT_NO not in", values, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoBetween(String value1, String value2) {
            addCriterion("DEPT_NO between", value1, value2, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoNotBetween(String value1, String value2) {
            addCriterion("DEPT_NO not between", value1, value2, "deptNo");
            return (Criteria) this;
        }

        public Criteria andPosNoIsNull() {
            addCriterion("POS_NO is null");
            return (Criteria) this;
        }

        public Criteria andPosNoIsNotNull() {
            addCriterion("POS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPosNoEqualTo(String value) {
            addCriterion("POS_NO =", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoNotEqualTo(String value) {
            addCriterion("POS_NO <>", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoGreaterThan(String value) {
            addCriterion("POS_NO >", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoGreaterThanOrEqualTo(String value) {
            addCriterion("POS_NO >=", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoLessThan(String value) {
            addCriterion("POS_NO <", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoLessThanOrEqualTo(String value) {
            addCriterion("POS_NO <=", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoLike(String value) {
            addCriterion("POS_NO like", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoNotLike(String value) {
            addCriterion("POS_NO not like", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoIn(List<String> values) {
            addCriterion("POS_NO in", values, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoNotIn(List<String> values) {
            addCriterion("POS_NO not in", values, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoBetween(String value1, String value2) {
            addCriterion("POS_NO between", value1, value2, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoNotBetween(String value1, String value2) {
            addCriterion("POS_NO not between", value1, value2, "posNo");
            return (Criteria) this;
        }

        public Criteria andCertNameIsNull() {
            addCriterion("CERT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCertNameIsNotNull() {
            addCriterion("CERT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCertNameEqualTo(String value) {
            addCriterion("CERT_NAME =", value, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameNotEqualTo(String value) {
            addCriterion("CERT_NAME <>", value, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameGreaterThan(String value) {
            addCriterion("CERT_NAME >", value, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameGreaterThanOrEqualTo(String value) {
            addCriterion("CERT_NAME >=", value, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameLessThan(String value) {
            addCriterion("CERT_NAME <", value, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameLessThanOrEqualTo(String value) {
            addCriterion("CERT_NAME <=", value, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameLike(String value) {
            addCriterion("CERT_NAME like", value, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameNotLike(String value) {
            addCriterion("CERT_NAME not like", value, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameIn(List<String> values) {
            addCriterion("CERT_NAME in", values, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameNotIn(List<String> values) {
            addCriterion("CERT_NAME not in", values, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameBetween(String value1, String value2) {
            addCriterion("CERT_NAME between", value1, value2, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameNotBetween(String value1, String value2) {
            addCriterion("CERT_NAME not between", value1, value2, "certName");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNull() {
            addCriterion("JOB_ID is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("JOB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(String value) {
            addCriterion("JOB_ID =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(String value) {
            addCriterion("JOB_ID <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(String value) {
            addCriterion("JOB_ID >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_ID >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(String value) {
            addCriterion("JOB_ID <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(String value) {
            addCriterion("JOB_ID <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLike(String value) {
            addCriterion("JOB_ID like", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotLike(String value) {
            addCriterion("JOB_ID not like", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<String> values) {
            addCriterion("JOB_ID in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<String> values) {
            addCriterion("JOB_ID not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(String value1, String value2) {
            addCriterion("JOB_ID between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(String value1, String value2) {
            addCriterion("JOB_ID not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andNxIdIsNull() {
            addCriterion("NX_ID is null");
            return (Criteria) this;
        }

        public Criteria andNxIdIsNotNull() {
            addCriterion("NX_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNxIdEqualTo(String value) {
            addCriterion("NX_ID =", value, "nxId");
            return (Criteria) this;
        }

        public Criteria andNxIdNotEqualTo(String value) {
            addCriterion("NX_ID <>", value, "nxId");
            return (Criteria) this;
        }

        public Criteria andNxIdGreaterThan(String value) {
            addCriterion("NX_ID >", value, "nxId");
            return (Criteria) this;
        }

        public Criteria andNxIdGreaterThanOrEqualTo(String value) {
            addCriterion("NX_ID >=", value, "nxId");
            return (Criteria) this;
        }

        public Criteria andNxIdLessThan(String value) {
            addCriterion("NX_ID <", value, "nxId");
            return (Criteria) this;
        }

        public Criteria andNxIdLessThanOrEqualTo(String value) {
            addCriterion("NX_ID <=", value, "nxId");
            return (Criteria) this;
        }

        public Criteria andNxIdLike(String value) {
            addCriterion("NX_ID like", value, "nxId");
            return (Criteria) this;
        }

        public Criteria andNxIdNotLike(String value) {
            addCriterion("NX_ID not like", value, "nxId");
            return (Criteria) this;
        }

        public Criteria andNxIdIn(List<String> values) {
            addCriterion("NX_ID in", values, "nxId");
            return (Criteria) this;
        }

        public Criteria andNxIdNotIn(List<String> values) {
            addCriterion("NX_ID not in", values, "nxId");
            return (Criteria) this;
        }

        public Criteria andNxIdBetween(String value1, String value2) {
            addCriterion("NX_ID between", value1, value2, "nxId");
            return (Criteria) this;
        }

        public Criteria andNxIdNotBetween(String value1, String value2) {
            addCriterion("NX_ID not between", value1, value2, "nxId");
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