package com.cc.app.core.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WgActExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WgActExample() {
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

        public Criteria andSourceIsNull() {
            addCriterion("SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("SOURCE =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("SOURCE <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("SOURCE >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("SOURCE <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("SOURCE <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("SOURCE like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("SOURCE not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("SOURCE in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("SOURCE not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("SOURCE between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("SOURCE not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andWgTimeIsNull() {
            addCriterion("WG_TIME is null");
            return (Criteria) this;
        }

        public Criteria andWgTimeIsNotNull() {
            addCriterion("WG_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andWgTimeEqualTo(Date value) {
            addCriterion("WG_TIME =", value, "wgTime");
            return (Criteria) this;
        }

        public Criteria andWgTimeNotEqualTo(Date value) {
            addCriterion("WG_TIME <>", value, "wgTime");
            return (Criteria) this;
        }

        public Criteria andWgTimeGreaterThan(Date value) {
            addCriterion("WG_TIME >", value, "wgTime");
            return (Criteria) this;
        }

        public Criteria andWgTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("WG_TIME >=", value, "wgTime");
            return (Criteria) this;
        }

        public Criteria andWgTimeLessThan(Date value) {
            addCriterion("WG_TIME <", value, "wgTime");
            return (Criteria) this;
        }

        public Criteria andWgTimeLessThanOrEqualTo(Date value) {
            addCriterion("WG_TIME <=", value, "wgTime");
            return (Criteria) this;
        }

        public Criteria andWgTimeIn(List<Date> values) {
            addCriterion("WG_TIME in", values, "wgTime");
            return (Criteria) this;
        }

        public Criteria andWgTimeNotIn(List<Date> values) {
            addCriterion("WG_TIME not in", values, "wgTime");
            return (Criteria) this;
        }

        public Criteria andWgTimeBetween(Date value1, Date value2) {
            addCriterion("WG_TIME between", value1, value2, "wgTime");
            return (Criteria) this;
        }

        public Criteria andWgTimeNotBetween(Date value1, Date value2) {
            addCriterion("WG_TIME not between", value1, value2, "wgTime");
            return (Criteria) this;
        }

        public Criteria andWgTypeIsNull() {
            addCriterion("WG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andWgTypeIsNotNull() {
            addCriterion("WG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andWgTypeEqualTo(String value) {
            addCriterion("WG_TYPE =", value, "wgType");
            return (Criteria) this;
        }

        public Criteria andWgTypeNotEqualTo(String value) {
            addCriterion("WG_TYPE <>", value, "wgType");
            return (Criteria) this;
        }

        public Criteria andWgTypeGreaterThan(String value) {
            addCriterion("WG_TYPE >", value, "wgType");
            return (Criteria) this;
        }

        public Criteria andWgTypeGreaterThanOrEqualTo(String value) {
            addCriterion("WG_TYPE >=", value, "wgType");
            return (Criteria) this;
        }

        public Criteria andWgTypeLessThan(String value) {
            addCriterion("WG_TYPE <", value, "wgType");
            return (Criteria) this;
        }

        public Criteria andWgTypeLessThanOrEqualTo(String value) {
            addCriterion("WG_TYPE <=", value, "wgType");
            return (Criteria) this;
        }

        public Criteria andWgTypeLike(String value) {
            addCriterion("WG_TYPE like", value, "wgType");
            return (Criteria) this;
        }

        public Criteria andWgTypeNotLike(String value) {
            addCriterion("WG_TYPE not like", value, "wgType");
            return (Criteria) this;
        }

        public Criteria andWgTypeIn(List<String> values) {
            addCriterion("WG_TYPE in", values, "wgType");
            return (Criteria) this;
        }

        public Criteria andWgTypeNotIn(List<String> values) {
            addCriterion("WG_TYPE not in", values, "wgType");
            return (Criteria) this;
        }

        public Criteria andWgTypeBetween(String value1, String value2) {
            addCriterion("WG_TYPE between", value1, value2, "wgType");
            return (Criteria) this;
        }

        public Criteria andWgTypeNotBetween(String value1, String value2) {
            addCriterion("WG_TYPE not between", value1, value2, "wgType");
            return (Criteria) this;
        }

        public Criteria andWgRemarkIsNull() {
            addCriterion("WG_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andWgRemarkIsNotNull() {
            addCriterion("WG_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andWgRemarkEqualTo(String value) {
            addCriterion("WG_REMARK =", value, "wgRemark");
            return (Criteria) this;
        }

        public Criteria andWgRemarkNotEqualTo(String value) {
            addCriterion("WG_REMARK <>", value, "wgRemark");
            return (Criteria) this;
        }

        public Criteria andWgRemarkGreaterThan(String value) {
            addCriterion("WG_REMARK >", value, "wgRemark");
            return (Criteria) this;
        }

        public Criteria andWgRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("WG_REMARK >=", value, "wgRemark");
            return (Criteria) this;
        }

        public Criteria andWgRemarkLessThan(String value) {
            addCriterion("WG_REMARK <", value, "wgRemark");
            return (Criteria) this;
        }

        public Criteria andWgRemarkLessThanOrEqualTo(String value) {
            addCriterion("WG_REMARK <=", value, "wgRemark");
            return (Criteria) this;
        }

        public Criteria andWgRemarkLike(String value) {
            addCriterion("WG_REMARK like", value, "wgRemark");
            return (Criteria) this;
        }

        public Criteria andWgRemarkNotLike(String value) {
            addCriterion("WG_REMARK not like", value, "wgRemark");
            return (Criteria) this;
        }

        public Criteria andWgRemarkIn(List<String> values) {
            addCriterion("WG_REMARK in", values, "wgRemark");
            return (Criteria) this;
        }

        public Criteria andWgRemarkNotIn(List<String> values) {
            addCriterion("WG_REMARK not in", values, "wgRemark");
            return (Criteria) this;
        }

        public Criteria andWgRemarkBetween(String value1, String value2) {
            addCriterion("WG_REMARK between", value1, value2, "wgRemark");
            return (Criteria) this;
        }

        public Criteria andWgRemarkNotBetween(String value1, String value2) {
            addCriterion("WG_REMARK not between", value1, value2, "wgRemark");
            return (Criteria) this;
        }

        public Criteria andWgPhotoUrlIsNull() {
            addCriterion("WG_PHOTO_URL is null");
            return (Criteria) this;
        }

        public Criteria andWgPhotoUrlIsNotNull() {
            addCriterion("WG_PHOTO_URL is not null");
            return (Criteria) this;
        }

        public Criteria andWgPhotoUrlEqualTo(String value) {
            addCriterion("WG_PHOTO_URL =", value, "wgPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andWgPhotoUrlNotEqualTo(String value) {
            addCriterion("WG_PHOTO_URL <>", value, "wgPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andWgPhotoUrlGreaterThan(String value) {
            addCriterion("WG_PHOTO_URL >", value, "wgPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andWgPhotoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("WG_PHOTO_URL >=", value, "wgPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andWgPhotoUrlLessThan(String value) {
            addCriterion("WG_PHOTO_URL <", value, "wgPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andWgPhotoUrlLessThanOrEqualTo(String value) {
            addCriterion("WG_PHOTO_URL <=", value, "wgPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andWgPhotoUrlLike(String value) {
            addCriterion("WG_PHOTO_URL like", value, "wgPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andWgPhotoUrlNotLike(String value) {
            addCriterion("WG_PHOTO_URL not like", value, "wgPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andWgPhotoUrlIn(List<String> values) {
            addCriterion("WG_PHOTO_URL in", values, "wgPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andWgPhotoUrlNotIn(List<String> values) {
            addCriterion("WG_PHOTO_URL not in", values, "wgPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andWgPhotoUrlBetween(String value1, String value2) {
            addCriterion("WG_PHOTO_URL between", value1, value2, "wgPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andWgPhotoUrlNotBetween(String value1, String value2) {
            addCriterion("WG_PHOTO_URL not between", value1, value2, "wgPhotoUrl");
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

        public Criteria andTicketIdIsNull() {
            addCriterion("TICKET_ID is null");
            return (Criteria) this;
        }

        public Criteria andTicketIdIsNotNull() {
            addCriterion("TICKET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTicketIdEqualTo(String value) {
            addCriterion("TICKET_ID =", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotEqualTo(String value) {
            addCriterion("TICKET_ID <>", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdGreaterThan(String value) {
            addCriterion("TICKET_ID >", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_ID >=", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdLessThan(String value) {
            addCriterion("TICKET_ID <", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdLessThanOrEqualTo(String value) {
            addCriterion("TICKET_ID <=", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdLike(String value) {
            addCriterion("TICKET_ID like", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotLike(String value) {
            addCriterion("TICKET_ID not like", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdIn(List<String> values) {
            addCriterion("TICKET_ID in", values, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotIn(List<String> values) {
            addCriterion("TICKET_ID not in", values, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdBetween(String value1, String value2) {
            addCriterion("TICKET_ID between", value1, value2, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotBetween(String value1, String value2) {
            addCriterion("TICKET_ID not between", value1, value2, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketNoIsNull() {
            addCriterion("TICKET_NO is null");
            return (Criteria) this;
        }

        public Criteria andTicketNoIsNotNull() {
            addCriterion("TICKET_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTicketNoEqualTo(String value) {
            addCriterion("TICKET_NO =", value, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoNotEqualTo(String value) {
            addCriterion("TICKET_NO <>", value, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoGreaterThan(String value) {
            addCriterion("TICKET_NO >", value, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_NO >=", value, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoLessThan(String value) {
            addCriterion("TICKET_NO <", value, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoLessThanOrEqualTo(String value) {
            addCriterion("TICKET_NO <=", value, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoLike(String value) {
            addCriterion("TICKET_NO like", value, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoNotLike(String value) {
            addCriterion("TICKET_NO not like", value, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoIn(List<String> values) {
            addCriterion("TICKET_NO in", values, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoNotIn(List<String> values) {
            addCriterion("TICKET_NO not in", values, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoBetween(String value1, String value2) {
            addCriterion("TICKET_NO between", value1, value2, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoNotBetween(String value1, String value2) {
            addCriterion("TICKET_NO not between", value1, value2, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andPlanIdIsNull() {
            addCriterion("PLAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andPlanIdIsNotNull() {
            addCriterion("PLAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPlanIdEqualTo(String value) {
            addCriterion("PLAN_ID =", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotEqualTo(String value) {
            addCriterion("PLAN_ID <>", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThan(String value) {
            addCriterion("PLAN_ID >", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThanOrEqualTo(String value) {
            addCriterion("PLAN_ID >=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThan(String value) {
            addCriterion("PLAN_ID <", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThanOrEqualTo(String value) {
            addCriterion("PLAN_ID <=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLike(String value) {
            addCriterion("PLAN_ID like", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotLike(String value) {
            addCriterion("PLAN_ID not like", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdIn(List<String> values) {
            addCriterion("PLAN_ID in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotIn(List<String> values) {
            addCriterion("PLAN_ID not in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdBetween(String value1, String value2) {
            addCriterion("PLAN_ID between", value1, value2, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotBetween(String value1, String value2) {
            addCriterion("PLAN_ID not between", value1, value2, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanCodeIsNull() {
            addCriterion("PLAN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPlanCodeIsNotNull() {
            addCriterion("PLAN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanCodeEqualTo(String value) {
            addCriterion("PLAN_CODE =", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeNotEqualTo(String value) {
            addCriterion("PLAN_CODE <>", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeGreaterThan(String value) {
            addCriterion("PLAN_CODE >", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PLAN_CODE >=", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeLessThan(String value) {
            addCriterion("PLAN_CODE <", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeLessThanOrEqualTo(String value) {
            addCriterion("PLAN_CODE <=", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeLike(String value) {
            addCriterion("PLAN_CODE like", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeNotLike(String value) {
            addCriterion("PLAN_CODE not like", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeIn(List<String> values) {
            addCriterion("PLAN_CODE in", values, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeNotIn(List<String> values) {
            addCriterion("PLAN_CODE not in", values, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeBetween(String value1, String value2) {
            addCriterion("PLAN_CODE between", value1, value2, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeNotBetween(String value1, String value2) {
            addCriterion("PLAN_CODE not between", value1, value2, "planCode");
            return (Criteria) this;
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

        public Criteria andIsConfirmIsNull() {
            addCriterion("IS_CONFIRM is null");
            return (Criteria) this;
        }

        public Criteria andIsConfirmIsNotNull() {
            addCriterion("IS_CONFIRM is not null");
            return (Criteria) this;
        }

        public Criteria andIsConfirmEqualTo(String value) {
            addCriterion("IS_CONFIRM =", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmNotEqualTo(String value) {
            addCriterion("IS_CONFIRM <>", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmGreaterThan(String value) {
            addCriterion("IS_CONFIRM >", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CONFIRM >=", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmLessThan(String value) {
            addCriterion("IS_CONFIRM <", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmLessThanOrEqualTo(String value) {
            addCriterion("IS_CONFIRM <=", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmLike(String value) {
            addCriterion("IS_CONFIRM like", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmNotLike(String value) {
            addCriterion("IS_CONFIRM not like", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmIn(List<String> values) {
            addCriterion("IS_CONFIRM in", values, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmNotIn(List<String> values) {
            addCriterion("IS_CONFIRM not in", values, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmBetween(String value1, String value2) {
            addCriterion("IS_CONFIRM between", value1, value2, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmNotBetween(String value1, String value2) {
            addCriterion("IS_CONFIRM not between", value1, value2, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNull() {
            addCriterion("CONFIRM_TIME is null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNotNull() {
            addCriterion("CONFIRM_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeEqualTo(Date value) {
            addCriterion("CONFIRM_TIME =", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotEqualTo(Date value) {
            addCriterion("CONFIRM_TIME <>", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThan(Date value) {
            addCriterion("CONFIRM_TIME >", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CONFIRM_TIME >=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThan(Date value) {
            addCriterion("CONFIRM_TIME <", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThanOrEqualTo(Date value) {
            addCriterion("CONFIRM_TIME <=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIn(List<Date> values) {
            addCriterion("CONFIRM_TIME in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotIn(List<Date> values) {
            addCriterion("CONFIRM_TIME not in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeBetween(Date value1, Date value2) {
            addCriterion("CONFIRM_TIME between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotBetween(Date value1, Date value2) {
            addCriterion("CONFIRM_TIME not between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmOprIsNull() {
            addCriterion("CONFIRM_OPR is null");
            return (Criteria) this;
        }

        public Criteria andConfirmOprIsNotNull() {
            addCriterion("CONFIRM_OPR is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmOprEqualTo(String value) {
            addCriterion("CONFIRM_OPR =", value, "confirmOpr");
            return (Criteria) this;
        }

        public Criteria andConfirmOprNotEqualTo(String value) {
            addCriterion("CONFIRM_OPR <>", value, "confirmOpr");
            return (Criteria) this;
        }

        public Criteria andConfirmOprGreaterThan(String value) {
            addCriterion("CONFIRM_OPR >", value, "confirmOpr");
            return (Criteria) this;
        }

        public Criteria andConfirmOprGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRM_OPR >=", value, "confirmOpr");
            return (Criteria) this;
        }

        public Criteria andConfirmOprLessThan(String value) {
            addCriterion("CONFIRM_OPR <", value, "confirmOpr");
            return (Criteria) this;
        }

        public Criteria andConfirmOprLessThanOrEqualTo(String value) {
            addCriterion("CONFIRM_OPR <=", value, "confirmOpr");
            return (Criteria) this;
        }

        public Criteria andConfirmOprLike(String value) {
            addCriterion("CONFIRM_OPR like", value, "confirmOpr");
            return (Criteria) this;
        }

        public Criteria andConfirmOprNotLike(String value) {
            addCriterion("CONFIRM_OPR not like", value, "confirmOpr");
            return (Criteria) this;
        }

        public Criteria andConfirmOprIn(List<String> values) {
            addCriterion("CONFIRM_OPR in", values, "confirmOpr");
            return (Criteria) this;
        }

        public Criteria andConfirmOprNotIn(List<String> values) {
            addCriterion("CONFIRM_OPR not in", values, "confirmOpr");
            return (Criteria) this;
        }

        public Criteria andConfirmOprBetween(String value1, String value2) {
            addCriterion("CONFIRM_OPR between", value1, value2, "confirmOpr");
            return (Criteria) this;
        }

        public Criteria andConfirmOprNotBetween(String value1, String value2) {
            addCriterion("CONFIRM_OPR not between", value1, value2, "confirmOpr");
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