package com.cc.app.core.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CameraExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CameraExample() {
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

        public Criteria andResourceTypeIsNull() {
            addCriterion("RESOURCE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIsNotNull() {
            addCriterion("RESOURCE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeEqualTo(String value) {
            addCriterion("RESOURCE_TYPE =", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotEqualTo(String value) {
            addCriterion("RESOURCE_TYPE <>", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThan(String value) {
            addCriterion("RESOURCE_TYPE >", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCE_TYPE >=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThan(String value) {
            addCriterion("RESOURCE_TYPE <", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThanOrEqualTo(String value) {
            addCriterion("RESOURCE_TYPE <=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLike(String value) {
            addCriterion("RESOURCE_TYPE like", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotLike(String value) {
            addCriterion("RESOURCE_TYPE not like", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIn(List<String> values) {
            addCriterion("RESOURCE_TYPE in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotIn(List<String> values) {
            addCriterion("RESOURCE_TYPE not in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeBetween(String value1, String value2) {
            addCriterion("RESOURCE_TYPE between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotBetween(String value1, String value2) {
            addCriterion("RESOURCE_TYPE not between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andExternalIndexCodeIsNull() {
            addCriterion("EXTERNAL_INDEX_CODE is null");
            return (Criteria) this;
        }

        public Criteria andExternalIndexCodeIsNotNull() {
            addCriterion("EXTERNAL_INDEX_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andExternalIndexCodeEqualTo(String value) {
            addCriterion("EXTERNAL_INDEX_CODE =", value, "externalIndexCode");
            return (Criteria) this;
        }

        public Criteria andExternalIndexCodeNotEqualTo(String value) {
            addCriterion("EXTERNAL_INDEX_CODE <>", value, "externalIndexCode");
            return (Criteria) this;
        }

        public Criteria andExternalIndexCodeGreaterThan(String value) {
            addCriterion("EXTERNAL_INDEX_CODE >", value, "externalIndexCode");
            return (Criteria) this;
        }

        public Criteria andExternalIndexCodeGreaterThanOrEqualTo(String value) {
            addCriterion("EXTERNAL_INDEX_CODE >=", value, "externalIndexCode");
            return (Criteria) this;
        }

        public Criteria andExternalIndexCodeLessThan(String value) {
            addCriterion("EXTERNAL_INDEX_CODE <", value, "externalIndexCode");
            return (Criteria) this;
        }

        public Criteria andExternalIndexCodeLessThanOrEqualTo(String value) {
            addCriterion("EXTERNAL_INDEX_CODE <=", value, "externalIndexCode");
            return (Criteria) this;
        }

        public Criteria andExternalIndexCodeLike(String value) {
            addCriterion("EXTERNAL_INDEX_CODE like", value, "externalIndexCode");
            return (Criteria) this;
        }

        public Criteria andExternalIndexCodeNotLike(String value) {
            addCriterion("EXTERNAL_INDEX_CODE not like", value, "externalIndexCode");
            return (Criteria) this;
        }

        public Criteria andExternalIndexCodeIn(List<String> values) {
            addCriterion("EXTERNAL_INDEX_CODE in", values, "externalIndexCode");
            return (Criteria) this;
        }

        public Criteria andExternalIndexCodeNotIn(List<String> values) {
            addCriterion("EXTERNAL_INDEX_CODE not in", values, "externalIndexCode");
            return (Criteria) this;
        }

        public Criteria andExternalIndexCodeBetween(String value1, String value2) {
            addCriterion("EXTERNAL_INDEX_CODE between", value1, value2, "externalIndexCode");
            return (Criteria) this;
        }

        public Criteria andExternalIndexCodeNotBetween(String value1, String value2) {
            addCriterion("EXTERNAL_INDEX_CODE not between", value1, value2, "externalIndexCode");
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

        public Criteria andChanNumIsNull() {
            addCriterion("CHAN_NUM is null");
            return (Criteria) this;
        }

        public Criteria andChanNumIsNotNull() {
            addCriterion("CHAN_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andChanNumEqualTo(Integer value) {
            addCriterion("CHAN_NUM =", value, "chanNum");
            return (Criteria) this;
        }

        public Criteria andChanNumNotEqualTo(Integer value) {
            addCriterion("CHAN_NUM <>", value, "chanNum");
            return (Criteria) this;
        }

        public Criteria andChanNumGreaterThan(Integer value) {
            addCriterion("CHAN_NUM >", value, "chanNum");
            return (Criteria) this;
        }

        public Criteria andChanNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHAN_NUM >=", value, "chanNum");
            return (Criteria) this;
        }

        public Criteria andChanNumLessThan(Integer value) {
            addCriterion("CHAN_NUM <", value, "chanNum");
            return (Criteria) this;
        }

        public Criteria andChanNumLessThanOrEqualTo(Integer value) {
            addCriterion("CHAN_NUM <=", value, "chanNum");
            return (Criteria) this;
        }

        public Criteria andChanNumIn(List<Integer> values) {
            addCriterion("CHAN_NUM in", values, "chanNum");
            return (Criteria) this;
        }

        public Criteria andChanNumNotIn(List<Integer> values) {
            addCriterion("CHAN_NUM not in", values, "chanNum");
            return (Criteria) this;
        }

        public Criteria andChanNumBetween(Integer value1, Integer value2) {
            addCriterion("CHAN_NUM between", value1, value2, "chanNum");
            return (Criteria) this;
        }

        public Criteria andChanNumNotBetween(Integer value1, Integer value2) {
            addCriterion("CHAN_NUM not between", value1, value2, "chanNum");
            return (Criteria) this;
        }

        public Criteria andCascadeCodeIsNull() {
            addCriterion("CASCADE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCascadeCodeIsNotNull() {
            addCriterion("CASCADE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCascadeCodeEqualTo(String value) {
            addCriterion("CASCADE_CODE =", value, "cascadeCode");
            return (Criteria) this;
        }

        public Criteria andCascadeCodeNotEqualTo(String value) {
            addCriterion("CASCADE_CODE <>", value, "cascadeCode");
            return (Criteria) this;
        }

        public Criteria andCascadeCodeGreaterThan(String value) {
            addCriterion("CASCADE_CODE >", value, "cascadeCode");
            return (Criteria) this;
        }

        public Criteria andCascadeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CASCADE_CODE >=", value, "cascadeCode");
            return (Criteria) this;
        }

        public Criteria andCascadeCodeLessThan(String value) {
            addCriterion("CASCADE_CODE <", value, "cascadeCode");
            return (Criteria) this;
        }

        public Criteria andCascadeCodeLessThanOrEqualTo(String value) {
            addCriterion("CASCADE_CODE <=", value, "cascadeCode");
            return (Criteria) this;
        }

        public Criteria andCascadeCodeLike(String value) {
            addCriterion("CASCADE_CODE like", value, "cascadeCode");
            return (Criteria) this;
        }

        public Criteria andCascadeCodeNotLike(String value) {
            addCriterion("CASCADE_CODE not like", value, "cascadeCode");
            return (Criteria) this;
        }

        public Criteria andCascadeCodeIn(List<String> values) {
            addCriterion("CASCADE_CODE in", values, "cascadeCode");
            return (Criteria) this;
        }

        public Criteria andCascadeCodeNotIn(List<String> values) {
            addCriterion("CASCADE_CODE not in", values, "cascadeCode");
            return (Criteria) this;
        }

        public Criteria andCascadeCodeBetween(String value1, String value2) {
            addCriterion("CASCADE_CODE between", value1, value2, "cascadeCode");
            return (Criteria) this;
        }

        public Criteria andCascadeCodeNotBetween(String value1, String value2) {
            addCriterion("CASCADE_CODE not between", value1, value2, "cascadeCode");
            return (Criteria) this;
        }

        public Criteria andParentIndexCodeIsNull() {
            addCriterion("PARENT_INDEX_CODE is null");
            return (Criteria) this;
        }

        public Criteria andParentIndexCodeIsNotNull() {
            addCriterion("PARENT_INDEX_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andParentIndexCodeEqualTo(String value) {
            addCriterion("PARENT_INDEX_CODE =", value, "parentIndexCode");
            return (Criteria) this;
        }

        public Criteria andParentIndexCodeNotEqualTo(String value) {
            addCriterion("PARENT_INDEX_CODE <>", value, "parentIndexCode");
            return (Criteria) this;
        }

        public Criteria andParentIndexCodeGreaterThan(String value) {
            addCriterion("PARENT_INDEX_CODE >", value, "parentIndexCode");
            return (Criteria) this;
        }

        public Criteria andParentIndexCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_INDEX_CODE >=", value, "parentIndexCode");
            return (Criteria) this;
        }

        public Criteria andParentIndexCodeLessThan(String value) {
            addCriterion("PARENT_INDEX_CODE <", value, "parentIndexCode");
            return (Criteria) this;
        }

        public Criteria andParentIndexCodeLessThanOrEqualTo(String value) {
            addCriterion("PARENT_INDEX_CODE <=", value, "parentIndexCode");
            return (Criteria) this;
        }

        public Criteria andParentIndexCodeLike(String value) {
            addCriterion("PARENT_INDEX_CODE like", value, "parentIndexCode");
            return (Criteria) this;
        }

        public Criteria andParentIndexCodeNotLike(String value) {
            addCriterion("PARENT_INDEX_CODE not like", value, "parentIndexCode");
            return (Criteria) this;
        }

        public Criteria andParentIndexCodeIn(List<String> values) {
            addCriterion("PARENT_INDEX_CODE in", values, "parentIndexCode");
            return (Criteria) this;
        }

        public Criteria andParentIndexCodeNotIn(List<String> values) {
            addCriterion("PARENT_INDEX_CODE not in", values, "parentIndexCode");
            return (Criteria) this;
        }

        public Criteria andParentIndexCodeBetween(String value1, String value2) {
            addCriterion("PARENT_INDEX_CODE between", value1, value2, "parentIndexCode");
            return (Criteria) this;
        }

        public Criteria andParentIndexCodeNotBetween(String value1, String value2) {
            addCriterion("PARENT_INDEX_CODE not between", value1, value2, "parentIndexCode");
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

        public Criteria andLongitudeEqualTo(BigDecimal value) {
            addCriterion("LONGITUDE =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("LONGITUDE <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(BigDecimal value) {
            addCriterion("LONGITUDE >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LONGITUDE >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(BigDecimal value) {
            addCriterion("LONGITUDE <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LONGITUDE <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<BigDecimal> values) {
            addCriterion("LONGITUDE in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("LONGITUDE not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LONGITUDE between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andLatitudeEqualTo(BigDecimal value) {
            addCriterion("LATITUDE =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("LATITUDE <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(BigDecimal value) {
            addCriterion("LATITUDE >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LATITUDE >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(BigDecimal value) {
            addCriterion("LATITUDE <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LATITUDE <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<BigDecimal> values) {
            addCriterion("LATITUDE in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("LATITUDE not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LATITUDE between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LATITUDE not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andElevationIsNull() {
            addCriterion("ELEVATION is null");
            return (Criteria) this;
        }

        public Criteria andElevationIsNotNull() {
            addCriterion("ELEVATION is not null");
            return (Criteria) this;
        }

        public Criteria andElevationEqualTo(String value) {
            addCriterion("ELEVATION =", value, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationNotEqualTo(String value) {
            addCriterion("ELEVATION <>", value, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationGreaterThan(String value) {
            addCriterion("ELEVATION >", value, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationGreaterThanOrEqualTo(String value) {
            addCriterion("ELEVATION >=", value, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationLessThan(String value) {
            addCriterion("ELEVATION <", value, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationLessThanOrEqualTo(String value) {
            addCriterion("ELEVATION <=", value, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationLike(String value) {
            addCriterion("ELEVATION like", value, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationNotLike(String value) {
            addCriterion("ELEVATION not like", value, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationIn(List<String> values) {
            addCriterion("ELEVATION in", values, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationNotIn(List<String> values) {
            addCriterion("ELEVATION not in", values, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationBetween(String value1, String value2) {
            addCriterion("ELEVATION between", value1, value2, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationNotBetween(String value1, String value2) {
            addCriterion("ELEVATION not between", value1, value2, "elevation");
            return (Criteria) this;
        }

        public Criteria andCameraTypeIsNull() {
            addCriterion("CAMERA_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCameraTypeIsNotNull() {
            addCriterion("CAMERA_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCameraTypeEqualTo(Integer value) {
            addCriterion("CAMERA_TYPE =", value, "cameraType");
            return (Criteria) this;
        }

        public Criteria andCameraTypeNotEqualTo(Integer value) {
            addCriterion("CAMERA_TYPE <>", value, "cameraType");
            return (Criteria) this;
        }

        public Criteria andCameraTypeGreaterThan(Integer value) {
            addCriterion("CAMERA_TYPE >", value, "cameraType");
            return (Criteria) this;
        }

        public Criteria andCameraTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CAMERA_TYPE >=", value, "cameraType");
            return (Criteria) this;
        }

        public Criteria andCameraTypeLessThan(Integer value) {
            addCriterion("CAMERA_TYPE <", value, "cameraType");
            return (Criteria) this;
        }

        public Criteria andCameraTypeLessThanOrEqualTo(Integer value) {
            addCriterion("CAMERA_TYPE <=", value, "cameraType");
            return (Criteria) this;
        }

        public Criteria andCameraTypeIn(List<Integer> values) {
            addCriterion("CAMERA_TYPE in", values, "cameraType");
            return (Criteria) this;
        }

        public Criteria andCameraTypeNotIn(List<Integer> values) {
            addCriterion("CAMERA_TYPE not in", values, "cameraType");
            return (Criteria) this;
        }

        public Criteria andCameraTypeBetween(Integer value1, Integer value2) {
            addCriterion("CAMERA_TYPE between", value1, value2, "cameraType");
            return (Criteria) this;
        }

        public Criteria andCameraTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CAMERA_TYPE not between", value1, value2, "cameraType");
            return (Criteria) this;
        }

        public Criteria andCapabilityIsNull() {
            addCriterion("CAPABILITY is null");
            return (Criteria) this;
        }

        public Criteria andCapabilityIsNotNull() {
            addCriterion("CAPABILITY is not null");
            return (Criteria) this;
        }

        public Criteria andCapabilityEqualTo(String value) {
            addCriterion("CAPABILITY =", value, "capability");
            return (Criteria) this;
        }

        public Criteria andCapabilityNotEqualTo(String value) {
            addCriterion("CAPABILITY <>", value, "capability");
            return (Criteria) this;
        }

        public Criteria andCapabilityGreaterThan(String value) {
            addCriterion("CAPABILITY >", value, "capability");
            return (Criteria) this;
        }

        public Criteria andCapabilityGreaterThanOrEqualTo(String value) {
            addCriterion("CAPABILITY >=", value, "capability");
            return (Criteria) this;
        }

        public Criteria andCapabilityLessThan(String value) {
            addCriterion("CAPABILITY <", value, "capability");
            return (Criteria) this;
        }

        public Criteria andCapabilityLessThanOrEqualTo(String value) {
            addCriterion("CAPABILITY <=", value, "capability");
            return (Criteria) this;
        }

        public Criteria andCapabilityLike(String value) {
            addCriterion("CAPABILITY like", value, "capability");
            return (Criteria) this;
        }

        public Criteria andCapabilityNotLike(String value) {
            addCriterion("CAPABILITY not like", value, "capability");
            return (Criteria) this;
        }

        public Criteria andCapabilityIn(List<String> values) {
            addCriterion("CAPABILITY in", values, "capability");
            return (Criteria) this;
        }

        public Criteria andCapabilityNotIn(List<String> values) {
            addCriterion("CAPABILITY not in", values, "capability");
            return (Criteria) this;
        }

        public Criteria andCapabilityBetween(String value1, String value2) {
            addCriterion("CAPABILITY between", value1, value2, "capability");
            return (Criteria) this;
        }

        public Criteria andCapabilityNotBetween(String value1, String value2) {
            addCriterion("CAPABILITY not between", value1, value2, "capability");
            return (Criteria) this;
        }

        public Criteria andRecordLocationIsNull() {
            addCriterion("RECORD_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andRecordLocationIsNotNull() {
            addCriterion("RECORD_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andRecordLocationEqualTo(String value) {
            addCriterion("RECORD_LOCATION =", value, "recordLocation");
            return (Criteria) this;
        }

        public Criteria andRecordLocationNotEqualTo(String value) {
            addCriterion("RECORD_LOCATION <>", value, "recordLocation");
            return (Criteria) this;
        }

        public Criteria andRecordLocationGreaterThan(String value) {
            addCriterion("RECORD_LOCATION >", value, "recordLocation");
            return (Criteria) this;
        }

        public Criteria andRecordLocationGreaterThanOrEqualTo(String value) {
            addCriterion("RECORD_LOCATION >=", value, "recordLocation");
            return (Criteria) this;
        }

        public Criteria andRecordLocationLessThan(String value) {
            addCriterion("RECORD_LOCATION <", value, "recordLocation");
            return (Criteria) this;
        }

        public Criteria andRecordLocationLessThanOrEqualTo(String value) {
            addCriterion("RECORD_LOCATION <=", value, "recordLocation");
            return (Criteria) this;
        }

        public Criteria andRecordLocationLike(String value) {
            addCriterion("RECORD_LOCATION like", value, "recordLocation");
            return (Criteria) this;
        }

        public Criteria andRecordLocationNotLike(String value) {
            addCriterion("RECORD_LOCATION not like", value, "recordLocation");
            return (Criteria) this;
        }

        public Criteria andRecordLocationIn(List<String> values) {
            addCriterion("RECORD_LOCATION in", values, "recordLocation");
            return (Criteria) this;
        }

        public Criteria andRecordLocationNotIn(List<String> values) {
            addCriterion("RECORD_LOCATION not in", values, "recordLocation");
            return (Criteria) this;
        }

        public Criteria andRecordLocationBetween(String value1, String value2) {
            addCriterion("RECORD_LOCATION between", value1, value2, "recordLocation");
            return (Criteria) this;
        }

        public Criteria andRecordLocationNotBetween(String value1, String value2) {
            addCriterion("RECORD_LOCATION not between", value1, value2, "recordLocation");
            return (Criteria) this;
        }

        public Criteria andChannelTypeIsNull() {
            addCriterion("CHANNEL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andChannelTypeIsNotNull() {
            addCriterion("CHANNEL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChannelTypeEqualTo(String value) {
            addCriterion("CHANNEL_TYPE =", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotEqualTo(String value) {
            addCriterion("CHANNEL_TYPE <>", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeGreaterThan(String value) {
            addCriterion("CHANNEL_TYPE >", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_TYPE >=", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeLessThan(String value) {
            addCriterion("CHANNEL_TYPE <", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_TYPE <=", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeLike(String value) {
            addCriterion("CHANNEL_TYPE like", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotLike(String value) {
            addCriterion("CHANNEL_TYPE not like", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeIn(List<String> values) {
            addCriterion("CHANNEL_TYPE in", values, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotIn(List<String> values) {
            addCriterion("CHANNEL_TYPE not in", values, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeBetween(String value1, String value2) {
            addCriterion("CHANNEL_TYPE between", value1, value2, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_TYPE not between", value1, value2, "channelType");
            return (Criteria) this;
        }

        public Criteria andRegionIndexCodeIsNull() {
            addCriterion("REGION_INDEX_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRegionIndexCodeIsNotNull() {
            addCriterion("REGION_INDEX_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRegionIndexCodeEqualTo(String value) {
            addCriterion("REGION_INDEX_CODE =", value, "regionIndexCode");
            return (Criteria) this;
        }

        public Criteria andRegionIndexCodeNotEqualTo(String value) {
            addCriterion("REGION_INDEX_CODE <>", value, "regionIndexCode");
            return (Criteria) this;
        }

        public Criteria andRegionIndexCodeGreaterThan(String value) {
            addCriterion("REGION_INDEX_CODE >", value, "regionIndexCode");
            return (Criteria) this;
        }

        public Criteria andRegionIndexCodeGreaterThanOrEqualTo(String value) {
            addCriterion("REGION_INDEX_CODE >=", value, "regionIndexCode");
            return (Criteria) this;
        }

        public Criteria andRegionIndexCodeLessThan(String value) {
            addCriterion("REGION_INDEX_CODE <", value, "regionIndexCode");
            return (Criteria) this;
        }

        public Criteria andRegionIndexCodeLessThanOrEqualTo(String value) {
            addCriterion("REGION_INDEX_CODE <=", value, "regionIndexCode");
            return (Criteria) this;
        }

        public Criteria andRegionIndexCodeLike(String value) {
            addCriterion("REGION_INDEX_CODE like", value, "regionIndexCode");
            return (Criteria) this;
        }

        public Criteria andRegionIndexCodeNotLike(String value) {
            addCriterion("REGION_INDEX_CODE not like", value, "regionIndexCode");
            return (Criteria) this;
        }

        public Criteria andRegionIndexCodeIn(List<String> values) {
            addCriterion("REGION_INDEX_CODE in", values, "regionIndexCode");
            return (Criteria) this;
        }

        public Criteria andRegionIndexCodeNotIn(List<String> values) {
            addCriterion("REGION_INDEX_CODE not in", values, "regionIndexCode");
            return (Criteria) this;
        }

        public Criteria andRegionIndexCodeBetween(String value1, String value2) {
            addCriterion("REGION_INDEX_CODE between", value1, value2, "regionIndexCode");
            return (Criteria) this;
        }

        public Criteria andRegionIndexCodeNotBetween(String value1, String value2) {
            addCriterion("REGION_INDEX_CODE not between", value1, value2, "regionIndexCode");
            return (Criteria) this;
        }

        public Criteria andTransTypeIsNull() {
            addCriterion("TRANS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTransTypeIsNotNull() {
            addCriterion("TRANS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTransTypeEqualTo(Integer value) {
            addCriterion("TRANS_TYPE =", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotEqualTo(Integer value) {
            addCriterion("TRANS_TYPE <>", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeGreaterThan(Integer value) {
            addCriterion("TRANS_TYPE >", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRANS_TYPE >=", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLessThan(Integer value) {
            addCriterion("TRANS_TYPE <", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLessThanOrEqualTo(Integer value) {
            addCriterion("TRANS_TYPE <=", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeIn(List<Integer> values) {
            addCriterion("TRANS_TYPE in", values, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotIn(List<Integer> values) {
            addCriterion("TRANS_TYPE not in", values, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeBetween(Integer value1, Integer value2) {
            addCriterion("TRANS_TYPE between", value1, value2, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("TRANS_TYPE not between", value1, value2, "transType");
            return (Criteria) this;
        }

        public Criteria andTreatyTypeIsNull() {
            addCriterion("TREATY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTreatyTypeIsNotNull() {
            addCriterion("TREATY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTreatyTypeEqualTo(String value) {
            addCriterion("TREATY_TYPE =", value, "treatyType");
            return (Criteria) this;
        }

        public Criteria andTreatyTypeNotEqualTo(String value) {
            addCriterion("TREATY_TYPE <>", value, "treatyType");
            return (Criteria) this;
        }

        public Criteria andTreatyTypeGreaterThan(String value) {
            addCriterion("TREATY_TYPE >", value, "treatyType");
            return (Criteria) this;
        }

        public Criteria andTreatyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TREATY_TYPE >=", value, "treatyType");
            return (Criteria) this;
        }

        public Criteria andTreatyTypeLessThan(String value) {
            addCriterion("TREATY_TYPE <", value, "treatyType");
            return (Criteria) this;
        }

        public Criteria andTreatyTypeLessThanOrEqualTo(String value) {
            addCriterion("TREATY_TYPE <=", value, "treatyType");
            return (Criteria) this;
        }

        public Criteria andTreatyTypeLike(String value) {
            addCriterion("TREATY_TYPE like", value, "treatyType");
            return (Criteria) this;
        }

        public Criteria andTreatyTypeNotLike(String value) {
            addCriterion("TREATY_TYPE not like", value, "treatyType");
            return (Criteria) this;
        }

        public Criteria andTreatyTypeIn(List<String> values) {
            addCriterion("TREATY_TYPE in", values, "treatyType");
            return (Criteria) this;
        }

        public Criteria andTreatyTypeNotIn(List<String> values) {
            addCriterion("TREATY_TYPE not in", values, "treatyType");
            return (Criteria) this;
        }

        public Criteria andTreatyTypeBetween(String value1, String value2) {
            addCriterion("TREATY_TYPE between", value1, value2, "treatyType");
            return (Criteria) this;
        }

        public Criteria andTreatyTypeNotBetween(String value1, String value2) {
            addCriterion("TREATY_TYPE not between", value1, value2, "treatyType");
            return (Criteria) this;
        }

        public Criteria andInstallLocationIsNull() {
            addCriterion("INSTALL_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andInstallLocationIsNotNull() {
            addCriterion("INSTALL_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andInstallLocationEqualTo(String value) {
            addCriterion("INSTALL_LOCATION =", value, "installLocation");
            return (Criteria) this;
        }

        public Criteria andInstallLocationNotEqualTo(String value) {
            addCriterion("INSTALL_LOCATION <>", value, "installLocation");
            return (Criteria) this;
        }

        public Criteria andInstallLocationGreaterThan(String value) {
            addCriterion("INSTALL_LOCATION >", value, "installLocation");
            return (Criteria) this;
        }

        public Criteria andInstallLocationGreaterThanOrEqualTo(String value) {
            addCriterion("INSTALL_LOCATION >=", value, "installLocation");
            return (Criteria) this;
        }

        public Criteria andInstallLocationLessThan(String value) {
            addCriterion("INSTALL_LOCATION <", value, "installLocation");
            return (Criteria) this;
        }

        public Criteria andInstallLocationLessThanOrEqualTo(String value) {
            addCriterion("INSTALL_LOCATION <=", value, "installLocation");
            return (Criteria) this;
        }

        public Criteria andInstallLocationLike(String value) {
            addCriterion("INSTALL_LOCATION like", value, "installLocation");
            return (Criteria) this;
        }

        public Criteria andInstallLocationNotLike(String value) {
            addCriterion("INSTALL_LOCATION not like", value, "installLocation");
            return (Criteria) this;
        }

        public Criteria andInstallLocationIn(List<String> values) {
            addCriterion("INSTALL_LOCATION in", values, "installLocation");
            return (Criteria) this;
        }

        public Criteria andInstallLocationNotIn(List<String> values) {
            addCriterion("INSTALL_LOCATION not in", values, "installLocation");
            return (Criteria) this;
        }

        public Criteria andInstallLocationBetween(String value1, String value2) {
            addCriterion("INSTALL_LOCATION between", value1, value2, "installLocation");
            return (Criteria) this;
        }

        public Criteria andInstallLocationNotBetween(String value1, String value2) {
            addCriterion("INSTALL_LOCATION not between", value1, value2, "installLocation");
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

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDisOrderIsNull() {
            addCriterion("DIS_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andDisOrderIsNotNull() {
            addCriterion("DIS_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andDisOrderEqualTo(Integer value) {
            addCriterion("DIS_ORDER =", value, "disOrder");
            return (Criteria) this;
        }

        public Criteria andDisOrderNotEqualTo(Integer value) {
            addCriterion("DIS_ORDER <>", value, "disOrder");
            return (Criteria) this;
        }

        public Criteria andDisOrderGreaterThan(Integer value) {
            addCriterion("DIS_ORDER >", value, "disOrder");
            return (Criteria) this;
        }

        public Criteria andDisOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("DIS_ORDER >=", value, "disOrder");
            return (Criteria) this;
        }

        public Criteria andDisOrderLessThan(Integer value) {
            addCriterion("DIS_ORDER <", value, "disOrder");
            return (Criteria) this;
        }

        public Criteria andDisOrderLessThanOrEqualTo(Integer value) {
            addCriterion("DIS_ORDER <=", value, "disOrder");
            return (Criteria) this;
        }

        public Criteria andDisOrderIn(List<Integer> values) {
            addCriterion("DIS_ORDER in", values, "disOrder");
            return (Criteria) this;
        }

        public Criteria andDisOrderNotIn(List<Integer> values) {
            addCriterion("DIS_ORDER not in", values, "disOrder");
            return (Criteria) this;
        }

        public Criteria andDisOrderBetween(Integer value1, Integer value2) {
            addCriterion("DIS_ORDER between", value1, value2, "disOrder");
            return (Criteria) this;
        }

        public Criteria andDisOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("DIS_ORDER not between", value1, value2, "disOrder");
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