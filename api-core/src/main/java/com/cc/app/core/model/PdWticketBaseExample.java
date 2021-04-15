package com.cc.app.core.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PdWticketBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PdWticketBaseExample() {
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

        public Criteria andTicketTypeIsNull() {
            addCriterion("TICKET_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTicketTypeIsNotNull() {
            addCriterion("TICKET_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTicketTypeEqualTo(Integer value) {
            addCriterion("TICKET_TYPE =", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotEqualTo(Integer value) {
            addCriterion("TICKET_TYPE <>", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeGreaterThan(Integer value) {
            addCriterion("TICKET_TYPE >", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TICKET_TYPE >=", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLessThan(Integer value) {
            addCriterion("TICKET_TYPE <", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLessThanOrEqualTo(Integer value) {
            addCriterion("TICKET_TYPE <=", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeIn(List<Integer> values) {
            addCriterion("TICKET_TYPE in", values, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotIn(List<Integer> values) {
            addCriterion("TICKET_TYPE not in", values, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeBetween(Integer value1, Integer value2) {
            addCriterion("TICKET_TYPE between", value1, value2, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("TICKET_TYPE not between", value1, value2, "ticketType");
            return (Criteria) this;
        }

        public Criteria andWorkStateIsNull() {
            addCriterion("WORK_STATE is null");
            return (Criteria) this;
        }

        public Criteria andWorkStateIsNotNull() {
            addCriterion("WORK_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkStateEqualTo(Integer value) {
            addCriterion("WORK_STATE =", value, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkStateNotEqualTo(Integer value) {
            addCriterion("WORK_STATE <>", value, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkStateGreaterThan(Integer value) {
            addCriterion("WORK_STATE >", value, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("WORK_STATE >=", value, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkStateLessThan(Integer value) {
            addCriterion("WORK_STATE <", value, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkStateLessThanOrEqualTo(Integer value) {
            addCriterion("WORK_STATE <=", value, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkStateIn(List<Integer> values) {
            addCriterion("WORK_STATE in", values, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkStateNotIn(List<Integer> values) {
            addCriterion("WORK_STATE not in", values, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkStateBetween(Integer value1, Integer value2) {
            addCriterion("WORK_STATE between", value1, value2, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkStateNotBetween(Integer value1, Integer value2) {
            addCriterion("WORK_STATE not between", value1, value2, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalUidIsNull() {
            addCriterion("WORK_PRINCIPAL_UID is null");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalUidIsNotNull() {
            addCriterion("WORK_PRINCIPAL_UID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalUidEqualTo(String value) {
            addCriterion("WORK_PRINCIPAL_UID =", value, "workPrincipalUid");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalUidNotEqualTo(String value) {
            addCriterion("WORK_PRINCIPAL_UID <>", value, "workPrincipalUid");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalUidGreaterThan(String value) {
            addCriterion("WORK_PRINCIPAL_UID >", value, "workPrincipalUid");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalUidGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_PRINCIPAL_UID >=", value, "workPrincipalUid");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalUidLessThan(String value) {
            addCriterion("WORK_PRINCIPAL_UID <", value, "workPrincipalUid");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalUidLessThanOrEqualTo(String value) {
            addCriterion("WORK_PRINCIPAL_UID <=", value, "workPrincipalUid");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalUidLike(String value) {
            addCriterion("WORK_PRINCIPAL_UID like", value, "workPrincipalUid");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalUidNotLike(String value) {
            addCriterion("WORK_PRINCIPAL_UID not like", value, "workPrincipalUid");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalUidIn(List<String> values) {
            addCriterion("WORK_PRINCIPAL_UID in", values, "workPrincipalUid");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalUidNotIn(List<String> values) {
            addCriterion("WORK_PRINCIPAL_UID not in", values, "workPrincipalUid");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalUidBetween(String value1, String value2) {
            addCriterion("WORK_PRINCIPAL_UID between", value1, value2, "workPrincipalUid");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalUidNotBetween(String value1, String value2) {
            addCriterion("WORK_PRINCIPAL_UID not between", value1, value2, "workPrincipalUid");
            return (Criteria) this;
        }

        public Criteria andTicketReceiveUidIsNull() {
            addCriterion("TICKET_RECEIVE_UID is null");
            return (Criteria) this;
        }

        public Criteria andTicketReceiveUidIsNotNull() {
            addCriterion("TICKET_RECEIVE_UID is not null");
            return (Criteria) this;
        }

        public Criteria andTicketReceiveUidEqualTo(String value) {
            addCriterion("TICKET_RECEIVE_UID =", value, "ticketReceiveUid");
            return (Criteria) this;
        }

        public Criteria andTicketReceiveUidNotEqualTo(String value) {
            addCriterion("TICKET_RECEIVE_UID <>", value, "ticketReceiveUid");
            return (Criteria) this;
        }

        public Criteria andTicketReceiveUidGreaterThan(String value) {
            addCriterion("TICKET_RECEIVE_UID >", value, "ticketReceiveUid");
            return (Criteria) this;
        }

        public Criteria andTicketReceiveUidGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_RECEIVE_UID >=", value, "ticketReceiveUid");
            return (Criteria) this;
        }

        public Criteria andTicketReceiveUidLessThan(String value) {
            addCriterion("TICKET_RECEIVE_UID <", value, "ticketReceiveUid");
            return (Criteria) this;
        }

        public Criteria andTicketReceiveUidLessThanOrEqualTo(String value) {
            addCriterion("TICKET_RECEIVE_UID <=", value, "ticketReceiveUid");
            return (Criteria) this;
        }

        public Criteria andTicketReceiveUidLike(String value) {
            addCriterion("TICKET_RECEIVE_UID like", value, "ticketReceiveUid");
            return (Criteria) this;
        }

        public Criteria andTicketReceiveUidNotLike(String value) {
            addCriterion("TICKET_RECEIVE_UID not like", value, "ticketReceiveUid");
            return (Criteria) this;
        }

        public Criteria andTicketReceiveUidIn(List<String> values) {
            addCriterion("TICKET_RECEIVE_UID in", values, "ticketReceiveUid");
            return (Criteria) this;
        }

        public Criteria andTicketReceiveUidNotIn(List<String> values) {
            addCriterion("TICKET_RECEIVE_UID not in", values, "ticketReceiveUid");
            return (Criteria) this;
        }

        public Criteria andTicketReceiveUidBetween(String value1, String value2) {
            addCriterion("TICKET_RECEIVE_UID between", value1, value2, "ticketReceiveUid");
            return (Criteria) this;
        }

        public Criteria andTicketReceiveUidNotBetween(String value1, String value2) {
            addCriterion("TICKET_RECEIVE_UID not between", value1, value2, "ticketReceiveUid");
            return (Criteria) this;
        }

        public Criteria andTicketSignUidIsNull() {
            addCriterion("TICKET_SIGN_UID is null");
            return (Criteria) this;
        }

        public Criteria andTicketSignUidIsNotNull() {
            addCriterion("TICKET_SIGN_UID is not null");
            return (Criteria) this;
        }

        public Criteria andTicketSignUidEqualTo(String value) {
            addCriterion("TICKET_SIGN_UID =", value, "ticketSignUid");
            return (Criteria) this;
        }

        public Criteria andTicketSignUidNotEqualTo(String value) {
            addCriterion("TICKET_SIGN_UID <>", value, "ticketSignUid");
            return (Criteria) this;
        }

        public Criteria andTicketSignUidGreaterThan(String value) {
            addCriterion("TICKET_SIGN_UID >", value, "ticketSignUid");
            return (Criteria) this;
        }

        public Criteria andTicketSignUidGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_SIGN_UID >=", value, "ticketSignUid");
            return (Criteria) this;
        }

        public Criteria andTicketSignUidLessThan(String value) {
            addCriterion("TICKET_SIGN_UID <", value, "ticketSignUid");
            return (Criteria) this;
        }

        public Criteria andTicketSignUidLessThanOrEqualTo(String value) {
            addCriterion("TICKET_SIGN_UID <=", value, "ticketSignUid");
            return (Criteria) this;
        }

        public Criteria andTicketSignUidLike(String value) {
            addCriterion("TICKET_SIGN_UID like", value, "ticketSignUid");
            return (Criteria) this;
        }

        public Criteria andTicketSignUidNotLike(String value) {
            addCriterion("TICKET_SIGN_UID not like", value, "ticketSignUid");
            return (Criteria) this;
        }

        public Criteria andTicketSignUidIn(List<String> values) {
            addCriterion("TICKET_SIGN_UID in", values, "ticketSignUid");
            return (Criteria) this;
        }

        public Criteria andTicketSignUidNotIn(List<String> values) {
            addCriterion("TICKET_SIGN_UID not in", values, "ticketSignUid");
            return (Criteria) this;
        }

        public Criteria andTicketSignUidBetween(String value1, String value2) {
            addCriterion("TICKET_SIGN_UID between", value1, value2, "ticketSignUid");
            return (Criteria) this;
        }

        public Criteria andTicketSignUidNotBetween(String value1, String value2) {
            addCriterion("TICKET_SIGN_UID not between", value1, value2, "ticketSignUid");
            return (Criteria) this;
        }

        public Criteria andWorkPermissionUidIsNull() {
            addCriterion("WORK_PERMISSION_UID is null");
            return (Criteria) this;
        }

        public Criteria andWorkPermissionUidIsNotNull() {
            addCriterion("WORK_PERMISSION_UID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPermissionUidEqualTo(String value) {
            addCriterion("WORK_PERMISSION_UID =", value, "workPermissionUid");
            return (Criteria) this;
        }

        public Criteria andWorkPermissionUidNotEqualTo(String value) {
            addCriterion("WORK_PERMISSION_UID <>", value, "workPermissionUid");
            return (Criteria) this;
        }

        public Criteria andWorkPermissionUidGreaterThan(String value) {
            addCriterion("WORK_PERMISSION_UID >", value, "workPermissionUid");
            return (Criteria) this;
        }

        public Criteria andWorkPermissionUidGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_PERMISSION_UID >=", value, "workPermissionUid");
            return (Criteria) this;
        }

        public Criteria andWorkPermissionUidLessThan(String value) {
            addCriterion("WORK_PERMISSION_UID <", value, "workPermissionUid");
            return (Criteria) this;
        }

        public Criteria andWorkPermissionUidLessThanOrEqualTo(String value) {
            addCriterion("WORK_PERMISSION_UID <=", value, "workPermissionUid");
            return (Criteria) this;
        }

        public Criteria andWorkPermissionUidLike(String value) {
            addCriterion("WORK_PERMISSION_UID like", value, "workPermissionUid");
            return (Criteria) this;
        }

        public Criteria andWorkPermissionUidNotLike(String value) {
            addCriterion("WORK_PERMISSION_UID not like", value, "workPermissionUid");
            return (Criteria) this;
        }

        public Criteria andWorkPermissionUidIn(List<String> values) {
            addCriterion("WORK_PERMISSION_UID in", values, "workPermissionUid");
            return (Criteria) this;
        }

        public Criteria andWorkPermissionUidNotIn(List<String> values) {
            addCriterion("WORK_PERMISSION_UID not in", values, "workPermissionUid");
            return (Criteria) this;
        }

        public Criteria andWorkPermissionUidBetween(String value1, String value2) {
            addCriterion("WORK_PERMISSION_UID between", value1, value2, "workPermissionUid");
            return (Criteria) this;
        }

        public Criteria andWorkPermissionUidNotBetween(String value1, String value2) {
            addCriterion("WORK_PERMISSION_UID not between", value1, value2, "workPermissionUid");
            return (Criteria) this;
        }

        public Criteria andWorkEndPermissionUidIsNull() {
            addCriterion("WORK_END_PERMISSION_UID is null");
            return (Criteria) this;
        }

        public Criteria andWorkEndPermissionUidIsNotNull() {
            addCriterion("WORK_END_PERMISSION_UID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkEndPermissionUidEqualTo(String value) {
            addCriterion("WORK_END_PERMISSION_UID =", value, "workEndPermissionUid");
            return (Criteria) this;
        }

        public Criteria andWorkEndPermissionUidNotEqualTo(String value) {
            addCriterion("WORK_END_PERMISSION_UID <>", value, "workEndPermissionUid");
            return (Criteria) this;
        }

        public Criteria andWorkEndPermissionUidGreaterThan(String value) {
            addCriterion("WORK_END_PERMISSION_UID >", value, "workEndPermissionUid");
            return (Criteria) this;
        }

        public Criteria andWorkEndPermissionUidGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_END_PERMISSION_UID >=", value, "workEndPermissionUid");
            return (Criteria) this;
        }

        public Criteria andWorkEndPermissionUidLessThan(String value) {
            addCriterion("WORK_END_PERMISSION_UID <", value, "workEndPermissionUid");
            return (Criteria) this;
        }

        public Criteria andWorkEndPermissionUidLessThanOrEqualTo(String value) {
            addCriterion("WORK_END_PERMISSION_UID <=", value, "workEndPermissionUid");
            return (Criteria) this;
        }

        public Criteria andWorkEndPermissionUidLike(String value) {
            addCriterion("WORK_END_PERMISSION_UID like", value, "workEndPermissionUid");
            return (Criteria) this;
        }

        public Criteria andWorkEndPermissionUidNotLike(String value) {
            addCriterion("WORK_END_PERMISSION_UID not like", value, "workEndPermissionUid");
            return (Criteria) this;
        }

        public Criteria andWorkEndPermissionUidIn(List<String> values) {
            addCriterion("WORK_END_PERMISSION_UID in", values, "workEndPermissionUid");
            return (Criteria) this;
        }

        public Criteria andWorkEndPermissionUidNotIn(List<String> values) {
            addCriterion("WORK_END_PERMISSION_UID not in", values, "workEndPermissionUid");
            return (Criteria) this;
        }

        public Criteria andWorkEndPermissionUidBetween(String value1, String value2) {
            addCriterion("WORK_END_PERMISSION_UID between", value1, value2, "workEndPermissionUid");
            return (Criteria) this;
        }

        public Criteria andWorkEndPermissionUidNotBetween(String value1, String value2) {
            addCriterion("WORK_END_PERMISSION_UID not between", value1, value2, "workEndPermissionUid");
            return (Criteria) this;
        }

        public Criteria andWatchUidIsNull() {
            addCriterion("WATCH_UID is null");
            return (Criteria) this;
        }

        public Criteria andWatchUidIsNotNull() {
            addCriterion("WATCH_UID is not null");
            return (Criteria) this;
        }

        public Criteria andWatchUidEqualTo(String value) {
            addCriterion("WATCH_UID =", value, "watchUid");
            return (Criteria) this;
        }

        public Criteria andWatchUidNotEqualTo(String value) {
            addCriterion("WATCH_UID <>", value, "watchUid");
            return (Criteria) this;
        }

        public Criteria andWatchUidGreaterThan(String value) {
            addCriterion("WATCH_UID >", value, "watchUid");
            return (Criteria) this;
        }

        public Criteria andWatchUidGreaterThanOrEqualTo(String value) {
            addCriterion("WATCH_UID >=", value, "watchUid");
            return (Criteria) this;
        }

        public Criteria andWatchUidLessThan(String value) {
            addCriterion("WATCH_UID <", value, "watchUid");
            return (Criteria) this;
        }

        public Criteria andWatchUidLessThanOrEqualTo(String value) {
            addCriterion("WATCH_UID <=", value, "watchUid");
            return (Criteria) this;
        }

        public Criteria andWatchUidLike(String value) {
            addCriterion("WATCH_UID like", value, "watchUid");
            return (Criteria) this;
        }

        public Criteria andWatchUidNotLike(String value) {
            addCriterion("WATCH_UID not like", value, "watchUid");
            return (Criteria) this;
        }

        public Criteria andWatchUidIn(List<String> values) {
            addCriterion("WATCH_UID in", values, "watchUid");
            return (Criteria) this;
        }

        public Criteria andWatchUidNotIn(List<String> values) {
            addCriterion("WATCH_UID not in", values, "watchUid");
            return (Criteria) this;
        }

        public Criteria andWatchUidBetween(String value1, String value2) {
            addCriterion("WATCH_UID between", value1, value2, "watchUid");
            return (Criteria) this;
        }

        public Criteria andWatchUidNotBetween(String value1, String value2) {
            addCriterion("WATCH_UID not between", value1, value2, "watchUid");
            return (Criteria) this;
        }

        public Criteria andTicketEndWatchUidIsNull() {
            addCriterion("TICKET_END_WATCH_UID is null");
            return (Criteria) this;
        }

        public Criteria andTicketEndWatchUidIsNotNull() {
            addCriterion("TICKET_END_WATCH_UID is not null");
            return (Criteria) this;
        }

        public Criteria andTicketEndWatchUidEqualTo(String value) {
            addCriterion("TICKET_END_WATCH_UID =", value, "ticketEndWatchUid");
            return (Criteria) this;
        }

        public Criteria andTicketEndWatchUidNotEqualTo(String value) {
            addCriterion("TICKET_END_WATCH_UID <>", value, "ticketEndWatchUid");
            return (Criteria) this;
        }

        public Criteria andTicketEndWatchUidGreaterThan(String value) {
            addCriterion("TICKET_END_WATCH_UID >", value, "ticketEndWatchUid");
            return (Criteria) this;
        }

        public Criteria andTicketEndWatchUidGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_END_WATCH_UID >=", value, "ticketEndWatchUid");
            return (Criteria) this;
        }

        public Criteria andTicketEndWatchUidLessThan(String value) {
            addCriterion("TICKET_END_WATCH_UID <", value, "ticketEndWatchUid");
            return (Criteria) this;
        }

        public Criteria andTicketEndWatchUidLessThanOrEqualTo(String value) {
            addCriterion("TICKET_END_WATCH_UID <=", value, "ticketEndWatchUid");
            return (Criteria) this;
        }

        public Criteria andTicketEndWatchUidLike(String value) {
            addCriterion("TICKET_END_WATCH_UID like", value, "ticketEndWatchUid");
            return (Criteria) this;
        }

        public Criteria andTicketEndWatchUidNotLike(String value) {
            addCriterion("TICKET_END_WATCH_UID not like", value, "ticketEndWatchUid");
            return (Criteria) this;
        }

        public Criteria andTicketEndWatchUidIn(List<String> values) {
            addCriterion("TICKET_END_WATCH_UID in", values, "ticketEndWatchUid");
            return (Criteria) this;
        }

        public Criteria andTicketEndWatchUidNotIn(List<String> values) {
            addCriterion("TICKET_END_WATCH_UID not in", values, "ticketEndWatchUid");
            return (Criteria) this;
        }

        public Criteria andTicketEndWatchUidBetween(String value1, String value2) {
            addCriterion("TICKET_END_WATCH_UID between", value1, value2, "ticketEndWatchUid");
            return (Criteria) this;
        }

        public Criteria andTicketEndWatchUidNotBetween(String value1, String value2) {
            addCriterion("TICKET_END_WATCH_UID not between", value1, value2, "ticketEndWatchUid");
            return (Criteria) this;
        }

        public Criteria andDepartmentOidIsNull() {
            addCriterion("DEPARTMENT_OID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentOidIsNotNull() {
            addCriterion("DEPARTMENT_OID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentOidEqualTo(String value) {
            addCriterion("DEPARTMENT_OID =", value, "departmentOid");
            return (Criteria) this;
        }

        public Criteria andDepartmentOidNotEqualTo(String value) {
            addCriterion("DEPARTMENT_OID <>", value, "departmentOid");
            return (Criteria) this;
        }

        public Criteria andDepartmentOidGreaterThan(String value) {
            addCriterion("DEPARTMENT_OID >", value, "departmentOid");
            return (Criteria) this;
        }

        public Criteria andDepartmentOidGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_OID >=", value, "departmentOid");
            return (Criteria) this;
        }

        public Criteria andDepartmentOidLessThan(String value) {
            addCriterion("DEPARTMENT_OID <", value, "departmentOid");
            return (Criteria) this;
        }

        public Criteria andDepartmentOidLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_OID <=", value, "departmentOid");
            return (Criteria) this;
        }

        public Criteria andDepartmentOidLike(String value) {
            addCriterion("DEPARTMENT_OID like", value, "departmentOid");
            return (Criteria) this;
        }

        public Criteria andDepartmentOidNotLike(String value) {
            addCriterion("DEPARTMENT_OID not like", value, "departmentOid");
            return (Criteria) this;
        }

        public Criteria andDepartmentOidIn(List<String> values) {
            addCriterion("DEPARTMENT_OID in", values, "departmentOid");
            return (Criteria) this;
        }

        public Criteria andDepartmentOidNotIn(List<String> values) {
            addCriterion("DEPARTMENT_OID not in", values, "departmentOid");
            return (Criteria) this;
        }

        public Criteria andDepartmentOidBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_OID between", value1, value2, "departmentOid");
            return (Criteria) this;
        }

        public Criteria andDepartmentOidNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_OID not between", value1, value2, "departmentOid");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeIsNull() {
            addCriterion("PLAN_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeIsNotNull() {
            addCriterion("PLAN_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeEqualTo(Date value) {
            addCriterion("PLAN_START_TIME =", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeNotEqualTo(Date value) {
            addCriterion("PLAN_START_TIME <>", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeGreaterThan(Date value) {
            addCriterion("PLAN_START_TIME >", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PLAN_START_TIME >=", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeLessThan(Date value) {
            addCriterion("PLAN_START_TIME <", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("PLAN_START_TIME <=", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeIn(List<Date> values) {
            addCriterion("PLAN_START_TIME in", values, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeNotIn(List<Date> values) {
            addCriterion("PLAN_START_TIME not in", values, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeBetween(Date value1, Date value2) {
            addCriterion("PLAN_START_TIME between", value1, value2, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("PLAN_START_TIME not between", value1, value2, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeIsNull() {
            addCriterion("PLAN_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeIsNotNull() {
            addCriterion("PLAN_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeEqualTo(Date value) {
            addCriterion("PLAN_END_TIME =", value, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeNotEqualTo(Date value) {
            addCriterion("PLAN_END_TIME <>", value, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeGreaterThan(Date value) {
            addCriterion("PLAN_END_TIME >", value, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PLAN_END_TIME >=", value, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeLessThan(Date value) {
            addCriterion("PLAN_END_TIME <", value, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("PLAN_END_TIME <=", value, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeIn(List<Date> values) {
            addCriterion("PLAN_END_TIME in", values, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeNotIn(List<Date> values) {
            addCriterion("PLAN_END_TIME not in", values, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeBetween(Date value1, Date value2) {
            addCriterion("PLAN_END_TIME between", value1, value2, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("PLAN_END_TIME not between", value1, value2, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNull() {
            addCriterion("RECEIVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNotNull() {
            addCriterion("RECEIVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeEqualTo(Date value) {
            addCriterion("RECEIVE_TIME =", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotEqualTo(Date value) {
            addCriterion("RECEIVE_TIME <>", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThan(Date value) {
            addCriterion("RECEIVE_TIME >", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RECEIVE_TIME >=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThan(Date value) {
            addCriterion("RECEIVE_TIME <", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("RECEIVE_TIME <=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIn(List<Date> values) {
            addCriterion("RECEIVE_TIME in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotIn(List<Date> values) {
            addCriterion("RECEIVE_TIME not in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeBetween(Date value1, Date value2) {
            addCriterion("RECEIVE_TIME between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("RECEIVE_TIME not between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andPermissionTimeIsNull() {
            addCriterion("PERMISSION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPermissionTimeIsNotNull() {
            addCriterion("PERMISSION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionTimeEqualTo(Date value) {
            addCriterion("PERMISSION_TIME =", value, "permissionTime");
            return (Criteria) this;
        }

        public Criteria andPermissionTimeNotEqualTo(Date value) {
            addCriterion("PERMISSION_TIME <>", value, "permissionTime");
            return (Criteria) this;
        }

        public Criteria andPermissionTimeGreaterThan(Date value) {
            addCriterion("PERMISSION_TIME >", value, "permissionTime");
            return (Criteria) this;
        }

        public Criteria andPermissionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PERMISSION_TIME >=", value, "permissionTime");
            return (Criteria) this;
        }

        public Criteria andPermissionTimeLessThan(Date value) {
            addCriterion("PERMISSION_TIME <", value, "permissionTime");
            return (Criteria) this;
        }

        public Criteria andPermissionTimeLessThanOrEqualTo(Date value) {
            addCriterion("PERMISSION_TIME <=", value, "permissionTime");
            return (Criteria) this;
        }

        public Criteria andPermissionTimeIn(List<Date> values) {
            addCriterion("PERMISSION_TIME in", values, "permissionTime");
            return (Criteria) this;
        }

        public Criteria andPermissionTimeNotIn(List<Date> values) {
            addCriterion("PERMISSION_TIME not in", values, "permissionTime");
            return (Criteria) this;
        }

        public Criteria andPermissionTimeBetween(Date value1, Date value2) {
            addCriterion("PERMISSION_TIME between", value1, value2, "permissionTime");
            return (Criteria) this;
        }

        public Criteria andPermissionTimeNotBetween(Date value1, Date value2) {
            addCriterion("PERMISSION_TIME not between", value1, value2, "permissionTime");
            return (Criteria) this;
        }

        public Criteria andWorkEndTimeIsNull() {
            addCriterion("WORK_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andWorkEndTimeIsNotNull() {
            addCriterion("WORK_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andWorkEndTimeEqualTo(Date value) {
            addCriterion("WORK_END_TIME =", value, "workEndTime");
            return (Criteria) this;
        }

        public Criteria andWorkEndTimeNotEqualTo(Date value) {
            addCriterion("WORK_END_TIME <>", value, "workEndTime");
            return (Criteria) this;
        }

        public Criteria andWorkEndTimeGreaterThan(Date value) {
            addCriterion("WORK_END_TIME >", value, "workEndTime");
            return (Criteria) this;
        }

        public Criteria andWorkEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("WORK_END_TIME >=", value, "workEndTime");
            return (Criteria) this;
        }

        public Criteria andWorkEndTimeLessThan(Date value) {
            addCriterion("WORK_END_TIME <", value, "workEndTime");
            return (Criteria) this;
        }

        public Criteria andWorkEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("WORK_END_TIME <=", value, "workEndTime");
            return (Criteria) this;
        }

        public Criteria andWorkEndTimeIn(List<Date> values) {
            addCriterion("WORK_END_TIME in", values, "workEndTime");
            return (Criteria) this;
        }

        public Criteria andWorkEndTimeNotIn(List<Date> values) {
            addCriterion("WORK_END_TIME not in", values, "workEndTime");
            return (Criteria) this;
        }

        public Criteria andWorkEndTimeBetween(Date value1, Date value2) {
            addCriterion("WORK_END_TIME between", value1, value2, "workEndTime");
            return (Criteria) this;
        }

        public Criteria andWorkEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("WORK_END_TIME not between", value1, value2, "workEndTime");
            return (Criteria) this;
        }

        public Criteria andTicketEndTimeIsNull() {
            addCriterion("TICKET_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTicketEndTimeIsNotNull() {
            addCriterion("TICKET_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTicketEndTimeEqualTo(Date value) {
            addCriterion("TICKET_END_TIME =", value, "ticketEndTime");
            return (Criteria) this;
        }

        public Criteria andTicketEndTimeNotEqualTo(Date value) {
            addCriterion("TICKET_END_TIME <>", value, "ticketEndTime");
            return (Criteria) this;
        }

        public Criteria andTicketEndTimeGreaterThan(Date value) {
            addCriterion("TICKET_END_TIME >", value, "ticketEndTime");
            return (Criteria) this;
        }

        public Criteria andTicketEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TICKET_END_TIME >=", value, "ticketEndTime");
            return (Criteria) this;
        }

        public Criteria andTicketEndTimeLessThan(Date value) {
            addCriterion("TICKET_END_TIME <", value, "ticketEndTime");
            return (Criteria) this;
        }

        public Criteria andTicketEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("TICKET_END_TIME <=", value, "ticketEndTime");
            return (Criteria) this;
        }

        public Criteria andTicketEndTimeIn(List<Date> values) {
            addCriterion("TICKET_END_TIME in", values, "ticketEndTime");
            return (Criteria) this;
        }

        public Criteria andTicketEndTimeNotIn(List<Date> values) {
            addCriterion("TICKET_END_TIME not in", values, "ticketEndTime");
            return (Criteria) this;
        }

        public Criteria andTicketEndTimeBetween(Date value1, Date value2) {
            addCriterion("TICKET_END_TIME between", value1, value2, "ticketEndTime");
            return (Criteria) this;
        }

        public Criteria andTicketEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("TICKET_END_TIME not between", value1, value2, "ticketEndTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andFlowStateIsNull() {
            addCriterion("FLOW_STATE is null");
            return (Criteria) this;
        }

        public Criteria andFlowStateIsNotNull() {
            addCriterion("FLOW_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andFlowStateEqualTo(Integer value) {
            addCriterion("FLOW_STATE =", value, "flowState");
            return (Criteria) this;
        }

        public Criteria andFlowStateNotEqualTo(Integer value) {
            addCriterion("FLOW_STATE <>", value, "flowState");
            return (Criteria) this;
        }

        public Criteria andFlowStateGreaterThan(Integer value) {
            addCriterion("FLOW_STATE >", value, "flowState");
            return (Criteria) this;
        }

        public Criteria andFlowStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("FLOW_STATE >=", value, "flowState");
            return (Criteria) this;
        }

        public Criteria andFlowStateLessThan(Integer value) {
            addCriterion("FLOW_STATE <", value, "flowState");
            return (Criteria) this;
        }

        public Criteria andFlowStateLessThanOrEqualTo(Integer value) {
            addCriterion("FLOW_STATE <=", value, "flowState");
            return (Criteria) this;
        }

        public Criteria andFlowStateIn(List<Integer> values) {
            addCriterion("FLOW_STATE in", values, "flowState");
            return (Criteria) this;
        }

        public Criteria andFlowStateNotIn(List<Integer> values) {
            addCriterion("FLOW_STATE not in", values, "flowState");
            return (Criteria) this;
        }

        public Criteria andFlowStateBetween(Integer value1, Integer value2) {
            addCriterion("FLOW_STATE between", value1, value2, "flowState");
            return (Criteria) this;
        }

        public Criteria andFlowStateNotBetween(Integer value1, Integer value2) {
            addCriterion("FLOW_STATE not between", value1, value2, "flowState");
            return (Criteria) this;
        }

        public Criteria andWorkMemberCountIsNull() {
            addCriterion("WORK_MEMBER_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andWorkMemberCountIsNotNull() {
            addCriterion("WORK_MEMBER_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andWorkMemberCountEqualTo(Integer value) {
            addCriterion("WORK_MEMBER_COUNT =", value, "workMemberCount");
            return (Criteria) this;
        }

        public Criteria andWorkMemberCountNotEqualTo(Integer value) {
            addCriterion("WORK_MEMBER_COUNT <>", value, "workMemberCount");
            return (Criteria) this;
        }

        public Criteria andWorkMemberCountGreaterThan(Integer value) {
            addCriterion("WORK_MEMBER_COUNT >", value, "workMemberCount");
            return (Criteria) this;
        }

        public Criteria andWorkMemberCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("WORK_MEMBER_COUNT >=", value, "workMemberCount");
            return (Criteria) this;
        }

        public Criteria andWorkMemberCountLessThan(Integer value) {
            addCriterion("WORK_MEMBER_COUNT <", value, "workMemberCount");
            return (Criteria) this;
        }

        public Criteria andWorkMemberCountLessThanOrEqualTo(Integer value) {
            addCriterion("WORK_MEMBER_COUNT <=", value, "workMemberCount");
            return (Criteria) this;
        }

        public Criteria andWorkMemberCountIn(List<Integer> values) {
            addCriterion("WORK_MEMBER_COUNT in", values, "workMemberCount");
            return (Criteria) this;
        }

        public Criteria andWorkMemberCountNotIn(List<Integer> values) {
            addCriterion("WORK_MEMBER_COUNT not in", values, "workMemberCount");
            return (Criteria) this;
        }

        public Criteria andWorkMemberCountBetween(Integer value1, Integer value2) {
            addCriterion("WORK_MEMBER_COUNT between", value1, value2, "workMemberCount");
            return (Criteria) this;
        }

        public Criteria andWorkMemberCountNotBetween(Integer value1, Integer value2) {
            addCriterion("WORK_MEMBER_COUNT not between", value1, value2, "workMemberCount");
            return (Criteria) this;
        }

        public Criteria andWhetherOuterDeptIsNull() {
            addCriterion("WHETHER_OUTER_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andWhetherOuterDeptIsNotNull() {
            addCriterion("WHETHER_OUTER_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andWhetherOuterDeptEqualTo(Integer value) {
            addCriterion("WHETHER_OUTER_DEPT =", value, "whetherOuterDept");
            return (Criteria) this;
        }

        public Criteria andWhetherOuterDeptNotEqualTo(Integer value) {
            addCriterion("WHETHER_OUTER_DEPT <>", value, "whetherOuterDept");
            return (Criteria) this;
        }

        public Criteria andWhetherOuterDeptGreaterThan(Integer value) {
            addCriterion("WHETHER_OUTER_DEPT >", value, "whetherOuterDept");
            return (Criteria) this;
        }

        public Criteria andWhetherOuterDeptGreaterThanOrEqualTo(Integer value) {
            addCriterion("WHETHER_OUTER_DEPT >=", value, "whetherOuterDept");
            return (Criteria) this;
        }

        public Criteria andWhetherOuterDeptLessThan(Integer value) {
            addCriterion("WHETHER_OUTER_DEPT <", value, "whetherOuterDept");
            return (Criteria) this;
        }

        public Criteria andWhetherOuterDeptLessThanOrEqualTo(Integer value) {
            addCriterion("WHETHER_OUTER_DEPT <=", value, "whetherOuterDept");
            return (Criteria) this;
        }

        public Criteria andWhetherOuterDeptIn(List<Integer> values) {
            addCriterion("WHETHER_OUTER_DEPT in", values, "whetherOuterDept");
            return (Criteria) this;
        }

        public Criteria andWhetherOuterDeptNotIn(List<Integer> values) {
            addCriterion("WHETHER_OUTER_DEPT not in", values, "whetherOuterDept");
            return (Criteria) this;
        }

        public Criteria andWhetherOuterDeptBetween(Integer value1, Integer value2) {
            addCriterion("WHETHER_OUTER_DEPT between", value1, value2, "whetherOuterDept");
            return (Criteria) this;
        }

        public Criteria andWhetherOuterDeptNotBetween(Integer value1, Integer value2) {
            addCriterion("WHETHER_OUTER_DEPT not between", value1, value2, "whetherOuterDept");
            return (Criteria) this;
        }

        public Criteria andIsCommunicationTicketIsNull() {
            addCriterion("IS_COMMUNICATION_TICKET is null");
            return (Criteria) this;
        }

        public Criteria andIsCommunicationTicketIsNotNull() {
            addCriterion("IS_COMMUNICATION_TICKET is not null");
            return (Criteria) this;
        }

        public Criteria andIsCommunicationTicketEqualTo(Integer value) {
            addCriterion("IS_COMMUNICATION_TICKET =", value, "isCommunicationTicket");
            return (Criteria) this;
        }

        public Criteria andIsCommunicationTicketNotEqualTo(Integer value) {
            addCriterion("IS_COMMUNICATION_TICKET <>", value, "isCommunicationTicket");
            return (Criteria) this;
        }

        public Criteria andIsCommunicationTicketGreaterThan(Integer value) {
            addCriterion("IS_COMMUNICATION_TICKET >", value, "isCommunicationTicket");
            return (Criteria) this;
        }

        public Criteria andIsCommunicationTicketGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_COMMUNICATION_TICKET >=", value, "isCommunicationTicket");
            return (Criteria) this;
        }

        public Criteria andIsCommunicationTicketLessThan(Integer value) {
            addCriterion("IS_COMMUNICATION_TICKET <", value, "isCommunicationTicket");
            return (Criteria) this;
        }

        public Criteria andIsCommunicationTicketLessThanOrEqualTo(Integer value) {
            addCriterion("IS_COMMUNICATION_TICKET <=", value, "isCommunicationTicket");
            return (Criteria) this;
        }

        public Criteria andIsCommunicationTicketIn(List<Integer> values) {
            addCriterion("IS_COMMUNICATION_TICKET in", values, "isCommunicationTicket");
            return (Criteria) this;
        }

        public Criteria andIsCommunicationTicketNotIn(List<Integer> values) {
            addCriterion("IS_COMMUNICATION_TICKET not in", values, "isCommunicationTicket");
            return (Criteria) this;
        }

        public Criteria andIsCommunicationTicketBetween(Integer value1, Integer value2) {
            addCriterion("IS_COMMUNICATION_TICKET between", value1, value2, "isCommunicationTicket");
            return (Criteria) this;
        }

        public Criteria andIsCommunicationTicketNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_COMMUNICATION_TICKET not between", value1, value2, "isCommunicationTicket");
            return (Criteria) this;
        }

        public Criteria andSecondbillCountIsNull() {
            addCriterion("SECONDBILL_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andSecondbillCountIsNotNull() {
            addCriterion("SECONDBILL_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSecondbillCountEqualTo(Integer value) {
            addCriterion("SECONDBILL_COUNT =", value, "secondbillCount");
            return (Criteria) this;
        }

        public Criteria andSecondbillCountNotEqualTo(Integer value) {
            addCriterion("SECONDBILL_COUNT <>", value, "secondbillCount");
            return (Criteria) this;
        }

        public Criteria andSecondbillCountGreaterThan(Integer value) {
            addCriterion("SECONDBILL_COUNT >", value, "secondbillCount");
            return (Criteria) this;
        }

        public Criteria andSecondbillCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("SECONDBILL_COUNT >=", value, "secondbillCount");
            return (Criteria) this;
        }

        public Criteria andSecondbillCountLessThan(Integer value) {
            addCriterion("SECONDBILL_COUNT <", value, "secondbillCount");
            return (Criteria) this;
        }

        public Criteria andSecondbillCountLessThanOrEqualTo(Integer value) {
            addCriterion("SECONDBILL_COUNT <=", value, "secondbillCount");
            return (Criteria) this;
        }

        public Criteria andSecondbillCountIn(List<Integer> values) {
            addCriterion("SECONDBILL_COUNT in", values, "secondbillCount");
            return (Criteria) this;
        }

        public Criteria andSecondbillCountNotIn(List<Integer> values) {
            addCriterion("SECONDBILL_COUNT not in", values, "secondbillCount");
            return (Criteria) this;
        }

        public Criteria andSecondbillCountBetween(Integer value1, Integer value2) {
            addCriterion("SECONDBILL_COUNT between", value1, value2, "secondbillCount");
            return (Criteria) this;
        }

        public Criteria andSecondbillCountNotBetween(Integer value1, Integer value2) {
            addCriterion("SECONDBILL_COUNT not between", value1, value2, "secondbillCount");
            return (Criteria) this;
        }

        public Criteria andIsExitSwitchIsNull() {
            addCriterion("IS_EXIT_SWITCH is null");
            return (Criteria) this;
        }

        public Criteria andIsExitSwitchIsNotNull() {
            addCriterion("IS_EXIT_SWITCH is not null");
            return (Criteria) this;
        }

        public Criteria andIsExitSwitchEqualTo(Integer value) {
            addCriterion("IS_EXIT_SWITCH =", value, "isExitSwitch");
            return (Criteria) this;
        }

        public Criteria andIsExitSwitchNotEqualTo(Integer value) {
            addCriterion("IS_EXIT_SWITCH <>", value, "isExitSwitch");
            return (Criteria) this;
        }

        public Criteria andIsExitSwitchGreaterThan(Integer value) {
            addCriterion("IS_EXIT_SWITCH >", value, "isExitSwitch");
            return (Criteria) this;
        }

        public Criteria andIsExitSwitchGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_EXIT_SWITCH >=", value, "isExitSwitch");
            return (Criteria) this;
        }

        public Criteria andIsExitSwitchLessThan(Integer value) {
            addCriterion("IS_EXIT_SWITCH <", value, "isExitSwitch");
            return (Criteria) this;
        }

        public Criteria andIsExitSwitchLessThanOrEqualTo(Integer value) {
            addCriterion("IS_EXIT_SWITCH <=", value, "isExitSwitch");
            return (Criteria) this;
        }

        public Criteria andIsExitSwitchIn(List<Integer> values) {
            addCriterion("IS_EXIT_SWITCH in", values, "isExitSwitch");
            return (Criteria) this;
        }

        public Criteria andIsExitSwitchNotIn(List<Integer> values) {
            addCriterion("IS_EXIT_SWITCH not in", values, "isExitSwitch");
            return (Criteria) this;
        }

        public Criteria andIsExitSwitchBetween(Integer value1, Integer value2) {
            addCriterion("IS_EXIT_SWITCH between", value1, value2, "isExitSwitch");
            return (Criteria) this;
        }

        public Criteria andIsExitSwitchNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_EXIT_SWITCH not between", value1, value2, "isExitSwitch");
            return (Criteria) this;
        }

        public Criteria andWhetherSecondbillIsNull() {
            addCriterion("WHETHER_SECONDBILL is null");
            return (Criteria) this;
        }

        public Criteria andWhetherSecondbillIsNotNull() {
            addCriterion("WHETHER_SECONDBILL is not null");
            return (Criteria) this;
        }

        public Criteria andWhetherSecondbillEqualTo(Integer value) {
            addCriterion("WHETHER_SECONDBILL =", value, "whetherSecondbill");
            return (Criteria) this;
        }

        public Criteria andWhetherSecondbillNotEqualTo(Integer value) {
            addCriterion("WHETHER_SECONDBILL <>", value, "whetherSecondbill");
            return (Criteria) this;
        }

        public Criteria andWhetherSecondbillGreaterThan(Integer value) {
            addCriterion("WHETHER_SECONDBILL >", value, "whetherSecondbill");
            return (Criteria) this;
        }

        public Criteria andWhetherSecondbillGreaterThanOrEqualTo(Integer value) {
            addCriterion("WHETHER_SECONDBILL >=", value, "whetherSecondbill");
            return (Criteria) this;
        }

        public Criteria andWhetherSecondbillLessThan(Integer value) {
            addCriterion("WHETHER_SECONDBILL <", value, "whetherSecondbill");
            return (Criteria) this;
        }

        public Criteria andWhetherSecondbillLessThanOrEqualTo(Integer value) {
            addCriterion("WHETHER_SECONDBILL <=", value, "whetherSecondbill");
            return (Criteria) this;
        }

        public Criteria andWhetherSecondbillIn(List<Integer> values) {
            addCriterion("WHETHER_SECONDBILL in", values, "whetherSecondbill");
            return (Criteria) this;
        }

        public Criteria andWhetherSecondbillNotIn(List<Integer> values) {
            addCriterion("WHETHER_SECONDBILL not in", values, "whetherSecondbill");
            return (Criteria) this;
        }

        public Criteria andWhetherSecondbillBetween(Integer value1, Integer value2) {
            addCriterion("WHETHER_SECONDBILL between", value1, value2, "whetherSecondbill");
            return (Criteria) this;
        }

        public Criteria andWhetherSecondbillNotBetween(Integer value1, Integer value2) {
            addCriterion("WHETHER_SECONDBILL not between", value1, value2, "whetherSecondbill");
            return (Criteria) this;
        }

        public Criteria andWhetherQualifiedIsNull() {
            addCriterion("WHETHER_QUALIFIED is null");
            return (Criteria) this;
        }

        public Criteria andWhetherQualifiedIsNotNull() {
            addCriterion("WHETHER_QUALIFIED is not null");
            return (Criteria) this;
        }

        public Criteria andWhetherQualifiedEqualTo(Integer value) {
            addCriterion("WHETHER_QUALIFIED =", value, "whetherQualified");
            return (Criteria) this;
        }

        public Criteria andWhetherQualifiedNotEqualTo(Integer value) {
            addCriterion("WHETHER_QUALIFIED <>", value, "whetherQualified");
            return (Criteria) this;
        }

        public Criteria andWhetherQualifiedGreaterThan(Integer value) {
            addCriterion("WHETHER_QUALIFIED >", value, "whetherQualified");
            return (Criteria) this;
        }

        public Criteria andWhetherQualifiedGreaterThanOrEqualTo(Integer value) {
            addCriterion("WHETHER_QUALIFIED >=", value, "whetherQualified");
            return (Criteria) this;
        }

        public Criteria andWhetherQualifiedLessThan(Integer value) {
            addCriterion("WHETHER_QUALIFIED <", value, "whetherQualified");
            return (Criteria) this;
        }

        public Criteria andWhetherQualifiedLessThanOrEqualTo(Integer value) {
            addCriterion("WHETHER_QUALIFIED <=", value, "whetherQualified");
            return (Criteria) this;
        }

        public Criteria andWhetherQualifiedIn(List<Integer> values) {
            addCriterion("WHETHER_QUALIFIED in", values, "whetherQualified");
            return (Criteria) this;
        }

        public Criteria andWhetherQualifiedNotIn(List<Integer> values) {
            addCriterion("WHETHER_QUALIFIED not in", values, "whetherQualified");
            return (Criteria) this;
        }

        public Criteria andWhetherQualifiedBetween(Integer value1, Integer value2) {
            addCriterion("WHETHER_QUALIFIED between", value1, value2, "whetherQualified");
            return (Criteria) this;
        }

        public Criteria andWhetherQualifiedNotBetween(Integer value1, Integer value2) {
            addCriterion("WHETHER_QUALIFIED not between", value1, value2, "whetherQualified");
            return (Criteria) this;
        }

        public Criteria andWhetherNomativeIsNull() {
            addCriterion("WHETHER_NOMATIVE is null");
            return (Criteria) this;
        }

        public Criteria andWhetherNomativeIsNotNull() {
            addCriterion("WHETHER_NOMATIVE is not null");
            return (Criteria) this;
        }

        public Criteria andWhetherNomativeEqualTo(Integer value) {
            addCriterion("WHETHER_NOMATIVE =", value, "whetherNomative");
            return (Criteria) this;
        }

        public Criteria andWhetherNomativeNotEqualTo(Integer value) {
            addCriterion("WHETHER_NOMATIVE <>", value, "whetherNomative");
            return (Criteria) this;
        }

        public Criteria andWhetherNomativeGreaterThan(Integer value) {
            addCriterion("WHETHER_NOMATIVE >", value, "whetherNomative");
            return (Criteria) this;
        }

        public Criteria andWhetherNomativeGreaterThanOrEqualTo(Integer value) {
            addCriterion("WHETHER_NOMATIVE >=", value, "whetherNomative");
            return (Criteria) this;
        }

        public Criteria andWhetherNomativeLessThan(Integer value) {
            addCriterion("WHETHER_NOMATIVE <", value, "whetherNomative");
            return (Criteria) this;
        }

        public Criteria andWhetherNomativeLessThanOrEqualTo(Integer value) {
            addCriterion("WHETHER_NOMATIVE <=", value, "whetherNomative");
            return (Criteria) this;
        }

        public Criteria andWhetherNomativeIn(List<Integer> values) {
            addCriterion("WHETHER_NOMATIVE in", values, "whetherNomative");
            return (Criteria) this;
        }

        public Criteria andWhetherNomativeNotIn(List<Integer> values) {
            addCriterion("WHETHER_NOMATIVE not in", values, "whetherNomative");
            return (Criteria) this;
        }

        public Criteria andWhetherNomativeBetween(Integer value1, Integer value2) {
            addCriterion("WHETHER_NOMATIVE between", value1, value2, "whetherNomative");
            return (Criteria) this;
        }

        public Criteria andWhetherNomativeNotBetween(Integer value1, Integer value2) {
            addCriterion("WHETHER_NOMATIVE not between", value1, value2, "whetherNomative");
            return (Criteria) this;
        }

        public Criteria andQualifiedStateIsNull() {
            addCriterion("QUALIFIED_STATE is null");
            return (Criteria) this;
        }

        public Criteria andQualifiedStateIsNotNull() {
            addCriterion("QUALIFIED_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andQualifiedStateEqualTo(Integer value) {
            addCriterion("QUALIFIED_STATE =", value, "qualifiedState");
            return (Criteria) this;
        }

        public Criteria andQualifiedStateNotEqualTo(Integer value) {
            addCriterion("QUALIFIED_STATE <>", value, "qualifiedState");
            return (Criteria) this;
        }

        public Criteria andQualifiedStateGreaterThan(Integer value) {
            addCriterion("QUALIFIED_STATE >", value, "qualifiedState");
            return (Criteria) this;
        }

        public Criteria andQualifiedStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("QUALIFIED_STATE >=", value, "qualifiedState");
            return (Criteria) this;
        }

        public Criteria andQualifiedStateLessThan(Integer value) {
            addCriterion("QUALIFIED_STATE <", value, "qualifiedState");
            return (Criteria) this;
        }

        public Criteria andQualifiedStateLessThanOrEqualTo(Integer value) {
            addCriterion("QUALIFIED_STATE <=", value, "qualifiedState");
            return (Criteria) this;
        }

        public Criteria andQualifiedStateIn(List<Integer> values) {
            addCriterion("QUALIFIED_STATE in", values, "qualifiedState");
            return (Criteria) this;
        }

        public Criteria andQualifiedStateNotIn(List<Integer> values) {
            addCriterion("QUALIFIED_STATE not in", values, "qualifiedState");
            return (Criteria) this;
        }

        public Criteria andQualifiedStateBetween(Integer value1, Integer value2) {
            addCriterion("QUALIFIED_STATE between", value1, value2, "qualifiedState");
            return (Criteria) this;
        }

        public Criteria andQualifiedStateNotBetween(Integer value1, Integer value2) {
            addCriterion("QUALIFIED_STATE not between", value1, value2, "qualifiedState");
            return (Criteria) this;
        }

        public Criteria andWhetherGuardianSignIsNull() {
            addCriterion("WHETHER_GUARDIAN_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andWhetherGuardianSignIsNotNull() {
            addCriterion("WHETHER_GUARDIAN_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andWhetherGuardianSignEqualTo(Integer value) {
            addCriterion("WHETHER_GUARDIAN_SIGN =", value, "whetherGuardianSign");
            return (Criteria) this;
        }

        public Criteria andWhetherGuardianSignNotEqualTo(Integer value) {
            addCriterion("WHETHER_GUARDIAN_SIGN <>", value, "whetherGuardianSign");
            return (Criteria) this;
        }

        public Criteria andWhetherGuardianSignGreaterThan(Integer value) {
            addCriterion("WHETHER_GUARDIAN_SIGN >", value, "whetherGuardianSign");
            return (Criteria) this;
        }

        public Criteria andWhetherGuardianSignGreaterThanOrEqualTo(Integer value) {
            addCriterion("WHETHER_GUARDIAN_SIGN >=", value, "whetherGuardianSign");
            return (Criteria) this;
        }

        public Criteria andWhetherGuardianSignLessThan(Integer value) {
            addCriterion("WHETHER_GUARDIAN_SIGN <", value, "whetherGuardianSign");
            return (Criteria) this;
        }

        public Criteria andWhetherGuardianSignLessThanOrEqualTo(Integer value) {
            addCriterion("WHETHER_GUARDIAN_SIGN <=", value, "whetherGuardianSign");
            return (Criteria) this;
        }

        public Criteria andWhetherGuardianSignIn(List<Integer> values) {
            addCriterion("WHETHER_GUARDIAN_SIGN in", values, "whetherGuardianSign");
            return (Criteria) this;
        }

        public Criteria andWhetherGuardianSignNotIn(List<Integer> values) {
            addCriterion("WHETHER_GUARDIAN_SIGN not in", values, "whetherGuardianSign");
            return (Criteria) this;
        }

        public Criteria andWhetherGuardianSignBetween(Integer value1, Integer value2) {
            addCriterion("WHETHER_GUARDIAN_SIGN between", value1, value2, "whetherGuardianSign");
            return (Criteria) this;
        }

        public Criteria andWhetherGuardianSignNotBetween(Integer value1, Integer value2) {
            addCriterion("WHETHER_GUARDIAN_SIGN not between", value1, value2, "whetherGuardianSign");
            return (Criteria) this;
        }

        public Criteria andGuardianUidIsNull() {
            addCriterion("GUARDIAN_UID is null");
            return (Criteria) this;
        }

        public Criteria andGuardianUidIsNotNull() {
            addCriterion("GUARDIAN_UID is not null");
            return (Criteria) this;
        }

        public Criteria andGuardianUidEqualTo(String value) {
            addCriterion("GUARDIAN_UID =", value, "guardianUid");
            return (Criteria) this;
        }

        public Criteria andGuardianUidNotEqualTo(String value) {
            addCriterion("GUARDIAN_UID <>", value, "guardianUid");
            return (Criteria) this;
        }

        public Criteria andGuardianUidGreaterThan(String value) {
            addCriterion("GUARDIAN_UID >", value, "guardianUid");
            return (Criteria) this;
        }

        public Criteria andGuardianUidGreaterThanOrEqualTo(String value) {
            addCriterion("GUARDIAN_UID >=", value, "guardianUid");
            return (Criteria) this;
        }

        public Criteria andGuardianUidLessThan(String value) {
            addCriterion("GUARDIAN_UID <", value, "guardianUid");
            return (Criteria) this;
        }

        public Criteria andGuardianUidLessThanOrEqualTo(String value) {
            addCriterion("GUARDIAN_UID <=", value, "guardianUid");
            return (Criteria) this;
        }

        public Criteria andGuardianUidLike(String value) {
            addCriterion("GUARDIAN_UID like", value, "guardianUid");
            return (Criteria) this;
        }

        public Criteria andGuardianUidNotLike(String value) {
            addCriterion("GUARDIAN_UID not like", value, "guardianUid");
            return (Criteria) this;
        }

        public Criteria andGuardianUidIn(List<String> values) {
            addCriterion("GUARDIAN_UID in", values, "guardianUid");
            return (Criteria) this;
        }

        public Criteria andGuardianUidNotIn(List<String> values) {
            addCriterion("GUARDIAN_UID not in", values, "guardianUid");
            return (Criteria) this;
        }

        public Criteria andGuardianUidBetween(String value1, String value2) {
            addCriterion("GUARDIAN_UID between", value1, value2, "guardianUid");
            return (Criteria) this;
        }

        public Criteria andGuardianUidNotBetween(String value1, String value2) {
            addCriterion("GUARDIAN_UID not between", value1, value2, "guardianUid");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalTelIsNull() {
            addCriterion("WORK_PRINCIPAL_TEL is null");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalTelIsNotNull() {
            addCriterion("WORK_PRINCIPAL_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalTelEqualTo(String value) {
            addCriterion("WORK_PRINCIPAL_TEL =", value, "workPrincipalTel");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalTelNotEqualTo(String value) {
            addCriterion("WORK_PRINCIPAL_TEL <>", value, "workPrincipalTel");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalTelGreaterThan(String value) {
            addCriterion("WORK_PRINCIPAL_TEL >", value, "workPrincipalTel");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalTelGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_PRINCIPAL_TEL >=", value, "workPrincipalTel");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalTelLessThan(String value) {
            addCriterion("WORK_PRINCIPAL_TEL <", value, "workPrincipalTel");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalTelLessThanOrEqualTo(String value) {
            addCriterion("WORK_PRINCIPAL_TEL <=", value, "workPrincipalTel");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalTelLike(String value) {
            addCriterion("WORK_PRINCIPAL_TEL like", value, "workPrincipalTel");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalTelNotLike(String value) {
            addCriterion("WORK_PRINCIPAL_TEL not like", value, "workPrincipalTel");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalTelIn(List<String> values) {
            addCriterion("WORK_PRINCIPAL_TEL in", values, "workPrincipalTel");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalTelNotIn(List<String> values) {
            addCriterion("WORK_PRINCIPAL_TEL not in", values, "workPrincipalTel");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalTelBetween(String value1, String value2) {
            addCriterion("WORK_PRINCIPAL_TEL between", value1, value2, "workPrincipalTel");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalTelNotBetween(String value1, String value2) {
            addCriterion("WORK_PRINCIPAL_TEL not between", value1, value2, "workPrincipalTel");
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

        public Criteria andCreateOidIsNull() {
            addCriterion("CREATE_OID is null");
            return (Criteria) this;
        }

        public Criteria andCreateOidIsNotNull() {
            addCriterion("CREATE_OID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateOidEqualTo(String value) {
            addCriterion("CREATE_OID =", value, "createOid");
            return (Criteria) this;
        }

        public Criteria andCreateOidNotEqualTo(String value) {
            addCriterion("CREATE_OID <>", value, "createOid");
            return (Criteria) this;
        }

        public Criteria andCreateOidGreaterThan(String value) {
            addCriterion("CREATE_OID >", value, "createOid");
            return (Criteria) this;
        }

        public Criteria andCreateOidGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_OID >=", value, "createOid");
            return (Criteria) this;
        }

        public Criteria andCreateOidLessThan(String value) {
            addCriterion("CREATE_OID <", value, "createOid");
            return (Criteria) this;
        }

        public Criteria andCreateOidLessThanOrEqualTo(String value) {
            addCriterion("CREATE_OID <=", value, "createOid");
            return (Criteria) this;
        }

        public Criteria andCreateOidLike(String value) {
            addCriterion("CREATE_OID like", value, "createOid");
            return (Criteria) this;
        }

        public Criteria andCreateOidNotLike(String value) {
            addCriterion("CREATE_OID not like", value, "createOid");
            return (Criteria) this;
        }

        public Criteria andCreateOidIn(List<String> values) {
            addCriterion("CREATE_OID in", values, "createOid");
            return (Criteria) this;
        }

        public Criteria andCreateOidNotIn(List<String> values) {
            addCriterion("CREATE_OID not in", values, "createOid");
            return (Criteria) this;
        }

        public Criteria andCreateOidBetween(String value1, String value2) {
            addCriterion("CREATE_OID between", value1, value2, "createOid");
            return (Criteria) this;
        }

        public Criteria andCreateOidNotBetween(String value1, String value2) {
            addCriterion("CREATE_OID not between", value1, value2, "createOid");
            return (Criteria) this;
        }

        public Criteria andCreateUidIsNull() {
            addCriterion("CREATE_UID is null");
            return (Criteria) this;
        }

        public Criteria andCreateUidIsNotNull() {
            addCriterion("CREATE_UID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUidEqualTo(String value) {
            addCriterion("CREATE_UID =", value, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateUidNotEqualTo(String value) {
            addCriterion("CREATE_UID <>", value, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateUidGreaterThan(String value) {
            addCriterion("CREATE_UID >", value, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateUidGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_UID >=", value, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateUidLessThan(String value) {
            addCriterion("CREATE_UID <", value, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateUidLessThanOrEqualTo(String value) {
            addCriterion("CREATE_UID <=", value, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateUidLike(String value) {
            addCriterion("CREATE_UID like", value, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateUidNotLike(String value) {
            addCriterion("CREATE_UID not like", value, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateUidIn(List<String> values) {
            addCriterion("CREATE_UID in", values, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateUidNotIn(List<String> values) {
            addCriterion("CREATE_UID not in", values, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateUidBetween(String value1, String value2) {
            addCriterion("CREATE_UID between", value1, value2, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateUidNotBetween(String value1, String value2) {
            addCriterion("CREATE_UID not between", value1, value2, "createUid");
            return (Criteria) this;
        }

        public Criteria andProcessInsIdIsNull() {
            addCriterion("PROCESS_INS_ID is null");
            return (Criteria) this;
        }

        public Criteria andProcessInsIdIsNotNull() {
            addCriterion("PROCESS_INS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProcessInsIdEqualTo(String value) {
            addCriterion("PROCESS_INS_ID =", value, "processInsId");
            return (Criteria) this;
        }

        public Criteria andProcessInsIdNotEqualTo(String value) {
            addCriterion("PROCESS_INS_ID <>", value, "processInsId");
            return (Criteria) this;
        }

        public Criteria andProcessInsIdGreaterThan(String value) {
            addCriterion("PROCESS_INS_ID >", value, "processInsId");
            return (Criteria) this;
        }

        public Criteria andProcessInsIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_INS_ID >=", value, "processInsId");
            return (Criteria) this;
        }

        public Criteria andProcessInsIdLessThan(String value) {
            addCriterion("PROCESS_INS_ID <", value, "processInsId");
            return (Criteria) this;
        }

        public Criteria andProcessInsIdLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_INS_ID <=", value, "processInsId");
            return (Criteria) this;
        }

        public Criteria andProcessInsIdLike(String value) {
            addCriterion("PROCESS_INS_ID like", value, "processInsId");
            return (Criteria) this;
        }

        public Criteria andProcessInsIdNotLike(String value) {
            addCriterion("PROCESS_INS_ID not like", value, "processInsId");
            return (Criteria) this;
        }

        public Criteria andProcessInsIdIn(List<String> values) {
            addCriterion("PROCESS_INS_ID in", values, "processInsId");
            return (Criteria) this;
        }

        public Criteria andProcessInsIdNotIn(List<String> values) {
            addCriterion("PROCESS_INS_ID not in", values, "processInsId");
            return (Criteria) this;
        }

        public Criteria andProcessInsIdBetween(String value1, String value2) {
            addCriterion("PROCESS_INS_ID between", value1, value2, "processInsId");
            return (Criteria) this;
        }

        public Criteria andProcessInsIdNotBetween(String value1, String value2) {
            addCriterion("PROCESS_INS_ID not between", value1, value2, "processInsId");
            return (Criteria) this;
        }

        public Criteria andFunctionLocationIdIsNull() {
            addCriterion("FUNCTION_LOCATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andFunctionLocationIdIsNotNull() {
            addCriterion("FUNCTION_LOCATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionLocationIdEqualTo(String value) {
            addCriterion("FUNCTION_LOCATION_ID =", value, "functionLocationId");
            return (Criteria) this;
        }

        public Criteria andFunctionLocationIdNotEqualTo(String value) {
            addCriterion("FUNCTION_LOCATION_ID <>", value, "functionLocationId");
            return (Criteria) this;
        }

        public Criteria andFunctionLocationIdGreaterThan(String value) {
            addCriterion("FUNCTION_LOCATION_ID >", value, "functionLocationId");
            return (Criteria) this;
        }

        public Criteria andFunctionLocationIdGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTION_LOCATION_ID >=", value, "functionLocationId");
            return (Criteria) this;
        }

        public Criteria andFunctionLocationIdLessThan(String value) {
            addCriterion("FUNCTION_LOCATION_ID <", value, "functionLocationId");
            return (Criteria) this;
        }

        public Criteria andFunctionLocationIdLessThanOrEqualTo(String value) {
            addCriterion("FUNCTION_LOCATION_ID <=", value, "functionLocationId");
            return (Criteria) this;
        }

        public Criteria andFunctionLocationIdLike(String value) {
            addCriterion("FUNCTION_LOCATION_ID like", value, "functionLocationId");
            return (Criteria) this;
        }

        public Criteria andFunctionLocationIdNotLike(String value) {
            addCriterion("FUNCTION_LOCATION_ID not like", value, "functionLocationId");
            return (Criteria) this;
        }

        public Criteria andFunctionLocationIdIn(List<String> values) {
            addCriterion("FUNCTION_LOCATION_ID in", values, "functionLocationId");
            return (Criteria) this;
        }

        public Criteria andFunctionLocationIdNotIn(List<String> values) {
            addCriterion("FUNCTION_LOCATION_ID not in", values, "functionLocationId");
            return (Criteria) this;
        }

        public Criteria andFunctionLocationIdBetween(String value1, String value2) {
            addCriterion("FUNCTION_LOCATION_ID between", value1, value2, "functionLocationId");
            return (Criteria) this;
        }

        public Criteria andFunctionLocationIdNotBetween(String value1, String value2) {
            addCriterion("FUNCTION_LOCATION_ID not between", value1, value2, "functionLocationId");
            return (Criteria) this;
        }

        public Criteria andFunctionLocationNameIsNull() {
            addCriterion("FUNCTION_LOCATION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFunctionLocationNameIsNotNull() {
            addCriterion("FUNCTION_LOCATION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionLocationNameEqualTo(String value) {
            addCriterion("FUNCTION_LOCATION_NAME =", value, "functionLocationName");
            return (Criteria) this;
        }

        public Criteria andFunctionLocationNameNotEqualTo(String value) {
            addCriterion("FUNCTION_LOCATION_NAME <>", value, "functionLocationName");
            return (Criteria) this;
        }

        public Criteria andFunctionLocationNameGreaterThan(String value) {
            addCriterion("FUNCTION_LOCATION_NAME >", value, "functionLocationName");
            return (Criteria) this;
        }

        public Criteria andFunctionLocationNameGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTION_LOCATION_NAME >=", value, "functionLocationName");
            return (Criteria) this;
        }

        public Criteria andFunctionLocationNameLessThan(String value) {
            addCriterion("FUNCTION_LOCATION_NAME <", value, "functionLocationName");
            return (Criteria) this;
        }

        public Criteria andFunctionLocationNameLessThanOrEqualTo(String value) {
            addCriterion("FUNCTION_LOCATION_NAME <=", value, "functionLocationName");
            return (Criteria) this;
        }

        public Criteria andFunctionLocationNameLike(String value) {
            addCriterion("FUNCTION_LOCATION_NAME like", value, "functionLocationName");
            return (Criteria) this;
        }

        public Criteria andFunctionLocationNameNotLike(String value) {
            addCriterion("FUNCTION_LOCATION_NAME not like", value, "functionLocationName");
            return (Criteria) this;
        }

        public Criteria andFunctionLocationNameIn(List<String> values) {
            addCriterion("FUNCTION_LOCATION_NAME in", values, "functionLocationName");
            return (Criteria) this;
        }

        public Criteria andFunctionLocationNameNotIn(List<String> values) {
            addCriterion("FUNCTION_LOCATION_NAME not in", values, "functionLocationName");
            return (Criteria) this;
        }

        public Criteria andFunctionLocationNameBetween(String value1, String value2) {
            addCriterion("FUNCTION_LOCATION_NAME between", value1, value2, "functionLocationName");
            return (Criteria) this;
        }

        public Criteria andFunctionLocationNameNotBetween(String value1, String value2) {
            addCriterion("FUNCTION_LOCATION_NAME not between", value1, value2, "functionLocationName");
            return (Criteria) this;
        }

        public Criteria andDepartmentOnameIsNull() {
            addCriterion("DEPARTMENT_ONAME is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentOnameIsNotNull() {
            addCriterion("DEPARTMENT_ONAME is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentOnameEqualTo(String value) {
            addCriterion("DEPARTMENT_ONAME =", value, "departmentOname");
            return (Criteria) this;
        }

        public Criteria andDepartmentOnameNotEqualTo(String value) {
            addCriterion("DEPARTMENT_ONAME <>", value, "departmentOname");
            return (Criteria) this;
        }

        public Criteria andDepartmentOnameGreaterThan(String value) {
            addCriterion("DEPARTMENT_ONAME >", value, "departmentOname");
            return (Criteria) this;
        }

        public Criteria andDepartmentOnameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_ONAME >=", value, "departmentOname");
            return (Criteria) this;
        }

        public Criteria andDepartmentOnameLessThan(String value) {
            addCriterion("DEPARTMENT_ONAME <", value, "departmentOname");
            return (Criteria) this;
        }

        public Criteria andDepartmentOnameLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_ONAME <=", value, "departmentOname");
            return (Criteria) this;
        }

        public Criteria andDepartmentOnameLike(String value) {
            addCriterion("DEPARTMENT_ONAME like", value, "departmentOname");
            return (Criteria) this;
        }

        public Criteria andDepartmentOnameNotLike(String value) {
            addCriterion("DEPARTMENT_ONAME not like", value, "departmentOname");
            return (Criteria) this;
        }

        public Criteria andDepartmentOnameIn(List<String> values) {
            addCriterion("DEPARTMENT_ONAME in", values, "departmentOname");
            return (Criteria) this;
        }

        public Criteria andDepartmentOnameNotIn(List<String> values) {
            addCriterion("DEPARTMENT_ONAME not in", values, "departmentOname");
            return (Criteria) this;
        }

        public Criteria andDepartmentOnameBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_ONAME between", value1, value2, "departmentOname");
            return (Criteria) this;
        }

        public Criteria andDepartmentOnameNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_ONAME not between", value1, value2, "departmentOname");
            return (Criteria) this;
        }

        public Criteria andOptimisticLockVersionIsNull() {
            addCriterion("OPTIMISTIC_LOCK_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andOptimisticLockVersionIsNotNull() {
            addCriterion("OPTIMISTIC_LOCK_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andOptimisticLockVersionEqualTo(Integer value) {
            addCriterion("OPTIMISTIC_LOCK_VERSION =", value, "optimisticLockVersion");
            return (Criteria) this;
        }

        public Criteria andOptimisticLockVersionNotEqualTo(Integer value) {
            addCriterion("OPTIMISTIC_LOCK_VERSION <>", value, "optimisticLockVersion");
            return (Criteria) this;
        }

        public Criteria andOptimisticLockVersionGreaterThan(Integer value) {
            addCriterion("OPTIMISTIC_LOCK_VERSION >", value, "optimisticLockVersion");
            return (Criteria) this;
        }

        public Criteria andOptimisticLockVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("OPTIMISTIC_LOCK_VERSION >=", value, "optimisticLockVersion");
            return (Criteria) this;
        }

        public Criteria andOptimisticLockVersionLessThan(Integer value) {
            addCriterion("OPTIMISTIC_LOCK_VERSION <", value, "optimisticLockVersion");
            return (Criteria) this;
        }

        public Criteria andOptimisticLockVersionLessThanOrEqualTo(Integer value) {
            addCriterion("OPTIMISTIC_LOCK_VERSION <=", value, "optimisticLockVersion");
            return (Criteria) this;
        }

        public Criteria andOptimisticLockVersionIn(List<Integer> values) {
            addCriterion("OPTIMISTIC_LOCK_VERSION in", values, "optimisticLockVersion");
            return (Criteria) this;
        }

        public Criteria andOptimisticLockVersionNotIn(List<Integer> values) {
            addCriterion("OPTIMISTIC_LOCK_VERSION not in", values, "optimisticLockVersion");
            return (Criteria) this;
        }

        public Criteria andOptimisticLockVersionBetween(Integer value1, Integer value2) {
            addCriterion("OPTIMISTIC_LOCK_VERSION between", value1, value2, "optimisticLockVersion");
            return (Criteria) this;
        }

        public Criteria andOptimisticLockVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("OPTIMISTIC_LOCK_VERSION not between", value1, value2, "optimisticLockVersion");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDataFromIsNull() {
            addCriterion("DATA_FROM is null");
            return (Criteria) this;
        }

        public Criteria andDataFromIsNotNull() {
            addCriterion("DATA_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andDataFromEqualTo(String value) {
            addCriterion("DATA_FROM =", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromNotEqualTo(String value) {
            addCriterion("DATA_FROM <>", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromGreaterThan(String value) {
            addCriterion("DATA_FROM >", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_FROM >=", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromLessThan(String value) {
            addCriterion("DATA_FROM <", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromLessThanOrEqualTo(String value) {
            addCriterion("DATA_FROM <=", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromLike(String value) {
            addCriterion("DATA_FROM like", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromNotLike(String value) {
            addCriterion("DATA_FROM not like", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromIn(List<String> values) {
            addCriterion("DATA_FROM in", values, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromNotIn(List<String> values) {
            addCriterion("DATA_FROM not in", values, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromBetween(String value1, String value2) {
            addCriterion("DATA_FROM between", value1, value2, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromNotBetween(String value1, String value2) {
            addCriterion("DATA_FROM not between", value1, value2, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andBureauCodeIsNull() {
            addCriterion("BUREAU_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBureauCodeIsNotNull() {
            addCriterion("BUREAU_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBureauCodeEqualTo(String value) {
            addCriterion("BUREAU_CODE =", value, "bureauCode");
            return (Criteria) this;
        }

        public Criteria andBureauCodeNotEqualTo(String value) {
            addCriterion("BUREAU_CODE <>", value, "bureauCode");
            return (Criteria) this;
        }

        public Criteria andBureauCodeGreaterThan(String value) {
            addCriterion("BUREAU_CODE >", value, "bureauCode");
            return (Criteria) this;
        }

        public Criteria andBureauCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUREAU_CODE >=", value, "bureauCode");
            return (Criteria) this;
        }

        public Criteria andBureauCodeLessThan(String value) {
            addCriterion("BUREAU_CODE <", value, "bureauCode");
            return (Criteria) this;
        }

        public Criteria andBureauCodeLessThanOrEqualTo(String value) {
            addCriterion("BUREAU_CODE <=", value, "bureauCode");
            return (Criteria) this;
        }

        public Criteria andBureauCodeLike(String value) {
            addCriterion("BUREAU_CODE like", value, "bureauCode");
            return (Criteria) this;
        }

        public Criteria andBureauCodeNotLike(String value) {
            addCriterion("BUREAU_CODE not like", value, "bureauCode");
            return (Criteria) this;
        }

        public Criteria andBureauCodeIn(List<String> values) {
            addCriterion("BUREAU_CODE in", values, "bureauCode");
            return (Criteria) this;
        }

        public Criteria andBureauCodeNotIn(List<String> values) {
            addCriterion("BUREAU_CODE not in", values, "bureauCode");
            return (Criteria) this;
        }

        public Criteria andBureauCodeBetween(String value1, String value2) {
            addCriterion("BUREAU_CODE between", value1, value2, "bureauCode");
            return (Criteria) this;
        }

        public Criteria andBureauCodeNotBetween(String value1, String value2) {
            addCriterion("BUREAU_CODE not between", value1, value2, "bureauCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNull() {
            addCriterion("PROVINCE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNotNull() {
            addCriterion("PROVINCE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeEqualTo(String value) {
            addCriterion("PROVINCE_CODE =", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotEqualTo(String value) {
            addCriterion("PROVINCE_CODE <>", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThan(String value) {
            addCriterion("PROVINCE_CODE >", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE_CODE >=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThan(String value) {
            addCriterion("PROVINCE_CODE <", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE_CODE <=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLike(String value) {
            addCriterion("PROVINCE_CODE like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotLike(String value) {
            addCriterion("PROVINCE_CODE not like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIn(List<String> values) {
            addCriterion("PROVINCE_CODE in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotIn(List<String> values) {
            addCriterion("PROVINCE_CODE not in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeBetween(String value1, String value2) {
            addCriterion("PROVINCE_CODE between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("PROVINCE_CODE not between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignUidIsNull() {
            addCriterion("TICKET_COUNTER_SIGN_UID is null");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignUidIsNotNull() {
            addCriterion("TICKET_COUNTER_SIGN_UID is not null");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignUidEqualTo(String value) {
            addCriterion("TICKET_COUNTER_SIGN_UID =", value, "ticketCounterSignUid");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignUidNotEqualTo(String value) {
            addCriterion("TICKET_COUNTER_SIGN_UID <>", value, "ticketCounterSignUid");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignUidGreaterThan(String value) {
            addCriterion("TICKET_COUNTER_SIGN_UID >", value, "ticketCounterSignUid");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignUidGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_COUNTER_SIGN_UID >=", value, "ticketCounterSignUid");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignUidLessThan(String value) {
            addCriterion("TICKET_COUNTER_SIGN_UID <", value, "ticketCounterSignUid");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignUidLessThanOrEqualTo(String value) {
            addCriterion("TICKET_COUNTER_SIGN_UID <=", value, "ticketCounterSignUid");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignUidLike(String value) {
            addCriterion("TICKET_COUNTER_SIGN_UID like", value, "ticketCounterSignUid");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignUidNotLike(String value) {
            addCriterion("TICKET_COUNTER_SIGN_UID not like", value, "ticketCounterSignUid");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignUidIn(List<String> values) {
            addCriterion("TICKET_COUNTER_SIGN_UID in", values, "ticketCounterSignUid");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignUidNotIn(List<String> values) {
            addCriterion("TICKET_COUNTER_SIGN_UID not in", values, "ticketCounterSignUid");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignUidBetween(String value1, String value2) {
            addCriterion("TICKET_COUNTER_SIGN_UID between", value1, value2, "ticketCounterSignUid");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignUidNotBetween(String value1, String value2) {
            addCriterion("TICKET_COUNTER_SIGN_UID not between", value1, value2, "ticketCounterSignUid");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUidIsNull() {
            addCriterion("WORK_MEMBER_UID is null");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUidIsNotNull() {
            addCriterion("WORK_MEMBER_UID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUidEqualTo(String value) {
            addCriterion("WORK_MEMBER_UID =", value, "workMemberUid");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUidNotEqualTo(String value) {
            addCriterion("WORK_MEMBER_UID <>", value, "workMemberUid");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUidGreaterThan(String value) {
            addCriterion("WORK_MEMBER_UID >", value, "workMemberUid");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUidGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_MEMBER_UID >=", value, "workMemberUid");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUidLessThan(String value) {
            addCriterion("WORK_MEMBER_UID <", value, "workMemberUid");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUidLessThanOrEqualTo(String value) {
            addCriterion("WORK_MEMBER_UID <=", value, "workMemberUid");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUidLike(String value) {
            addCriterion("WORK_MEMBER_UID like", value, "workMemberUid");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUidNotLike(String value) {
            addCriterion("WORK_MEMBER_UID not like", value, "workMemberUid");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUidIn(List<String> values) {
            addCriterion("WORK_MEMBER_UID in", values, "workMemberUid");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUidNotIn(List<String> values) {
            addCriterion("WORK_MEMBER_UID not in", values, "workMemberUid");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUidBetween(String value1, String value2) {
            addCriterion("WORK_MEMBER_UID between", value1, value2, "workMemberUid");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUidNotBetween(String value1, String value2) {
            addCriterion("WORK_MEMBER_UID not between", value1, value2, "workMemberUid");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUnameIsNull() {
            addCriterion("WORK_MEMBER_UNAME is null");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUnameIsNotNull() {
            addCriterion("WORK_MEMBER_UNAME is not null");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUnameEqualTo(String value) {
            addCriterion("WORK_MEMBER_UNAME =", value, "workMemberUname");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUnameNotEqualTo(String value) {
            addCriterion("WORK_MEMBER_UNAME <>", value, "workMemberUname");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUnameGreaterThan(String value) {
            addCriterion("WORK_MEMBER_UNAME >", value, "workMemberUname");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUnameGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_MEMBER_UNAME >=", value, "workMemberUname");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUnameLessThan(String value) {
            addCriterion("WORK_MEMBER_UNAME <", value, "workMemberUname");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUnameLessThanOrEqualTo(String value) {
            addCriterion("WORK_MEMBER_UNAME <=", value, "workMemberUname");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUnameLike(String value) {
            addCriterion("WORK_MEMBER_UNAME like", value, "workMemberUname");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUnameNotLike(String value) {
            addCriterion("WORK_MEMBER_UNAME not like", value, "workMemberUname");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUnameIn(List<String> values) {
            addCriterion("WORK_MEMBER_UNAME in", values, "workMemberUname");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUnameNotIn(List<String> values) {
            addCriterion("WORK_MEMBER_UNAME not in", values, "workMemberUname");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUnameBetween(String value1, String value2) {
            addCriterion("WORK_MEMBER_UNAME between", value1, value2, "workMemberUname");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUnameNotBetween(String value1, String value2) {
            addCriterion("WORK_MEMBER_UNAME not between", value1, value2, "workMemberUname");
            return (Criteria) this;
        }

        public Criteria andWorkTaskIsNull() {
            addCriterion("WORK_TASK is null");
            return (Criteria) this;
        }

        public Criteria andWorkTaskIsNotNull() {
            addCriterion("WORK_TASK is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTaskEqualTo(String value) {
            addCriterion("WORK_TASK =", value, "workTask");
            return (Criteria) this;
        }

        public Criteria andWorkTaskNotEqualTo(String value) {
            addCriterion("WORK_TASK <>", value, "workTask");
            return (Criteria) this;
        }

        public Criteria andWorkTaskGreaterThan(String value) {
            addCriterion("WORK_TASK >", value, "workTask");
            return (Criteria) this;
        }

        public Criteria andWorkTaskGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_TASK >=", value, "workTask");
            return (Criteria) this;
        }

        public Criteria andWorkTaskLessThan(String value) {
            addCriterion("WORK_TASK <", value, "workTask");
            return (Criteria) this;
        }

        public Criteria andWorkTaskLessThanOrEqualTo(String value) {
            addCriterion("WORK_TASK <=", value, "workTask");
            return (Criteria) this;
        }

        public Criteria andWorkTaskLike(String value) {
            addCriterion("WORK_TASK like", value, "workTask");
            return (Criteria) this;
        }

        public Criteria andWorkTaskNotLike(String value) {
            addCriterion("WORK_TASK not like", value, "workTask");
            return (Criteria) this;
        }

        public Criteria andWorkTaskIn(List<String> values) {
            addCriterion("WORK_TASK in", values, "workTask");
            return (Criteria) this;
        }

        public Criteria andWorkTaskNotIn(List<String> values) {
            addCriterion("WORK_TASK not in", values, "workTask");
            return (Criteria) this;
        }

        public Criteria andWorkTaskBetween(String value1, String value2) {
            addCriterion("WORK_TASK between", value1, value2, "workTask");
            return (Criteria) this;
        }

        public Criteria andWorkTaskNotBetween(String value1, String value2) {
            addCriterion("WORK_TASK not between", value1, value2, "workTask");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceIsNull() {
            addCriterion("WORK_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceIsNotNull() {
            addCriterion("WORK_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceEqualTo(String value) {
            addCriterion("WORK_PLACE =", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceNotEqualTo(String value) {
            addCriterion("WORK_PLACE <>", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceGreaterThan(String value) {
            addCriterion("WORK_PLACE >", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_PLACE >=", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceLessThan(String value) {
            addCriterion("WORK_PLACE <", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceLessThanOrEqualTo(String value) {
            addCriterion("WORK_PLACE <=", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceLike(String value) {
            addCriterion("WORK_PLACE like", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceNotLike(String value) {
            addCriterion("WORK_PLACE not like", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceIn(List<String> values) {
            addCriterion("WORK_PLACE in", values, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceNotIn(List<String> values) {
            addCriterion("WORK_PLACE not in", values, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceBetween(String value1, String value2) {
            addCriterion("WORK_PLACE between", value1, value2, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceNotBetween(String value1, String value2) {
            addCriterion("WORK_PLACE not between", value1, value2, "workPlace");
            return (Criteria) this;
        }

        public Criteria andPowerGridFlagIsNull() {
            addCriterion("POWER_GRID_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andPowerGridFlagIsNotNull() {
            addCriterion("POWER_GRID_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPowerGridFlagEqualTo(Integer value) {
            addCriterion("POWER_GRID_FLAG =", value, "powerGridFlag");
            return (Criteria) this;
        }

        public Criteria andPowerGridFlagNotEqualTo(Integer value) {
            addCriterion("POWER_GRID_FLAG <>", value, "powerGridFlag");
            return (Criteria) this;
        }

        public Criteria andPowerGridFlagGreaterThan(Integer value) {
            addCriterion("POWER_GRID_FLAG >", value, "powerGridFlag");
            return (Criteria) this;
        }

        public Criteria andPowerGridFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("POWER_GRID_FLAG >=", value, "powerGridFlag");
            return (Criteria) this;
        }

        public Criteria andPowerGridFlagLessThan(Integer value) {
            addCriterion("POWER_GRID_FLAG <", value, "powerGridFlag");
            return (Criteria) this;
        }

        public Criteria andPowerGridFlagLessThanOrEqualTo(Integer value) {
            addCriterion("POWER_GRID_FLAG <=", value, "powerGridFlag");
            return (Criteria) this;
        }

        public Criteria andPowerGridFlagIn(List<Integer> values) {
            addCriterion("POWER_GRID_FLAG in", values, "powerGridFlag");
            return (Criteria) this;
        }

        public Criteria andPowerGridFlagNotIn(List<Integer> values) {
            addCriterion("POWER_GRID_FLAG not in", values, "powerGridFlag");
            return (Criteria) this;
        }

        public Criteria andPowerGridFlagBetween(Integer value1, Integer value2) {
            addCriterion("POWER_GRID_FLAG between", value1, value2, "powerGridFlag");
            return (Criteria) this;
        }

        public Criteria andPowerGridFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("POWER_GRID_FLAG not between", value1, value2, "powerGridFlag");
            return (Criteria) this;
        }

        public Criteria andTicketSignTimeIsNull() {
            addCriterion("TICKET_SIGN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTicketSignTimeIsNotNull() {
            addCriterion("TICKET_SIGN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTicketSignTimeEqualTo(Date value) {
            addCriterion("TICKET_SIGN_TIME =", value, "ticketSignTime");
            return (Criteria) this;
        }

        public Criteria andTicketSignTimeNotEqualTo(Date value) {
            addCriterion("TICKET_SIGN_TIME <>", value, "ticketSignTime");
            return (Criteria) this;
        }

        public Criteria andTicketSignTimeGreaterThan(Date value) {
            addCriterion("TICKET_SIGN_TIME >", value, "ticketSignTime");
            return (Criteria) this;
        }

        public Criteria andTicketSignTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TICKET_SIGN_TIME >=", value, "ticketSignTime");
            return (Criteria) this;
        }

        public Criteria andTicketSignTimeLessThan(Date value) {
            addCriterion("TICKET_SIGN_TIME <", value, "ticketSignTime");
            return (Criteria) this;
        }

        public Criteria andTicketSignTimeLessThanOrEqualTo(Date value) {
            addCriterion("TICKET_SIGN_TIME <=", value, "ticketSignTime");
            return (Criteria) this;
        }

        public Criteria andTicketSignTimeIn(List<Date> values) {
            addCriterion("TICKET_SIGN_TIME in", values, "ticketSignTime");
            return (Criteria) this;
        }

        public Criteria andTicketSignTimeNotIn(List<Date> values) {
            addCriterion("TICKET_SIGN_TIME not in", values, "ticketSignTime");
            return (Criteria) this;
        }

        public Criteria andTicketSignTimeBetween(Date value1, Date value2) {
            addCriterion("TICKET_SIGN_TIME between", value1, value2, "ticketSignTime");
            return (Criteria) this;
        }

        public Criteria andTicketSignTimeNotBetween(Date value1, Date value2) {
            addCriterion("TICKET_SIGN_TIME not between", value1, value2, "ticketSignTime");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignTimeIsNull() {
            addCriterion("TICKET_COUNTER_SIGN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignTimeIsNotNull() {
            addCriterion("TICKET_COUNTER_SIGN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignTimeEqualTo(Date value) {
            addCriterion("TICKET_COUNTER_SIGN_TIME =", value, "ticketCounterSignTime");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignTimeNotEqualTo(Date value) {
            addCriterion("TICKET_COUNTER_SIGN_TIME <>", value, "ticketCounterSignTime");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignTimeGreaterThan(Date value) {
            addCriterion("TICKET_COUNTER_SIGN_TIME >", value, "ticketCounterSignTime");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TICKET_COUNTER_SIGN_TIME >=", value, "ticketCounterSignTime");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignTimeLessThan(Date value) {
            addCriterion("TICKET_COUNTER_SIGN_TIME <", value, "ticketCounterSignTime");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignTimeLessThanOrEqualTo(Date value) {
            addCriterion("TICKET_COUNTER_SIGN_TIME <=", value, "ticketCounterSignTime");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignTimeIn(List<Date> values) {
            addCriterion("TICKET_COUNTER_SIGN_TIME in", values, "ticketCounterSignTime");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignTimeNotIn(List<Date> values) {
            addCriterion("TICKET_COUNTER_SIGN_TIME not in", values, "ticketCounterSignTime");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignTimeBetween(Date value1, Date value2) {
            addCriterion("TICKET_COUNTER_SIGN_TIME between", value1, value2, "ticketCounterSignTime");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignTimeNotBetween(Date value1, Date value2) {
            addCriterion("TICKET_COUNTER_SIGN_TIME not between", value1, value2, "ticketCounterSignTime");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIsNull() {
            addCriterion("FUNCTION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIsNotNull() {
            addCriterion("FUNCTION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameEqualTo(String value) {
            addCriterion("FUNCTION_NAME =", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotEqualTo(String value) {
            addCriterion("FUNCTION_NAME <>", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameGreaterThan(String value) {
            addCriterion("FUNCTION_NAME >", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTION_NAME >=", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLessThan(String value) {
            addCriterion("FUNCTION_NAME <", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLessThanOrEqualTo(String value) {
            addCriterion("FUNCTION_NAME <=", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLike(String value) {
            addCriterion("FUNCTION_NAME like", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotLike(String value) {
            addCriterion("FUNCTION_NAME not like", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIn(List<String> values) {
            addCriterion("FUNCTION_NAME in", values, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotIn(List<String> values) {
            addCriterion("FUNCTION_NAME not in", values, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameBetween(String value1, String value2) {
            addCriterion("FUNCTION_NAME between", value1, value2, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotBetween(String value1, String value2) {
            addCriterion("FUNCTION_NAME not between", value1, value2, "functionName");
            return (Criteria) this;
        }

        public Criteria andPermissionFlagIsNull() {
            addCriterion("PERMISSION_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andPermissionFlagIsNotNull() {
            addCriterion("PERMISSION_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionFlagEqualTo(Integer value) {
            addCriterion("PERMISSION_FLAG =", value, "permissionFlag");
            return (Criteria) this;
        }

        public Criteria andPermissionFlagNotEqualTo(Integer value) {
            addCriterion("PERMISSION_FLAG <>", value, "permissionFlag");
            return (Criteria) this;
        }

        public Criteria andPermissionFlagGreaterThan(Integer value) {
            addCriterion("PERMISSION_FLAG >", value, "permissionFlag");
            return (Criteria) this;
        }

        public Criteria andPermissionFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("PERMISSION_FLAG >=", value, "permissionFlag");
            return (Criteria) this;
        }

        public Criteria andPermissionFlagLessThan(Integer value) {
            addCriterion("PERMISSION_FLAG <", value, "permissionFlag");
            return (Criteria) this;
        }

        public Criteria andPermissionFlagLessThanOrEqualTo(Integer value) {
            addCriterion("PERMISSION_FLAG <=", value, "permissionFlag");
            return (Criteria) this;
        }

        public Criteria andPermissionFlagIn(List<Integer> values) {
            addCriterion("PERMISSION_FLAG in", values, "permissionFlag");
            return (Criteria) this;
        }

        public Criteria andPermissionFlagNotIn(List<Integer> values) {
            addCriterion("PERMISSION_FLAG not in", values, "permissionFlag");
            return (Criteria) this;
        }

        public Criteria andPermissionFlagBetween(Integer value1, Integer value2) {
            addCriterion("PERMISSION_FLAG between", value1, value2, "permissionFlag");
            return (Criteria) this;
        }

        public Criteria andPermissionFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("PERMISSION_FLAG not between", value1, value2, "permissionFlag");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("MAJOR is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("MAJOR is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("MAJOR =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("MAJOR <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("MAJOR >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("MAJOR >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("MAJOR <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("MAJOR <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("MAJOR like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("MAJOR not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("MAJOR in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("MAJOR not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("MAJOR between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("MAJOR not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andOutOrInIsNull() {
            addCriterion("OUT_OR_IN is null");
            return (Criteria) this;
        }

        public Criteria andOutOrInIsNotNull() {
            addCriterion("OUT_OR_IN is not null");
            return (Criteria) this;
        }

        public Criteria andOutOrInEqualTo(Integer value) {
            addCriterion("OUT_OR_IN =", value, "outOrIn");
            return (Criteria) this;
        }

        public Criteria andOutOrInNotEqualTo(Integer value) {
            addCriterion("OUT_OR_IN <>", value, "outOrIn");
            return (Criteria) this;
        }

        public Criteria andOutOrInGreaterThan(Integer value) {
            addCriterion("OUT_OR_IN >", value, "outOrIn");
            return (Criteria) this;
        }

        public Criteria andOutOrInGreaterThanOrEqualTo(Integer value) {
            addCriterion("OUT_OR_IN >=", value, "outOrIn");
            return (Criteria) this;
        }

        public Criteria andOutOrInLessThan(Integer value) {
            addCriterion("OUT_OR_IN <", value, "outOrIn");
            return (Criteria) this;
        }

        public Criteria andOutOrInLessThanOrEqualTo(Integer value) {
            addCriterion("OUT_OR_IN <=", value, "outOrIn");
            return (Criteria) this;
        }

        public Criteria andOutOrInIn(List<Integer> values) {
            addCriterion("OUT_OR_IN in", values, "outOrIn");
            return (Criteria) this;
        }

        public Criteria andOutOrInNotIn(List<Integer> values) {
            addCriterion("OUT_OR_IN not in", values, "outOrIn");
            return (Criteria) this;
        }

        public Criteria andOutOrInBetween(Integer value1, Integer value2) {
            addCriterion("OUT_OR_IN between", value1, value2, "outOrIn");
            return (Criteria) this;
        }

        public Criteria andOutOrInNotBetween(Integer value1, Integer value2) {
            addCriterion("OUT_OR_IN not between", value1, value2, "outOrIn");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalUnameIsNull() {
            addCriterion("WORK_PRINCIPAL_UNAME is null");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalUnameIsNotNull() {
            addCriterion("WORK_PRINCIPAL_UNAME is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalUnameEqualTo(String value) {
            addCriterion("WORK_PRINCIPAL_UNAME =", value, "workPrincipalUname");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalUnameNotEqualTo(String value) {
            addCriterion("WORK_PRINCIPAL_UNAME <>", value, "workPrincipalUname");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalUnameGreaterThan(String value) {
            addCriterion("WORK_PRINCIPAL_UNAME >", value, "workPrincipalUname");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalUnameGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_PRINCIPAL_UNAME >=", value, "workPrincipalUname");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalUnameLessThan(String value) {
            addCriterion("WORK_PRINCIPAL_UNAME <", value, "workPrincipalUname");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalUnameLessThanOrEqualTo(String value) {
            addCriterion("WORK_PRINCIPAL_UNAME <=", value, "workPrincipalUname");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalUnameLike(String value) {
            addCriterion("WORK_PRINCIPAL_UNAME like", value, "workPrincipalUname");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalUnameNotLike(String value) {
            addCriterion("WORK_PRINCIPAL_UNAME not like", value, "workPrincipalUname");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalUnameIn(List<String> values) {
            addCriterion("WORK_PRINCIPAL_UNAME in", values, "workPrincipalUname");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalUnameNotIn(List<String> values) {
            addCriterion("WORK_PRINCIPAL_UNAME not in", values, "workPrincipalUname");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalUnameBetween(String value1, String value2) {
            addCriterion("WORK_PRINCIPAL_UNAME between", value1, value2, "workPrincipalUname");
            return (Criteria) this;
        }

        public Criteria andWorkPrincipalUnameNotBetween(String value1, String value2) {
            addCriterion("WORK_PRINCIPAL_UNAME not between", value1, value2, "workPrincipalUname");
            return (Criteria) this;
        }

        public Criteria andTicketSignUnameIsNull() {
            addCriterion("TICKET_SIGN_UNAME is null");
            return (Criteria) this;
        }

        public Criteria andTicketSignUnameIsNotNull() {
            addCriterion("TICKET_SIGN_UNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTicketSignUnameEqualTo(String value) {
            addCriterion("TICKET_SIGN_UNAME =", value, "ticketSignUname");
            return (Criteria) this;
        }

        public Criteria andTicketSignUnameNotEqualTo(String value) {
            addCriterion("TICKET_SIGN_UNAME <>", value, "ticketSignUname");
            return (Criteria) this;
        }

        public Criteria andTicketSignUnameGreaterThan(String value) {
            addCriterion("TICKET_SIGN_UNAME >", value, "ticketSignUname");
            return (Criteria) this;
        }

        public Criteria andTicketSignUnameGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_SIGN_UNAME >=", value, "ticketSignUname");
            return (Criteria) this;
        }

        public Criteria andTicketSignUnameLessThan(String value) {
            addCriterion("TICKET_SIGN_UNAME <", value, "ticketSignUname");
            return (Criteria) this;
        }

        public Criteria andTicketSignUnameLessThanOrEqualTo(String value) {
            addCriterion("TICKET_SIGN_UNAME <=", value, "ticketSignUname");
            return (Criteria) this;
        }

        public Criteria andTicketSignUnameLike(String value) {
            addCriterion("TICKET_SIGN_UNAME like", value, "ticketSignUname");
            return (Criteria) this;
        }

        public Criteria andTicketSignUnameNotLike(String value) {
            addCriterion("TICKET_SIGN_UNAME not like", value, "ticketSignUname");
            return (Criteria) this;
        }

        public Criteria andTicketSignUnameIn(List<String> values) {
            addCriterion("TICKET_SIGN_UNAME in", values, "ticketSignUname");
            return (Criteria) this;
        }

        public Criteria andTicketSignUnameNotIn(List<String> values) {
            addCriterion("TICKET_SIGN_UNAME not in", values, "ticketSignUname");
            return (Criteria) this;
        }

        public Criteria andTicketSignUnameBetween(String value1, String value2) {
            addCriterion("TICKET_SIGN_UNAME between", value1, value2, "ticketSignUname");
            return (Criteria) this;
        }

        public Criteria andTicketSignUnameNotBetween(String value1, String value2) {
            addCriterion("TICKET_SIGN_UNAME not between", value1, value2, "ticketSignUname");
            return (Criteria) this;
        }

        public Criteria andWatchUnameIsNull() {
            addCriterion("WATCH_UNAME is null");
            return (Criteria) this;
        }

        public Criteria andWatchUnameIsNotNull() {
            addCriterion("WATCH_UNAME is not null");
            return (Criteria) this;
        }

        public Criteria andWatchUnameEqualTo(String value) {
            addCriterion("WATCH_UNAME =", value, "watchUname");
            return (Criteria) this;
        }

        public Criteria andWatchUnameNotEqualTo(String value) {
            addCriterion("WATCH_UNAME <>", value, "watchUname");
            return (Criteria) this;
        }

        public Criteria andWatchUnameGreaterThan(String value) {
            addCriterion("WATCH_UNAME >", value, "watchUname");
            return (Criteria) this;
        }

        public Criteria andWatchUnameGreaterThanOrEqualTo(String value) {
            addCriterion("WATCH_UNAME >=", value, "watchUname");
            return (Criteria) this;
        }

        public Criteria andWatchUnameLessThan(String value) {
            addCriterion("WATCH_UNAME <", value, "watchUname");
            return (Criteria) this;
        }

        public Criteria andWatchUnameLessThanOrEqualTo(String value) {
            addCriterion("WATCH_UNAME <=", value, "watchUname");
            return (Criteria) this;
        }

        public Criteria andWatchUnameLike(String value) {
            addCriterion("WATCH_UNAME like", value, "watchUname");
            return (Criteria) this;
        }

        public Criteria andWatchUnameNotLike(String value) {
            addCriterion("WATCH_UNAME not like", value, "watchUname");
            return (Criteria) this;
        }

        public Criteria andWatchUnameIn(List<String> values) {
            addCriterion("WATCH_UNAME in", values, "watchUname");
            return (Criteria) this;
        }

        public Criteria andWatchUnameNotIn(List<String> values) {
            addCriterion("WATCH_UNAME not in", values, "watchUname");
            return (Criteria) this;
        }

        public Criteria andWatchUnameBetween(String value1, String value2) {
            addCriterion("WATCH_UNAME between", value1, value2, "watchUname");
            return (Criteria) this;
        }

        public Criteria andWatchUnameNotBetween(String value1, String value2) {
            addCriterion("WATCH_UNAME not between", value1, value2, "watchUname");
            return (Criteria) this;
        }

        public Criteria andWorkPermissionUnameIsNull() {
            addCriterion("WORK_PERMISSION_UNAME is null");
            return (Criteria) this;
        }

        public Criteria andWorkPermissionUnameIsNotNull() {
            addCriterion("WORK_PERMISSION_UNAME is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPermissionUnameEqualTo(String value) {
            addCriterion("WORK_PERMISSION_UNAME =", value, "workPermissionUname");
            return (Criteria) this;
        }

        public Criteria andWorkPermissionUnameNotEqualTo(String value) {
            addCriterion("WORK_PERMISSION_UNAME <>", value, "workPermissionUname");
            return (Criteria) this;
        }

        public Criteria andWorkPermissionUnameGreaterThan(String value) {
            addCriterion("WORK_PERMISSION_UNAME >", value, "workPermissionUname");
            return (Criteria) this;
        }

        public Criteria andWorkPermissionUnameGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_PERMISSION_UNAME >=", value, "workPermissionUname");
            return (Criteria) this;
        }

        public Criteria andWorkPermissionUnameLessThan(String value) {
            addCriterion("WORK_PERMISSION_UNAME <", value, "workPermissionUname");
            return (Criteria) this;
        }

        public Criteria andWorkPermissionUnameLessThanOrEqualTo(String value) {
            addCriterion("WORK_PERMISSION_UNAME <=", value, "workPermissionUname");
            return (Criteria) this;
        }

        public Criteria andWorkPermissionUnameLike(String value) {
            addCriterion("WORK_PERMISSION_UNAME like", value, "workPermissionUname");
            return (Criteria) this;
        }

        public Criteria andWorkPermissionUnameNotLike(String value) {
            addCriterion("WORK_PERMISSION_UNAME not like", value, "workPermissionUname");
            return (Criteria) this;
        }

        public Criteria andWorkPermissionUnameIn(List<String> values) {
            addCriterion("WORK_PERMISSION_UNAME in", values, "workPermissionUname");
            return (Criteria) this;
        }

        public Criteria andWorkPermissionUnameNotIn(List<String> values) {
            addCriterion("WORK_PERMISSION_UNAME not in", values, "workPermissionUname");
            return (Criteria) this;
        }

        public Criteria andWorkPermissionUnameBetween(String value1, String value2) {
            addCriterion("WORK_PERMISSION_UNAME between", value1, value2, "workPermissionUname");
            return (Criteria) this;
        }

        public Criteria andWorkPermissionUnameNotBetween(String value1, String value2) {
            addCriterion("WORK_PERMISSION_UNAME not between", value1, value2, "workPermissionUname");
            return (Criteria) this;
        }

        public Criteria andWorkEndPermissionUnameIsNull() {
            addCriterion("WORK_END_PERMISSION_UNAME is null");
            return (Criteria) this;
        }

        public Criteria andWorkEndPermissionUnameIsNotNull() {
            addCriterion("WORK_END_PERMISSION_UNAME is not null");
            return (Criteria) this;
        }

        public Criteria andWorkEndPermissionUnameEqualTo(String value) {
            addCriterion("WORK_END_PERMISSION_UNAME =", value, "workEndPermissionUname");
            return (Criteria) this;
        }

        public Criteria andWorkEndPermissionUnameNotEqualTo(String value) {
            addCriterion("WORK_END_PERMISSION_UNAME <>", value, "workEndPermissionUname");
            return (Criteria) this;
        }

        public Criteria andWorkEndPermissionUnameGreaterThan(String value) {
            addCriterion("WORK_END_PERMISSION_UNAME >", value, "workEndPermissionUname");
            return (Criteria) this;
        }

        public Criteria andWorkEndPermissionUnameGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_END_PERMISSION_UNAME >=", value, "workEndPermissionUname");
            return (Criteria) this;
        }

        public Criteria andWorkEndPermissionUnameLessThan(String value) {
            addCriterion("WORK_END_PERMISSION_UNAME <", value, "workEndPermissionUname");
            return (Criteria) this;
        }

        public Criteria andWorkEndPermissionUnameLessThanOrEqualTo(String value) {
            addCriterion("WORK_END_PERMISSION_UNAME <=", value, "workEndPermissionUname");
            return (Criteria) this;
        }

        public Criteria andWorkEndPermissionUnameLike(String value) {
            addCriterion("WORK_END_PERMISSION_UNAME like", value, "workEndPermissionUname");
            return (Criteria) this;
        }

        public Criteria andWorkEndPermissionUnameNotLike(String value) {
            addCriterion("WORK_END_PERMISSION_UNAME not like", value, "workEndPermissionUname");
            return (Criteria) this;
        }

        public Criteria andWorkEndPermissionUnameIn(List<String> values) {
            addCriterion("WORK_END_PERMISSION_UNAME in", values, "workEndPermissionUname");
            return (Criteria) this;
        }

        public Criteria andWorkEndPermissionUnameNotIn(List<String> values) {
            addCriterion("WORK_END_PERMISSION_UNAME not in", values, "workEndPermissionUname");
            return (Criteria) this;
        }

        public Criteria andWorkEndPermissionUnameBetween(String value1, String value2) {
            addCriterion("WORK_END_PERMISSION_UNAME between", value1, value2, "workEndPermissionUname");
            return (Criteria) this;
        }

        public Criteria andWorkEndPermissionUnameNotBetween(String value1, String value2) {
            addCriterion("WORK_END_PERMISSION_UNAME not between", value1, value2, "workEndPermissionUname");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignUnameIsNull() {
            addCriterion("TICKET_COUNTER_SIGN_UNAME is null");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignUnameIsNotNull() {
            addCriterion("TICKET_COUNTER_SIGN_UNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignUnameEqualTo(String value) {
            addCriterion("TICKET_COUNTER_SIGN_UNAME =", value, "ticketCounterSignUname");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignUnameNotEqualTo(String value) {
            addCriterion("TICKET_COUNTER_SIGN_UNAME <>", value, "ticketCounterSignUname");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignUnameGreaterThan(String value) {
            addCriterion("TICKET_COUNTER_SIGN_UNAME >", value, "ticketCounterSignUname");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignUnameGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_COUNTER_SIGN_UNAME >=", value, "ticketCounterSignUname");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignUnameLessThan(String value) {
            addCriterion("TICKET_COUNTER_SIGN_UNAME <", value, "ticketCounterSignUname");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignUnameLessThanOrEqualTo(String value) {
            addCriterion("TICKET_COUNTER_SIGN_UNAME <=", value, "ticketCounterSignUname");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignUnameLike(String value) {
            addCriterion("TICKET_COUNTER_SIGN_UNAME like", value, "ticketCounterSignUname");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignUnameNotLike(String value) {
            addCriterion("TICKET_COUNTER_SIGN_UNAME not like", value, "ticketCounterSignUname");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignUnameIn(List<String> values) {
            addCriterion("TICKET_COUNTER_SIGN_UNAME in", values, "ticketCounterSignUname");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignUnameNotIn(List<String> values) {
            addCriterion("TICKET_COUNTER_SIGN_UNAME not in", values, "ticketCounterSignUname");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignUnameBetween(String value1, String value2) {
            addCriterion("TICKET_COUNTER_SIGN_UNAME between", value1, value2, "ticketCounterSignUname");
            return (Criteria) this;
        }

        public Criteria andTicketCounterSignUnameNotBetween(String value1, String value2) {
            addCriterion("TICKET_COUNTER_SIGN_UNAME not between", value1, value2, "ticketCounterSignUname");
            return (Criteria) this;
        }

        public Criteria andTicketReceiveUnameIsNull() {
            addCriterion("TICKET_RECEIVE_UNAME is null");
            return (Criteria) this;
        }

        public Criteria andTicketReceiveUnameIsNotNull() {
            addCriterion("TICKET_RECEIVE_UNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTicketReceiveUnameEqualTo(String value) {
            addCriterion("TICKET_RECEIVE_UNAME =", value, "ticketReceiveUname");
            return (Criteria) this;
        }

        public Criteria andTicketReceiveUnameNotEqualTo(String value) {
            addCriterion("TICKET_RECEIVE_UNAME <>", value, "ticketReceiveUname");
            return (Criteria) this;
        }

        public Criteria andTicketReceiveUnameGreaterThan(String value) {
            addCriterion("TICKET_RECEIVE_UNAME >", value, "ticketReceiveUname");
            return (Criteria) this;
        }

        public Criteria andTicketReceiveUnameGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_RECEIVE_UNAME >=", value, "ticketReceiveUname");
            return (Criteria) this;
        }

        public Criteria andTicketReceiveUnameLessThan(String value) {
            addCriterion("TICKET_RECEIVE_UNAME <", value, "ticketReceiveUname");
            return (Criteria) this;
        }

        public Criteria andTicketReceiveUnameLessThanOrEqualTo(String value) {
            addCriterion("TICKET_RECEIVE_UNAME <=", value, "ticketReceiveUname");
            return (Criteria) this;
        }

        public Criteria andTicketReceiveUnameLike(String value) {
            addCriterion("TICKET_RECEIVE_UNAME like", value, "ticketReceiveUname");
            return (Criteria) this;
        }

        public Criteria andTicketReceiveUnameNotLike(String value) {
            addCriterion("TICKET_RECEIVE_UNAME not like", value, "ticketReceiveUname");
            return (Criteria) this;
        }

        public Criteria andTicketReceiveUnameIn(List<String> values) {
            addCriterion("TICKET_RECEIVE_UNAME in", values, "ticketReceiveUname");
            return (Criteria) this;
        }

        public Criteria andTicketReceiveUnameNotIn(List<String> values) {
            addCriterion("TICKET_RECEIVE_UNAME not in", values, "ticketReceiveUname");
            return (Criteria) this;
        }

        public Criteria andTicketReceiveUnameBetween(String value1, String value2) {
            addCriterion("TICKET_RECEIVE_UNAME between", value1, value2, "ticketReceiveUname");
            return (Criteria) this;
        }

        public Criteria andTicketReceiveUnameNotBetween(String value1, String value2) {
            addCriterion("TICKET_RECEIVE_UNAME not between", value1, value2, "ticketReceiveUname");
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