package ltd.tomato.model;

import java.util.ArrayList;
import java.util.List;

public class MajorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public MajorExample() {
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

        public Criteria andMajorIdIsNull() {
            addCriterion("major_id is null");
            return (Criteria) this;
        }

        public Criteria andMajorIdIsNotNull() {
            addCriterion("major_id is not null");
            return (Criteria) this;
        }

        public Criteria andMajorIdEqualTo(Integer value) {
            addCriterion("major_id =", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotEqualTo(Integer value) {
            addCriterion("major_id <>", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThan(Integer value) {
            addCriterion("major_id >", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("major_id >=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThan(Integer value) {
            addCriterion("major_id <", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThanOrEqualTo(Integer value) {
            addCriterion("major_id <=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdIn(List<Integer> values) {
            addCriterion("major_id in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotIn(List<Integer> values) {
            addCriterion("major_id not in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdBetween(Integer value1, Integer value2) {
            addCriterion("major_id between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("major_id not between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorNameIsNull() {
            addCriterion("major_name is null");
            return (Criteria) this;
        }

        public Criteria andMajorNameIsNotNull() {
            addCriterion("major_name is not null");
            return (Criteria) this;
        }

        public Criteria andMajorNameEqualTo(String value) {
            addCriterion("major_name =", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotEqualTo(String value) {
            addCriterion("major_name <>", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameGreaterThan(String value) {
            addCriterion("major_name >", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameGreaterThanOrEqualTo(String value) {
            addCriterion("major_name >=", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLessThan(String value) {
            addCriterion("major_name <", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLessThanOrEqualTo(String value) {
            addCriterion("major_name <=", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLike(String value) {
            addCriterion("major_name like", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotLike(String value) {
            addCriterion("major_name not like", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameIn(List<String> values) {
            addCriterion("major_name in", values, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotIn(List<String> values) {
            addCriterion("major_name not in", values, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameBetween(String value1, String value2) {
            addCriterion("major_name between", value1, value2, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotBetween(String value1, String value2) {
            addCriterion("major_name not between", value1, value2, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorProfileIsNull() {
            addCriterion("major_profile is null");
            return (Criteria) this;
        }

        public Criteria andMajorProfileIsNotNull() {
            addCriterion("major_profile is not null");
            return (Criteria) this;
        }

        public Criteria andMajorProfileEqualTo(String value) {
            addCriterion("major_profile =", value, "majorProfile");
            return (Criteria) this;
        }

        public Criteria andMajorProfileNotEqualTo(String value) {
            addCriterion("major_profile <>", value, "majorProfile");
            return (Criteria) this;
        }

        public Criteria andMajorProfileGreaterThan(String value) {
            addCriterion("major_profile >", value, "majorProfile");
            return (Criteria) this;
        }

        public Criteria andMajorProfileGreaterThanOrEqualTo(String value) {
            addCriterion("major_profile >=", value, "majorProfile");
            return (Criteria) this;
        }

        public Criteria andMajorProfileLessThan(String value) {
            addCriterion("major_profile <", value, "majorProfile");
            return (Criteria) this;
        }

        public Criteria andMajorProfileLessThanOrEqualTo(String value) {
            addCriterion("major_profile <=", value, "majorProfile");
            return (Criteria) this;
        }

        public Criteria andMajorProfileLike(String value) {
            addCriterion("major_profile like", value, "majorProfile");
            return (Criteria) this;
        }

        public Criteria andMajorProfileNotLike(String value) {
            addCriterion("major_profile not like", value, "majorProfile");
            return (Criteria) this;
        }

        public Criteria andMajorProfileIn(List<String> values) {
            addCriterion("major_profile in", values, "majorProfile");
            return (Criteria) this;
        }

        public Criteria andMajorProfileNotIn(List<String> values) {
            addCriterion("major_profile not in", values, "majorProfile");
            return (Criteria) this;
        }

        public Criteria andMajorProfileBetween(String value1, String value2) {
            addCriterion("major_profile between", value1, value2, "majorProfile");
            return (Criteria) this;
        }

        public Criteria andMajorProfileNotBetween(String value1, String value2) {
            addCriterion("major_profile not between", value1, value2, "majorProfile");
            return (Criteria) this;
        }

        public Criteria andMajorAddrIsNull() {
            addCriterion("major_addr is null");
            return (Criteria) this;
        }

        public Criteria andMajorAddrIsNotNull() {
            addCriterion("major_addr is not null");
            return (Criteria) this;
        }

        public Criteria andMajorAddrEqualTo(String value) {
            addCriterion("major_addr =", value, "majorAddr");
            return (Criteria) this;
        }

        public Criteria andMajorAddrNotEqualTo(String value) {
            addCriterion("major_addr <>", value, "majorAddr");
            return (Criteria) this;
        }

        public Criteria andMajorAddrGreaterThan(String value) {
            addCriterion("major_addr >", value, "majorAddr");
            return (Criteria) this;
        }

        public Criteria andMajorAddrGreaterThanOrEqualTo(String value) {
            addCriterion("major_addr >=", value, "majorAddr");
            return (Criteria) this;
        }

        public Criteria andMajorAddrLessThan(String value) {
            addCriterion("major_addr <", value, "majorAddr");
            return (Criteria) this;
        }

        public Criteria andMajorAddrLessThanOrEqualTo(String value) {
            addCriterion("major_addr <=", value, "majorAddr");
            return (Criteria) this;
        }

        public Criteria andMajorAddrLike(String value) {
            addCriterion("major_addr like", value, "majorAddr");
            return (Criteria) this;
        }

        public Criteria andMajorAddrNotLike(String value) {
            addCriterion("major_addr not like", value, "majorAddr");
            return (Criteria) this;
        }

        public Criteria andMajorAddrIn(List<String> values) {
            addCriterion("major_addr in", values, "majorAddr");
            return (Criteria) this;
        }

        public Criteria andMajorAddrNotIn(List<String> values) {
            addCriterion("major_addr not in", values, "majorAddr");
            return (Criteria) this;
        }

        public Criteria andMajorAddrBetween(String value1, String value2) {
            addCriterion("major_addr between", value1, value2, "majorAddr");
            return (Criteria) this;
        }

        public Criteria andMajorAddrNotBetween(String value1, String value2) {
            addCriterion("major_addr not between", value1, value2, "majorAddr");
            return (Criteria) this;
        }

        public Criteria andMajorTelIsNull() {
            addCriterion("major_tel is null");
            return (Criteria) this;
        }

        public Criteria andMajorTelIsNotNull() {
            addCriterion("major_tel is not null");
            return (Criteria) this;
        }

        public Criteria andMajorTelEqualTo(String value) {
            addCriterion("major_tel =", value, "majorTel");
            return (Criteria) this;
        }

        public Criteria andMajorTelNotEqualTo(String value) {
            addCriterion("major_tel <>", value, "majorTel");
            return (Criteria) this;
        }

        public Criteria andMajorTelGreaterThan(String value) {
            addCriterion("major_tel >", value, "majorTel");
            return (Criteria) this;
        }

        public Criteria andMajorTelGreaterThanOrEqualTo(String value) {
            addCriterion("major_tel >=", value, "majorTel");
            return (Criteria) this;
        }

        public Criteria andMajorTelLessThan(String value) {
            addCriterion("major_tel <", value, "majorTel");
            return (Criteria) this;
        }

        public Criteria andMajorTelLessThanOrEqualTo(String value) {
            addCriterion("major_tel <=", value, "majorTel");
            return (Criteria) this;
        }

        public Criteria andMajorTelLike(String value) {
            addCriterion("major_tel like", value, "majorTel");
            return (Criteria) this;
        }

        public Criteria andMajorTelNotLike(String value) {
            addCriterion("major_tel not like", value, "majorTel");
            return (Criteria) this;
        }

        public Criteria andMajorTelIn(List<String> values) {
            addCriterion("major_tel in", values, "majorTel");
            return (Criteria) this;
        }

        public Criteria andMajorTelNotIn(List<String> values) {
            addCriterion("major_tel not in", values, "majorTel");
            return (Criteria) this;
        }

        public Criteria andMajorTelBetween(String value1, String value2) {
            addCriterion("major_tel between", value1, value2, "majorTel");
            return (Criteria) this;
        }

        public Criteria andMajorTelNotBetween(String value1, String value2) {
            addCriterion("major_tel not between", value1, value2, "majorTel");
            return (Criteria) this;
        }

        public Criteria andMajorUrlIsNull() {
            addCriterion("major_url is null");
            return (Criteria) this;
        }

        public Criteria andMajorUrlIsNotNull() {
            addCriterion("major_url is not null");
            return (Criteria) this;
        }

        public Criteria andMajorUrlEqualTo(String value) {
            addCriterion("major_url =", value, "majorUrl");
            return (Criteria) this;
        }

        public Criteria andMajorUrlNotEqualTo(String value) {
            addCriterion("major_url <>", value, "majorUrl");
            return (Criteria) this;
        }

        public Criteria andMajorUrlGreaterThan(String value) {
            addCriterion("major_url >", value, "majorUrl");
            return (Criteria) this;
        }

        public Criteria andMajorUrlGreaterThanOrEqualTo(String value) {
            addCriterion("major_url >=", value, "majorUrl");
            return (Criteria) this;
        }

        public Criteria andMajorUrlLessThan(String value) {
            addCriterion("major_url <", value, "majorUrl");
            return (Criteria) this;
        }

        public Criteria andMajorUrlLessThanOrEqualTo(String value) {
            addCriterion("major_url <=", value, "majorUrl");
            return (Criteria) this;
        }

        public Criteria andMajorUrlLike(String value) {
            addCriterion("major_url like", value, "majorUrl");
            return (Criteria) this;
        }

        public Criteria andMajorUrlNotLike(String value) {
            addCriterion("major_url not like", value, "majorUrl");
            return (Criteria) this;
        }

        public Criteria andMajorUrlIn(List<String> values) {
            addCriterion("major_url in", values, "majorUrl");
            return (Criteria) this;
        }

        public Criteria andMajorUrlNotIn(List<String> values) {
            addCriterion("major_url not in", values, "majorUrl");
            return (Criteria) this;
        }

        public Criteria andMajorUrlBetween(String value1, String value2) {
            addCriterion("major_url between", value1, value2, "majorUrl");
            return (Criteria) this;
        }

        public Criteria andMajorUrlNotBetween(String value1, String value2) {
            addCriterion("major_url not between", value1, value2, "majorUrl");
            return (Criteria) this;
        }

        public Criteria andMajorLogoIsNull() {
            addCriterion("major_logo is null");
            return (Criteria) this;
        }

        public Criteria andMajorLogoIsNotNull() {
            addCriterion("major_logo is not null");
            return (Criteria) this;
        }

        public Criteria andMajorLogoEqualTo(String value) {
            addCriterion("major_logo =", value, "majorLogo");
            return (Criteria) this;
        }

        public Criteria andMajorLogoNotEqualTo(String value) {
            addCriterion("major_logo <>", value, "majorLogo");
            return (Criteria) this;
        }

        public Criteria andMajorLogoGreaterThan(String value) {
            addCriterion("major_logo >", value, "majorLogo");
            return (Criteria) this;
        }

        public Criteria andMajorLogoGreaterThanOrEqualTo(String value) {
            addCriterion("major_logo >=", value, "majorLogo");
            return (Criteria) this;
        }

        public Criteria andMajorLogoLessThan(String value) {
            addCriterion("major_logo <", value, "majorLogo");
            return (Criteria) this;
        }

        public Criteria andMajorLogoLessThanOrEqualTo(String value) {
            addCriterion("major_logo <=", value, "majorLogo");
            return (Criteria) this;
        }

        public Criteria andMajorLogoLike(String value) {
            addCriterion("major_logo like", value, "majorLogo");
            return (Criteria) this;
        }

        public Criteria andMajorLogoNotLike(String value) {
            addCriterion("major_logo not like", value, "majorLogo");
            return (Criteria) this;
        }

        public Criteria andMajorLogoIn(List<String> values) {
            addCriterion("major_logo in", values, "majorLogo");
            return (Criteria) this;
        }

        public Criteria andMajorLogoNotIn(List<String> values) {
            addCriterion("major_logo not in", values, "majorLogo");
            return (Criteria) this;
        }

        public Criteria andMajorLogoBetween(String value1, String value2) {
            addCriterion("major_logo between", value1, value2, "majorLogo");
            return (Criteria) this;
        }

        public Criteria andMajorLogoNotBetween(String value1, String value2) {
            addCriterion("major_logo not between", value1, value2, "majorLogo");
            return (Criteria) this;
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