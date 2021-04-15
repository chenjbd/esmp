package com.cc.app.core.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ImgAlsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImgAlsExample() {
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

        public Criteria andBusiTypeIsNull() {
            addCriterion("BUSI_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIsNotNull() {
            addCriterion("BUSI_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusiTypeEqualTo(String value) {
            addCriterion("BUSI_TYPE =", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotEqualTo(String value) {
            addCriterion("BUSI_TYPE <>", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeGreaterThan(String value) {
            addCriterion("BUSI_TYPE >", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_TYPE >=", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeLessThan(String value) {
            addCriterion("BUSI_TYPE <", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeLessThanOrEqualTo(String value) {
            addCriterion("BUSI_TYPE <=", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeLike(String value) {
            addCriterion("BUSI_TYPE like", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotLike(String value) {
            addCriterion("BUSI_TYPE not like", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIn(List<String> values) {
            addCriterion("BUSI_TYPE in", values, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotIn(List<String> values) {
            addCriterion("BUSI_TYPE not in", values, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeBetween(String value1, String value2) {
            addCriterion("BUSI_TYPE between", value1, value2, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotBetween(String value1, String value2) {
            addCriterion("BUSI_TYPE not between", value1, value2, "busiType");
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

        public Criteria andBusiImgUrlIsNull() {
            addCriterion("BUSI_IMG_URL is null");
            return (Criteria) this;
        }

        public Criteria andBusiImgUrlIsNotNull() {
            addCriterion("BUSI_IMG_URL is not null");
            return (Criteria) this;
        }

        public Criteria andBusiImgUrlEqualTo(String value) {
            addCriterion("BUSI_IMG_URL =", value, "busiImgUrl");
            return (Criteria) this;
        }

        public Criteria andBusiImgUrlNotEqualTo(String value) {
            addCriterion("BUSI_IMG_URL <>", value, "busiImgUrl");
            return (Criteria) this;
        }

        public Criteria andBusiImgUrlGreaterThan(String value) {
            addCriterion("BUSI_IMG_URL >", value, "busiImgUrl");
            return (Criteria) this;
        }

        public Criteria andBusiImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_IMG_URL >=", value, "busiImgUrl");
            return (Criteria) this;
        }

        public Criteria andBusiImgUrlLessThan(String value) {
            addCriterion("BUSI_IMG_URL <", value, "busiImgUrl");
            return (Criteria) this;
        }

        public Criteria andBusiImgUrlLessThanOrEqualTo(String value) {
            addCriterion("BUSI_IMG_URL <=", value, "busiImgUrl");
            return (Criteria) this;
        }

        public Criteria andBusiImgUrlLike(String value) {
            addCriterion("BUSI_IMG_URL like", value, "busiImgUrl");
            return (Criteria) this;
        }

        public Criteria andBusiImgUrlNotLike(String value) {
            addCriterion("BUSI_IMG_URL not like", value, "busiImgUrl");
            return (Criteria) this;
        }

        public Criteria andBusiImgUrlIn(List<String> values) {
            addCriterion("BUSI_IMG_URL in", values, "busiImgUrl");
            return (Criteria) this;
        }

        public Criteria andBusiImgUrlNotIn(List<String> values) {
            addCriterion("BUSI_IMG_URL not in", values, "busiImgUrl");
            return (Criteria) this;
        }

        public Criteria andBusiImgUrlBetween(String value1, String value2) {
            addCriterion("BUSI_IMG_URL between", value1, value2, "busiImgUrl");
            return (Criteria) this;
        }

        public Criteria andBusiImgUrlNotBetween(String value1, String value2) {
            addCriterion("BUSI_IMG_URL not between", value1, value2, "busiImgUrl");
            return (Criteria) this;
        }

        public Criteria andSimilarityIsNull() {
            addCriterion("SIMILARITY is null");
            return (Criteria) this;
        }

        public Criteria andSimilarityIsNotNull() {
            addCriterion("SIMILARITY is not null");
            return (Criteria) this;
        }

        public Criteria andSimilarityEqualTo(Integer value) {
            addCriterion("SIMILARITY =", value, "similarity");
            return (Criteria) this;
        }

        public Criteria andSimilarityNotEqualTo(Integer value) {
            addCriterion("SIMILARITY <>", value, "similarity");
            return (Criteria) this;
        }

        public Criteria andSimilarityGreaterThan(Integer value) {
            addCriterion("SIMILARITY >", value, "similarity");
            return (Criteria) this;
        }

        public Criteria andSimilarityGreaterThanOrEqualTo(Integer value) {
            addCriterion("SIMILARITY >=", value, "similarity");
            return (Criteria) this;
        }

        public Criteria andSimilarityLessThan(Integer value) {
            addCriterion("SIMILARITY <", value, "similarity");
            return (Criteria) this;
        }

        public Criteria andSimilarityLessThanOrEqualTo(Integer value) {
            addCriterion("SIMILARITY <=", value, "similarity");
            return (Criteria) this;
        }

        public Criteria andSimilarityIn(List<Integer> values) {
            addCriterion("SIMILARITY in", values, "similarity");
            return (Criteria) this;
        }

        public Criteria andSimilarityNotIn(List<Integer> values) {
            addCriterion("SIMILARITY not in", values, "similarity");
            return (Criteria) this;
        }

        public Criteria andSimilarityBetween(Integer value1, Integer value2) {
            addCriterion("SIMILARITY between", value1, value2, "similarity");
            return (Criteria) this;
        }

        public Criteria andSimilarityNotBetween(Integer value1, Integer value2) {
            addCriterion("SIMILARITY not between", value1, value2, "similarity");
            return (Criteria) this;
        }

        public Criteria andIndexCodeIsNull() {
            addCriterion("INDEX_CODE is null");
            return (Criteria) this;
        }

        public Criteria andIndexCodeIsNotNull() {
            addCriterion("INDEX_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andIndexCodeEqualTo(String value) {
            addCriterion("INDEX_CODE =", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeNotEqualTo(String value) {
            addCriterion("INDEX_CODE <>", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeGreaterThan(String value) {
            addCriterion("INDEX_CODE >", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeGreaterThanOrEqualTo(String value) {
            addCriterion("INDEX_CODE >=", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeLessThan(String value) {
            addCriterion("INDEX_CODE <", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeLessThanOrEqualTo(String value) {
            addCriterion("INDEX_CODE <=", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeLike(String value) {
            addCriterion("INDEX_CODE like", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeNotLike(String value) {
            addCriterion("INDEX_CODE not like", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeIn(List<String> values) {
            addCriterion("INDEX_CODE in", values, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeNotIn(List<String> values) {
            addCriterion("INDEX_CODE not in", values, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeBetween(String value1, String value2) {
            addCriterion("INDEX_CODE between", value1, value2, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeNotBetween(String value1, String value2) {
            addCriterion("INDEX_CODE not between", value1, value2, "indexCode");
            return (Criteria) this;
        }

        public Criteria andFaceNameIsNull() {
            addCriterion("FACE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFaceNameIsNotNull() {
            addCriterion("FACE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFaceNameEqualTo(String value) {
            addCriterion("FACE_NAME =", value, "faceName");
            return (Criteria) this;
        }

        public Criteria andFaceNameNotEqualTo(String value) {
            addCriterion("FACE_NAME <>", value, "faceName");
            return (Criteria) this;
        }

        public Criteria andFaceNameGreaterThan(String value) {
            addCriterion("FACE_NAME >", value, "faceName");
            return (Criteria) this;
        }

        public Criteria andFaceNameGreaterThanOrEqualTo(String value) {
            addCriterion("FACE_NAME >=", value, "faceName");
            return (Criteria) this;
        }

        public Criteria andFaceNameLessThan(String value) {
            addCriterion("FACE_NAME <", value, "faceName");
            return (Criteria) this;
        }

        public Criteria andFaceNameLessThanOrEqualTo(String value) {
            addCriterion("FACE_NAME <=", value, "faceName");
            return (Criteria) this;
        }

        public Criteria andFaceNameLike(String value) {
            addCriterion("FACE_NAME like", value, "faceName");
            return (Criteria) this;
        }

        public Criteria andFaceNameNotLike(String value) {
            addCriterion("FACE_NAME not like", value, "faceName");
            return (Criteria) this;
        }

        public Criteria andFaceNameIn(List<String> values) {
            addCriterion("FACE_NAME in", values, "faceName");
            return (Criteria) this;
        }

        public Criteria andFaceNameNotIn(List<String> values) {
            addCriterion("FACE_NAME not in", values, "faceName");
            return (Criteria) this;
        }

        public Criteria andFaceNameBetween(String value1, String value2) {
            addCriterion("FACE_NAME between", value1, value2, "faceName");
            return (Criteria) this;
        }

        public Criteria andFaceNameNotBetween(String value1, String value2) {
            addCriterion("FACE_NAME not between", value1, value2, "faceName");
            return (Criteria) this;
        }

        public Criteria andFaceSexIsNull() {
            addCriterion("FACE_SEX is null");
            return (Criteria) this;
        }

        public Criteria andFaceSexIsNotNull() {
            addCriterion("FACE_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andFaceSexEqualTo(String value) {
            addCriterion("FACE_SEX =", value, "faceSex");
            return (Criteria) this;
        }

        public Criteria andFaceSexNotEqualTo(String value) {
            addCriterion("FACE_SEX <>", value, "faceSex");
            return (Criteria) this;
        }

        public Criteria andFaceSexGreaterThan(String value) {
            addCriterion("FACE_SEX >", value, "faceSex");
            return (Criteria) this;
        }

        public Criteria andFaceSexGreaterThanOrEqualTo(String value) {
            addCriterion("FACE_SEX >=", value, "faceSex");
            return (Criteria) this;
        }

        public Criteria andFaceSexLessThan(String value) {
            addCriterion("FACE_SEX <", value, "faceSex");
            return (Criteria) this;
        }

        public Criteria andFaceSexLessThanOrEqualTo(String value) {
            addCriterion("FACE_SEX <=", value, "faceSex");
            return (Criteria) this;
        }

        public Criteria andFaceSexLike(String value) {
            addCriterion("FACE_SEX like", value, "faceSex");
            return (Criteria) this;
        }

        public Criteria andFaceSexNotLike(String value) {
            addCriterion("FACE_SEX not like", value, "faceSex");
            return (Criteria) this;
        }

        public Criteria andFaceSexIn(List<String> values) {
            addCriterion("FACE_SEX in", values, "faceSex");
            return (Criteria) this;
        }

        public Criteria andFaceSexNotIn(List<String> values) {
            addCriterion("FACE_SEX not in", values, "faceSex");
            return (Criteria) this;
        }

        public Criteria andFaceSexBetween(String value1, String value2) {
            addCriterion("FACE_SEX between", value1, value2, "faceSex");
            return (Criteria) this;
        }

        public Criteria andFaceSexNotBetween(String value1, String value2) {
            addCriterion("FACE_SEX not between", value1, value2, "faceSex");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNull() {
            addCriterion("CERTIFICATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNotNull() {
            addCriterion("CERTIFICATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeEqualTo(String value) {
            addCriterion("CERTIFICATE_TYPE =", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotEqualTo(String value) {
            addCriterion("CERTIFICATE_TYPE <>", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThan(String value) {
            addCriterion("CERTIFICATE_TYPE >", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_TYPE >=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThan(String value) {
            addCriterion("CERTIFICATE_TYPE <", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_TYPE <=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLike(String value) {
            addCriterion("CERTIFICATE_TYPE like", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotLike(String value) {
            addCriterion("CERTIFICATE_TYPE not like", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIn(List<String> values) {
            addCriterion("CERTIFICATE_TYPE in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotIn(List<String> values) {
            addCriterion("CERTIFICATE_TYPE not in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_TYPE between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_TYPE not between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateNumIsNull() {
            addCriterion("CERTIFICATE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCertificateNumIsNotNull() {
            addCriterion("CERTIFICATE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateNumEqualTo(String value) {
            addCriterion("CERTIFICATE_NUM =", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumNotEqualTo(String value) {
            addCriterion("CERTIFICATE_NUM <>", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumGreaterThan(String value) {
            addCriterion("CERTIFICATE_NUM >", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_NUM >=", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumLessThan(String value) {
            addCriterion("CERTIFICATE_NUM <", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_NUM <=", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumLike(String value) {
            addCriterion("CERTIFICATE_NUM like", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumNotLike(String value) {
            addCriterion("CERTIFICATE_NUM not like", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumIn(List<String> values) {
            addCriterion("CERTIFICATE_NUM in", values, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumNotIn(List<String> values) {
            addCriterion("CERTIFICATE_NUM not in", values, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_NUM between", value1, value2, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_NUM not between", value1, value2, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andFaceUrlIsNull() {
            addCriterion("FACE_URL is null");
            return (Criteria) this;
        }

        public Criteria andFaceUrlIsNotNull() {
            addCriterion("FACE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andFaceUrlEqualTo(String value) {
            addCriterion("FACE_URL =", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlNotEqualTo(String value) {
            addCriterion("FACE_URL <>", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlGreaterThan(String value) {
            addCriterion("FACE_URL >", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("FACE_URL >=", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlLessThan(String value) {
            addCriterion("FACE_URL <", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlLessThanOrEqualTo(String value) {
            addCriterion("FACE_URL <=", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlLike(String value) {
            addCriterion("FACE_URL like", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlNotLike(String value) {
            addCriterion("FACE_URL not like", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlIn(List<String> values) {
            addCriterion("FACE_URL in", values, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlNotIn(List<String> values) {
            addCriterion("FACE_URL not in", values, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlBetween(String value1, String value2) {
            addCriterion("FACE_URL between", value1, value2, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlNotBetween(String value1, String value2) {
            addCriterion("FACE_URL not between", value1, value2, "faceUrl");
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