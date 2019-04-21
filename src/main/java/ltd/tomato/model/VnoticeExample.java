package ltd.tomato.model;

import java.util.ArrayList;
import java.util.List;

public class VnoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public VnoticeExample() {
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

        public Criteria andVnoticeIdIsNull() {
            addCriterion("vnotice_id is null");
            return (Criteria) this;
        }

        public Criteria andVnoticeIdIsNotNull() {
            addCriterion("vnotice_id is not null");
            return (Criteria) this;
        }

        public Criteria andVnoticeIdEqualTo(Integer value) {
            addCriterion("vnotice_id =", value, "vnoticeId");
            return (Criteria) this;
        }

        public Criteria andVnoticeIdNotEqualTo(Integer value) {
            addCriterion("vnotice_id <>", value, "vnoticeId");
            return (Criteria) this;
        }

        public Criteria andVnoticeIdGreaterThan(Integer value) {
            addCriterion("vnotice_id >", value, "vnoticeId");
            return (Criteria) this;
        }

        public Criteria andVnoticeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vnotice_id >=", value, "vnoticeId");
            return (Criteria) this;
        }

        public Criteria andVnoticeIdLessThan(Integer value) {
            addCriterion("vnotice_id <", value, "vnoticeId");
            return (Criteria) this;
        }

        public Criteria andVnoticeIdLessThanOrEqualTo(Integer value) {
            addCriterion("vnotice_id <=", value, "vnoticeId");
            return (Criteria) this;
        }

        public Criteria andVnoticeIdIn(List<Integer> values) {
            addCriterion("vnotice_id in", values, "vnoticeId");
            return (Criteria) this;
        }

        public Criteria andVnoticeIdNotIn(List<Integer> values) {
            addCriterion("vnotice_id not in", values, "vnoticeId");
            return (Criteria) this;
        }

        public Criteria andVnoticeIdBetween(Integer value1, Integer value2) {
            addCriterion("vnotice_id between", value1, value2, "vnoticeId");
            return (Criteria) this;
        }

        public Criteria andVnoticeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vnotice_id not between", value1, value2, "vnoticeId");
            return (Criteria) this;
        }

        public Criteria andVnoticeFlagIsNull() {
            addCriterion("vnotice_flag is null");
            return (Criteria) this;
        }

        public Criteria andVnoticeFlagIsNotNull() {
            addCriterion("vnotice_flag is not null");
            return (Criteria) this;
        }

        public Criteria andVnoticeFlagEqualTo(String value) {
            addCriterion("vnotice_flag =", value, "vnoticeFlag");
            return (Criteria) this;
        }

        public Criteria andVnoticeFlagNotEqualTo(String value) {
            addCriterion("vnotice_flag <>", value, "vnoticeFlag");
            return (Criteria) this;
        }

        public Criteria andVnoticeFlagGreaterThan(String value) {
            addCriterion("vnotice_flag >", value, "vnoticeFlag");
            return (Criteria) this;
        }

        public Criteria andVnoticeFlagGreaterThanOrEqualTo(String value) {
            addCriterion("vnotice_flag >=", value, "vnoticeFlag");
            return (Criteria) this;
        }

        public Criteria andVnoticeFlagLessThan(String value) {
            addCriterion("vnotice_flag <", value, "vnoticeFlag");
            return (Criteria) this;
        }

        public Criteria andVnoticeFlagLessThanOrEqualTo(String value) {
            addCriterion("vnotice_flag <=", value, "vnoticeFlag");
            return (Criteria) this;
        }

        public Criteria andVnoticeFlagLike(String value) {
            addCriterion("vnotice_flag like", value, "vnoticeFlag");
            return (Criteria) this;
        }

        public Criteria andVnoticeFlagNotLike(String value) {
            addCriterion("vnotice_flag not like", value, "vnoticeFlag");
            return (Criteria) this;
        }

        public Criteria andVnoticeFlagIn(List<String> values) {
            addCriterion("vnotice_flag in", values, "vnoticeFlag");
            return (Criteria) this;
        }

        public Criteria andVnoticeFlagNotIn(List<String> values) {
            addCriterion("vnotice_flag not in", values, "vnoticeFlag");
            return (Criteria) this;
        }

        public Criteria andVnoticeFlagBetween(String value1, String value2) {
            addCriterion("vnotice_flag between", value1, value2, "vnoticeFlag");
            return (Criteria) this;
        }

        public Criteria andVnoticeFlagNotBetween(String value1, String value2) {
            addCriterion("vnotice_flag not between", value1, value2, "vnoticeFlag");
            return (Criteria) this;
        }

        public Criteria andNoticeIdIsNull() {
            addCriterion("notice_id is null");
            return (Criteria) this;
        }

        public Criteria andNoticeIdIsNotNull() {
            addCriterion("notice_id is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeIdEqualTo(Integer value) {
            addCriterion("notice_id =", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotEqualTo(Integer value) {
            addCriterion("notice_id <>", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdGreaterThan(Integer value) {
            addCriterion("notice_id >", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("notice_id >=", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdLessThan(Integer value) {
            addCriterion("notice_id <", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdLessThanOrEqualTo(Integer value) {
            addCriterion("notice_id <=", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdIn(List<Integer> values) {
            addCriterion("notice_id in", values, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotIn(List<Integer> values) {
            addCriterion("notice_id not in", values, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdBetween(Integer value1, Integer value2) {
            addCriterion("notice_id between", value1, value2, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("notice_id not between", value1, value2, "noticeId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andParentsIdIsNull() {
            addCriterion("parents_id is null");
            return (Criteria) this;
        }

        public Criteria andParentsIdIsNotNull() {
            addCriterion("parents_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentsIdEqualTo(Integer value) {
            addCriterion("parents_id =", value, "parentsId");
            return (Criteria) this;
        }

        public Criteria andParentsIdNotEqualTo(Integer value) {
            addCriterion("parents_id <>", value, "parentsId");
            return (Criteria) this;
        }

        public Criteria andParentsIdGreaterThan(Integer value) {
            addCriterion("parents_id >", value, "parentsId");
            return (Criteria) this;
        }

        public Criteria andParentsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parents_id >=", value, "parentsId");
            return (Criteria) this;
        }

        public Criteria andParentsIdLessThan(Integer value) {
            addCriterion("parents_id <", value, "parentsId");
            return (Criteria) this;
        }

        public Criteria andParentsIdLessThanOrEqualTo(Integer value) {
            addCriterion("parents_id <=", value, "parentsId");
            return (Criteria) this;
        }

        public Criteria andParentsIdIn(List<Integer> values) {
            addCriterion("parents_id in", values, "parentsId");
            return (Criteria) this;
        }

        public Criteria andParentsIdNotIn(List<Integer> values) {
            addCriterion("parents_id not in", values, "parentsId");
            return (Criteria) this;
        }

        public Criteria andParentsIdBetween(Integer value1, Integer value2) {
            addCriterion("parents_id between", value1, value2, "parentsId");
            return (Criteria) this;
        }

        public Criteria andParentsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parents_id not between", value1, value2, "parentsId");
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