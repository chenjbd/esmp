package com.cc.app.pms.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrgInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrgInfoExample() {
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

        public Criteria andOrgidIsNull() {
            addCriterion("ORGID is null");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNotNull() {
            addCriterion("ORGID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgidEqualTo(String value) {
            addCriterion("ORGID =", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotEqualTo(String value) {
            addCriterion("ORGID <>", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThan(String value) {
            addCriterion("ORGID >", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThanOrEqualTo(String value) {
            addCriterion("ORGID >=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThan(String value) {
            addCriterion("ORGID <", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThanOrEqualTo(String value) {
            addCriterion("ORGID <=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLike(String value) {
            addCriterion("ORGID like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotLike(String value) {
            addCriterion("ORGID not like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidIn(List<String> values) {
            addCriterion("ORGID in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotIn(List<String> values) {
            addCriterion("ORGID not in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidBetween(String value1, String value2) {
            addCriterion("ORGID between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotBetween(String value1, String value2) {
            addCriterion("ORGID not between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNull() {
            addCriterion("ORGNAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNotNull() {
            addCriterion("ORGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnameEqualTo(String value) {
            addCriterion("ORGNAME =", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotEqualTo(String value) {
            addCriterion("ORGNAME <>", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThan(String value) {
            addCriterion("ORGNAME >", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThanOrEqualTo(String value) {
            addCriterion("ORGNAME >=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThan(String value) {
            addCriterion("ORGNAME <", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThanOrEqualTo(String value) {
            addCriterion("ORGNAME <=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLike(String value) {
            addCriterion("ORGNAME like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotLike(String value) {
            addCriterion("ORGNAME not like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameIn(List<String> values) {
            addCriterion("ORGNAME in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotIn(List<String> values) {
            addCriterion("ORGNAME not in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameBetween(String value1, String value2) {
            addCriterion("ORGNAME between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotBetween(String value1, String value2) {
            addCriterion("ORGNAME not between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnoIsNull() {
            addCriterion("ORGNO is null");
            return (Criteria) this;
        }

        public Criteria andOrgnoIsNotNull() {
            addCriterion("ORGNO is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnoEqualTo(String value) {
            addCriterion("ORGNO =", value, "orgno");
            return (Criteria) this;
        }

        public Criteria andOrgnoNotEqualTo(String value) {
            addCriterion("ORGNO <>", value, "orgno");
            return (Criteria) this;
        }

        public Criteria andOrgnoGreaterThan(String value) {
            addCriterion("ORGNO >", value, "orgno");
            return (Criteria) this;
        }

        public Criteria andOrgnoGreaterThanOrEqualTo(String value) {
            addCriterion("ORGNO >=", value, "orgno");
            return (Criteria) this;
        }

        public Criteria andOrgnoLessThan(String value) {
            addCriterion("ORGNO <", value, "orgno");
            return (Criteria) this;
        }

        public Criteria andOrgnoLessThanOrEqualTo(String value) {
            addCriterion("ORGNO <=", value, "orgno");
            return (Criteria) this;
        }

        public Criteria andOrgnoLike(String value) {
            addCriterion("ORGNO like", value, "orgno");
            return (Criteria) this;
        }

        public Criteria andOrgnoNotLike(String value) {
            addCriterion("ORGNO not like", value, "orgno");
            return (Criteria) this;
        }

        public Criteria andOrgnoIn(List<String> values) {
            addCriterion("ORGNO in", values, "orgno");
            return (Criteria) this;
        }

        public Criteria andOrgnoNotIn(List<String> values) {
            addCriterion("ORGNO not in", values, "orgno");
            return (Criteria) this;
        }

        public Criteria andOrgnoBetween(String value1, String value2) {
            addCriterion("ORGNO between", value1, value2, "orgno");
            return (Criteria) this;
        }

        public Criteria andOrgnoNotBetween(String value1, String value2) {
            addCriterion("ORGNO not between", value1, value2, "orgno");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIsNull() {
            addCriterion("ORG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIsNotNull() {
            addCriterion("ORG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeEqualTo(String value) {
            addCriterion("ORG_TYPE =", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotEqualTo(String value) {
            addCriterion("ORG_TYPE <>", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeGreaterThan(String value) {
            addCriterion("ORG_TYPE >", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_TYPE >=", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeLessThan(String value) {
            addCriterion("ORG_TYPE <", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeLessThanOrEqualTo(String value) {
            addCriterion("ORG_TYPE <=", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeLike(String value) {
            addCriterion("ORG_TYPE like", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotLike(String value) {
            addCriterion("ORG_TYPE not like", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIn(List<String> values) {
            addCriterion("ORG_TYPE in", values, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotIn(List<String> values) {
            addCriterion("ORG_TYPE not in", values, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeBetween(String value1, String value2) {
            addCriterion("ORG_TYPE between", value1, value2, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotBetween(String value1, String value2) {
            addCriterion("ORG_TYPE not between", value1, value2, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgKindIsNull() {
            addCriterion("ORG_KIND is null");
            return (Criteria) this;
        }

        public Criteria andOrgKindIsNotNull() {
            addCriterion("ORG_KIND is not null");
            return (Criteria) this;
        }

        public Criteria andOrgKindEqualTo(String value) {
            addCriterion("ORG_KIND =", value, "orgKind");
            return (Criteria) this;
        }

        public Criteria andOrgKindNotEqualTo(String value) {
            addCriterion("ORG_KIND <>", value, "orgKind");
            return (Criteria) this;
        }

        public Criteria andOrgKindGreaterThan(String value) {
            addCriterion("ORG_KIND >", value, "orgKind");
            return (Criteria) this;
        }

        public Criteria andOrgKindGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_KIND >=", value, "orgKind");
            return (Criteria) this;
        }

        public Criteria andOrgKindLessThan(String value) {
            addCriterion("ORG_KIND <", value, "orgKind");
            return (Criteria) this;
        }

        public Criteria andOrgKindLessThanOrEqualTo(String value) {
            addCriterion("ORG_KIND <=", value, "orgKind");
            return (Criteria) this;
        }

        public Criteria andOrgKindLike(String value) {
            addCriterion("ORG_KIND like", value, "orgKind");
            return (Criteria) this;
        }

        public Criteria andOrgKindNotLike(String value) {
            addCriterion("ORG_KIND not like", value, "orgKind");
            return (Criteria) this;
        }

        public Criteria andOrgKindIn(List<String> values) {
            addCriterion("ORG_KIND in", values, "orgKind");
            return (Criteria) this;
        }

        public Criteria andOrgKindNotIn(List<String> values) {
            addCriterion("ORG_KIND not in", values, "orgKind");
            return (Criteria) this;
        }

        public Criteria andOrgKindBetween(String value1, String value2) {
            addCriterion("ORG_KIND between", value1, value2, "orgKind");
            return (Criteria) this;
        }

        public Criteria andOrgKindNotBetween(String value1, String value2) {
            addCriterion("ORG_KIND not between", value1, value2, "orgKind");
            return (Criteria) this;
        }

        public Criteria andLeadNameIsNull() {
            addCriterion("LEAD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLeadNameIsNotNull() {
            addCriterion("LEAD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLeadNameEqualTo(String value) {
            addCriterion("LEAD_NAME =", value, "leadName");
            return (Criteria) this;
        }

        public Criteria andLeadNameNotEqualTo(String value) {
            addCriterion("LEAD_NAME <>", value, "leadName");
            return (Criteria) this;
        }

        public Criteria andLeadNameGreaterThan(String value) {
            addCriterion("LEAD_NAME >", value, "leadName");
            return (Criteria) this;
        }

        public Criteria andLeadNameGreaterThanOrEqualTo(String value) {
            addCriterion("LEAD_NAME >=", value, "leadName");
            return (Criteria) this;
        }

        public Criteria andLeadNameLessThan(String value) {
            addCriterion("LEAD_NAME <", value, "leadName");
            return (Criteria) this;
        }

        public Criteria andLeadNameLessThanOrEqualTo(String value) {
            addCriterion("LEAD_NAME <=", value, "leadName");
            return (Criteria) this;
        }

        public Criteria andLeadNameLike(String value) {
            addCriterion("LEAD_NAME like", value, "leadName");
            return (Criteria) this;
        }

        public Criteria andLeadNameNotLike(String value) {
            addCriterion("LEAD_NAME not like", value, "leadName");
            return (Criteria) this;
        }

        public Criteria andLeadNameIn(List<String> values) {
            addCriterion("LEAD_NAME in", values, "leadName");
            return (Criteria) this;
        }

        public Criteria andLeadNameNotIn(List<String> values) {
            addCriterion("LEAD_NAME not in", values, "leadName");
            return (Criteria) this;
        }

        public Criteria andLeadNameBetween(String value1, String value2) {
            addCriterion("LEAD_NAME between", value1, value2, "leadName");
            return (Criteria) this;
        }

        public Criteria andLeadNameNotBetween(String value1, String value2) {
            addCriterion("LEAD_NAME not between", value1, value2, "leadName");
            return (Criteria) this;
        }

        public Criteria andLeadPaperTypeIsNull() {
            addCriterion("LEAD_PAPER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLeadPaperTypeIsNotNull() {
            addCriterion("LEAD_PAPER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLeadPaperTypeEqualTo(String value) {
            addCriterion("LEAD_PAPER_TYPE =", value, "leadPaperType");
            return (Criteria) this;
        }

        public Criteria andLeadPaperTypeNotEqualTo(String value) {
            addCriterion("LEAD_PAPER_TYPE <>", value, "leadPaperType");
            return (Criteria) this;
        }

        public Criteria andLeadPaperTypeGreaterThan(String value) {
            addCriterion("LEAD_PAPER_TYPE >", value, "leadPaperType");
            return (Criteria) this;
        }

        public Criteria andLeadPaperTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LEAD_PAPER_TYPE >=", value, "leadPaperType");
            return (Criteria) this;
        }

        public Criteria andLeadPaperTypeLessThan(String value) {
            addCriterion("LEAD_PAPER_TYPE <", value, "leadPaperType");
            return (Criteria) this;
        }

        public Criteria andLeadPaperTypeLessThanOrEqualTo(String value) {
            addCriterion("LEAD_PAPER_TYPE <=", value, "leadPaperType");
            return (Criteria) this;
        }

        public Criteria andLeadPaperTypeLike(String value) {
            addCriterion("LEAD_PAPER_TYPE like", value, "leadPaperType");
            return (Criteria) this;
        }

        public Criteria andLeadPaperTypeNotLike(String value) {
            addCriterion("LEAD_PAPER_TYPE not like", value, "leadPaperType");
            return (Criteria) this;
        }

        public Criteria andLeadPaperTypeIn(List<String> values) {
            addCriterion("LEAD_PAPER_TYPE in", values, "leadPaperType");
            return (Criteria) this;
        }

        public Criteria andLeadPaperTypeNotIn(List<String> values) {
            addCriterion("LEAD_PAPER_TYPE not in", values, "leadPaperType");
            return (Criteria) this;
        }

        public Criteria andLeadPaperTypeBetween(String value1, String value2) {
            addCriterion("LEAD_PAPER_TYPE between", value1, value2, "leadPaperType");
            return (Criteria) this;
        }

        public Criteria andLeadPaperTypeNotBetween(String value1, String value2) {
            addCriterion("LEAD_PAPER_TYPE not between", value1, value2, "leadPaperType");
            return (Criteria) this;
        }

        public Criteria andLeadPaperNoIsNull() {
            addCriterion("LEAD_PAPER_NO is null");
            return (Criteria) this;
        }

        public Criteria andLeadPaperNoIsNotNull() {
            addCriterion("LEAD_PAPER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLeadPaperNoEqualTo(String value) {
            addCriterion("LEAD_PAPER_NO =", value, "leadPaperNo");
            return (Criteria) this;
        }

        public Criteria andLeadPaperNoNotEqualTo(String value) {
            addCriterion("LEAD_PAPER_NO <>", value, "leadPaperNo");
            return (Criteria) this;
        }

        public Criteria andLeadPaperNoGreaterThan(String value) {
            addCriterion("LEAD_PAPER_NO >", value, "leadPaperNo");
            return (Criteria) this;
        }

        public Criteria andLeadPaperNoGreaterThanOrEqualTo(String value) {
            addCriterion("LEAD_PAPER_NO >=", value, "leadPaperNo");
            return (Criteria) this;
        }

        public Criteria andLeadPaperNoLessThan(String value) {
            addCriterion("LEAD_PAPER_NO <", value, "leadPaperNo");
            return (Criteria) this;
        }

        public Criteria andLeadPaperNoLessThanOrEqualTo(String value) {
            addCriterion("LEAD_PAPER_NO <=", value, "leadPaperNo");
            return (Criteria) this;
        }

        public Criteria andLeadPaperNoLike(String value) {
            addCriterion("LEAD_PAPER_NO like", value, "leadPaperNo");
            return (Criteria) this;
        }

        public Criteria andLeadPaperNoNotLike(String value) {
            addCriterion("LEAD_PAPER_NO not like", value, "leadPaperNo");
            return (Criteria) this;
        }

        public Criteria andLeadPaperNoIn(List<String> values) {
            addCriterion("LEAD_PAPER_NO in", values, "leadPaperNo");
            return (Criteria) this;
        }

        public Criteria andLeadPaperNoNotIn(List<String> values) {
            addCriterion("LEAD_PAPER_NO not in", values, "leadPaperNo");
            return (Criteria) this;
        }

        public Criteria andLeadPaperNoBetween(String value1, String value2) {
            addCriterion("LEAD_PAPER_NO between", value1, value2, "leadPaperNo");
            return (Criteria) this;
        }

        public Criteria andLeadPaperNoNotBetween(String value1, String value2) {
            addCriterion("LEAD_PAPER_NO not between", value1, value2, "leadPaperNo");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNull() {
            addCriterion("CONTACT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNotNull() {
            addCriterion("CONTACT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andContactNameEqualTo(String value) {
            addCriterion("CONTACT_NAME =", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotEqualTo(String value) {
            addCriterion("CONTACT_NAME <>", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThan(String value) {
            addCriterion("CONTACT_NAME >", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_NAME >=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThan(String value) {
            addCriterion("CONTACT_NAME <", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_NAME <=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLike(String value) {
            addCriterion("CONTACT_NAME like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotLike(String value) {
            addCriterion("CONTACT_NAME not like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameIn(List<String> values) {
            addCriterion("CONTACT_NAME in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotIn(List<String> values) {
            addCriterion("CONTACT_NAME not in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameBetween(String value1, String value2) {
            addCriterion("CONTACT_NAME between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotBetween(String value1, String value2) {
            addCriterion("CONTACT_NAME not between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("CONTACT_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("CONTACT_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("CONTACT_PHONE =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("CONTACT_PHONE <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("CONTACT_PHONE >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_PHONE >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("CONTACT_PHONE <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_PHONE <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("CONTACT_PHONE like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("CONTACT_PHONE not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("CONTACT_PHONE in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("CONTACT_PHONE not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("CONTACT_PHONE between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("CONTACT_PHONE not between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("FAX is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("FAX is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("FAX =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("FAX <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("FAX >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("FAX >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("FAX <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("FAX <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("FAX like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("FAX not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("FAX in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("FAX not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("FAX between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("FAX not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("POSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("POSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("POSTCODE =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("POSTCODE <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("POSTCODE >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("POSTCODE >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("POSTCODE <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("POSTCODE <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("POSTCODE like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("POSTCODE not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("POSTCODE in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("POSTCODE not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("POSTCODE between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("POSTCODE not between", value1, value2, "postcode");
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

        public Criteria andStreetIsNull() {
            addCriterion("STREET is null");
            return (Criteria) this;
        }

        public Criteria andStreetIsNotNull() {
            addCriterion("STREET is not null");
            return (Criteria) this;
        }

        public Criteria andStreetEqualTo(String value) {
            addCriterion("STREET =", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotEqualTo(String value) {
            addCriterion("STREET <>", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThan(String value) {
            addCriterion("STREET >", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThanOrEqualTo(String value) {
            addCriterion("STREET >=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThan(String value) {
            addCriterion("STREET <", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThanOrEqualTo(String value) {
            addCriterion("STREET <=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLike(String value) {
            addCriterion("STREET like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotLike(String value) {
            addCriterion("STREET not like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetIn(List<String> values) {
            addCriterion("STREET in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotIn(List<String> values) {
            addCriterion("STREET not in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetBetween(String value1, String value2) {
            addCriterion("STREET between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotBetween(String value1, String value2) {
            addCriterion("STREET not between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andCommunityIsNull() {
            addCriterion("COMMUNITY is null");
            return (Criteria) this;
        }

        public Criteria andCommunityIsNotNull() {
            addCriterion("COMMUNITY is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityEqualTo(String value) {
            addCriterion("COMMUNITY =", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotEqualTo(String value) {
            addCriterion("COMMUNITY <>", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityGreaterThan(String value) {
            addCriterion("COMMUNITY >", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityGreaterThanOrEqualTo(String value) {
            addCriterion("COMMUNITY >=", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLessThan(String value) {
            addCriterion("COMMUNITY <", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLessThanOrEqualTo(String value) {
            addCriterion("COMMUNITY <=", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLike(String value) {
            addCriterion("COMMUNITY like", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotLike(String value) {
            addCriterion("COMMUNITY not like", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityIn(List<String> values) {
            addCriterion("COMMUNITY in", values, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotIn(List<String> values) {
            addCriterion("COMMUNITY not in", values, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityBetween(String value1, String value2) {
            addCriterion("COMMUNITY between", value1, value2, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotBetween(String value1, String value2) {
            addCriterion("COMMUNITY not between", value1, value2, "community");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("REGION is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("REGION is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("REGION =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("REGION <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("REGION >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("REGION >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("REGION <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("REGION <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("REGION like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("REGION not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("REGION in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("REGION not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("REGION between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("REGION not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andSuperOrgIsNull() {
            addCriterion("SUPER_ORG is null");
            return (Criteria) this;
        }

        public Criteria andSuperOrgIsNotNull() {
            addCriterion("SUPER_ORG is not null");
            return (Criteria) this;
        }

        public Criteria andSuperOrgEqualTo(String value) {
            addCriterion("SUPER_ORG =", value, "superOrg");
            return (Criteria) this;
        }

        public Criteria andSuperOrgNotEqualTo(String value) {
            addCriterion("SUPER_ORG <>", value, "superOrg");
            return (Criteria) this;
        }

        public Criteria andSuperOrgGreaterThan(String value) {
            addCriterion("SUPER_ORG >", value, "superOrg");
            return (Criteria) this;
        }

        public Criteria andSuperOrgGreaterThanOrEqualTo(String value) {
            addCriterion("SUPER_ORG >=", value, "superOrg");
            return (Criteria) this;
        }

        public Criteria andSuperOrgLessThan(String value) {
            addCriterion("SUPER_ORG <", value, "superOrg");
            return (Criteria) this;
        }

        public Criteria andSuperOrgLessThanOrEqualTo(String value) {
            addCriterion("SUPER_ORG <=", value, "superOrg");
            return (Criteria) this;
        }

        public Criteria andSuperOrgLike(String value) {
            addCriterion("SUPER_ORG like", value, "superOrg");
            return (Criteria) this;
        }

        public Criteria andSuperOrgNotLike(String value) {
            addCriterion("SUPER_ORG not like", value, "superOrg");
            return (Criteria) this;
        }

        public Criteria andSuperOrgIn(List<String> values) {
            addCriterion("SUPER_ORG in", values, "superOrg");
            return (Criteria) this;
        }

        public Criteria andSuperOrgNotIn(List<String> values) {
            addCriterion("SUPER_ORG not in", values, "superOrg");
            return (Criteria) this;
        }

        public Criteria andSuperOrgBetween(String value1, String value2) {
            addCriterion("SUPER_ORG between", value1, value2, "superOrg");
            return (Criteria) this;
        }

        public Criteria andSuperOrgNotBetween(String value1, String value2) {
            addCriterion("SUPER_ORG not between", value1, value2, "superOrg");
            return (Criteria) this;
        }

        public Criteria andDirectorDepIsNull() {
            addCriterion("DIRECTOR_DEP is null");
            return (Criteria) this;
        }

        public Criteria andDirectorDepIsNotNull() {
            addCriterion("DIRECTOR_DEP is not null");
            return (Criteria) this;
        }

        public Criteria andDirectorDepEqualTo(String value) {
            addCriterion("DIRECTOR_DEP =", value, "directorDep");
            return (Criteria) this;
        }

        public Criteria andDirectorDepNotEqualTo(String value) {
            addCriterion("DIRECTOR_DEP <>", value, "directorDep");
            return (Criteria) this;
        }

        public Criteria andDirectorDepGreaterThan(String value) {
            addCriterion("DIRECTOR_DEP >", value, "directorDep");
            return (Criteria) this;
        }

        public Criteria andDirectorDepGreaterThanOrEqualTo(String value) {
            addCriterion("DIRECTOR_DEP >=", value, "directorDep");
            return (Criteria) this;
        }

        public Criteria andDirectorDepLessThan(String value) {
            addCriterion("DIRECTOR_DEP <", value, "directorDep");
            return (Criteria) this;
        }

        public Criteria andDirectorDepLessThanOrEqualTo(String value) {
            addCriterion("DIRECTOR_DEP <=", value, "directorDep");
            return (Criteria) this;
        }

        public Criteria andDirectorDepLike(String value) {
            addCriterion("DIRECTOR_DEP like", value, "directorDep");
            return (Criteria) this;
        }

        public Criteria andDirectorDepNotLike(String value) {
            addCriterion("DIRECTOR_DEP not like", value, "directorDep");
            return (Criteria) this;
        }

        public Criteria andDirectorDepIn(List<String> values) {
            addCriterion("DIRECTOR_DEP in", values, "directorDep");
            return (Criteria) this;
        }

        public Criteria andDirectorDepNotIn(List<String> values) {
            addCriterion("DIRECTOR_DEP not in", values, "directorDep");
            return (Criteria) this;
        }

        public Criteria andDirectorDepBetween(String value1, String value2) {
            addCriterion("DIRECTOR_DEP between", value1, value2, "directorDep");
            return (Criteria) this;
        }

        public Criteria andDirectorDepNotBetween(String value1, String value2) {
            addCriterion("DIRECTOR_DEP not between", value1, value2, "directorDep");
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

        public Criteria andUptOprIsNull() {
            addCriterion("UPT_OPR is null");
            return (Criteria) this;
        }

        public Criteria andUptOprIsNotNull() {
            addCriterion("UPT_OPR is not null");
            return (Criteria) this;
        }

        public Criteria andUptOprEqualTo(String value) {
            addCriterion("UPT_OPR =", value, "uptOpr");
            return (Criteria) this;
        }

        public Criteria andUptOprNotEqualTo(String value) {
            addCriterion("UPT_OPR <>", value, "uptOpr");
            return (Criteria) this;
        }

        public Criteria andUptOprGreaterThan(String value) {
            addCriterion("UPT_OPR >", value, "uptOpr");
            return (Criteria) this;
        }

        public Criteria andUptOprGreaterThanOrEqualTo(String value) {
            addCriterion("UPT_OPR >=", value, "uptOpr");
            return (Criteria) this;
        }

        public Criteria andUptOprLessThan(String value) {
            addCriterion("UPT_OPR <", value, "uptOpr");
            return (Criteria) this;
        }

        public Criteria andUptOprLessThanOrEqualTo(String value) {
            addCriterion("UPT_OPR <=", value, "uptOpr");
            return (Criteria) this;
        }

        public Criteria andUptOprLike(String value) {
            addCriterion("UPT_OPR like", value, "uptOpr");
            return (Criteria) this;
        }

        public Criteria andUptOprNotLike(String value) {
            addCriterion("UPT_OPR not like", value, "uptOpr");
            return (Criteria) this;
        }

        public Criteria andUptOprIn(List<String> values) {
            addCriterion("UPT_OPR in", values, "uptOpr");
            return (Criteria) this;
        }

        public Criteria andUptOprNotIn(List<String> values) {
            addCriterion("UPT_OPR not in", values, "uptOpr");
            return (Criteria) this;
        }

        public Criteria andUptOprBetween(String value1, String value2) {
            addCriterion("UPT_OPR between", value1, value2, "uptOpr");
            return (Criteria) this;
        }

        public Criteria andUptOprNotBetween(String value1, String value2) {
            addCriterion("UPT_OPR not between", value1, value2, "uptOpr");
            return (Criteria) this;
        }

        public Criteria andUptTimeIsNull() {
            addCriterion("UPT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUptTimeIsNotNull() {
            addCriterion("UPT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUptTimeEqualTo(Date value) {
            addCriterion("UPT_TIME =", value, "uptTime");
            return (Criteria) this;
        }

        public Criteria andUptTimeNotEqualTo(Date value) {
            addCriterion("UPT_TIME <>", value, "uptTime");
            return (Criteria) this;
        }

        public Criteria andUptTimeGreaterThan(Date value) {
            addCriterion("UPT_TIME >", value, "uptTime");
            return (Criteria) this;
        }

        public Criteria andUptTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPT_TIME >=", value, "uptTime");
            return (Criteria) this;
        }

        public Criteria andUptTimeLessThan(Date value) {
            addCriterion("UPT_TIME <", value, "uptTime");
            return (Criteria) this;
        }

        public Criteria andUptTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPT_TIME <=", value, "uptTime");
            return (Criteria) this;
        }

        public Criteria andUptTimeIn(List<Date> values) {
            addCriterion("UPT_TIME in", values, "uptTime");
            return (Criteria) this;
        }

        public Criteria andUptTimeNotIn(List<Date> values) {
            addCriterion("UPT_TIME not in", values, "uptTime");
            return (Criteria) this;
        }

        public Criteria andUptTimeBetween(Date value1, Date value2) {
            addCriterion("UPT_TIME between", value1, value2, "uptTime");
            return (Criteria) this;
        }

        public Criteria andUptTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPT_TIME not between", value1, value2, "uptTime");
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