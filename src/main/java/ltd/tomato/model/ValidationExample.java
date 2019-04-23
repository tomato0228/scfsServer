package ltd.tomato.model;

import java.util.ArrayList;
import java.util.List;

public class ValidationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ValidationExample() {
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

        public Criteria andValidationIdIsNull() {
            addCriterion("validation_id is null");
            return (Criteria) this;
        }

        public Criteria andValidationIdIsNotNull() {
            addCriterion("validation_id is not null");
            return (Criteria) this;
        }

        public Criteria andValidationIdEqualTo(Integer value) {
            addCriterion("validation_id =", value, "validationId");
            return (Criteria) this;
        }

        public Criteria andValidationIdNotEqualTo(Integer value) {
            addCriterion("validation_id <>", value, "validationId");
            return (Criteria) this;
        }

        public Criteria andValidationIdGreaterThan(Integer value) {
            addCriterion("validation_id >", value, "validationId");
            return (Criteria) this;
        }

        public Criteria andValidationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("validation_id >=", value, "validationId");
            return (Criteria) this;
        }

        public Criteria andValidationIdLessThan(Integer value) {
            addCriterion("validation_id <", value, "validationId");
            return (Criteria) this;
        }

        public Criteria andValidationIdLessThanOrEqualTo(Integer value) {
            addCriterion("validation_id <=", value, "validationId");
            return (Criteria) this;
        }

        public Criteria andValidationIdIn(List<Integer> values) {
            addCriterion("validation_id in", values, "validationId");
            return (Criteria) this;
        }

        public Criteria andValidationIdNotIn(List<Integer> values) {
            addCriterion("validation_id not in", values, "validationId");
            return (Criteria) this;
        }

        public Criteria andValidationIdBetween(Integer value1, Integer value2) {
            addCriterion("validation_id between", value1, value2, "validationId");
            return (Criteria) this;
        }

        public Criteria andValidationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("validation_id not between", value1, value2, "validationId");
            return (Criteria) this;
        }

        public Criteria andValidationAccIsNull() {
            addCriterion("validation_acc is null");
            return (Criteria) this;
        }

        public Criteria andValidationAccIsNotNull() {
            addCriterion("validation_acc is not null");
            return (Criteria) this;
        }

        public Criteria andValidationAccEqualTo(String value) {
            addCriterion("validation_acc =", value, "validationAcc");
            return (Criteria) this;
        }

        public Criteria andValidationAccNotEqualTo(String value) {
            addCriterion("validation_acc <>", value, "validationAcc");
            return (Criteria) this;
        }

        public Criteria andValidationAccGreaterThan(String value) {
            addCriterion("validation_acc >", value, "validationAcc");
            return (Criteria) this;
        }

        public Criteria andValidationAccGreaterThanOrEqualTo(String value) {
            addCriterion("validation_acc >=", value, "validationAcc");
            return (Criteria) this;
        }

        public Criteria andValidationAccLessThan(String value) {
            addCriterion("validation_acc <", value, "validationAcc");
            return (Criteria) this;
        }

        public Criteria andValidationAccLessThanOrEqualTo(String value) {
            addCriterion("validation_acc <=", value, "validationAcc");
            return (Criteria) this;
        }

        public Criteria andValidationAccLike(String value) {
            addCriterion("validation_acc like", value, "validationAcc");
            return (Criteria) this;
        }

        public Criteria andValidationAccNotLike(String value) {
            addCriterion("validation_acc not like", value, "validationAcc");
            return (Criteria) this;
        }

        public Criteria andValidationAccIn(List<String> values) {
            addCriterion("validation_acc in", values, "validationAcc");
            return (Criteria) this;
        }

        public Criteria andValidationAccNotIn(List<String> values) {
            addCriterion("validation_acc not in", values, "validationAcc");
            return (Criteria) this;
        }

        public Criteria andValidationAccBetween(String value1, String value2) {
            addCriterion("validation_acc between", value1, value2, "validationAcc");
            return (Criteria) this;
        }

        public Criteria andValidationAccNotBetween(String value1, String value2) {
            addCriterion("validation_acc not between", value1, value2, "validationAcc");
            return (Criteria) this;
        }

        public Criteria andValidationCodeIsNull() {
            addCriterion("validation_code is null");
            return (Criteria) this;
        }

        public Criteria andValidationCodeIsNotNull() {
            addCriterion("validation_code is not null");
            return (Criteria) this;
        }

        public Criteria andValidationCodeEqualTo(String value) {
            addCriterion("validation_code =", value, "validationCode");
            return (Criteria) this;
        }

        public Criteria andValidationCodeNotEqualTo(String value) {
            addCriterion("validation_code <>", value, "validationCode");
            return (Criteria) this;
        }

        public Criteria andValidationCodeGreaterThan(String value) {
            addCriterion("validation_code >", value, "validationCode");
            return (Criteria) this;
        }

        public Criteria andValidationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("validation_code >=", value, "validationCode");
            return (Criteria) this;
        }

        public Criteria andValidationCodeLessThan(String value) {
            addCriterion("validation_code <", value, "validationCode");
            return (Criteria) this;
        }

        public Criteria andValidationCodeLessThanOrEqualTo(String value) {
            addCriterion("validation_code <=", value, "validationCode");
            return (Criteria) this;
        }

        public Criteria andValidationCodeLike(String value) {
            addCriterion("validation_code like", value, "validationCode");
            return (Criteria) this;
        }

        public Criteria andValidationCodeNotLike(String value) {
            addCriterion("validation_code not like", value, "validationCode");
            return (Criteria) this;
        }

        public Criteria andValidationCodeIn(List<String> values) {
            addCriterion("validation_code in", values, "validationCode");
            return (Criteria) this;
        }

        public Criteria andValidationCodeNotIn(List<String> values) {
            addCriterion("validation_code not in", values, "validationCode");
            return (Criteria) this;
        }

        public Criteria andValidationCodeBetween(String value1, String value2) {
            addCriterion("validation_code between", value1, value2, "validationCode");
            return (Criteria) this;
        }

        public Criteria andValidationCodeNotBetween(String value1, String value2) {
            addCriterion("validation_code not between", value1, value2, "validationCode");
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