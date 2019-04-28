package ltd.tomato.model;

import java.util.ArrayList;
import java.util.List;

public class ParentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ParentsExample() {
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

        public Criteria andParentsKeyIsNull() {
            addCriterion("parents_key is null");
            return (Criteria) this;
        }

        public Criteria andParentsKeyIsNotNull() {
            addCriterion("parents_key is not null");
            return (Criteria) this;
        }

        public Criteria andParentsKeyEqualTo(Integer value) {
            addCriterion("parents_key =", value, "parentsKey");
            return (Criteria) this;
        }

        public Criteria andParentsKeyNotEqualTo(Integer value) {
            addCriterion("parents_key <>", value, "parentsKey");
            return (Criteria) this;
        }

        public Criteria andParentsKeyGreaterThan(Integer value) {
            addCriterion("parents_key >", value, "parentsKey");
            return (Criteria) this;
        }

        public Criteria andParentsKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("parents_key >=", value, "parentsKey");
            return (Criteria) this;
        }

        public Criteria andParentsKeyLessThan(Integer value) {
            addCriterion("parents_key <", value, "parentsKey");
            return (Criteria) this;
        }

        public Criteria andParentsKeyLessThanOrEqualTo(Integer value) {
            addCriterion("parents_key <=", value, "parentsKey");
            return (Criteria) this;
        }

        public Criteria andParentsKeyIn(List<Integer> values) {
            addCriterion("parents_key in", values, "parentsKey");
            return (Criteria) this;
        }

        public Criteria andParentsKeyNotIn(List<Integer> values) {
            addCriterion("parents_key not in", values, "parentsKey");
            return (Criteria) this;
        }

        public Criteria andParentsKeyBetween(Integer value1, Integer value2) {
            addCriterion("parents_key between", value1, value2, "parentsKey");
            return (Criteria) this;
        }

        public Criteria andParentsKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("parents_key not between", value1, value2, "parentsKey");
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

        public Criteria andParentsRelationIsNull() {
            addCriterion("parents_relation is null");
            return (Criteria) this;
        }

        public Criteria andParentsRelationIsNotNull() {
            addCriterion("parents_relation is not null");
            return (Criteria) this;
        }

        public Criteria andParentsRelationEqualTo(String value) {
            addCriterion("parents_relation =", value, "parentsRelation");
            return (Criteria) this;
        }

        public Criteria andParentsRelationNotEqualTo(String value) {
            addCriterion("parents_relation <>", value, "parentsRelation");
            return (Criteria) this;
        }

        public Criteria andParentsRelationGreaterThan(String value) {
            addCriterion("parents_relation >", value, "parentsRelation");
            return (Criteria) this;
        }

        public Criteria andParentsRelationGreaterThanOrEqualTo(String value) {
            addCriterion("parents_relation >=", value, "parentsRelation");
            return (Criteria) this;
        }

        public Criteria andParentsRelationLessThan(String value) {
            addCriterion("parents_relation <", value, "parentsRelation");
            return (Criteria) this;
        }

        public Criteria andParentsRelationLessThanOrEqualTo(String value) {
            addCriterion("parents_relation <=", value, "parentsRelation");
            return (Criteria) this;
        }

        public Criteria andParentsRelationLike(String value) {
            addCriterion("parents_relation like", value, "parentsRelation");
            return (Criteria) this;
        }

        public Criteria andParentsRelationNotLike(String value) {
            addCriterion("parents_relation not like", value, "parentsRelation");
            return (Criteria) this;
        }

        public Criteria andParentsRelationIn(List<String> values) {
            addCriterion("parents_relation in", values, "parentsRelation");
            return (Criteria) this;
        }

        public Criteria andParentsRelationNotIn(List<String> values) {
            addCriterion("parents_relation not in", values, "parentsRelation");
            return (Criteria) this;
        }

        public Criteria andParentsRelationBetween(String value1, String value2) {
            addCriterion("parents_relation between", value1, value2, "parentsRelation");
            return (Criteria) this;
        }

        public Criteria andParentsRelationNotBetween(String value1, String value2) {
            addCriterion("parents_relation not between", value1, value2, "parentsRelation");
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