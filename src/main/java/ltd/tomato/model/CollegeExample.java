package ltd.tomato.model;

import java.util.ArrayList;
import java.util.List;

public class CollegeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CollegeExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andCollegeIdIsNull() {
            addCriterion("college_id is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIsNotNull() {
            addCriterion("college_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeIdEqualTo(Integer value) {
            addCriterion("college_id =", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotEqualTo(Integer value) {
            addCriterion("college_id <>", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdGreaterThan(Integer value) {
            addCriterion("college_id >", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("college_id >=", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLessThan(Integer value) {
            addCriterion("college_id <", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLessThanOrEqualTo(Integer value) {
            addCriterion("college_id <=", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIn(List<Integer> values) {
            addCriterion("college_id in", values, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotIn(List<Integer> values) {
            addCriterion("college_id not in", values, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdBetween(Integer value1, Integer value2) {
            addCriterion("college_id between", value1, value2, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("college_id not between", value1, value2, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeNameIsNull() {
            addCriterion("college_name is null");
            return (Criteria) this;
        }

        public Criteria andCollegeNameIsNotNull() {
            addCriterion("college_name is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeNameEqualTo(String value) {
            addCriterion("college_name =", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotEqualTo(String value) {
            addCriterion("college_name <>", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameGreaterThan(String value) {
            addCriterion("college_name >", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameGreaterThanOrEqualTo(String value) {
            addCriterion("college_name >=", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLessThan(String value) {
            addCriterion("college_name <", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLessThanOrEqualTo(String value) {
            addCriterion("college_name <=", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLike(String value) {
            addCriterion("college_name like", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotLike(String value) {
            addCriterion("college_name not like", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameIn(List<String> values) {
            addCriterion("college_name in", values, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotIn(List<String> values) {
            addCriterion("college_name not in", values, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameBetween(String value1, String value2) {
            addCriterion("college_name between", value1, value2, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotBetween(String value1, String value2) {
            addCriterion("college_name not between", value1, value2, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeProfileIsNull() {
            addCriterion("college_profile is null");
            return (Criteria) this;
        }

        public Criteria andCollegeProfileIsNotNull() {
            addCriterion("college_profile is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeProfileEqualTo(String value) {
            addCriterion("college_profile =", value, "collegeProfile");
            return (Criteria) this;
        }

        public Criteria andCollegeProfileNotEqualTo(String value) {
            addCriterion("college_profile <>", value, "collegeProfile");
            return (Criteria) this;
        }

        public Criteria andCollegeProfileGreaterThan(String value) {
            addCriterion("college_profile >", value, "collegeProfile");
            return (Criteria) this;
        }

        public Criteria andCollegeProfileGreaterThanOrEqualTo(String value) {
            addCriterion("college_profile >=", value, "collegeProfile");
            return (Criteria) this;
        }

        public Criteria andCollegeProfileLessThan(String value) {
            addCriterion("college_profile <", value, "collegeProfile");
            return (Criteria) this;
        }

        public Criteria andCollegeProfileLessThanOrEqualTo(String value) {
            addCriterion("college_profile <=", value, "collegeProfile");
            return (Criteria) this;
        }

        public Criteria andCollegeProfileLike(String value) {
            addCriterion("college_profile like", value, "collegeProfile");
            return (Criteria) this;
        }

        public Criteria andCollegeProfileNotLike(String value) {
            addCriterion("college_profile not like", value, "collegeProfile");
            return (Criteria) this;
        }

        public Criteria andCollegeProfileIn(List<String> values) {
            addCriterion("college_profile in", values, "collegeProfile");
            return (Criteria) this;
        }

        public Criteria andCollegeProfileNotIn(List<String> values) {
            addCriterion("college_profile not in", values, "collegeProfile");
            return (Criteria) this;
        }

        public Criteria andCollegeProfileBetween(String value1, String value2) {
            addCriterion("college_profile between", value1, value2, "collegeProfile");
            return (Criteria) this;
        }

        public Criteria andCollegeProfileNotBetween(String value1, String value2) {
            addCriterion("college_profile not between", value1, value2, "collegeProfile");
            return (Criteria) this;
        }

        public Criteria andCollegeAddrIsNull() {
            addCriterion("college_addr is null");
            return (Criteria) this;
        }

        public Criteria andCollegeAddrIsNotNull() {
            addCriterion("college_addr is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeAddrEqualTo(String value) {
            addCriterion("college_addr =", value, "collegeAddr");
            return (Criteria) this;
        }

        public Criteria andCollegeAddrNotEqualTo(String value) {
            addCriterion("college_addr <>", value, "collegeAddr");
            return (Criteria) this;
        }

        public Criteria andCollegeAddrGreaterThan(String value) {
            addCriterion("college_addr >", value, "collegeAddr");
            return (Criteria) this;
        }

        public Criteria andCollegeAddrGreaterThanOrEqualTo(String value) {
            addCriterion("college_addr >=", value, "collegeAddr");
            return (Criteria) this;
        }

        public Criteria andCollegeAddrLessThan(String value) {
            addCriterion("college_addr <", value, "collegeAddr");
            return (Criteria) this;
        }

        public Criteria andCollegeAddrLessThanOrEqualTo(String value) {
            addCriterion("college_addr <=", value, "collegeAddr");
            return (Criteria) this;
        }

        public Criteria andCollegeAddrLike(String value) {
            addCriterion("college_addr like", value, "collegeAddr");
            return (Criteria) this;
        }

        public Criteria andCollegeAddrNotLike(String value) {
            addCriterion("college_addr not like", value, "collegeAddr");
            return (Criteria) this;
        }

        public Criteria andCollegeAddrIn(List<String> values) {
            addCriterion("college_addr in", values, "collegeAddr");
            return (Criteria) this;
        }

        public Criteria andCollegeAddrNotIn(List<String> values) {
            addCriterion("college_addr not in", values, "collegeAddr");
            return (Criteria) this;
        }

        public Criteria andCollegeAddrBetween(String value1, String value2) {
            addCriterion("college_addr between", value1, value2, "collegeAddr");
            return (Criteria) this;
        }

        public Criteria andCollegeAddrNotBetween(String value1, String value2) {
            addCriterion("college_addr not between", value1, value2, "collegeAddr");
            return (Criteria) this;
        }

        public Criteria andCollegeTelIsNull() {
            addCriterion("college_tel is null");
            return (Criteria) this;
        }

        public Criteria andCollegeTelIsNotNull() {
            addCriterion("college_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeTelEqualTo(String value) {
            addCriterion("college_tel =", value, "collegeTel");
            return (Criteria) this;
        }

        public Criteria andCollegeTelNotEqualTo(String value) {
            addCriterion("college_tel <>", value, "collegeTel");
            return (Criteria) this;
        }

        public Criteria andCollegeTelGreaterThan(String value) {
            addCriterion("college_tel >", value, "collegeTel");
            return (Criteria) this;
        }

        public Criteria andCollegeTelGreaterThanOrEqualTo(String value) {
            addCriterion("college_tel >=", value, "collegeTel");
            return (Criteria) this;
        }

        public Criteria andCollegeTelLessThan(String value) {
            addCriterion("college_tel <", value, "collegeTel");
            return (Criteria) this;
        }

        public Criteria andCollegeTelLessThanOrEqualTo(String value) {
            addCriterion("college_tel <=", value, "collegeTel");
            return (Criteria) this;
        }

        public Criteria andCollegeTelLike(String value) {
            addCriterion("college_tel like", value, "collegeTel");
            return (Criteria) this;
        }

        public Criteria andCollegeTelNotLike(String value) {
            addCriterion("college_tel not like", value, "collegeTel");
            return (Criteria) this;
        }

        public Criteria andCollegeTelIn(List<String> values) {
            addCriterion("college_tel in", values, "collegeTel");
            return (Criteria) this;
        }

        public Criteria andCollegeTelNotIn(List<String> values) {
            addCriterion("college_tel not in", values, "collegeTel");
            return (Criteria) this;
        }

        public Criteria andCollegeTelBetween(String value1, String value2) {
            addCriterion("college_tel between", value1, value2, "collegeTel");
            return (Criteria) this;
        }

        public Criteria andCollegeTelNotBetween(String value1, String value2) {
            addCriterion("college_tel not between", value1, value2, "collegeTel");
            return (Criteria) this;
        }

        public Criteria andCollegeUrlIsNull() {
            addCriterion("college_url is null");
            return (Criteria) this;
        }

        public Criteria andCollegeUrlIsNotNull() {
            addCriterion("college_url is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeUrlEqualTo(String value) {
            addCriterion("college_url =", value, "collegeUrl");
            return (Criteria) this;
        }

        public Criteria andCollegeUrlNotEqualTo(String value) {
            addCriterion("college_url <>", value, "collegeUrl");
            return (Criteria) this;
        }

        public Criteria andCollegeUrlGreaterThan(String value) {
            addCriterion("college_url >", value, "collegeUrl");
            return (Criteria) this;
        }

        public Criteria andCollegeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("college_url >=", value, "collegeUrl");
            return (Criteria) this;
        }

        public Criteria andCollegeUrlLessThan(String value) {
            addCriterion("college_url <", value, "collegeUrl");
            return (Criteria) this;
        }

        public Criteria andCollegeUrlLessThanOrEqualTo(String value) {
            addCriterion("college_url <=", value, "collegeUrl");
            return (Criteria) this;
        }

        public Criteria andCollegeUrlLike(String value) {
            addCriterion("college_url like", value, "collegeUrl");
            return (Criteria) this;
        }

        public Criteria andCollegeUrlNotLike(String value) {
            addCriterion("college_url not like", value, "collegeUrl");
            return (Criteria) this;
        }

        public Criteria andCollegeUrlIn(List<String> values) {
            addCriterion("college_url in", values, "collegeUrl");
            return (Criteria) this;
        }

        public Criteria andCollegeUrlNotIn(List<String> values) {
            addCriterion("college_url not in", values, "collegeUrl");
            return (Criteria) this;
        }

        public Criteria andCollegeUrlBetween(String value1, String value2) {
            addCriterion("college_url between", value1, value2, "collegeUrl");
            return (Criteria) this;
        }

        public Criteria andCollegeUrlNotBetween(String value1, String value2) {
            addCriterion("college_url not between", value1, value2, "collegeUrl");
            return (Criteria) this;
        }

        public Criteria andCollegeLogoIsNull() {
            addCriterion("college_logo is null");
            return (Criteria) this;
        }

        public Criteria andCollegeLogoIsNotNull() {
            addCriterion("college_logo is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeLogoEqualTo(String value) {
            addCriterion("college_logo =", value, "collegeLogo");
            return (Criteria) this;
        }

        public Criteria andCollegeLogoNotEqualTo(String value) {
            addCriterion("college_logo <>", value, "collegeLogo");
            return (Criteria) this;
        }

        public Criteria andCollegeLogoGreaterThan(String value) {
            addCriterion("college_logo >", value, "collegeLogo");
            return (Criteria) this;
        }

        public Criteria andCollegeLogoGreaterThanOrEqualTo(String value) {
            addCriterion("college_logo >=", value, "collegeLogo");
            return (Criteria) this;
        }

        public Criteria andCollegeLogoLessThan(String value) {
            addCriterion("college_logo <", value, "collegeLogo");
            return (Criteria) this;
        }

        public Criteria andCollegeLogoLessThanOrEqualTo(String value) {
            addCriterion("college_logo <=", value, "collegeLogo");
            return (Criteria) this;
        }

        public Criteria andCollegeLogoLike(String value) {
            addCriterion("college_logo like", value, "collegeLogo");
            return (Criteria) this;
        }

        public Criteria andCollegeLogoNotLike(String value) {
            addCriterion("college_logo not like", value, "collegeLogo");
            return (Criteria) this;
        }

        public Criteria andCollegeLogoIn(List<String> values) {
            addCriterion("college_logo in", values, "collegeLogo");
            return (Criteria) this;
        }

        public Criteria andCollegeLogoNotIn(List<String> values) {
            addCriterion("college_logo not in", values, "collegeLogo");
            return (Criteria) this;
        }

        public Criteria andCollegeLogoBetween(String value1, String value2) {
            addCriterion("college_logo between", value1, value2, "collegeLogo");
            return (Criteria) this;
        }

        public Criteria andCollegeLogoNotBetween(String value1, String value2) {
            addCriterion("college_logo not between", value1, value2, "collegeLogo");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNull() {
            addCriterion("school_id is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNotNull() {
            addCriterion("school_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdEqualTo(Integer value) {
            addCriterion("school_id =", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotEqualTo(Integer value) {
            addCriterion("school_id <>", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThan(Integer value) {
            addCriterion("school_id >", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("school_id >=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThan(Integer value) {
            addCriterion("school_id <", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("school_id <=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIn(List<Integer> values) {
            addCriterion("school_id in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotIn(List<Integer> values) {
            addCriterion("school_id not in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdBetween(Integer value1, Integer value2) {
            addCriterion("school_id between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("school_id not between", value1, value2, "schoolId");
            return (Criteria) this;
        }
    }

    /**
     */
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