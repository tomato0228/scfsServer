package ltd.tomato.model;

import java.util.ArrayList;
import java.util.List;

public class SchoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public SchoolExample() {
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

        public Criteria andSchoolNameIsNull() {
            addCriterion("school_name is null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNotNull() {
            addCriterion("school_name is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameEqualTo(String value) {
            addCriterion("school_name =", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotEqualTo(String value) {
            addCriterion("school_name <>", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThan(String value) {
            addCriterion("school_name >", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThanOrEqualTo(String value) {
            addCriterion("school_name >=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThan(String value) {
            addCriterion("school_name <", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThanOrEqualTo(String value) {
            addCriterion("school_name <=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLike(String value) {
            addCriterion("school_name like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotLike(String value) {
            addCriterion("school_name not like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIn(List<String> values) {
            addCriterion("school_name in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotIn(List<String> values) {
            addCriterion("school_name not in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameBetween(String value1, String value2) {
            addCriterion("school_name between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotBetween(String value1, String value2) {
            addCriterion("school_name not between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolProfileIsNull() {
            addCriterion("school_profile is null");
            return (Criteria) this;
        }

        public Criteria andSchoolProfileIsNotNull() {
            addCriterion("school_profile is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolProfileEqualTo(String value) {
            addCriterion("school_profile =", value, "schoolProfile");
            return (Criteria) this;
        }

        public Criteria andSchoolProfileNotEqualTo(String value) {
            addCriterion("school_profile <>", value, "schoolProfile");
            return (Criteria) this;
        }

        public Criteria andSchoolProfileGreaterThan(String value) {
            addCriterion("school_profile >", value, "schoolProfile");
            return (Criteria) this;
        }

        public Criteria andSchoolProfileGreaterThanOrEqualTo(String value) {
            addCriterion("school_profile >=", value, "schoolProfile");
            return (Criteria) this;
        }

        public Criteria andSchoolProfileLessThan(String value) {
            addCriterion("school_profile <", value, "schoolProfile");
            return (Criteria) this;
        }

        public Criteria andSchoolProfileLessThanOrEqualTo(String value) {
            addCriterion("school_profile <=", value, "schoolProfile");
            return (Criteria) this;
        }

        public Criteria andSchoolProfileLike(String value) {
            addCriterion("school_profile like", value, "schoolProfile");
            return (Criteria) this;
        }

        public Criteria andSchoolProfileNotLike(String value) {
            addCriterion("school_profile not like", value, "schoolProfile");
            return (Criteria) this;
        }

        public Criteria andSchoolProfileIn(List<String> values) {
            addCriterion("school_profile in", values, "schoolProfile");
            return (Criteria) this;
        }

        public Criteria andSchoolProfileNotIn(List<String> values) {
            addCriterion("school_profile not in", values, "schoolProfile");
            return (Criteria) this;
        }

        public Criteria andSchoolProfileBetween(String value1, String value2) {
            addCriterion("school_profile between", value1, value2, "schoolProfile");
            return (Criteria) this;
        }

        public Criteria andSchoolProfileNotBetween(String value1, String value2) {
            addCriterion("school_profile not between", value1, value2, "schoolProfile");
            return (Criteria) this;
        }

        public Criteria andSchoolAddrIsNull() {
            addCriterion("school_addr is null");
            return (Criteria) this;
        }

        public Criteria andSchoolAddrIsNotNull() {
            addCriterion("school_addr is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolAddrEqualTo(String value) {
            addCriterion("school_addr =", value, "schoolAddr");
            return (Criteria) this;
        }

        public Criteria andSchoolAddrNotEqualTo(String value) {
            addCriterion("school_addr <>", value, "schoolAddr");
            return (Criteria) this;
        }

        public Criteria andSchoolAddrGreaterThan(String value) {
            addCriterion("school_addr >", value, "schoolAddr");
            return (Criteria) this;
        }

        public Criteria andSchoolAddrGreaterThanOrEqualTo(String value) {
            addCriterion("school_addr >=", value, "schoolAddr");
            return (Criteria) this;
        }

        public Criteria andSchoolAddrLessThan(String value) {
            addCriterion("school_addr <", value, "schoolAddr");
            return (Criteria) this;
        }

        public Criteria andSchoolAddrLessThanOrEqualTo(String value) {
            addCriterion("school_addr <=", value, "schoolAddr");
            return (Criteria) this;
        }

        public Criteria andSchoolAddrLike(String value) {
            addCriterion("school_addr like", value, "schoolAddr");
            return (Criteria) this;
        }

        public Criteria andSchoolAddrNotLike(String value) {
            addCriterion("school_addr not like", value, "schoolAddr");
            return (Criteria) this;
        }

        public Criteria andSchoolAddrIn(List<String> values) {
            addCriterion("school_addr in", values, "schoolAddr");
            return (Criteria) this;
        }

        public Criteria andSchoolAddrNotIn(List<String> values) {
            addCriterion("school_addr not in", values, "schoolAddr");
            return (Criteria) this;
        }

        public Criteria andSchoolAddrBetween(String value1, String value2) {
            addCriterion("school_addr between", value1, value2, "schoolAddr");
            return (Criteria) this;
        }

        public Criteria andSchoolAddrNotBetween(String value1, String value2) {
            addCriterion("school_addr not between", value1, value2, "schoolAddr");
            return (Criteria) this;
        }

        public Criteria andSchoolTelIsNull() {
            addCriterion("school_tel is null");
            return (Criteria) this;
        }

        public Criteria andSchoolTelIsNotNull() {
            addCriterion("school_tel is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolTelEqualTo(String value) {
            addCriterion("school_tel =", value, "schoolTel");
            return (Criteria) this;
        }

        public Criteria andSchoolTelNotEqualTo(String value) {
            addCriterion("school_tel <>", value, "schoolTel");
            return (Criteria) this;
        }

        public Criteria andSchoolTelGreaterThan(String value) {
            addCriterion("school_tel >", value, "schoolTel");
            return (Criteria) this;
        }

        public Criteria andSchoolTelGreaterThanOrEqualTo(String value) {
            addCriterion("school_tel >=", value, "schoolTel");
            return (Criteria) this;
        }

        public Criteria andSchoolTelLessThan(String value) {
            addCriterion("school_tel <", value, "schoolTel");
            return (Criteria) this;
        }

        public Criteria andSchoolTelLessThanOrEqualTo(String value) {
            addCriterion("school_tel <=", value, "schoolTel");
            return (Criteria) this;
        }

        public Criteria andSchoolTelLike(String value) {
            addCriterion("school_tel like", value, "schoolTel");
            return (Criteria) this;
        }

        public Criteria andSchoolTelNotLike(String value) {
            addCriterion("school_tel not like", value, "schoolTel");
            return (Criteria) this;
        }

        public Criteria andSchoolTelIn(List<String> values) {
            addCriterion("school_tel in", values, "schoolTel");
            return (Criteria) this;
        }

        public Criteria andSchoolTelNotIn(List<String> values) {
            addCriterion("school_tel not in", values, "schoolTel");
            return (Criteria) this;
        }

        public Criteria andSchoolTelBetween(String value1, String value2) {
            addCriterion("school_tel between", value1, value2, "schoolTel");
            return (Criteria) this;
        }

        public Criteria andSchoolTelNotBetween(String value1, String value2) {
            addCriterion("school_tel not between", value1, value2, "schoolTel");
            return (Criteria) this;
        }

        public Criteria andSchoolUrlIsNull() {
            addCriterion("school_url is null");
            return (Criteria) this;
        }

        public Criteria andSchoolUrlIsNotNull() {
            addCriterion("school_url is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolUrlEqualTo(String value) {
            addCriterion("school_url =", value, "schoolUrl");
            return (Criteria) this;
        }

        public Criteria andSchoolUrlNotEqualTo(String value) {
            addCriterion("school_url <>", value, "schoolUrl");
            return (Criteria) this;
        }

        public Criteria andSchoolUrlGreaterThan(String value) {
            addCriterion("school_url >", value, "schoolUrl");
            return (Criteria) this;
        }

        public Criteria andSchoolUrlGreaterThanOrEqualTo(String value) {
            addCriterion("school_url >=", value, "schoolUrl");
            return (Criteria) this;
        }

        public Criteria andSchoolUrlLessThan(String value) {
            addCriterion("school_url <", value, "schoolUrl");
            return (Criteria) this;
        }

        public Criteria andSchoolUrlLessThanOrEqualTo(String value) {
            addCriterion("school_url <=", value, "schoolUrl");
            return (Criteria) this;
        }

        public Criteria andSchoolUrlLike(String value) {
            addCriterion("school_url like", value, "schoolUrl");
            return (Criteria) this;
        }

        public Criteria andSchoolUrlNotLike(String value) {
            addCriterion("school_url not like", value, "schoolUrl");
            return (Criteria) this;
        }

        public Criteria andSchoolUrlIn(List<String> values) {
            addCriterion("school_url in", values, "schoolUrl");
            return (Criteria) this;
        }

        public Criteria andSchoolUrlNotIn(List<String> values) {
            addCriterion("school_url not in", values, "schoolUrl");
            return (Criteria) this;
        }

        public Criteria andSchoolUrlBetween(String value1, String value2) {
            addCriterion("school_url between", value1, value2, "schoolUrl");
            return (Criteria) this;
        }

        public Criteria andSchoolUrlNotBetween(String value1, String value2) {
            addCriterion("school_url not between", value1, value2, "schoolUrl");
            return (Criteria) this;
        }

        public Criteria andSchoolLogoIsNull() {
            addCriterion("school_logo is null");
            return (Criteria) this;
        }

        public Criteria andSchoolLogoIsNotNull() {
            addCriterion("school_logo is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolLogoEqualTo(String value) {
            addCriterion("school_logo =", value, "schoolLogo");
            return (Criteria) this;
        }

        public Criteria andSchoolLogoNotEqualTo(String value) {
            addCriterion("school_logo <>", value, "schoolLogo");
            return (Criteria) this;
        }

        public Criteria andSchoolLogoGreaterThan(String value) {
            addCriterion("school_logo >", value, "schoolLogo");
            return (Criteria) this;
        }

        public Criteria andSchoolLogoGreaterThanOrEqualTo(String value) {
            addCriterion("school_logo >=", value, "schoolLogo");
            return (Criteria) this;
        }

        public Criteria andSchoolLogoLessThan(String value) {
            addCriterion("school_logo <", value, "schoolLogo");
            return (Criteria) this;
        }

        public Criteria andSchoolLogoLessThanOrEqualTo(String value) {
            addCriterion("school_logo <=", value, "schoolLogo");
            return (Criteria) this;
        }

        public Criteria andSchoolLogoLike(String value) {
            addCriterion("school_logo like", value, "schoolLogo");
            return (Criteria) this;
        }

        public Criteria andSchoolLogoNotLike(String value) {
            addCriterion("school_logo not like", value, "schoolLogo");
            return (Criteria) this;
        }

        public Criteria andSchoolLogoIn(List<String> values) {
            addCriterion("school_logo in", values, "schoolLogo");
            return (Criteria) this;
        }

        public Criteria andSchoolLogoNotIn(List<String> values) {
            addCriterion("school_logo not in", values, "schoolLogo");
            return (Criteria) this;
        }

        public Criteria andSchoolLogoBetween(String value1, String value2) {
            addCriterion("school_logo between", value1, value2, "schoolLogo");
            return (Criteria) this;
        }

        public Criteria andSchoolLogoNotBetween(String value1, String value2) {
            addCriterion("school_logo not between", value1, value2, "schoolLogo");
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