package com.cc.app.core.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PdPpInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PdPpInfoExample() {
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

        public Criteria andWorkContentIsNull() {
            addCriterion("WORK_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andWorkContentIsNotNull() {
            addCriterion("WORK_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andWorkContentEqualTo(String value) {
            addCriterion("WORK_CONTENT =", value, "workContent");
            return (Criteria) this;
        }

        public Criteria andWorkContentNotEqualTo(String value) {
            addCriterion("WORK_CONTENT <>", value, "workContent");
            return (Criteria) this;
        }

        public Criteria andWorkContentGreaterThan(String value) {
            addCriterion("WORK_CONTENT >", value, "workContent");
            return (Criteria) this;
        }

        public Criteria andWorkContentGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_CONTENT >=", value, "workContent");
            return (Criteria) this;
        }

        public Criteria andWorkContentLessThan(String value) {
            addCriterion("WORK_CONTENT <", value, "workContent");
            return (Criteria) this;
        }

        public Criteria andWorkContentLessThanOrEqualTo(String value) {
            addCriterion("WORK_CONTENT <=", value, "workContent");
            return (Criteria) this;
        }

        public Criteria andWorkContentLike(String value) {
            addCriterion("WORK_CONTENT like", value, "workContent");
            return (Criteria) this;
        }

        public Criteria andWorkContentNotLike(String value) {
            addCriterion("WORK_CONTENT not like", value, "workContent");
            return (Criteria) this;
        }

        public Criteria andWorkContentIn(List<String> values) {
            addCriterion("WORK_CONTENT in", values, "workContent");
            return (Criteria) this;
        }

        public Criteria andWorkContentNotIn(List<String> values) {
            addCriterion("WORK_CONTENT not in", values, "workContent");
            return (Criteria) this;
        }

        public Criteria andWorkContentBetween(String value1, String value2) {
            addCriterion("WORK_CONTENT between", value1, value2, "workContent");
            return (Criteria) this;
        }

        public Criteria andWorkContentNotBetween(String value1, String value2) {
            addCriterion("WORK_CONTENT not between", value1, value2, "workContent");
            return (Criteria) this;
        }

        public Criteria andPropertyIsNull() {
            addCriterion("PROPERTY is null");
            return (Criteria) this;
        }

        public Criteria andPropertyIsNotNull() {
            addCriterion("PROPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyEqualTo(Integer value) {
            addCriterion("PROPERTY =", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotEqualTo(Integer value) {
            addCriterion("PROPERTY <>", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThan(Integer value) {
            addCriterion("PROPERTY >", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROPERTY >=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThan(Integer value) {
            addCriterion("PROPERTY <", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThanOrEqualTo(Integer value) {
            addCriterion("PROPERTY <=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyIn(List<Integer> values) {
            addCriterion("PROPERTY in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotIn(List<Integer> values) {
            addCriterion("PROPERTY not in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyBetween(Integer value1, Integer value2) {
            addCriterion("PROPERTY between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotBetween(Integer value1, Integer value2) {
            addCriterion("PROPERTY not between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIsNull() {
            addCriterion("WORK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIsNotNull() {
            addCriterion("WORK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTypeEqualTo(Integer value) {
            addCriterion("WORK_TYPE =", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotEqualTo(Integer value) {
            addCriterion("WORK_TYPE <>", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeGreaterThan(Integer value) {
            addCriterion("WORK_TYPE >", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("WORK_TYPE >=", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeLessThan(Integer value) {
            addCriterion("WORK_TYPE <", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeLessThanOrEqualTo(Integer value) {
            addCriterion("WORK_TYPE <=", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIn(List<Integer> values) {
            addCriterion("WORK_TYPE in", values, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotIn(List<Integer> values) {
            addCriterion("WORK_TYPE not in", values, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeBetween(Integer value1, Integer value2) {
            addCriterion("WORK_TYPE between", value1, value2, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("WORK_TYPE not between", value1, value2, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOidIsNull() {
            addCriterion("WORK_TEAM_OID is null");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOidIsNotNull() {
            addCriterion("WORK_TEAM_OID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOidEqualTo(String value) {
            addCriterion("WORK_TEAM_OID =", value, "workTeamOid");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOidNotEqualTo(String value) {
            addCriterion("WORK_TEAM_OID <>", value, "workTeamOid");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOidGreaterThan(String value) {
            addCriterion("WORK_TEAM_OID >", value, "workTeamOid");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOidGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_TEAM_OID >=", value, "workTeamOid");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOidLessThan(String value) {
            addCriterion("WORK_TEAM_OID <", value, "workTeamOid");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOidLessThanOrEqualTo(String value) {
            addCriterion("WORK_TEAM_OID <=", value, "workTeamOid");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOidLike(String value) {
            addCriterion("WORK_TEAM_OID like", value, "workTeamOid");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOidNotLike(String value) {
            addCriterion("WORK_TEAM_OID not like", value, "workTeamOid");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOidIn(List<String> values) {
            addCriterion("WORK_TEAM_OID in", values, "workTeamOid");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOidNotIn(List<String> values) {
            addCriterion("WORK_TEAM_OID not in", values, "workTeamOid");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOidBetween(String value1, String value2) {
            addCriterion("WORK_TEAM_OID between", value1, value2, "workTeamOid");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOidNotBetween(String value1, String value2) {
            addCriterion("WORK_TEAM_OID not between", value1, value2, "workTeamOid");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOcodeIsNull() {
            addCriterion("WORK_TEAM_OCODE is null");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOcodeIsNotNull() {
            addCriterion("WORK_TEAM_OCODE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOcodeEqualTo(String value) {
            addCriterion("WORK_TEAM_OCODE =", value, "workTeamOcode");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOcodeNotEqualTo(String value) {
            addCriterion("WORK_TEAM_OCODE <>", value, "workTeamOcode");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOcodeGreaterThan(String value) {
            addCriterion("WORK_TEAM_OCODE >", value, "workTeamOcode");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOcodeGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_TEAM_OCODE >=", value, "workTeamOcode");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOcodeLessThan(String value) {
            addCriterion("WORK_TEAM_OCODE <", value, "workTeamOcode");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOcodeLessThanOrEqualTo(String value) {
            addCriterion("WORK_TEAM_OCODE <=", value, "workTeamOcode");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOcodeLike(String value) {
            addCriterion("WORK_TEAM_OCODE like", value, "workTeamOcode");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOcodeNotLike(String value) {
            addCriterion("WORK_TEAM_OCODE not like", value, "workTeamOcode");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOcodeIn(List<String> values) {
            addCriterion("WORK_TEAM_OCODE in", values, "workTeamOcode");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOcodeNotIn(List<String> values) {
            addCriterion("WORK_TEAM_OCODE not in", values, "workTeamOcode");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOcodeBetween(String value1, String value2) {
            addCriterion("WORK_TEAM_OCODE between", value1, value2, "workTeamOcode");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOcodeNotBetween(String value1, String value2) {
            addCriterion("WORK_TEAM_OCODE not between", value1, value2, "workTeamOcode");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOnameIsNull() {
            addCriterion("WORK_TEAM_ONAME is null");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOnameIsNotNull() {
            addCriterion("WORK_TEAM_ONAME is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOnameEqualTo(String value) {
            addCriterion("WORK_TEAM_ONAME =", value, "workTeamOname");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOnameNotEqualTo(String value) {
            addCriterion("WORK_TEAM_ONAME <>", value, "workTeamOname");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOnameGreaterThan(String value) {
            addCriterion("WORK_TEAM_ONAME >", value, "workTeamOname");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOnameGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_TEAM_ONAME >=", value, "workTeamOname");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOnameLessThan(String value) {
            addCriterion("WORK_TEAM_ONAME <", value, "workTeamOname");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOnameLessThanOrEqualTo(String value) {
            addCriterion("WORK_TEAM_ONAME <=", value, "workTeamOname");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOnameLike(String value) {
            addCriterion("WORK_TEAM_ONAME like", value, "workTeamOname");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOnameNotLike(String value) {
            addCriterion("WORK_TEAM_ONAME not like", value, "workTeamOname");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOnameIn(List<String> values) {
            addCriterion("WORK_TEAM_ONAME in", values, "workTeamOname");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOnameNotIn(List<String> values) {
            addCriterion("WORK_TEAM_ONAME not in", values, "workTeamOname");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOnameBetween(String value1, String value2) {
            addCriterion("WORK_TEAM_ONAME between", value1, value2, "workTeamOname");
            return (Criteria) this;
        }

        public Criteria andWorkTeamOnameNotBetween(String value1, String value2) {
            addCriterion("WORK_TEAM_ONAME not between", value1, value2, "workTeamOname");
            return (Criteria) this;
        }

        public Criteria andPlanBeginDateIsNull() {
            addCriterion("PLAN_BEGIN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPlanBeginDateIsNotNull() {
            addCriterion("PLAN_BEGIN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanBeginDateEqualTo(Date value) {
            addCriterion("PLAN_BEGIN_DATE =", value, "planBeginDate");
            return (Criteria) this;
        }

        public Criteria andPlanBeginDateNotEqualTo(Date value) {
            addCriterion("PLAN_BEGIN_DATE <>", value, "planBeginDate");
            return (Criteria) this;
        }

        public Criteria andPlanBeginDateGreaterThan(Date value) {
            addCriterion("PLAN_BEGIN_DATE >", value, "planBeginDate");
            return (Criteria) this;
        }

        public Criteria andPlanBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PLAN_BEGIN_DATE >=", value, "planBeginDate");
            return (Criteria) this;
        }

        public Criteria andPlanBeginDateLessThan(Date value) {
            addCriterion("PLAN_BEGIN_DATE <", value, "planBeginDate");
            return (Criteria) this;
        }

        public Criteria andPlanBeginDateLessThanOrEqualTo(Date value) {
            addCriterion("PLAN_BEGIN_DATE <=", value, "planBeginDate");
            return (Criteria) this;
        }

        public Criteria andPlanBeginDateIn(List<Date> values) {
            addCriterion("PLAN_BEGIN_DATE in", values, "planBeginDate");
            return (Criteria) this;
        }

        public Criteria andPlanBeginDateNotIn(List<Date> values) {
            addCriterion("PLAN_BEGIN_DATE not in", values, "planBeginDate");
            return (Criteria) this;
        }

        public Criteria andPlanBeginDateBetween(Date value1, Date value2) {
            addCriterion("PLAN_BEGIN_DATE between", value1, value2, "planBeginDate");
            return (Criteria) this;
        }

        public Criteria andPlanBeginDateNotBetween(Date value1, Date value2) {
            addCriterion("PLAN_BEGIN_DATE not between", value1, value2, "planBeginDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateIsNull() {
            addCriterion("PLAN_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateIsNotNull() {
            addCriterion("PLAN_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateEqualTo(Date value) {
            addCriterion("PLAN_END_DATE =", value, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateNotEqualTo(Date value) {
            addCriterion("PLAN_END_DATE <>", value, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateGreaterThan(Date value) {
            addCriterion("PLAN_END_DATE >", value, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PLAN_END_DATE >=", value, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateLessThan(Date value) {
            addCriterion("PLAN_END_DATE <", value, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateLessThanOrEqualTo(Date value) {
            addCriterion("PLAN_END_DATE <=", value, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateIn(List<Date> values) {
            addCriterion("PLAN_END_DATE in", values, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateNotIn(List<Date> values) {
            addCriterion("PLAN_END_DATE not in", values, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateBetween(Date value1, Date value2) {
            addCriterion("PLAN_END_DATE between", value1, value2, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateNotBetween(Date value1, Date value2) {
            addCriterion("PLAN_END_DATE not between", value1, value2, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andWorkSiteNamesIsNull() {
            addCriterion("WORK_SITE_NAMES is null");
            return (Criteria) this;
        }

        public Criteria andWorkSiteNamesIsNotNull() {
            addCriterion("WORK_SITE_NAMES is not null");
            return (Criteria) this;
        }

        public Criteria andWorkSiteNamesEqualTo(String value) {
            addCriterion("WORK_SITE_NAMES =", value, "workSiteNames");
            return (Criteria) this;
        }

        public Criteria andWorkSiteNamesNotEqualTo(String value) {
            addCriterion("WORK_SITE_NAMES <>", value, "workSiteNames");
            return (Criteria) this;
        }

        public Criteria andWorkSiteNamesGreaterThan(String value) {
            addCriterion("WORK_SITE_NAMES >", value, "workSiteNames");
            return (Criteria) this;
        }

        public Criteria andWorkSiteNamesGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_SITE_NAMES >=", value, "workSiteNames");
            return (Criteria) this;
        }

        public Criteria andWorkSiteNamesLessThan(String value) {
            addCriterion("WORK_SITE_NAMES <", value, "workSiteNames");
            return (Criteria) this;
        }

        public Criteria andWorkSiteNamesLessThanOrEqualTo(String value) {
            addCriterion("WORK_SITE_NAMES <=", value, "workSiteNames");
            return (Criteria) this;
        }

        public Criteria andWorkSiteNamesLike(String value) {
            addCriterion("WORK_SITE_NAMES like", value, "workSiteNames");
            return (Criteria) this;
        }

        public Criteria andWorkSiteNamesNotLike(String value) {
            addCriterion("WORK_SITE_NAMES not like", value, "workSiteNames");
            return (Criteria) this;
        }

        public Criteria andWorkSiteNamesIn(List<String> values) {
            addCriterion("WORK_SITE_NAMES in", values, "workSiteNames");
            return (Criteria) this;
        }

        public Criteria andWorkSiteNamesNotIn(List<String> values) {
            addCriterion("WORK_SITE_NAMES not in", values, "workSiteNames");
            return (Criteria) this;
        }

        public Criteria andWorkSiteNamesBetween(String value1, String value2) {
            addCriterion("WORK_SITE_NAMES between", value1, value2, "workSiteNames");
            return (Criteria) this;
        }

        public Criteria andWorkSiteNamesNotBetween(String value1, String value2) {
            addCriterion("WORK_SITE_NAMES not between", value1, value2, "workSiteNames");
            return (Criteria) this;
        }

        public Criteria andPlanTypeIsNull() {
            addCriterion("PLAN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPlanTypeIsNotNull() {
            addCriterion("PLAN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanTypeEqualTo(Integer value) {
            addCriterion("PLAN_TYPE =", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNotEqualTo(Integer value) {
            addCriterion("PLAN_TYPE <>", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeGreaterThan(Integer value) {
            addCriterion("PLAN_TYPE >", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLAN_TYPE >=", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeLessThan(Integer value) {
            addCriterion("PLAN_TYPE <", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeLessThanOrEqualTo(Integer value) {
            addCriterion("PLAN_TYPE <=", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeIn(List<Integer> values) {
            addCriterion("PLAN_TYPE in", values, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNotIn(List<Integer> values) {
            addCriterion("PLAN_TYPE not in", values, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeBetween(Integer value1, Integer value2) {
            addCriterion("PLAN_TYPE between", value1, value2, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("PLAN_TYPE not between", value1, value2, "planType");
            return (Criteria) this;
        }

        public Criteria andWorkingIsNull() {
            addCriterion("WORKING is null");
            return (Criteria) this;
        }

        public Criteria andWorkingIsNotNull() {
            addCriterion("WORKING is not null");
            return (Criteria) this;
        }

        public Criteria andWorkingEqualTo(Integer value) {
            addCriterion("WORKING =", value, "working");
            return (Criteria) this;
        }

        public Criteria andWorkingNotEqualTo(Integer value) {
            addCriterion("WORKING <>", value, "working");
            return (Criteria) this;
        }

        public Criteria andWorkingGreaterThan(Integer value) {
            addCriterion("WORKING >", value, "working");
            return (Criteria) this;
        }

        public Criteria andWorkingGreaterThanOrEqualTo(Integer value) {
            addCriterion("WORKING >=", value, "working");
            return (Criteria) this;
        }

        public Criteria andWorkingLessThan(Integer value) {
            addCriterion("WORKING <", value, "working");
            return (Criteria) this;
        }

        public Criteria andWorkingLessThanOrEqualTo(Integer value) {
            addCriterion("WORKING <=", value, "working");
            return (Criteria) this;
        }

        public Criteria andWorkingIn(List<Integer> values) {
            addCriterion("WORKING in", values, "working");
            return (Criteria) this;
        }

        public Criteria andWorkingNotIn(List<Integer> values) {
            addCriterion("WORKING not in", values, "working");
            return (Criteria) this;
        }

        public Criteria andWorkingBetween(Integer value1, Integer value2) {
            addCriterion("WORKING between", value1, value2, "working");
            return (Criteria) this;
        }

        public Criteria andWorkingNotBetween(Integer value1, Integer value2) {
            addCriterion("WORKING not between", value1, value2, "working");
            return (Criteria) this;
        }

        public Criteria andPlanStateIsNull() {
            addCriterion("PLAN_STATE is null");
            return (Criteria) this;
        }

        public Criteria andPlanStateIsNotNull() {
            addCriterion("PLAN_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanStateEqualTo(Integer value) {
            addCriterion("PLAN_STATE =", value, "planState");
            return (Criteria) this;
        }

        public Criteria andPlanStateNotEqualTo(Integer value) {
            addCriterion("PLAN_STATE <>", value, "planState");
            return (Criteria) this;
        }

        public Criteria andPlanStateGreaterThan(Integer value) {
            addCriterion("PLAN_STATE >", value, "planState");
            return (Criteria) this;
        }

        public Criteria andPlanStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLAN_STATE >=", value, "planState");
            return (Criteria) this;
        }

        public Criteria andPlanStateLessThan(Integer value) {
            addCriterion("PLAN_STATE <", value, "planState");
            return (Criteria) this;
        }

        public Criteria andPlanStateLessThanOrEqualTo(Integer value) {
            addCriterion("PLAN_STATE <=", value, "planState");
            return (Criteria) this;
        }

        public Criteria andPlanStateIn(List<Integer> values) {
            addCriterion("PLAN_STATE in", values, "planState");
            return (Criteria) this;
        }

        public Criteria andPlanStateNotIn(List<Integer> values) {
            addCriterion("PLAN_STATE not in", values, "planState");
            return (Criteria) this;
        }

        public Criteria andPlanStateBetween(Integer value1, Integer value2) {
            addCriterion("PLAN_STATE between", value1, value2, "planState");
            return (Criteria) this;
        }

        public Criteria andPlanStateNotBetween(Integer value1, Integer value2) {
            addCriterion("PLAN_STATE not between", value1, value2, "planState");
            return (Criteria) this;
        }

        public Criteria andPlanSourceTypeIsNull() {
            addCriterion("PLAN_SOURCE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPlanSourceTypeIsNotNull() {
            addCriterion("PLAN_SOURCE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanSourceTypeEqualTo(Integer value) {
            addCriterion("PLAN_SOURCE_TYPE =", value, "planSourceType");
            return (Criteria) this;
        }

        public Criteria andPlanSourceTypeNotEqualTo(Integer value) {
            addCriterion("PLAN_SOURCE_TYPE <>", value, "planSourceType");
            return (Criteria) this;
        }

        public Criteria andPlanSourceTypeGreaterThan(Integer value) {
            addCriterion("PLAN_SOURCE_TYPE >", value, "planSourceType");
            return (Criteria) this;
        }

        public Criteria andPlanSourceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLAN_SOURCE_TYPE >=", value, "planSourceType");
            return (Criteria) this;
        }

        public Criteria andPlanSourceTypeLessThan(Integer value) {
            addCriterion("PLAN_SOURCE_TYPE <", value, "planSourceType");
            return (Criteria) this;
        }

        public Criteria andPlanSourceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("PLAN_SOURCE_TYPE <=", value, "planSourceType");
            return (Criteria) this;
        }

        public Criteria andPlanSourceTypeIn(List<Integer> values) {
            addCriterion("PLAN_SOURCE_TYPE in", values, "planSourceType");
            return (Criteria) this;
        }

        public Criteria andPlanSourceTypeNotIn(List<Integer> values) {
            addCriterion("PLAN_SOURCE_TYPE not in", values, "planSourceType");
            return (Criteria) this;
        }

        public Criteria andPlanSourceTypeBetween(Integer value1, Integer value2) {
            addCriterion("PLAN_SOURCE_TYPE between", value1, value2, "planSourceType");
            return (Criteria) this;
        }

        public Criteria andPlanSourceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("PLAN_SOURCE_TYPE not between", value1, value2, "planSourceType");
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

        public Criteria andCreateUnameIsNull() {
            addCriterion("CREATE_UNAME is null");
            return (Criteria) this;
        }

        public Criteria andCreateUnameIsNotNull() {
            addCriterion("CREATE_UNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUnameEqualTo(String value) {
            addCriterion("CREATE_UNAME =", value, "createUname");
            return (Criteria) this;
        }

        public Criteria andCreateUnameNotEqualTo(String value) {
            addCriterion("CREATE_UNAME <>", value, "createUname");
            return (Criteria) this;
        }

        public Criteria andCreateUnameGreaterThan(String value) {
            addCriterion("CREATE_UNAME >", value, "createUname");
            return (Criteria) this;
        }

        public Criteria andCreateUnameGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_UNAME >=", value, "createUname");
            return (Criteria) this;
        }

        public Criteria andCreateUnameLessThan(String value) {
            addCriterion("CREATE_UNAME <", value, "createUname");
            return (Criteria) this;
        }

        public Criteria andCreateUnameLessThanOrEqualTo(String value) {
            addCriterion("CREATE_UNAME <=", value, "createUname");
            return (Criteria) this;
        }

        public Criteria andCreateUnameLike(String value) {
            addCriterion("CREATE_UNAME like", value, "createUname");
            return (Criteria) this;
        }

        public Criteria andCreateUnameNotLike(String value) {
            addCriterion("CREATE_UNAME not like", value, "createUname");
            return (Criteria) this;
        }

        public Criteria andCreateUnameIn(List<String> values) {
            addCriterion("CREATE_UNAME in", values, "createUname");
            return (Criteria) this;
        }

        public Criteria andCreateUnameNotIn(List<String> values) {
            addCriterion("CREATE_UNAME not in", values, "createUname");
            return (Criteria) this;
        }

        public Criteria andCreateUnameBetween(String value1, String value2) {
            addCriterion("CREATE_UNAME between", value1, value2, "createUname");
            return (Criteria) this;
        }

        public Criteria andCreateUnameNotBetween(String value1, String value2) {
            addCriterion("CREATE_UNAME not between", value1, value2, "createUname");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andPlanClassifyIsNull() {
            addCriterion("PLAN_CLASSIFY is null");
            return (Criteria) this;
        }

        public Criteria andPlanClassifyIsNotNull() {
            addCriterion("PLAN_CLASSIFY is not null");
            return (Criteria) this;
        }

        public Criteria andPlanClassifyEqualTo(Integer value) {
            addCriterion("PLAN_CLASSIFY =", value, "planClassify");
            return (Criteria) this;
        }

        public Criteria andPlanClassifyNotEqualTo(Integer value) {
            addCriterion("PLAN_CLASSIFY <>", value, "planClassify");
            return (Criteria) this;
        }

        public Criteria andPlanClassifyGreaterThan(Integer value) {
            addCriterion("PLAN_CLASSIFY >", value, "planClassify");
            return (Criteria) this;
        }

        public Criteria andPlanClassifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLAN_CLASSIFY >=", value, "planClassify");
            return (Criteria) this;
        }

        public Criteria andPlanClassifyLessThan(Integer value) {
            addCriterion("PLAN_CLASSIFY <", value, "planClassify");
            return (Criteria) this;
        }

        public Criteria andPlanClassifyLessThanOrEqualTo(Integer value) {
            addCriterion("PLAN_CLASSIFY <=", value, "planClassify");
            return (Criteria) this;
        }

        public Criteria andPlanClassifyIn(List<Integer> values) {
            addCriterion("PLAN_CLASSIFY in", values, "planClassify");
            return (Criteria) this;
        }

        public Criteria andPlanClassifyNotIn(List<Integer> values) {
            addCriterion("PLAN_CLASSIFY not in", values, "planClassify");
            return (Criteria) this;
        }

        public Criteria andPlanClassifyBetween(Integer value1, Integer value2) {
            addCriterion("PLAN_CLASSIFY between", value1, value2, "planClassify");
            return (Criteria) this;
        }

        public Criteria andPlanClassifyNotBetween(Integer value1, Integer value2) {
            addCriterion("PLAN_CLASSIFY not between", value1, value2, "planClassify");
            return (Criteria) this;
        }

        public Criteria andLightRemindIsNull() {
            addCriterion("LIGHT_REMIND is null");
            return (Criteria) this;
        }

        public Criteria andLightRemindIsNotNull() {
            addCriterion("LIGHT_REMIND is not null");
            return (Criteria) this;
        }

        public Criteria andLightRemindEqualTo(Integer value) {
            addCriterion("LIGHT_REMIND =", value, "lightRemind");
            return (Criteria) this;
        }

        public Criteria andLightRemindNotEqualTo(Integer value) {
            addCriterion("LIGHT_REMIND <>", value, "lightRemind");
            return (Criteria) this;
        }

        public Criteria andLightRemindGreaterThan(Integer value) {
            addCriterion("LIGHT_REMIND >", value, "lightRemind");
            return (Criteria) this;
        }

        public Criteria andLightRemindGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIGHT_REMIND >=", value, "lightRemind");
            return (Criteria) this;
        }

        public Criteria andLightRemindLessThan(Integer value) {
            addCriterion("LIGHT_REMIND <", value, "lightRemind");
            return (Criteria) this;
        }

        public Criteria andLightRemindLessThanOrEqualTo(Integer value) {
            addCriterion("LIGHT_REMIND <=", value, "lightRemind");
            return (Criteria) this;
        }

        public Criteria andLightRemindIn(List<Integer> values) {
            addCriterion("LIGHT_REMIND in", values, "lightRemind");
            return (Criteria) this;
        }

        public Criteria andLightRemindNotIn(List<Integer> values) {
            addCriterion("LIGHT_REMIND not in", values, "lightRemind");
            return (Criteria) this;
        }

        public Criteria andLightRemindBetween(Integer value1, Integer value2) {
            addCriterion("LIGHT_REMIND between", value1, value2, "lightRemind");
            return (Criteria) this;
        }

        public Criteria andLightRemindNotBetween(Integer value1, Integer value2) {
            addCriterion("LIGHT_REMIND not between", value1, value2, "lightRemind");
            return (Criteria) this;
        }

        public Criteria andWorkMasterUidIsNull() {
            addCriterion("WORK_MASTER_UID is null");
            return (Criteria) this;
        }

        public Criteria andWorkMasterUidIsNotNull() {
            addCriterion("WORK_MASTER_UID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkMasterUidEqualTo(String value) {
            addCriterion("WORK_MASTER_UID =", value, "workMasterUid");
            return (Criteria) this;
        }

        public Criteria andWorkMasterUidNotEqualTo(String value) {
            addCriterion("WORK_MASTER_UID <>", value, "workMasterUid");
            return (Criteria) this;
        }

        public Criteria andWorkMasterUidGreaterThan(String value) {
            addCriterion("WORK_MASTER_UID >", value, "workMasterUid");
            return (Criteria) this;
        }

        public Criteria andWorkMasterUidGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_MASTER_UID >=", value, "workMasterUid");
            return (Criteria) this;
        }

        public Criteria andWorkMasterUidLessThan(String value) {
            addCriterion("WORK_MASTER_UID <", value, "workMasterUid");
            return (Criteria) this;
        }

        public Criteria andWorkMasterUidLessThanOrEqualTo(String value) {
            addCriterion("WORK_MASTER_UID <=", value, "workMasterUid");
            return (Criteria) this;
        }

        public Criteria andWorkMasterUidLike(String value) {
            addCriterion("WORK_MASTER_UID like", value, "workMasterUid");
            return (Criteria) this;
        }

        public Criteria andWorkMasterUidNotLike(String value) {
            addCriterion("WORK_MASTER_UID not like", value, "workMasterUid");
            return (Criteria) this;
        }

        public Criteria andWorkMasterUidIn(List<String> values) {
            addCriterion("WORK_MASTER_UID in", values, "workMasterUid");
            return (Criteria) this;
        }

        public Criteria andWorkMasterUidNotIn(List<String> values) {
            addCriterion("WORK_MASTER_UID not in", values, "workMasterUid");
            return (Criteria) this;
        }

        public Criteria andWorkMasterUidBetween(String value1, String value2) {
            addCriterion("WORK_MASTER_UID between", value1, value2, "workMasterUid");
            return (Criteria) this;
        }

        public Criteria andWorkMasterUidNotBetween(String value1, String value2) {
            addCriterion("WORK_MASTER_UID not between", value1, value2, "workMasterUid");
            return (Criteria) this;
        }

        public Criteria andWorkMasterUnameIsNull() {
            addCriterion("WORK_MASTER_UNAME is null");
            return (Criteria) this;
        }

        public Criteria andWorkMasterUnameIsNotNull() {
            addCriterion("WORK_MASTER_UNAME is not null");
            return (Criteria) this;
        }

        public Criteria andWorkMasterUnameEqualTo(String value) {
            addCriterion("WORK_MASTER_UNAME =", value, "workMasterUname");
            return (Criteria) this;
        }

        public Criteria andWorkMasterUnameNotEqualTo(String value) {
            addCriterion("WORK_MASTER_UNAME <>", value, "workMasterUname");
            return (Criteria) this;
        }

        public Criteria andWorkMasterUnameGreaterThan(String value) {
            addCriterion("WORK_MASTER_UNAME >", value, "workMasterUname");
            return (Criteria) this;
        }

        public Criteria andWorkMasterUnameGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_MASTER_UNAME >=", value, "workMasterUname");
            return (Criteria) this;
        }

        public Criteria andWorkMasterUnameLessThan(String value) {
            addCriterion("WORK_MASTER_UNAME <", value, "workMasterUname");
            return (Criteria) this;
        }

        public Criteria andWorkMasterUnameLessThanOrEqualTo(String value) {
            addCriterion("WORK_MASTER_UNAME <=", value, "workMasterUname");
            return (Criteria) this;
        }

        public Criteria andWorkMasterUnameLike(String value) {
            addCriterion("WORK_MASTER_UNAME like", value, "workMasterUname");
            return (Criteria) this;
        }

        public Criteria andWorkMasterUnameNotLike(String value) {
            addCriterion("WORK_MASTER_UNAME not like", value, "workMasterUname");
            return (Criteria) this;
        }

        public Criteria andWorkMasterUnameIn(List<String> values) {
            addCriterion("WORK_MASTER_UNAME in", values, "workMasterUname");
            return (Criteria) this;
        }

        public Criteria andWorkMasterUnameNotIn(List<String> values) {
            addCriterion("WORK_MASTER_UNAME not in", values, "workMasterUname");
            return (Criteria) this;
        }

        public Criteria andWorkMasterUnameBetween(String value1, String value2) {
            addCriterion("WORK_MASTER_UNAME between", value1, value2, "workMasterUname");
            return (Criteria) this;
        }

        public Criteria andWorkMasterUnameNotBetween(String value1, String value2) {
            addCriterion("WORK_MASTER_UNAME not between", value1, value2, "workMasterUname");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUnamesIsNull() {
            addCriterion("WORK_MEMBER_UNAMES is null");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUnamesIsNotNull() {
            addCriterion("WORK_MEMBER_UNAMES is not null");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUnamesEqualTo(String value) {
            addCriterion("WORK_MEMBER_UNAMES =", value, "workMemberUnames");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUnamesNotEqualTo(String value) {
            addCriterion("WORK_MEMBER_UNAMES <>", value, "workMemberUnames");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUnamesGreaterThan(String value) {
            addCriterion("WORK_MEMBER_UNAMES >", value, "workMemberUnames");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUnamesGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_MEMBER_UNAMES >=", value, "workMemberUnames");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUnamesLessThan(String value) {
            addCriterion("WORK_MEMBER_UNAMES <", value, "workMemberUnames");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUnamesLessThanOrEqualTo(String value) {
            addCriterion("WORK_MEMBER_UNAMES <=", value, "workMemberUnames");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUnamesLike(String value) {
            addCriterion("WORK_MEMBER_UNAMES like", value, "workMemberUnames");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUnamesNotLike(String value) {
            addCriterion("WORK_MEMBER_UNAMES not like", value, "workMemberUnames");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUnamesIn(List<String> values) {
            addCriterion("WORK_MEMBER_UNAMES in", values, "workMemberUnames");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUnamesNotIn(List<String> values) {
            addCriterion("WORK_MEMBER_UNAMES not in", values, "workMemberUnames");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUnamesBetween(String value1, String value2) {
            addCriterion("WORK_MEMBER_UNAMES between", value1, value2, "workMemberUnames");
            return (Criteria) this;
        }

        public Criteria andWorkMemberUnamesNotBetween(String value1, String value2) {
            addCriterion("WORK_MEMBER_UNAMES not between", value1, value2, "workMemberUnames");
            return (Criteria) this;
        }

        public Criteria andRealBeginDateIsNull() {
            addCriterion("REAL_BEGIN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRealBeginDateIsNotNull() {
            addCriterion("REAL_BEGIN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRealBeginDateEqualTo(Date value) {
            addCriterion("REAL_BEGIN_DATE =", value, "realBeginDate");
            return (Criteria) this;
        }

        public Criteria andRealBeginDateNotEqualTo(Date value) {
            addCriterion("REAL_BEGIN_DATE <>", value, "realBeginDate");
            return (Criteria) this;
        }

        public Criteria andRealBeginDateGreaterThan(Date value) {
            addCriterion("REAL_BEGIN_DATE >", value, "realBeginDate");
            return (Criteria) this;
        }

        public Criteria andRealBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("REAL_BEGIN_DATE >=", value, "realBeginDate");
            return (Criteria) this;
        }

        public Criteria andRealBeginDateLessThan(Date value) {
            addCriterion("REAL_BEGIN_DATE <", value, "realBeginDate");
            return (Criteria) this;
        }

        public Criteria andRealBeginDateLessThanOrEqualTo(Date value) {
            addCriterion("REAL_BEGIN_DATE <=", value, "realBeginDate");
            return (Criteria) this;
        }

        public Criteria andRealBeginDateIn(List<Date> values) {
            addCriterion("REAL_BEGIN_DATE in", values, "realBeginDate");
            return (Criteria) this;
        }

        public Criteria andRealBeginDateNotIn(List<Date> values) {
            addCriterion("REAL_BEGIN_DATE not in", values, "realBeginDate");
            return (Criteria) this;
        }

        public Criteria andRealBeginDateBetween(Date value1, Date value2) {
            addCriterion("REAL_BEGIN_DATE between", value1, value2, "realBeginDate");
            return (Criteria) this;
        }

        public Criteria andRealBeginDateNotBetween(Date value1, Date value2) {
            addCriterion("REAL_BEGIN_DATE not between", value1, value2, "realBeginDate");
            return (Criteria) this;
        }

        public Criteria andRealEndDateIsNull() {
            addCriterion("REAL_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRealEndDateIsNotNull() {
            addCriterion("REAL_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRealEndDateEqualTo(Date value) {
            addCriterion("REAL_END_DATE =", value, "realEndDate");
            return (Criteria) this;
        }

        public Criteria andRealEndDateNotEqualTo(Date value) {
            addCriterion("REAL_END_DATE <>", value, "realEndDate");
            return (Criteria) this;
        }

        public Criteria andRealEndDateGreaterThan(Date value) {
            addCriterion("REAL_END_DATE >", value, "realEndDate");
            return (Criteria) this;
        }

        public Criteria andRealEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("REAL_END_DATE >=", value, "realEndDate");
            return (Criteria) this;
        }

        public Criteria andRealEndDateLessThan(Date value) {
            addCriterion("REAL_END_DATE <", value, "realEndDate");
            return (Criteria) this;
        }

        public Criteria andRealEndDateLessThanOrEqualTo(Date value) {
            addCriterion("REAL_END_DATE <=", value, "realEndDate");
            return (Criteria) this;
        }

        public Criteria andRealEndDateIn(List<Date> values) {
            addCriterion("REAL_END_DATE in", values, "realEndDate");
            return (Criteria) this;
        }

        public Criteria andRealEndDateNotIn(List<Date> values) {
            addCriterion("REAL_END_DATE not in", values, "realEndDate");
            return (Criteria) this;
        }

        public Criteria andRealEndDateBetween(Date value1, Date value2) {
            addCriterion("REAL_END_DATE between", value1, value2, "realEndDate");
            return (Criteria) this;
        }

        public Criteria andRealEndDateNotBetween(Date value1, Date value2) {
            addCriterion("REAL_END_DATE not between", value1, value2, "realEndDate");
            return (Criteria) this;
        }

        public Criteria andCompletionConditionIsNull() {
            addCriterion("COMPLETION_CONDITION is null");
            return (Criteria) this;
        }

        public Criteria andCompletionConditionIsNotNull() {
            addCriterion("COMPLETION_CONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andCompletionConditionEqualTo(String value) {
            addCriterion("COMPLETION_CONDITION =", value, "completionCondition");
            return (Criteria) this;
        }

        public Criteria andCompletionConditionNotEqualTo(String value) {
            addCriterion("COMPLETION_CONDITION <>", value, "completionCondition");
            return (Criteria) this;
        }

        public Criteria andCompletionConditionGreaterThan(String value) {
            addCriterion("COMPLETION_CONDITION >", value, "completionCondition");
            return (Criteria) this;
        }

        public Criteria andCompletionConditionGreaterThanOrEqualTo(String value) {
            addCriterion("COMPLETION_CONDITION >=", value, "completionCondition");
            return (Criteria) this;
        }

        public Criteria andCompletionConditionLessThan(String value) {
            addCriterion("COMPLETION_CONDITION <", value, "completionCondition");
            return (Criteria) this;
        }

        public Criteria andCompletionConditionLessThanOrEqualTo(String value) {
            addCriterion("COMPLETION_CONDITION <=", value, "completionCondition");
            return (Criteria) this;
        }

        public Criteria andCompletionConditionLike(String value) {
            addCriterion("COMPLETION_CONDITION like", value, "completionCondition");
            return (Criteria) this;
        }

        public Criteria andCompletionConditionNotLike(String value) {
            addCriterion("COMPLETION_CONDITION not like", value, "completionCondition");
            return (Criteria) this;
        }

        public Criteria andCompletionConditionIn(List<String> values) {
            addCriterion("COMPLETION_CONDITION in", values, "completionCondition");
            return (Criteria) this;
        }

        public Criteria andCompletionConditionNotIn(List<String> values) {
            addCriterion("COMPLETION_CONDITION not in", values, "completionCondition");
            return (Criteria) this;
        }

        public Criteria andCompletionConditionBetween(String value1, String value2) {
            addCriterion("COMPLETION_CONDITION between", value1, value2, "completionCondition");
            return (Criteria) this;
        }

        public Criteria andCompletionConditionNotBetween(String value1, String value2) {
            addCriterion("COMPLETION_CONDITION not between", value1, value2, "completionCondition");
            return (Criteria) this;
        }

        public Criteria andVoltageLevelIsNull() {
            addCriterion("VOLTAGE_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andVoltageLevelIsNotNull() {
            addCriterion("VOLTAGE_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andVoltageLevelEqualTo(Integer value) {
            addCriterion("VOLTAGE_LEVEL =", value, "voltageLevel");
            return (Criteria) this;
        }

        public Criteria andVoltageLevelNotEqualTo(Integer value) {
            addCriterion("VOLTAGE_LEVEL <>", value, "voltageLevel");
            return (Criteria) this;
        }

        public Criteria andVoltageLevelGreaterThan(Integer value) {
            addCriterion("VOLTAGE_LEVEL >", value, "voltageLevel");
            return (Criteria) this;
        }

        public Criteria andVoltageLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("VOLTAGE_LEVEL >=", value, "voltageLevel");
            return (Criteria) this;
        }

        public Criteria andVoltageLevelLessThan(Integer value) {
            addCriterion("VOLTAGE_LEVEL <", value, "voltageLevel");
            return (Criteria) this;
        }

        public Criteria andVoltageLevelLessThanOrEqualTo(Integer value) {
            addCriterion("VOLTAGE_LEVEL <=", value, "voltageLevel");
            return (Criteria) this;
        }

        public Criteria andVoltageLevelIn(List<Integer> values) {
            addCriterion("VOLTAGE_LEVEL in", values, "voltageLevel");
            return (Criteria) this;
        }

        public Criteria andVoltageLevelNotIn(List<Integer> values) {
            addCriterion("VOLTAGE_LEVEL not in", values, "voltageLevel");
            return (Criteria) this;
        }

        public Criteria andVoltageLevelBetween(Integer value1, Integer value2) {
            addCriterion("VOLTAGE_LEVEL between", value1, value2, "voltageLevel");
            return (Criteria) this;
        }

        public Criteria andVoltageLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("VOLTAGE_LEVEL not between", value1, value2, "voltageLevel");
            return (Criteria) this;
        }

        public Criteria andWorkDayIsNull() {
            addCriterion("WORK_DAY is null");
            return (Criteria) this;
        }

        public Criteria andWorkDayIsNotNull() {
            addCriterion("WORK_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andWorkDayEqualTo(Integer value) {
            addCriterion("WORK_DAY =", value, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkDayNotEqualTo(Integer value) {
            addCriterion("WORK_DAY <>", value, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkDayGreaterThan(Integer value) {
            addCriterion("WORK_DAY >", value, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("WORK_DAY >=", value, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkDayLessThan(Integer value) {
            addCriterion("WORK_DAY <", value, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkDayLessThanOrEqualTo(Integer value) {
            addCriterion("WORK_DAY <=", value, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkDayIn(List<Integer> values) {
            addCriterion("WORK_DAY in", values, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkDayNotIn(List<Integer> values) {
            addCriterion("WORK_DAY not in", values, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkDayBetween(Integer value1, Integer value2) {
            addCriterion("WORK_DAY between", value1, value2, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkDayNotBetween(Integer value1, Integer value2) {
            addCriterion("WORK_DAY not between", value1, value2, "workDay");
            return (Criteria) this;
        }

        public Criteria andSpecialityIsNull() {
            addCriterion("SPECIALITY is null");
            return (Criteria) this;
        }

        public Criteria andSpecialityIsNotNull() {
            addCriterion("SPECIALITY is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialityEqualTo(Integer value) {
            addCriterion("SPECIALITY =", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotEqualTo(Integer value) {
            addCriterion("SPECIALITY <>", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityGreaterThan(Integer value) {
            addCriterion("SPECIALITY >", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityGreaterThanOrEqualTo(Integer value) {
            addCriterion("SPECIALITY >=", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLessThan(Integer value) {
            addCriterion("SPECIALITY <", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLessThanOrEqualTo(Integer value) {
            addCriterion("SPECIALITY <=", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityIn(List<Integer> values) {
            addCriterion("SPECIALITY in", values, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotIn(List<Integer> values) {
            addCriterion("SPECIALITY not in", values, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityBetween(Integer value1, Integer value2) {
            addCriterion("SPECIALITY between", value1, value2, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotBetween(Integer value1, Integer value2) {
            addCriterion("SPECIALITY not between", value1, value2, "speciality");
            return (Criteria) this;
        }

        public Criteria andWorkHourIsNull() {
            addCriterion("WORK_HOUR is null");
            return (Criteria) this;
        }

        public Criteria andWorkHourIsNotNull() {
            addCriterion("WORK_HOUR is not null");
            return (Criteria) this;
        }

        public Criteria andWorkHourEqualTo(Integer value) {
            addCriterion("WORK_HOUR =", value, "workHour");
            return (Criteria) this;
        }

        public Criteria andWorkHourNotEqualTo(Integer value) {
            addCriterion("WORK_HOUR <>", value, "workHour");
            return (Criteria) this;
        }

        public Criteria andWorkHourGreaterThan(Integer value) {
            addCriterion("WORK_HOUR >", value, "workHour");
            return (Criteria) this;
        }

        public Criteria andWorkHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("WORK_HOUR >=", value, "workHour");
            return (Criteria) this;
        }

        public Criteria andWorkHourLessThan(Integer value) {
            addCriterion("WORK_HOUR <", value, "workHour");
            return (Criteria) this;
        }

        public Criteria andWorkHourLessThanOrEqualTo(Integer value) {
            addCriterion("WORK_HOUR <=", value, "workHour");
            return (Criteria) this;
        }

        public Criteria andWorkHourIn(List<Integer> values) {
            addCriterion("WORK_HOUR in", values, "workHour");
            return (Criteria) this;
        }

        public Criteria andWorkHourNotIn(List<Integer> values) {
            addCriterion("WORK_HOUR not in", values, "workHour");
            return (Criteria) this;
        }

        public Criteria andWorkHourBetween(Integer value1, Integer value2) {
            addCriterion("WORK_HOUR between", value1, value2, "workHour");
            return (Criteria) this;
        }

        public Criteria andWorkHourNotBetween(Integer value1, Integer value2) {
            addCriterion("WORK_HOUR not between", value1, value2, "workHour");
            return (Criteria) this;
        }

        public Criteria andPlanBeginWeekIsNull() {
            addCriterion("PLAN_BEGIN_WEEK is null");
            return (Criteria) this;
        }

        public Criteria andPlanBeginWeekIsNotNull() {
            addCriterion("PLAN_BEGIN_WEEK is not null");
            return (Criteria) this;
        }

        public Criteria andPlanBeginWeekEqualTo(Integer value) {
            addCriterion("PLAN_BEGIN_WEEK =", value, "planBeginWeek");
            return (Criteria) this;
        }

        public Criteria andPlanBeginWeekNotEqualTo(Integer value) {
            addCriterion("PLAN_BEGIN_WEEK <>", value, "planBeginWeek");
            return (Criteria) this;
        }

        public Criteria andPlanBeginWeekGreaterThan(Integer value) {
            addCriterion("PLAN_BEGIN_WEEK >", value, "planBeginWeek");
            return (Criteria) this;
        }

        public Criteria andPlanBeginWeekGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLAN_BEGIN_WEEK >=", value, "planBeginWeek");
            return (Criteria) this;
        }

        public Criteria andPlanBeginWeekLessThan(Integer value) {
            addCriterion("PLAN_BEGIN_WEEK <", value, "planBeginWeek");
            return (Criteria) this;
        }

        public Criteria andPlanBeginWeekLessThanOrEqualTo(Integer value) {
            addCriterion("PLAN_BEGIN_WEEK <=", value, "planBeginWeek");
            return (Criteria) this;
        }

        public Criteria andPlanBeginWeekIn(List<Integer> values) {
            addCriterion("PLAN_BEGIN_WEEK in", values, "planBeginWeek");
            return (Criteria) this;
        }

        public Criteria andPlanBeginWeekNotIn(List<Integer> values) {
            addCriterion("PLAN_BEGIN_WEEK not in", values, "planBeginWeek");
            return (Criteria) this;
        }

        public Criteria andPlanBeginWeekBetween(Integer value1, Integer value2) {
            addCriterion("PLAN_BEGIN_WEEK between", value1, value2, "planBeginWeek");
            return (Criteria) this;
        }

        public Criteria andPlanBeginWeekNotBetween(Integer value1, Integer value2) {
            addCriterion("PLAN_BEGIN_WEEK not between", value1, value2, "planBeginWeek");
            return (Criteria) this;
        }

        public Criteria andIsExteriorDeptIsNull() {
            addCriterion("IS_EXTERIOR_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andIsExteriorDeptIsNotNull() {
            addCriterion("IS_EXTERIOR_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andIsExteriorDeptEqualTo(Integer value) {
            addCriterion("IS_EXTERIOR_DEPT =", value, "isExteriorDept");
            return (Criteria) this;
        }

        public Criteria andIsExteriorDeptNotEqualTo(Integer value) {
            addCriterion("IS_EXTERIOR_DEPT <>", value, "isExteriorDept");
            return (Criteria) this;
        }

        public Criteria andIsExteriorDeptGreaterThan(Integer value) {
            addCriterion("IS_EXTERIOR_DEPT >", value, "isExteriorDept");
            return (Criteria) this;
        }

        public Criteria andIsExteriorDeptGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_EXTERIOR_DEPT >=", value, "isExteriorDept");
            return (Criteria) this;
        }

        public Criteria andIsExteriorDeptLessThan(Integer value) {
            addCriterion("IS_EXTERIOR_DEPT <", value, "isExteriorDept");
            return (Criteria) this;
        }

        public Criteria andIsExteriorDeptLessThanOrEqualTo(Integer value) {
            addCriterion("IS_EXTERIOR_DEPT <=", value, "isExteriorDept");
            return (Criteria) this;
        }

        public Criteria andIsExteriorDeptIn(List<Integer> values) {
            addCriterion("IS_EXTERIOR_DEPT in", values, "isExteriorDept");
            return (Criteria) this;
        }

        public Criteria andIsExteriorDeptNotIn(List<Integer> values) {
            addCriterion("IS_EXTERIOR_DEPT not in", values, "isExteriorDept");
            return (Criteria) this;
        }

        public Criteria andIsExteriorDeptBetween(Integer value1, Integer value2) {
            addCriterion("IS_EXTERIOR_DEPT between", value1, value2, "isExteriorDept");
            return (Criteria) this;
        }

        public Criteria andIsExteriorDeptNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_EXTERIOR_DEPT not between", value1, value2, "isExteriorDept");
            return (Criteria) this;
        }

        public Criteria andPersonnelCountIsNull() {
            addCriterion("PERSONNEL_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelCountIsNotNull() {
            addCriterion("PERSONNEL_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelCountEqualTo(Integer value) {
            addCriterion("PERSONNEL_COUNT =", value, "personnelCount");
            return (Criteria) this;
        }

        public Criteria andPersonnelCountNotEqualTo(Integer value) {
            addCriterion("PERSONNEL_COUNT <>", value, "personnelCount");
            return (Criteria) this;
        }

        public Criteria andPersonnelCountGreaterThan(Integer value) {
            addCriterion("PERSONNEL_COUNT >", value, "personnelCount");
            return (Criteria) this;
        }

        public Criteria andPersonnelCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("PERSONNEL_COUNT >=", value, "personnelCount");
            return (Criteria) this;
        }

        public Criteria andPersonnelCountLessThan(Integer value) {
            addCriterion("PERSONNEL_COUNT <", value, "personnelCount");
            return (Criteria) this;
        }

        public Criteria andPersonnelCountLessThanOrEqualTo(Integer value) {
            addCriterion("PERSONNEL_COUNT <=", value, "personnelCount");
            return (Criteria) this;
        }

        public Criteria andPersonnelCountIn(List<Integer> values) {
            addCriterion("PERSONNEL_COUNT in", values, "personnelCount");
            return (Criteria) this;
        }

        public Criteria andPersonnelCountNotIn(List<Integer> values) {
            addCriterion("PERSONNEL_COUNT not in", values, "personnelCount");
            return (Criteria) this;
        }

        public Criteria andPersonnelCountBetween(Integer value1, Integer value2) {
            addCriterion("PERSONNEL_COUNT between", value1, value2, "personnelCount");
            return (Criteria) this;
        }

        public Criteria andPersonnelCountNotBetween(Integer value1, Integer value2) {
            addCriterion("PERSONNEL_COUNT not between", value1, value2, "personnelCount");
            return (Criteria) this;
        }

        public Criteria andWorkDeptOidIsNull() {
            addCriterion("WORK_DEPT_OID is null");
            return (Criteria) this;
        }

        public Criteria andWorkDeptOidIsNotNull() {
            addCriterion("WORK_DEPT_OID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkDeptOidEqualTo(String value) {
            addCriterion("WORK_DEPT_OID =", value, "workDeptOid");
            return (Criteria) this;
        }

        public Criteria andWorkDeptOidNotEqualTo(String value) {
            addCriterion("WORK_DEPT_OID <>", value, "workDeptOid");
            return (Criteria) this;
        }

        public Criteria andWorkDeptOidGreaterThan(String value) {
            addCriterion("WORK_DEPT_OID >", value, "workDeptOid");
            return (Criteria) this;
        }

        public Criteria andWorkDeptOidGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_DEPT_OID >=", value, "workDeptOid");
            return (Criteria) this;
        }

        public Criteria andWorkDeptOidLessThan(String value) {
            addCriterion("WORK_DEPT_OID <", value, "workDeptOid");
            return (Criteria) this;
        }

        public Criteria andWorkDeptOidLessThanOrEqualTo(String value) {
            addCriterion("WORK_DEPT_OID <=", value, "workDeptOid");
            return (Criteria) this;
        }

        public Criteria andWorkDeptOidLike(String value) {
            addCriterion("WORK_DEPT_OID like", value, "workDeptOid");
            return (Criteria) this;
        }

        public Criteria andWorkDeptOidNotLike(String value) {
            addCriterion("WORK_DEPT_OID not like", value, "workDeptOid");
            return (Criteria) this;
        }

        public Criteria andWorkDeptOidIn(List<String> values) {
            addCriterion("WORK_DEPT_OID in", values, "workDeptOid");
            return (Criteria) this;
        }

        public Criteria andWorkDeptOidNotIn(List<String> values) {
            addCriterion("WORK_DEPT_OID not in", values, "workDeptOid");
            return (Criteria) this;
        }

        public Criteria andWorkDeptOidBetween(String value1, String value2) {
            addCriterion("WORK_DEPT_OID between", value1, value2, "workDeptOid");
            return (Criteria) this;
        }

        public Criteria andWorkDeptOidNotBetween(String value1, String value2) {
            addCriterion("WORK_DEPT_OID not between", value1, value2, "workDeptOid");
            return (Criteria) this;
        }

        public Criteria andWorkDeptOnameIsNull() {
            addCriterion("WORK_DEPT_ONAME is null");
            return (Criteria) this;
        }

        public Criteria andWorkDeptOnameIsNotNull() {
            addCriterion("WORK_DEPT_ONAME is not null");
            return (Criteria) this;
        }

        public Criteria andWorkDeptOnameEqualTo(String value) {
            addCriterion("WORK_DEPT_ONAME =", value, "workDeptOname");
            return (Criteria) this;
        }

        public Criteria andWorkDeptOnameNotEqualTo(String value) {
            addCriterion("WORK_DEPT_ONAME <>", value, "workDeptOname");
            return (Criteria) this;
        }

        public Criteria andWorkDeptOnameGreaterThan(String value) {
            addCriterion("WORK_DEPT_ONAME >", value, "workDeptOname");
            return (Criteria) this;
        }

        public Criteria andWorkDeptOnameGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_DEPT_ONAME >=", value, "workDeptOname");
            return (Criteria) this;
        }

        public Criteria andWorkDeptOnameLessThan(String value) {
            addCriterion("WORK_DEPT_ONAME <", value, "workDeptOname");
            return (Criteria) this;
        }

        public Criteria andWorkDeptOnameLessThanOrEqualTo(String value) {
            addCriterion("WORK_DEPT_ONAME <=", value, "workDeptOname");
            return (Criteria) this;
        }

        public Criteria andWorkDeptOnameLike(String value) {
            addCriterion("WORK_DEPT_ONAME like", value, "workDeptOname");
            return (Criteria) this;
        }

        public Criteria andWorkDeptOnameNotLike(String value) {
            addCriterion("WORK_DEPT_ONAME not like", value, "workDeptOname");
            return (Criteria) this;
        }

        public Criteria andWorkDeptOnameIn(List<String> values) {
            addCriterion("WORK_DEPT_ONAME in", values, "workDeptOname");
            return (Criteria) this;
        }

        public Criteria andWorkDeptOnameNotIn(List<String> values) {
            addCriterion("WORK_DEPT_ONAME not in", values, "workDeptOname");
            return (Criteria) this;
        }

        public Criteria andWorkDeptOnameBetween(String value1, String value2) {
            addCriterion("WORK_DEPT_ONAME between", value1, value2, "workDeptOname");
            return (Criteria) this;
        }

        public Criteria andWorkDeptOnameNotBetween(String value1, String value2) {
            addCriterion("WORK_DEPT_ONAME not between", value1, value2, "workDeptOname");
            return (Criteria) this;
        }

        public Criteria andIsBequeathQuestionIsNull() {
            addCriterion("IS_BEQUEATH_QUESTION is null");
            return (Criteria) this;
        }

        public Criteria andIsBequeathQuestionIsNotNull() {
            addCriterion("IS_BEQUEATH_QUESTION is not null");
            return (Criteria) this;
        }

        public Criteria andIsBequeathQuestionEqualTo(Integer value) {
            addCriterion("IS_BEQUEATH_QUESTION =", value, "isBequeathQuestion");
            return (Criteria) this;
        }

        public Criteria andIsBequeathQuestionNotEqualTo(Integer value) {
            addCriterion("IS_BEQUEATH_QUESTION <>", value, "isBequeathQuestion");
            return (Criteria) this;
        }

        public Criteria andIsBequeathQuestionGreaterThan(Integer value) {
            addCriterion("IS_BEQUEATH_QUESTION >", value, "isBequeathQuestion");
            return (Criteria) this;
        }

        public Criteria andIsBequeathQuestionGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_BEQUEATH_QUESTION >=", value, "isBequeathQuestion");
            return (Criteria) this;
        }

        public Criteria andIsBequeathQuestionLessThan(Integer value) {
            addCriterion("IS_BEQUEATH_QUESTION <", value, "isBequeathQuestion");
            return (Criteria) this;
        }

        public Criteria andIsBequeathQuestionLessThanOrEqualTo(Integer value) {
            addCriterion("IS_BEQUEATH_QUESTION <=", value, "isBequeathQuestion");
            return (Criteria) this;
        }

        public Criteria andIsBequeathQuestionIn(List<Integer> values) {
            addCriterion("IS_BEQUEATH_QUESTION in", values, "isBequeathQuestion");
            return (Criteria) this;
        }

        public Criteria andIsBequeathQuestionNotIn(List<Integer> values) {
            addCriterion("IS_BEQUEATH_QUESTION not in", values, "isBequeathQuestion");
            return (Criteria) this;
        }

        public Criteria andIsBequeathQuestionBetween(Integer value1, Integer value2) {
            addCriterion("IS_BEQUEATH_QUESTION between", value1, value2, "isBequeathQuestion");
            return (Criteria) this;
        }

        public Criteria andIsBequeathQuestionNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_BEQUEATH_QUESTION not between", value1, value2, "isBequeathQuestion");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinionIsNull() {
            addCriterion("MONITOR_OPINION is null");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinionIsNotNull() {
            addCriterion("MONITOR_OPINION is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinionEqualTo(String value) {
            addCriterion("MONITOR_OPINION =", value, "monitorOpinion");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinionNotEqualTo(String value) {
            addCriterion("MONITOR_OPINION <>", value, "monitorOpinion");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinionGreaterThan(String value) {
            addCriterion("MONITOR_OPINION >", value, "monitorOpinion");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("MONITOR_OPINION >=", value, "monitorOpinion");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinionLessThan(String value) {
            addCriterion("MONITOR_OPINION <", value, "monitorOpinion");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinionLessThanOrEqualTo(String value) {
            addCriterion("MONITOR_OPINION <=", value, "monitorOpinion");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinionLike(String value) {
            addCriterion("MONITOR_OPINION like", value, "monitorOpinion");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinionNotLike(String value) {
            addCriterion("MONITOR_OPINION not like", value, "monitorOpinion");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinionIn(List<String> values) {
            addCriterion("MONITOR_OPINION in", values, "monitorOpinion");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinionNotIn(List<String> values) {
            addCriterion("MONITOR_OPINION not in", values, "monitorOpinion");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinionBetween(String value1, String value2) {
            addCriterion("MONITOR_OPINION between", value1, value2, "monitorOpinion");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinionNotBetween(String value1, String value2) {
            addCriterion("MONITOR_OPINION not between", value1, value2, "monitorOpinion");
            return (Criteria) this;
        }

        public Criteria andAffirmUidIsNull() {
            addCriterion("AFFIRM_UID is null");
            return (Criteria) this;
        }

        public Criteria andAffirmUidIsNotNull() {
            addCriterion("AFFIRM_UID is not null");
            return (Criteria) this;
        }

        public Criteria andAffirmUidEqualTo(String value) {
            addCriterion("AFFIRM_UID =", value, "affirmUid");
            return (Criteria) this;
        }

        public Criteria andAffirmUidNotEqualTo(String value) {
            addCriterion("AFFIRM_UID <>", value, "affirmUid");
            return (Criteria) this;
        }

        public Criteria andAffirmUidGreaterThan(String value) {
            addCriterion("AFFIRM_UID >", value, "affirmUid");
            return (Criteria) this;
        }

        public Criteria andAffirmUidGreaterThanOrEqualTo(String value) {
            addCriterion("AFFIRM_UID >=", value, "affirmUid");
            return (Criteria) this;
        }

        public Criteria andAffirmUidLessThan(String value) {
            addCriterion("AFFIRM_UID <", value, "affirmUid");
            return (Criteria) this;
        }

        public Criteria andAffirmUidLessThanOrEqualTo(String value) {
            addCriterion("AFFIRM_UID <=", value, "affirmUid");
            return (Criteria) this;
        }

        public Criteria andAffirmUidLike(String value) {
            addCriterion("AFFIRM_UID like", value, "affirmUid");
            return (Criteria) this;
        }

        public Criteria andAffirmUidNotLike(String value) {
            addCriterion("AFFIRM_UID not like", value, "affirmUid");
            return (Criteria) this;
        }

        public Criteria andAffirmUidIn(List<String> values) {
            addCriterion("AFFIRM_UID in", values, "affirmUid");
            return (Criteria) this;
        }

        public Criteria andAffirmUidNotIn(List<String> values) {
            addCriterion("AFFIRM_UID not in", values, "affirmUid");
            return (Criteria) this;
        }

        public Criteria andAffirmUidBetween(String value1, String value2) {
            addCriterion("AFFIRM_UID between", value1, value2, "affirmUid");
            return (Criteria) this;
        }

        public Criteria andAffirmUidNotBetween(String value1, String value2) {
            addCriterion("AFFIRM_UID not between", value1, value2, "affirmUid");
            return (Criteria) this;
        }

        public Criteria andAffirmUnameIsNull() {
            addCriterion("AFFIRM_UNAME is null");
            return (Criteria) this;
        }

        public Criteria andAffirmUnameIsNotNull() {
            addCriterion("AFFIRM_UNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAffirmUnameEqualTo(String value) {
            addCriterion("AFFIRM_UNAME =", value, "affirmUname");
            return (Criteria) this;
        }

        public Criteria andAffirmUnameNotEqualTo(String value) {
            addCriterion("AFFIRM_UNAME <>", value, "affirmUname");
            return (Criteria) this;
        }

        public Criteria andAffirmUnameGreaterThan(String value) {
            addCriterion("AFFIRM_UNAME >", value, "affirmUname");
            return (Criteria) this;
        }

        public Criteria andAffirmUnameGreaterThanOrEqualTo(String value) {
            addCriterion("AFFIRM_UNAME >=", value, "affirmUname");
            return (Criteria) this;
        }

        public Criteria andAffirmUnameLessThan(String value) {
            addCriterion("AFFIRM_UNAME <", value, "affirmUname");
            return (Criteria) this;
        }

        public Criteria andAffirmUnameLessThanOrEqualTo(String value) {
            addCriterion("AFFIRM_UNAME <=", value, "affirmUname");
            return (Criteria) this;
        }

        public Criteria andAffirmUnameLike(String value) {
            addCriterion("AFFIRM_UNAME like", value, "affirmUname");
            return (Criteria) this;
        }

        public Criteria andAffirmUnameNotLike(String value) {
            addCriterion("AFFIRM_UNAME not like", value, "affirmUname");
            return (Criteria) this;
        }

        public Criteria andAffirmUnameIn(List<String> values) {
            addCriterion("AFFIRM_UNAME in", values, "affirmUname");
            return (Criteria) this;
        }

        public Criteria andAffirmUnameNotIn(List<String> values) {
            addCriterion("AFFIRM_UNAME not in", values, "affirmUname");
            return (Criteria) this;
        }

        public Criteria andAffirmUnameBetween(String value1, String value2) {
            addCriterion("AFFIRM_UNAME between", value1, value2, "affirmUname");
            return (Criteria) this;
        }

        public Criteria andAffirmUnameNotBetween(String value1, String value2) {
            addCriterion("AFFIRM_UNAME not between", value1, value2, "affirmUname");
            return (Criteria) this;
        }

        public Criteria andAffirmDateIsNull() {
            addCriterion("AFFIRM_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAffirmDateIsNotNull() {
            addCriterion("AFFIRM_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAffirmDateEqualTo(Date value) {
            addCriterion("AFFIRM_DATE =", value, "affirmDate");
            return (Criteria) this;
        }

        public Criteria andAffirmDateNotEqualTo(Date value) {
            addCriterion("AFFIRM_DATE <>", value, "affirmDate");
            return (Criteria) this;
        }

        public Criteria andAffirmDateGreaterThan(Date value) {
            addCriterion("AFFIRM_DATE >", value, "affirmDate");
            return (Criteria) this;
        }

        public Criteria andAffirmDateGreaterThanOrEqualTo(Date value) {
            addCriterion("AFFIRM_DATE >=", value, "affirmDate");
            return (Criteria) this;
        }

        public Criteria andAffirmDateLessThan(Date value) {
            addCriterion("AFFIRM_DATE <", value, "affirmDate");
            return (Criteria) this;
        }

        public Criteria andAffirmDateLessThanOrEqualTo(Date value) {
            addCriterion("AFFIRM_DATE <=", value, "affirmDate");
            return (Criteria) this;
        }

        public Criteria andAffirmDateIn(List<Date> values) {
            addCriterion("AFFIRM_DATE in", values, "affirmDate");
            return (Criteria) this;
        }

        public Criteria andAffirmDateNotIn(List<Date> values) {
            addCriterion("AFFIRM_DATE not in", values, "affirmDate");
            return (Criteria) this;
        }

        public Criteria andAffirmDateBetween(Date value1, Date value2) {
            addCriterion("AFFIRM_DATE between", value1, value2, "affirmDate");
            return (Criteria) this;
        }

        public Criteria andAffirmDateNotBetween(Date value1, Date value2) {
            addCriterion("AFFIRM_DATE not between", value1, value2, "affirmDate");
            return (Criteria) this;
        }

        public Criteria andAdvertProceedingIsNull() {
            addCriterion("ADVERT_PROCEEDING is null");
            return (Criteria) this;
        }

        public Criteria andAdvertProceedingIsNotNull() {
            addCriterion("ADVERT_PROCEEDING is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertProceedingEqualTo(String value) {
            addCriterion("ADVERT_PROCEEDING =", value, "advertProceeding");
            return (Criteria) this;
        }

        public Criteria andAdvertProceedingNotEqualTo(String value) {
            addCriterion("ADVERT_PROCEEDING <>", value, "advertProceeding");
            return (Criteria) this;
        }

        public Criteria andAdvertProceedingGreaterThan(String value) {
            addCriterion("ADVERT_PROCEEDING >", value, "advertProceeding");
            return (Criteria) this;
        }

        public Criteria andAdvertProceedingGreaterThanOrEqualTo(String value) {
            addCriterion("ADVERT_PROCEEDING >=", value, "advertProceeding");
            return (Criteria) this;
        }

        public Criteria andAdvertProceedingLessThan(String value) {
            addCriterion("ADVERT_PROCEEDING <", value, "advertProceeding");
            return (Criteria) this;
        }

        public Criteria andAdvertProceedingLessThanOrEqualTo(String value) {
            addCriterion("ADVERT_PROCEEDING <=", value, "advertProceeding");
            return (Criteria) this;
        }

        public Criteria andAdvertProceedingLike(String value) {
            addCriterion("ADVERT_PROCEEDING like", value, "advertProceeding");
            return (Criteria) this;
        }

        public Criteria andAdvertProceedingNotLike(String value) {
            addCriterion("ADVERT_PROCEEDING not like", value, "advertProceeding");
            return (Criteria) this;
        }

        public Criteria andAdvertProceedingIn(List<String> values) {
            addCriterion("ADVERT_PROCEEDING in", values, "advertProceeding");
            return (Criteria) this;
        }

        public Criteria andAdvertProceedingNotIn(List<String> values) {
            addCriterion("ADVERT_PROCEEDING not in", values, "advertProceeding");
            return (Criteria) this;
        }

        public Criteria andAdvertProceedingBetween(String value1, String value2) {
            addCriterion("ADVERT_PROCEEDING between", value1, value2, "advertProceeding");
            return (Criteria) this;
        }

        public Criteria andAdvertProceedingNotBetween(String value1, String value2) {
            addCriterion("ADVERT_PROCEEDING not between", value1, value2, "advertProceeding");
            return (Criteria) this;
        }

        public Criteria andWorkSmallTypeIsNull() {
            addCriterion("WORK_SMALL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andWorkSmallTypeIsNotNull() {
            addCriterion("WORK_SMALL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkSmallTypeEqualTo(Integer value) {
            addCriterion("WORK_SMALL_TYPE =", value, "workSmallType");
            return (Criteria) this;
        }

        public Criteria andWorkSmallTypeNotEqualTo(Integer value) {
            addCriterion("WORK_SMALL_TYPE <>", value, "workSmallType");
            return (Criteria) this;
        }

        public Criteria andWorkSmallTypeGreaterThan(Integer value) {
            addCriterion("WORK_SMALL_TYPE >", value, "workSmallType");
            return (Criteria) this;
        }

        public Criteria andWorkSmallTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("WORK_SMALL_TYPE >=", value, "workSmallType");
            return (Criteria) this;
        }

        public Criteria andWorkSmallTypeLessThan(Integer value) {
            addCriterion("WORK_SMALL_TYPE <", value, "workSmallType");
            return (Criteria) this;
        }

        public Criteria andWorkSmallTypeLessThanOrEqualTo(Integer value) {
            addCriterion("WORK_SMALL_TYPE <=", value, "workSmallType");
            return (Criteria) this;
        }

        public Criteria andWorkSmallTypeIn(List<Integer> values) {
            addCriterion("WORK_SMALL_TYPE in", values, "workSmallType");
            return (Criteria) this;
        }

        public Criteria andWorkSmallTypeNotIn(List<Integer> values) {
            addCriterion("WORK_SMALL_TYPE not in", values, "workSmallType");
            return (Criteria) this;
        }

        public Criteria andWorkSmallTypeBetween(Integer value1, Integer value2) {
            addCriterion("WORK_SMALL_TYPE between", value1, value2, "workSmallType");
            return (Criteria) this;
        }

        public Criteria andWorkSmallTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("WORK_SMALL_TYPE not between", value1, value2, "workSmallType");
            return (Criteria) this;
        }

        public Criteria andExecutionBackFlagIsNull() {
            addCriterion("EXECUTION_BACK_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andExecutionBackFlagIsNotNull() {
            addCriterion("EXECUTION_BACK_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andExecutionBackFlagEqualTo(Integer value) {
            addCriterion("EXECUTION_BACK_FLAG =", value, "executionBackFlag");
            return (Criteria) this;
        }

        public Criteria andExecutionBackFlagNotEqualTo(Integer value) {
            addCriterion("EXECUTION_BACK_FLAG <>", value, "executionBackFlag");
            return (Criteria) this;
        }

        public Criteria andExecutionBackFlagGreaterThan(Integer value) {
            addCriterion("EXECUTION_BACK_FLAG >", value, "executionBackFlag");
            return (Criteria) this;
        }

        public Criteria andExecutionBackFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXECUTION_BACK_FLAG >=", value, "executionBackFlag");
            return (Criteria) this;
        }

        public Criteria andExecutionBackFlagLessThan(Integer value) {
            addCriterion("EXECUTION_BACK_FLAG <", value, "executionBackFlag");
            return (Criteria) this;
        }

        public Criteria andExecutionBackFlagLessThanOrEqualTo(Integer value) {
            addCriterion("EXECUTION_BACK_FLAG <=", value, "executionBackFlag");
            return (Criteria) this;
        }

        public Criteria andExecutionBackFlagIn(List<Integer> values) {
            addCriterion("EXECUTION_BACK_FLAG in", values, "executionBackFlag");
            return (Criteria) this;
        }

        public Criteria andExecutionBackFlagNotIn(List<Integer> values) {
            addCriterion("EXECUTION_BACK_FLAG not in", values, "executionBackFlag");
            return (Criteria) this;
        }

        public Criteria andExecutionBackFlagBetween(Integer value1, Integer value2) {
            addCriterion("EXECUTION_BACK_FLAG between", value1, value2, "executionBackFlag");
            return (Criteria) this;
        }

        public Criteria andExecutionBackFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("EXECUTION_BACK_FLAG not between", value1, value2, "executionBackFlag");
            return (Criteria) this;
        }

        public Criteria andIsDealDefectIsNull() {
            addCriterion("IS_DEAL_DEFECT is null");
            return (Criteria) this;
        }

        public Criteria andIsDealDefectIsNotNull() {
            addCriterion("IS_DEAL_DEFECT is not null");
            return (Criteria) this;
        }

        public Criteria andIsDealDefectEqualTo(Integer value) {
            addCriterion("IS_DEAL_DEFECT =", value, "isDealDefect");
            return (Criteria) this;
        }

        public Criteria andIsDealDefectNotEqualTo(Integer value) {
            addCriterion("IS_DEAL_DEFECT <>", value, "isDealDefect");
            return (Criteria) this;
        }

        public Criteria andIsDealDefectGreaterThan(Integer value) {
            addCriterion("IS_DEAL_DEFECT >", value, "isDealDefect");
            return (Criteria) this;
        }

        public Criteria andIsDealDefectGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_DEAL_DEFECT >=", value, "isDealDefect");
            return (Criteria) this;
        }

        public Criteria andIsDealDefectLessThan(Integer value) {
            addCriterion("IS_DEAL_DEFECT <", value, "isDealDefect");
            return (Criteria) this;
        }

        public Criteria andIsDealDefectLessThanOrEqualTo(Integer value) {
            addCriterion("IS_DEAL_DEFECT <=", value, "isDealDefect");
            return (Criteria) this;
        }

        public Criteria andIsDealDefectIn(List<Integer> values) {
            addCriterion("IS_DEAL_DEFECT in", values, "isDealDefect");
            return (Criteria) this;
        }

        public Criteria andIsDealDefectNotIn(List<Integer> values) {
            addCriterion("IS_DEAL_DEFECT not in", values, "isDealDefect");
            return (Criteria) this;
        }

        public Criteria andIsDealDefectBetween(Integer value1, Integer value2) {
            addCriterion("IS_DEAL_DEFECT between", value1, value2, "isDealDefect");
            return (Criteria) this;
        }

        public Criteria andIsDealDefectNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_DEAL_DEFECT not between", value1, value2, "isDealDefect");
            return (Criteria) this;
        }

        public Criteria andCurrentExperimentDateIsNull() {
            addCriterion("CURRENT_EXPERIMENT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCurrentExperimentDateIsNotNull() {
            addCriterion("CURRENT_EXPERIMENT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentExperimentDateEqualTo(Date value) {
            addCriterion("CURRENT_EXPERIMENT_DATE =", value, "currentExperimentDate");
            return (Criteria) this;
        }

        public Criteria andCurrentExperimentDateNotEqualTo(Date value) {
            addCriterion("CURRENT_EXPERIMENT_DATE <>", value, "currentExperimentDate");
            return (Criteria) this;
        }

        public Criteria andCurrentExperimentDateGreaterThan(Date value) {
            addCriterion("CURRENT_EXPERIMENT_DATE >", value, "currentExperimentDate");
            return (Criteria) this;
        }

        public Criteria andCurrentExperimentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CURRENT_EXPERIMENT_DATE >=", value, "currentExperimentDate");
            return (Criteria) this;
        }

        public Criteria andCurrentExperimentDateLessThan(Date value) {
            addCriterion("CURRENT_EXPERIMENT_DATE <", value, "currentExperimentDate");
            return (Criteria) this;
        }

        public Criteria andCurrentExperimentDateLessThanOrEqualTo(Date value) {
            addCriterion("CURRENT_EXPERIMENT_DATE <=", value, "currentExperimentDate");
            return (Criteria) this;
        }

        public Criteria andCurrentExperimentDateIn(List<Date> values) {
            addCriterion("CURRENT_EXPERIMENT_DATE in", values, "currentExperimentDate");
            return (Criteria) this;
        }

        public Criteria andCurrentExperimentDateNotIn(List<Date> values) {
            addCriterion("CURRENT_EXPERIMENT_DATE not in", values, "currentExperimentDate");
            return (Criteria) this;
        }

        public Criteria andCurrentExperimentDateBetween(Date value1, Date value2) {
            addCriterion("CURRENT_EXPERIMENT_DATE between", value1, value2, "currentExperimentDate");
            return (Criteria) this;
        }

        public Criteria andCurrentExperimentDateNotBetween(Date value1, Date value2) {
            addCriterion("CURRENT_EXPERIMENT_DATE not between", value1, value2, "currentExperimentDate");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIsNull() {
            addCriterion("RISK_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIsNotNull() {
            addCriterion("RISK_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andRiskLevelEqualTo(Integer value) {
            addCriterion("RISK_LEVEL =", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotEqualTo(Integer value) {
            addCriterion("RISK_LEVEL <>", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelGreaterThan(Integer value) {
            addCriterion("RISK_LEVEL >", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("RISK_LEVEL >=", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelLessThan(Integer value) {
            addCriterion("RISK_LEVEL <", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelLessThanOrEqualTo(Integer value) {
            addCriterion("RISK_LEVEL <=", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIn(List<Integer> values) {
            addCriterion("RISK_LEVEL in", values, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotIn(List<Integer> values) {
            addCriterion("RISK_LEVEL not in", values, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelBetween(Integer value1, Integer value2) {
            addCriterion("RISK_LEVEL between", value1, value2, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("RISK_LEVEL not between", value1, value2, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskValueIsNull() {
            addCriterion("RISK_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andRiskValueIsNotNull() {
            addCriterion("RISK_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andRiskValueEqualTo(BigDecimal value) {
            addCriterion("RISK_VALUE =", value, "riskValue");
            return (Criteria) this;
        }

        public Criteria andRiskValueNotEqualTo(BigDecimal value) {
            addCriterion("RISK_VALUE <>", value, "riskValue");
            return (Criteria) this;
        }

        public Criteria andRiskValueGreaterThan(BigDecimal value) {
            addCriterion("RISK_VALUE >", value, "riskValue");
            return (Criteria) this;
        }

        public Criteria andRiskValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RISK_VALUE >=", value, "riskValue");
            return (Criteria) this;
        }

        public Criteria andRiskValueLessThan(BigDecimal value) {
            addCriterion("RISK_VALUE <", value, "riskValue");
            return (Criteria) this;
        }

        public Criteria andRiskValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RISK_VALUE <=", value, "riskValue");
            return (Criteria) this;
        }

        public Criteria andRiskValueIn(List<BigDecimal> values) {
            addCriterion("RISK_VALUE in", values, "riskValue");
            return (Criteria) this;
        }

        public Criteria andRiskValueNotIn(List<BigDecimal> values) {
            addCriterion("RISK_VALUE not in", values, "riskValue");
            return (Criteria) this;
        }

        public Criteria andRiskValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RISK_VALUE between", value1, value2, "riskValue");
            return (Criteria) this;
        }

        public Criteria andRiskValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RISK_VALUE not between", value1, value2, "riskValue");
            return (Criteria) this;
        }

        public Criteria andPatrolClassifyIsNull() {
            addCriterion("PATROL_CLASSIFY is null");
            return (Criteria) this;
        }

        public Criteria andPatrolClassifyIsNotNull() {
            addCriterion("PATROL_CLASSIFY is not null");
            return (Criteria) this;
        }

        public Criteria andPatrolClassifyEqualTo(Integer value) {
            addCriterion("PATROL_CLASSIFY =", value, "patrolClassify");
            return (Criteria) this;
        }

        public Criteria andPatrolClassifyNotEqualTo(Integer value) {
            addCriterion("PATROL_CLASSIFY <>", value, "patrolClassify");
            return (Criteria) this;
        }

        public Criteria andPatrolClassifyGreaterThan(Integer value) {
            addCriterion("PATROL_CLASSIFY >", value, "patrolClassify");
            return (Criteria) this;
        }

        public Criteria andPatrolClassifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("PATROL_CLASSIFY >=", value, "patrolClassify");
            return (Criteria) this;
        }

        public Criteria andPatrolClassifyLessThan(Integer value) {
            addCriterion("PATROL_CLASSIFY <", value, "patrolClassify");
            return (Criteria) this;
        }

        public Criteria andPatrolClassifyLessThanOrEqualTo(Integer value) {
            addCriterion("PATROL_CLASSIFY <=", value, "patrolClassify");
            return (Criteria) this;
        }

        public Criteria andPatrolClassifyIn(List<Integer> values) {
            addCriterion("PATROL_CLASSIFY in", values, "patrolClassify");
            return (Criteria) this;
        }

        public Criteria andPatrolClassifyNotIn(List<Integer> values) {
            addCriterion("PATROL_CLASSIFY not in", values, "patrolClassify");
            return (Criteria) this;
        }

        public Criteria andPatrolClassifyBetween(Integer value1, Integer value2) {
            addCriterion("PATROL_CLASSIFY between", value1, value2, "patrolClassify");
            return (Criteria) this;
        }

        public Criteria andPatrolClassifyNotBetween(Integer value1, Integer value2) {
            addCriterion("PATROL_CLASSIFY not between", value1, value2, "patrolClassify");
            return (Criteria) this;
        }

        public Criteria andPatrolObjectSelectTypeIsNull() {
            addCriterion("PATROL_OBJECT_SELECT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPatrolObjectSelectTypeIsNotNull() {
            addCriterion("PATROL_OBJECT_SELECT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPatrolObjectSelectTypeEqualTo(Integer value) {
            addCriterion("PATROL_OBJECT_SELECT_TYPE =", value, "patrolObjectSelectType");
            return (Criteria) this;
        }

        public Criteria andPatrolObjectSelectTypeNotEqualTo(Integer value) {
            addCriterion("PATROL_OBJECT_SELECT_TYPE <>", value, "patrolObjectSelectType");
            return (Criteria) this;
        }

        public Criteria andPatrolObjectSelectTypeGreaterThan(Integer value) {
            addCriterion("PATROL_OBJECT_SELECT_TYPE >", value, "patrolObjectSelectType");
            return (Criteria) this;
        }

        public Criteria andPatrolObjectSelectTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PATROL_OBJECT_SELECT_TYPE >=", value, "patrolObjectSelectType");
            return (Criteria) this;
        }

        public Criteria andPatrolObjectSelectTypeLessThan(Integer value) {
            addCriterion("PATROL_OBJECT_SELECT_TYPE <", value, "patrolObjectSelectType");
            return (Criteria) this;
        }

        public Criteria andPatrolObjectSelectTypeLessThanOrEqualTo(Integer value) {
            addCriterion("PATROL_OBJECT_SELECT_TYPE <=", value, "patrolObjectSelectType");
            return (Criteria) this;
        }

        public Criteria andPatrolObjectSelectTypeIn(List<Integer> values) {
            addCriterion("PATROL_OBJECT_SELECT_TYPE in", values, "patrolObjectSelectType");
            return (Criteria) this;
        }

        public Criteria andPatrolObjectSelectTypeNotIn(List<Integer> values) {
            addCriterion("PATROL_OBJECT_SELECT_TYPE not in", values, "patrolObjectSelectType");
            return (Criteria) this;
        }

        public Criteria andPatrolObjectSelectTypeBetween(Integer value1, Integer value2) {
            addCriterion("PATROL_OBJECT_SELECT_TYPE between", value1, value2, "patrolObjectSelectType");
            return (Criteria) this;
        }

        public Criteria andPatrolObjectSelectTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("PATROL_OBJECT_SELECT_TYPE not between", value1, value2, "patrolObjectSelectType");
            return (Criteria) this;
        }

        public Criteria andDispatchWorkUidIsNull() {
            addCriterion("DISPATCH_WORK_UID is null");
            return (Criteria) this;
        }

        public Criteria andDispatchWorkUidIsNotNull() {
            addCriterion("DISPATCH_WORK_UID is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchWorkUidEqualTo(String value) {
            addCriterion("DISPATCH_WORK_UID =", value, "dispatchWorkUid");
            return (Criteria) this;
        }

        public Criteria andDispatchWorkUidNotEqualTo(String value) {
            addCriterion("DISPATCH_WORK_UID <>", value, "dispatchWorkUid");
            return (Criteria) this;
        }

        public Criteria andDispatchWorkUidGreaterThan(String value) {
            addCriterion("DISPATCH_WORK_UID >", value, "dispatchWorkUid");
            return (Criteria) this;
        }

        public Criteria andDispatchWorkUidGreaterThanOrEqualTo(String value) {
            addCriterion("DISPATCH_WORK_UID >=", value, "dispatchWorkUid");
            return (Criteria) this;
        }

        public Criteria andDispatchWorkUidLessThan(String value) {
            addCriterion("DISPATCH_WORK_UID <", value, "dispatchWorkUid");
            return (Criteria) this;
        }

        public Criteria andDispatchWorkUidLessThanOrEqualTo(String value) {
            addCriterion("DISPATCH_WORK_UID <=", value, "dispatchWorkUid");
            return (Criteria) this;
        }

        public Criteria andDispatchWorkUidLike(String value) {
            addCriterion("DISPATCH_WORK_UID like", value, "dispatchWorkUid");
            return (Criteria) this;
        }

        public Criteria andDispatchWorkUidNotLike(String value) {
            addCriterion("DISPATCH_WORK_UID not like", value, "dispatchWorkUid");
            return (Criteria) this;
        }

        public Criteria andDispatchWorkUidIn(List<String> values) {
            addCriterion("DISPATCH_WORK_UID in", values, "dispatchWorkUid");
            return (Criteria) this;
        }

        public Criteria andDispatchWorkUidNotIn(List<String> values) {
            addCriterion("DISPATCH_WORK_UID not in", values, "dispatchWorkUid");
            return (Criteria) this;
        }

        public Criteria andDispatchWorkUidBetween(String value1, String value2) {
            addCriterion("DISPATCH_WORK_UID between", value1, value2, "dispatchWorkUid");
            return (Criteria) this;
        }

        public Criteria andDispatchWorkUidNotBetween(String value1, String value2) {
            addCriterion("DISPATCH_WORK_UID not between", value1, value2, "dispatchWorkUid");
            return (Criteria) this;
        }

        public Criteria andDispatchWorkUnameIsNull() {
            addCriterion("DISPATCH_WORK_UNAME is null");
            return (Criteria) this;
        }

        public Criteria andDispatchWorkUnameIsNotNull() {
            addCriterion("DISPATCH_WORK_UNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchWorkUnameEqualTo(String value) {
            addCriterion("DISPATCH_WORK_UNAME =", value, "dispatchWorkUname");
            return (Criteria) this;
        }

        public Criteria andDispatchWorkUnameNotEqualTo(String value) {
            addCriterion("DISPATCH_WORK_UNAME <>", value, "dispatchWorkUname");
            return (Criteria) this;
        }

        public Criteria andDispatchWorkUnameGreaterThan(String value) {
            addCriterion("DISPATCH_WORK_UNAME >", value, "dispatchWorkUname");
            return (Criteria) this;
        }

        public Criteria andDispatchWorkUnameGreaterThanOrEqualTo(String value) {
            addCriterion("DISPATCH_WORK_UNAME >=", value, "dispatchWorkUname");
            return (Criteria) this;
        }

        public Criteria andDispatchWorkUnameLessThan(String value) {
            addCriterion("DISPATCH_WORK_UNAME <", value, "dispatchWorkUname");
            return (Criteria) this;
        }

        public Criteria andDispatchWorkUnameLessThanOrEqualTo(String value) {
            addCriterion("DISPATCH_WORK_UNAME <=", value, "dispatchWorkUname");
            return (Criteria) this;
        }

        public Criteria andDispatchWorkUnameLike(String value) {
            addCriterion("DISPATCH_WORK_UNAME like", value, "dispatchWorkUname");
            return (Criteria) this;
        }

        public Criteria andDispatchWorkUnameNotLike(String value) {
            addCriterion("DISPATCH_WORK_UNAME not like", value, "dispatchWorkUname");
            return (Criteria) this;
        }

        public Criteria andDispatchWorkUnameIn(List<String> values) {
            addCriterion("DISPATCH_WORK_UNAME in", values, "dispatchWorkUname");
            return (Criteria) this;
        }

        public Criteria andDispatchWorkUnameNotIn(List<String> values) {
            addCriterion("DISPATCH_WORK_UNAME not in", values, "dispatchWorkUname");
            return (Criteria) this;
        }

        public Criteria andDispatchWorkUnameBetween(String value1, String value2) {
            addCriterion("DISPATCH_WORK_UNAME between", value1, value2, "dispatchWorkUname");
            return (Criteria) this;
        }

        public Criteria andDispatchWorkUnameNotBetween(String value1, String value2) {
            addCriterion("DISPATCH_WORK_UNAME not between", value1, value2, "dispatchWorkUname");
            return (Criteria) this;
        }

        public Criteria andDownloadStateIsNull() {
            addCriterion("DOWNLOAD_STATE is null");
            return (Criteria) this;
        }

        public Criteria andDownloadStateIsNotNull() {
            addCriterion("DOWNLOAD_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadStateEqualTo(Integer value) {
            addCriterion("DOWNLOAD_STATE =", value, "downloadState");
            return (Criteria) this;
        }

        public Criteria andDownloadStateNotEqualTo(Integer value) {
            addCriterion("DOWNLOAD_STATE <>", value, "downloadState");
            return (Criteria) this;
        }

        public Criteria andDownloadStateGreaterThan(Integer value) {
            addCriterion("DOWNLOAD_STATE >", value, "downloadState");
            return (Criteria) this;
        }

        public Criteria andDownloadStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("DOWNLOAD_STATE >=", value, "downloadState");
            return (Criteria) this;
        }

        public Criteria andDownloadStateLessThan(Integer value) {
            addCriterion("DOWNLOAD_STATE <", value, "downloadState");
            return (Criteria) this;
        }

        public Criteria andDownloadStateLessThanOrEqualTo(Integer value) {
            addCriterion("DOWNLOAD_STATE <=", value, "downloadState");
            return (Criteria) this;
        }

        public Criteria andDownloadStateIn(List<Integer> values) {
            addCriterion("DOWNLOAD_STATE in", values, "downloadState");
            return (Criteria) this;
        }

        public Criteria andDownloadStateNotIn(List<Integer> values) {
            addCriterion("DOWNLOAD_STATE not in", values, "downloadState");
            return (Criteria) this;
        }

        public Criteria andDownloadStateBetween(Integer value1, Integer value2) {
            addCriterion("DOWNLOAD_STATE between", value1, value2, "downloadState");
            return (Criteria) this;
        }

        public Criteria andDownloadStateNotBetween(Integer value1, Integer value2) {
            addCriterion("DOWNLOAD_STATE not between", value1, value2, "downloadState");
            return (Criteria) this;
        }

        public Criteria andIsSendNoteMasterIsNull() {
            addCriterion("IS_SEND_NOTE_MASTER is null");
            return (Criteria) this;
        }

        public Criteria andIsSendNoteMasterIsNotNull() {
            addCriterion("IS_SEND_NOTE_MASTER is not null");
            return (Criteria) this;
        }

        public Criteria andIsSendNoteMasterEqualTo(Integer value) {
            addCriterion("IS_SEND_NOTE_MASTER =", value, "isSendNoteMaster");
            return (Criteria) this;
        }

        public Criteria andIsSendNoteMasterNotEqualTo(Integer value) {
            addCriterion("IS_SEND_NOTE_MASTER <>", value, "isSendNoteMaster");
            return (Criteria) this;
        }

        public Criteria andIsSendNoteMasterGreaterThan(Integer value) {
            addCriterion("IS_SEND_NOTE_MASTER >", value, "isSendNoteMaster");
            return (Criteria) this;
        }

        public Criteria andIsSendNoteMasterGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_SEND_NOTE_MASTER >=", value, "isSendNoteMaster");
            return (Criteria) this;
        }

        public Criteria andIsSendNoteMasterLessThan(Integer value) {
            addCriterion("IS_SEND_NOTE_MASTER <", value, "isSendNoteMaster");
            return (Criteria) this;
        }

        public Criteria andIsSendNoteMasterLessThanOrEqualTo(Integer value) {
            addCriterion("IS_SEND_NOTE_MASTER <=", value, "isSendNoteMaster");
            return (Criteria) this;
        }

        public Criteria andIsSendNoteMasterIn(List<Integer> values) {
            addCriterion("IS_SEND_NOTE_MASTER in", values, "isSendNoteMaster");
            return (Criteria) this;
        }

        public Criteria andIsSendNoteMasterNotIn(List<Integer> values) {
            addCriterion("IS_SEND_NOTE_MASTER not in", values, "isSendNoteMaster");
            return (Criteria) this;
        }

        public Criteria andIsSendNoteMasterBetween(Integer value1, Integer value2) {
            addCriterion("IS_SEND_NOTE_MASTER between", value1, value2, "isSendNoteMaster");
            return (Criteria) this;
        }

        public Criteria andIsSendNoteMasterNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_SEND_NOTE_MASTER not between", value1, value2, "isSendNoteMaster");
            return (Criteria) this;
        }

        public Criteria andIsSendNoteMemberIsNull() {
            addCriterion("IS_SEND_NOTE_MEMBER is null");
            return (Criteria) this;
        }

        public Criteria andIsSendNoteMemberIsNotNull() {
            addCriterion("IS_SEND_NOTE_MEMBER is not null");
            return (Criteria) this;
        }

        public Criteria andIsSendNoteMemberEqualTo(Integer value) {
            addCriterion("IS_SEND_NOTE_MEMBER =", value, "isSendNoteMember");
            return (Criteria) this;
        }

        public Criteria andIsSendNoteMemberNotEqualTo(Integer value) {
            addCriterion("IS_SEND_NOTE_MEMBER <>", value, "isSendNoteMember");
            return (Criteria) this;
        }

        public Criteria andIsSendNoteMemberGreaterThan(Integer value) {
            addCriterion("IS_SEND_NOTE_MEMBER >", value, "isSendNoteMember");
            return (Criteria) this;
        }

        public Criteria andIsSendNoteMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_SEND_NOTE_MEMBER >=", value, "isSendNoteMember");
            return (Criteria) this;
        }

        public Criteria andIsSendNoteMemberLessThan(Integer value) {
            addCriterion("IS_SEND_NOTE_MEMBER <", value, "isSendNoteMember");
            return (Criteria) this;
        }

        public Criteria andIsSendNoteMemberLessThanOrEqualTo(Integer value) {
            addCriterion("IS_SEND_NOTE_MEMBER <=", value, "isSendNoteMember");
            return (Criteria) this;
        }

        public Criteria andIsSendNoteMemberIn(List<Integer> values) {
            addCriterion("IS_SEND_NOTE_MEMBER in", values, "isSendNoteMember");
            return (Criteria) this;
        }

        public Criteria andIsSendNoteMemberNotIn(List<Integer> values) {
            addCriterion("IS_SEND_NOTE_MEMBER not in", values, "isSendNoteMember");
            return (Criteria) this;
        }

        public Criteria andIsSendNoteMemberBetween(Integer value1, Integer value2) {
            addCriterion("IS_SEND_NOTE_MEMBER between", value1, value2, "isSendNoteMember");
            return (Criteria) this;
        }

        public Criteria andIsSendNoteMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_SEND_NOTE_MEMBER not between", value1, value2, "isSendNoteMember");
            return (Criteria) this;
        }

        public Criteria andPlanRemarkIsNull() {
            addCriterion("PLAN_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andPlanRemarkIsNotNull() {
            addCriterion("PLAN_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andPlanRemarkEqualTo(String value) {
            addCriterion("PLAN_REMARK =", value, "planRemark");
            return (Criteria) this;
        }

        public Criteria andPlanRemarkNotEqualTo(String value) {
            addCriterion("PLAN_REMARK <>", value, "planRemark");
            return (Criteria) this;
        }

        public Criteria andPlanRemarkGreaterThan(String value) {
            addCriterion("PLAN_REMARK >", value, "planRemark");
            return (Criteria) this;
        }

        public Criteria andPlanRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("PLAN_REMARK >=", value, "planRemark");
            return (Criteria) this;
        }

        public Criteria andPlanRemarkLessThan(String value) {
            addCriterion("PLAN_REMARK <", value, "planRemark");
            return (Criteria) this;
        }

        public Criteria andPlanRemarkLessThanOrEqualTo(String value) {
            addCriterion("PLAN_REMARK <=", value, "planRemark");
            return (Criteria) this;
        }

        public Criteria andPlanRemarkLike(String value) {
            addCriterion("PLAN_REMARK like", value, "planRemark");
            return (Criteria) this;
        }

        public Criteria andPlanRemarkNotLike(String value) {
            addCriterion("PLAN_REMARK not like", value, "planRemark");
            return (Criteria) this;
        }

        public Criteria andPlanRemarkIn(List<String> values) {
            addCriterion("PLAN_REMARK in", values, "planRemark");
            return (Criteria) this;
        }

        public Criteria andPlanRemarkNotIn(List<String> values) {
            addCriterion("PLAN_REMARK not in", values, "planRemark");
            return (Criteria) this;
        }

        public Criteria andPlanRemarkBetween(String value1, String value2) {
            addCriterion("PLAN_REMARK between", value1, value2, "planRemark");
            return (Criteria) this;
        }

        public Criteria andPlanRemarkNotBetween(String value1, String value2) {
            addCriterion("PLAN_REMARK not between", value1, value2, "planRemark");
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

        public Criteria andExteriorDeptNameIsNull() {
            addCriterion("EXTERIOR_DEPT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andExteriorDeptNameIsNotNull() {
            addCriterion("EXTERIOR_DEPT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andExteriorDeptNameEqualTo(String value) {
            addCriterion("EXTERIOR_DEPT_NAME =", value, "exteriorDeptName");
            return (Criteria) this;
        }

        public Criteria andExteriorDeptNameNotEqualTo(String value) {
            addCriterion("EXTERIOR_DEPT_NAME <>", value, "exteriorDeptName");
            return (Criteria) this;
        }

        public Criteria andExteriorDeptNameGreaterThan(String value) {
            addCriterion("EXTERIOR_DEPT_NAME >", value, "exteriorDeptName");
            return (Criteria) this;
        }

        public Criteria andExteriorDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("EXTERIOR_DEPT_NAME >=", value, "exteriorDeptName");
            return (Criteria) this;
        }

        public Criteria andExteriorDeptNameLessThan(String value) {
            addCriterion("EXTERIOR_DEPT_NAME <", value, "exteriorDeptName");
            return (Criteria) this;
        }

        public Criteria andExteriorDeptNameLessThanOrEqualTo(String value) {
            addCriterion("EXTERIOR_DEPT_NAME <=", value, "exteriorDeptName");
            return (Criteria) this;
        }

        public Criteria andExteriorDeptNameLike(String value) {
            addCriterion("EXTERIOR_DEPT_NAME like", value, "exteriorDeptName");
            return (Criteria) this;
        }

        public Criteria andExteriorDeptNameNotLike(String value) {
            addCriterion("EXTERIOR_DEPT_NAME not like", value, "exteriorDeptName");
            return (Criteria) this;
        }

        public Criteria andExteriorDeptNameIn(List<String> values) {
            addCriterion("EXTERIOR_DEPT_NAME in", values, "exteriorDeptName");
            return (Criteria) this;
        }

        public Criteria andExteriorDeptNameNotIn(List<String> values) {
            addCriterion("EXTERIOR_DEPT_NAME not in", values, "exteriorDeptName");
            return (Criteria) this;
        }

        public Criteria andExteriorDeptNameBetween(String value1, String value2) {
            addCriterion("EXTERIOR_DEPT_NAME between", value1, value2, "exteriorDeptName");
            return (Criteria) this;
        }

        public Criteria andExteriorDeptNameNotBetween(String value1, String value2) {
            addCriterion("EXTERIOR_DEPT_NAME not between", value1, value2, "exteriorDeptName");
            return (Criteria) this;
        }

        public Criteria andBequeathQuestionIsNull() {
            addCriterion("BEQUEATH_QUESTION is null");
            return (Criteria) this;
        }

        public Criteria andBequeathQuestionIsNotNull() {
            addCriterion("BEQUEATH_QUESTION is not null");
            return (Criteria) this;
        }

        public Criteria andBequeathQuestionEqualTo(String value) {
            addCriterion("BEQUEATH_QUESTION =", value, "bequeathQuestion");
            return (Criteria) this;
        }

        public Criteria andBequeathQuestionNotEqualTo(String value) {
            addCriterion("BEQUEATH_QUESTION <>", value, "bequeathQuestion");
            return (Criteria) this;
        }

        public Criteria andBequeathQuestionGreaterThan(String value) {
            addCriterion("BEQUEATH_QUESTION >", value, "bequeathQuestion");
            return (Criteria) this;
        }

        public Criteria andBequeathQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("BEQUEATH_QUESTION >=", value, "bequeathQuestion");
            return (Criteria) this;
        }

        public Criteria andBequeathQuestionLessThan(String value) {
            addCriterion("BEQUEATH_QUESTION <", value, "bequeathQuestion");
            return (Criteria) this;
        }

        public Criteria andBequeathQuestionLessThanOrEqualTo(String value) {
            addCriterion("BEQUEATH_QUESTION <=", value, "bequeathQuestion");
            return (Criteria) this;
        }

        public Criteria andBequeathQuestionLike(String value) {
            addCriterion("BEQUEATH_QUESTION like", value, "bequeathQuestion");
            return (Criteria) this;
        }

        public Criteria andBequeathQuestionNotLike(String value) {
            addCriterion("BEQUEATH_QUESTION not like", value, "bequeathQuestion");
            return (Criteria) this;
        }

        public Criteria andBequeathQuestionIn(List<String> values) {
            addCriterion("BEQUEATH_QUESTION in", values, "bequeathQuestion");
            return (Criteria) this;
        }

        public Criteria andBequeathQuestionNotIn(List<String> values) {
            addCriterion("BEQUEATH_QUESTION not in", values, "bequeathQuestion");
            return (Criteria) this;
        }

        public Criteria andBequeathQuestionBetween(String value1, String value2) {
            addCriterion("BEQUEATH_QUESTION between", value1, value2, "bequeathQuestion");
            return (Criteria) this;
        }

        public Criteria andBequeathQuestionNotBetween(String value1, String value2) {
            addCriterion("BEQUEATH_QUESTION not between", value1, value2, "bequeathQuestion");
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

        public Criteria andIsNeedOutageApplyIsNull() {
            addCriterion("IS_NEED_OUTAGE_APPLY is null");
            return (Criteria) this;
        }

        public Criteria andIsNeedOutageApplyIsNotNull() {
            addCriterion("IS_NEED_OUTAGE_APPLY is not null");
            return (Criteria) this;
        }

        public Criteria andIsNeedOutageApplyEqualTo(Integer value) {
            addCriterion("IS_NEED_OUTAGE_APPLY =", value, "isNeedOutageApply");
            return (Criteria) this;
        }

        public Criteria andIsNeedOutageApplyNotEqualTo(Integer value) {
            addCriterion("IS_NEED_OUTAGE_APPLY <>", value, "isNeedOutageApply");
            return (Criteria) this;
        }

        public Criteria andIsNeedOutageApplyGreaterThan(Integer value) {
            addCriterion("IS_NEED_OUTAGE_APPLY >", value, "isNeedOutageApply");
            return (Criteria) this;
        }

        public Criteria andIsNeedOutageApplyGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_NEED_OUTAGE_APPLY >=", value, "isNeedOutageApply");
            return (Criteria) this;
        }

        public Criteria andIsNeedOutageApplyLessThan(Integer value) {
            addCriterion("IS_NEED_OUTAGE_APPLY <", value, "isNeedOutageApply");
            return (Criteria) this;
        }

        public Criteria andIsNeedOutageApplyLessThanOrEqualTo(Integer value) {
            addCriterion("IS_NEED_OUTAGE_APPLY <=", value, "isNeedOutageApply");
            return (Criteria) this;
        }

        public Criteria andIsNeedOutageApplyIn(List<Integer> values) {
            addCriterion("IS_NEED_OUTAGE_APPLY in", values, "isNeedOutageApply");
            return (Criteria) this;
        }

        public Criteria andIsNeedOutageApplyNotIn(List<Integer> values) {
            addCriterion("IS_NEED_OUTAGE_APPLY not in", values, "isNeedOutageApply");
            return (Criteria) this;
        }

        public Criteria andIsNeedOutageApplyBetween(Integer value1, Integer value2) {
            addCriterion("IS_NEED_OUTAGE_APPLY between", value1, value2, "isNeedOutageApply");
            return (Criteria) this;
        }

        public Criteria andIsNeedOutageApplyNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_NEED_OUTAGE_APPLY not between", value1, value2, "isNeedOutageApply");
            return (Criteria) this;
        }

        public Criteria andIsAeronefPatrolCooperateIsNull() {
            addCriterion("IS_AERONEF_PATROL_COOPERATE is null");
            return (Criteria) this;
        }

        public Criteria andIsAeronefPatrolCooperateIsNotNull() {
            addCriterion("IS_AERONEF_PATROL_COOPERATE is not null");
            return (Criteria) this;
        }

        public Criteria andIsAeronefPatrolCooperateEqualTo(Integer value) {
            addCriterion("IS_AERONEF_PATROL_COOPERATE =", value, "isAeronefPatrolCooperate");
            return (Criteria) this;
        }

        public Criteria andIsAeronefPatrolCooperateNotEqualTo(Integer value) {
            addCriterion("IS_AERONEF_PATROL_COOPERATE <>", value, "isAeronefPatrolCooperate");
            return (Criteria) this;
        }

        public Criteria andIsAeronefPatrolCooperateGreaterThan(Integer value) {
            addCriterion("IS_AERONEF_PATROL_COOPERATE >", value, "isAeronefPatrolCooperate");
            return (Criteria) this;
        }

        public Criteria andIsAeronefPatrolCooperateGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_AERONEF_PATROL_COOPERATE >=", value, "isAeronefPatrolCooperate");
            return (Criteria) this;
        }

        public Criteria andIsAeronefPatrolCooperateLessThan(Integer value) {
            addCriterion("IS_AERONEF_PATROL_COOPERATE <", value, "isAeronefPatrolCooperate");
            return (Criteria) this;
        }

        public Criteria andIsAeronefPatrolCooperateLessThanOrEqualTo(Integer value) {
            addCriterion("IS_AERONEF_PATROL_COOPERATE <=", value, "isAeronefPatrolCooperate");
            return (Criteria) this;
        }

        public Criteria andIsAeronefPatrolCooperateIn(List<Integer> values) {
            addCriterion("IS_AERONEF_PATROL_COOPERATE in", values, "isAeronefPatrolCooperate");
            return (Criteria) this;
        }

        public Criteria andIsAeronefPatrolCooperateNotIn(List<Integer> values) {
            addCriterion("IS_AERONEF_PATROL_COOPERATE not in", values, "isAeronefPatrolCooperate");
            return (Criteria) this;
        }

        public Criteria andIsAeronefPatrolCooperateBetween(Integer value1, Integer value2) {
            addCriterion("IS_AERONEF_PATROL_COOPERATE between", value1, value2, "isAeronefPatrolCooperate");
            return (Criteria) this;
        }

        public Criteria andIsAeronefPatrolCooperateNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_AERONEF_PATROL_COOPERATE not between", value1, value2, "isAeronefPatrolCooperate");
            return (Criteria) this;
        }

        public Criteria andNotRelTaskformIsNull() {
            addCriterion("NOT_REL_TASKFORM is null");
            return (Criteria) this;
        }

        public Criteria andNotRelTaskformIsNotNull() {
            addCriterion("NOT_REL_TASKFORM is not null");
            return (Criteria) this;
        }

        public Criteria andNotRelTaskformEqualTo(Integer value) {
            addCriterion("NOT_REL_TASKFORM =", value, "notRelTaskform");
            return (Criteria) this;
        }

        public Criteria andNotRelTaskformNotEqualTo(Integer value) {
            addCriterion("NOT_REL_TASKFORM <>", value, "notRelTaskform");
            return (Criteria) this;
        }

        public Criteria andNotRelTaskformGreaterThan(Integer value) {
            addCriterion("NOT_REL_TASKFORM >", value, "notRelTaskform");
            return (Criteria) this;
        }

        public Criteria andNotRelTaskformGreaterThanOrEqualTo(Integer value) {
            addCriterion("NOT_REL_TASKFORM >=", value, "notRelTaskform");
            return (Criteria) this;
        }

        public Criteria andNotRelTaskformLessThan(Integer value) {
            addCriterion("NOT_REL_TASKFORM <", value, "notRelTaskform");
            return (Criteria) this;
        }

        public Criteria andNotRelTaskformLessThanOrEqualTo(Integer value) {
            addCriterion("NOT_REL_TASKFORM <=", value, "notRelTaskform");
            return (Criteria) this;
        }

        public Criteria andNotRelTaskformIn(List<Integer> values) {
            addCriterion("NOT_REL_TASKFORM in", values, "notRelTaskform");
            return (Criteria) this;
        }

        public Criteria andNotRelTaskformNotIn(List<Integer> values) {
            addCriterion("NOT_REL_TASKFORM not in", values, "notRelTaskform");
            return (Criteria) this;
        }

        public Criteria andNotRelTaskformBetween(Integer value1, Integer value2) {
            addCriterion("NOT_REL_TASKFORM between", value1, value2, "notRelTaskform");
            return (Criteria) this;
        }

        public Criteria andNotRelTaskformNotBetween(Integer value1, Integer value2) {
            addCriterion("NOT_REL_TASKFORM not between", value1, value2, "notRelTaskform");
            return (Criteria) this;
        }

        public Criteria andRelTaskFormTypeIsNull() {
            addCriterion("REL_TASK_FORM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRelTaskFormTypeIsNotNull() {
            addCriterion("REL_TASK_FORM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRelTaskFormTypeEqualTo(Integer value) {
            addCriterion("REL_TASK_FORM_TYPE =", value, "relTaskFormType");
            return (Criteria) this;
        }

        public Criteria andRelTaskFormTypeNotEqualTo(Integer value) {
            addCriterion("REL_TASK_FORM_TYPE <>", value, "relTaskFormType");
            return (Criteria) this;
        }

        public Criteria andRelTaskFormTypeGreaterThan(Integer value) {
            addCriterion("REL_TASK_FORM_TYPE >", value, "relTaskFormType");
            return (Criteria) this;
        }

        public Criteria andRelTaskFormTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("REL_TASK_FORM_TYPE >=", value, "relTaskFormType");
            return (Criteria) this;
        }

        public Criteria andRelTaskFormTypeLessThan(Integer value) {
            addCriterion("REL_TASK_FORM_TYPE <", value, "relTaskFormType");
            return (Criteria) this;
        }

        public Criteria andRelTaskFormTypeLessThanOrEqualTo(Integer value) {
            addCriterion("REL_TASK_FORM_TYPE <=", value, "relTaskFormType");
            return (Criteria) this;
        }

        public Criteria andRelTaskFormTypeIn(List<Integer> values) {
            addCriterion("REL_TASK_FORM_TYPE in", values, "relTaskFormType");
            return (Criteria) this;
        }

        public Criteria andRelTaskFormTypeNotIn(List<Integer> values) {
            addCriterion("REL_TASK_FORM_TYPE not in", values, "relTaskFormType");
            return (Criteria) this;
        }

        public Criteria andRelTaskFormTypeBetween(Integer value1, Integer value2) {
            addCriterion("REL_TASK_FORM_TYPE between", value1, value2, "relTaskFormType");
            return (Criteria) this;
        }

        public Criteria andRelTaskFormTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("REL_TASK_FORM_TYPE not between", value1, value2, "relTaskFormType");
            return (Criteria) this;
        }

        public Criteria andIsGriddingPatrolIsNull() {
            addCriterion("IS_GRIDDING_PATROL is null");
            return (Criteria) this;
        }

        public Criteria andIsGriddingPatrolIsNotNull() {
            addCriterion("IS_GRIDDING_PATROL is not null");
            return (Criteria) this;
        }

        public Criteria andIsGriddingPatrolEqualTo(Integer value) {
            addCriterion("IS_GRIDDING_PATROL =", value, "isGriddingPatrol");
            return (Criteria) this;
        }

        public Criteria andIsGriddingPatrolNotEqualTo(Integer value) {
            addCriterion("IS_GRIDDING_PATROL <>", value, "isGriddingPatrol");
            return (Criteria) this;
        }

        public Criteria andIsGriddingPatrolGreaterThan(Integer value) {
            addCriterion("IS_GRIDDING_PATROL >", value, "isGriddingPatrol");
            return (Criteria) this;
        }

        public Criteria andIsGriddingPatrolGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_GRIDDING_PATROL >=", value, "isGriddingPatrol");
            return (Criteria) this;
        }

        public Criteria andIsGriddingPatrolLessThan(Integer value) {
            addCriterion("IS_GRIDDING_PATROL <", value, "isGriddingPatrol");
            return (Criteria) this;
        }

        public Criteria andIsGriddingPatrolLessThanOrEqualTo(Integer value) {
            addCriterion("IS_GRIDDING_PATROL <=", value, "isGriddingPatrol");
            return (Criteria) this;
        }

        public Criteria andIsGriddingPatrolIn(List<Integer> values) {
            addCriterion("IS_GRIDDING_PATROL in", values, "isGriddingPatrol");
            return (Criteria) this;
        }

        public Criteria andIsGriddingPatrolNotIn(List<Integer> values) {
            addCriterion("IS_GRIDDING_PATROL not in", values, "isGriddingPatrol");
            return (Criteria) this;
        }

        public Criteria andIsGriddingPatrolBetween(Integer value1, Integer value2) {
            addCriterion("IS_GRIDDING_PATROL between", value1, value2, "isGriddingPatrol");
            return (Criteria) this;
        }

        public Criteria andIsGriddingPatrolNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_GRIDDING_PATROL not between", value1, value2, "isGriddingPatrol");
            return (Criteria) this;
        }

        public Criteria andIsUavPatrolIsNull() {
            addCriterion("IS_UAV_PATROL is null");
            return (Criteria) this;
        }

        public Criteria andIsUavPatrolIsNotNull() {
            addCriterion("IS_UAV_PATROL is not null");
            return (Criteria) this;
        }

        public Criteria andIsUavPatrolEqualTo(Integer value) {
            addCriterion("IS_UAV_PATROL =", value, "isUavPatrol");
            return (Criteria) this;
        }

        public Criteria andIsUavPatrolNotEqualTo(Integer value) {
            addCriterion("IS_UAV_PATROL <>", value, "isUavPatrol");
            return (Criteria) this;
        }

        public Criteria andIsUavPatrolGreaterThan(Integer value) {
            addCriterion("IS_UAV_PATROL >", value, "isUavPatrol");
            return (Criteria) this;
        }

        public Criteria andIsUavPatrolGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_UAV_PATROL >=", value, "isUavPatrol");
            return (Criteria) this;
        }

        public Criteria andIsUavPatrolLessThan(Integer value) {
            addCriterion("IS_UAV_PATROL <", value, "isUavPatrol");
            return (Criteria) this;
        }

        public Criteria andIsUavPatrolLessThanOrEqualTo(Integer value) {
            addCriterion("IS_UAV_PATROL <=", value, "isUavPatrol");
            return (Criteria) this;
        }

        public Criteria andIsUavPatrolIn(List<Integer> values) {
            addCriterion("IS_UAV_PATROL in", values, "isUavPatrol");
            return (Criteria) this;
        }

        public Criteria andIsUavPatrolNotIn(List<Integer> values) {
            addCriterion("IS_UAV_PATROL not in", values, "isUavPatrol");
            return (Criteria) this;
        }

        public Criteria andIsUavPatrolBetween(Integer value1, Integer value2) {
            addCriterion("IS_UAV_PATROL between", value1, value2, "isUavPatrol");
            return (Criteria) this;
        }

        public Criteria andIsUavPatrolNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_UAV_PATROL not between", value1, value2, "isUavPatrol");
            return (Criteria) this;
        }

        public Criteria andImplementModeIsNull() {
            addCriterion("IMPLEMENT_MODE is null");
            return (Criteria) this;
        }

        public Criteria andImplementModeIsNotNull() {
            addCriterion("IMPLEMENT_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andImplementModeEqualTo(Integer value) {
            addCriterion("IMPLEMENT_MODE =", value, "implementMode");
            return (Criteria) this;
        }

        public Criteria andImplementModeNotEqualTo(Integer value) {
            addCriterion("IMPLEMENT_MODE <>", value, "implementMode");
            return (Criteria) this;
        }

        public Criteria andImplementModeGreaterThan(Integer value) {
            addCriterion("IMPLEMENT_MODE >", value, "implementMode");
            return (Criteria) this;
        }

        public Criteria andImplementModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("IMPLEMENT_MODE >=", value, "implementMode");
            return (Criteria) this;
        }

        public Criteria andImplementModeLessThan(Integer value) {
            addCriterion("IMPLEMENT_MODE <", value, "implementMode");
            return (Criteria) this;
        }

        public Criteria andImplementModeLessThanOrEqualTo(Integer value) {
            addCriterion("IMPLEMENT_MODE <=", value, "implementMode");
            return (Criteria) this;
        }

        public Criteria andImplementModeIn(List<Integer> values) {
            addCriterion("IMPLEMENT_MODE in", values, "implementMode");
            return (Criteria) this;
        }

        public Criteria andImplementModeNotIn(List<Integer> values) {
            addCriterion("IMPLEMENT_MODE not in", values, "implementMode");
            return (Criteria) this;
        }

        public Criteria andImplementModeBetween(Integer value1, Integer value2) {
            addCriterion("IMPLEMENT_MODE between", value1, value2, "implementMode");
            return (Criteria) this;
        }

        public Criteria andImplementModeNotBetween(Integer value1, Integer value2) {
            addCriterion("IMPLEMENT_MODE not between", value1, value2, "implementMode");
            return (Criteria) this;
        }

        public Criteria andIsCableChannelPatrolIsNull() {
            addCriterion("IS_CABLE_CHANNEL_PATROL is null");
            return (Criteria) this;
        }

        public Criteria andIsCableChannelPatrolIsNotNull() {
            addCriterion("IS_CABLE_CHANNEL_PATROL is not null");
            return (Criteria) this;
        }

        public Criteria andIsCableChannelPatrolEqualTo(Integer value) {
            addCriterion("IS_CABLE_CHANNEL_PATROL =", value, "isCableChannelPatrol");
            return (Criteria) this;
        }

        public Criteria andIsCableChannelPatrolNotEqualTo(Integer value) {
            addCriterion("IS_CABLE_CHANNEL_PATROL <>", value, "isCableChannelPatrol");
            return (Criteria) this;
        }

        public Criteria andIsCableChannelPatrolGreaterThan(Integer value) {
            addCriterion("IS_CABLE_CHANNEL_PATROL >", value, "isCableChannelPatrol");
            return (Criteria) this;
        }

        public Criteria andIsCableChannelPatrolGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_CABLE_CHANNEL_PATROL >=", value, "isCableChannelPatrol");
            return (Criteria) this;
        }

        public Criteria andIsCableChannelPatrolLessThan(Integer value) {
            addCriterion("IS_CABLE_CHANNEL_PATROL <", value, "isCableChannelPatrol");
            return (Criteria) this;
        }

        public Criteria andIsCableChannelPatrolLessThanOrEqualTo(Integer value) {
            addCriterion("IS_CABLE_CHANNEL_PATROL <=", value, "isCableChannelPatrol");
            return (Criteria) this;
        }

        public Criteria andIsCableChannelPatrolIn(List<Integer> values) {
            addCriterion("IS_CABLE_CHANNEL_PATROL in", values, "isCableChannelPatrol");
            return (Criteria) this;
        }

        public Criteria andIsCableChannelPatrolNotIn(List<Integer> values) {
            addCriterion("IS_CABLE_CHANNEL_PATROL not in", values, "isCableChannelPatrol");
            return (Criteria) this;
        }

        public Criteria andIsCableChannelPatrolBetween(Integer value1, Integer value2) {
            addCriterion("IS_CABLE_CHANNEL_PATROL between", value1, value2, "isCableChannelPatrol");
            return (Criteria) this;
        }

        public Criteria andIsCableChannelPatrolNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_CABLE_CHANNEL_PATROL not between", value1, value2, "isCableChannelPatrol");
            return (Criteria) this;
        }

        public Criteria andPatrolModeIsNull() {
            addCriterion("PATROL_MODE is null");
            return (Criteria) this;
        }

        public Criteria andPatrolModeIsNotNull() {
            addCriterion("PATROL_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andPatrolModeEqualTo(Integer value) {
            addCriterion("PATROL_MODE =", value, "patrolMode");
            return (Criteria) this;
        }

        public Criteria andPatrolModeNotEqualTo(Integer value) {
            addCriterion("PATROL_MODE <>", value, "patrolMode");
            return (Criteria) this;
        }

        public Criteria andPatrolModeGreaterThan(Integer value) {
            addCriterion("PATROL_MODE >", value, "patrolMode");
            return (Criteria) this;
        }

        public Criteria andPatrolModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PATROL_MODE >=", value, "patrolMode");
            return (Criteria) this;
        }

        public Criteria andPatrolModeLessThan(Integer value) {
            addCriterion("PATROL_MODE <", value, "patrolMode");
            return (Criteria) this;
        }

        public Criteria andPatrolModeLessThanOrEqualTo(Integer value) {
            addCriterion("PATROL_MODE <=", value, "patrolMode");
            return (Criteria) this;
        }

        public Criteria andPatrolModeIn(List<Integer> values) {
            addCriterion("PATROL_MODE in", values, "patrolMode");
            return (Criteria) this;
        }

        public Criteria andPatrolModeNotIn(List<Integer> values) {
            addCriterion("PATROL_MODE not in", values, "patrolMode");
            return (Criteria) this;
        }

        public Criteria andPatrolModeBetween(Integer value1, Integer value2) {
            addCriterion("PATROL_MODE between", value1, value2, "patrolMode");
            return (Criteria) this;
        }

        public Criteria andPatrolModeNotBetween(Integer value1, Integer value2) {
            addCriterion("PATROL_MODE not between", value1, value2, "patrolMode");
            return (Criteria) this;
        }

        public Criteria andWorkSourceTypeIsNull() {
            addCriterion("WORK_SOURCE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andWorkSourceTypeIsNotNull() {
            addCriterion("WORK_SOURCE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkSourceTypeEqualTo(Integer value) {
            addCriterion("WORK_SOURCE_TYPE =", value, "workSourceType");
            return (Criteria) this;
        }

        public Criteria andWorkSourceTypeNotEqualTo(Integer value) {
            addCriterion("WORK_SOURCE_TYPE <>", value, "workSourceType");
            return (Criteria) this;
        }

        public Criteria andWorkSourceTypeGreaterThan(Integer value) {
            addCriterion("WORK_SOURCE_TYPE >", value, "workSourceType");
            return (Criteria) this;
        }

        public Criteria andWorkSourceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("WORK_SOURCE_TYPE >=", value, "workSourceType");
            return (Criteria) this;
        }

        public Criteria andWorkSourceTypeLessThan(Integer value) {
            addCriterion("WORK_SOURCE_TYPE <", value, "workSourceType");
            return (Criteria) this;
        }

        public Criteria andWorkSourceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("WORK_SOURCE_TYPE <=", value, "workSourceType");
            return (Criteria) this;
        }

        public Criteria andWorkSourceTypeIn(List<Integer> values) {
            addCriterion("WORK_SOURCE_TYPE in", values, "workSourceType");
            return (Criteria) this;
        }

        public Criteria andWorkSourceTypeNotIn(List<Integer> values) {
            addCriterion("WORK_SOURCE_TYPE not in", values, "workSourceType");
            return (Criteria) this;
        }

        public Criteria andWorkSourceTypeBetween(Integer value1, Integer value2) {
            addCriterion("WORK_SOURCE_TYPE between", value1, value2, "workSourceType");
            return (Criteria) this;
        }

        public Criteria andWorkSourceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("WORK_SOURCE_TYPE not between", value1, value2, "workSourceType");
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