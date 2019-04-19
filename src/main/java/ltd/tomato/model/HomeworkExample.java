package ltd.tomato.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HomeworkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HomeworkExample() {
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

        public Criteria andHomeworkIdIsNull() {
            addCriterion("homework_id is null");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdIsNotNull() {
            addCriterion("homework_id is not null");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdEqualTo(Integer value) {
            addCriterion("homework_id =", value, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdNotEqualTo(Integer value) {
            addCriterion("homework_id <>", value, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdGreaterThan(Integer value) {
            addCriterion("homework_id >", value, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("homework_id >=", value, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdLessThan(Integer value) {
            addCriterion("homework_id <", value, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdLessThanOrEqualTo(Integer value) {
            addCriterion("homework_id <=", value, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdIn(List<Integer> values) {
            addCriterion("homework_id in", values, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdNotIn(List<Integer> values) {
            addCriterion("homework_id not in", values, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdBetween(Integer value1, Integer value2) {
            addCriterion("homework_id between", value1, value2, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("homework_id not between", value1, value2, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andHomeworkContentIsNull() {
            addCriterion("homework_content is null");
            return (Criteria) this;
        }

        public Criteria andHomeworkContentIsNotNull() {
            addCriterion("homework_content is not null");
            return (Criteria) this;
        }

        public Criteria andHomeworkContentEqualTo(String value) {
            addCriterion("homework_content =", value, "homeworkContent");
            return (Criteria) this;
        }

        public Criteria andHomeworkContentNotEqualTo(String value) {
            addCriterion("homework_content <>", value, "homeworkContent");
            return (Criteria) this;
        }

        public Criteria andHomeworkContentGreaterThan(String value) {
            addCriterion("homework_content >", value, "homeworkContent");
            return (Criteria) this;
        }

        public Criteria andHomeworkContentGreaterThanOrEqualTo(String value) {
            addCriterion("homework_content >=", value, "homeworkContent");
            return (Criteria) this;
        }

        public Criteria andHomeworkContentLessThan(String value) {
            addCriterion("homework_content <", value, "homeworkContent");
            return (Criteria) this;
        }

        public Criteria andHomeworkContentLessThanOrEqualTo(String value) {
            addCriterion("homework_content <=", value, "homeworkContent");
            return (Criteria) this;
        }

        public Criteria andHomeworkContentLike(String value) {
            addCriterion("homework_content like", value, "homeworkContent");
            return (Criteria) this;
        }

        public Criteria andHomeworkContentNotLike(String value) {
            addCriterion("homework_content not like", value, "homeworkContent");
            return (Criteria) this;
        }

        public Criteria andHomeworkContentIn(List<String> values) {
            addCriterion("homework_content in", values, "homeworkContent");
            return (Criteria) this;
        }

        public Criteria andHomeworkContentNotIn(List<String> values) {
            addCriterion("homework_content not in", values, "homeworkContent");
            return (Criteria) this;
        }

        public Criteria andHomeworkContentBetween(String value1, String value2) {
            addCriterion("homework_content between", value1, value2, "homeworkContent");
            return (Criteria) this;
        }

        public Criteria andHomeworkContentNotBetween(String value1, String value2) {
            addCriterion("homework_content not between", value1, value2, "homeworkContent");
            return (Criteria) this;
        }

        public Criteria andHomeworkDateIsNull() {
            addCriterion("homework_date is null");
            return (Criteria) this;
        }

        public Criteria andHomeworkDateIsNotNull() {
            addCriterion("homework_date is not null");
            return (Criteria) this;
        }

        public Criteria andHomeworkDateEqualTo(Date value) {
            addCriterion("homework_date =", value, "homeworkDate");
            return (Criteria) this;
        }

        public Criteria andHomeworkDateNotEqualTo(Date value) {
            addCriterion("homework_date <>", value, "homeworkDate");
            return (Criteria) this;
        }

        public Criteria andHomeworkDateGreaterThan(Date value) {
            addCriterion("homework_date >", value, "homeworkDate");
            return (Criteria) this;
        }

        public Criteria andHomeworkDateGreaterThanOrEqualTo(Date value) {
            addCriterion("homework_date >=", value, "homeworkDate");
            return (Criteria) this;
        }

        public Criteria andHomeworkDateLessThan(Date value) {
            addCriterion("homework_date <", value, "homeworkDate");
            return (Criteria) this;
        }

        public Criteria andHomeworkDateLessThanOrEqualTo(Date value) {
            addCriterion("homework_date <=", value, "homeworkDate");
            return (Criteria) this;
        }

        public Criteria andHomeworkDateIn(List<Date> values) {
            addCriterion("homework_date in", values, "homeworkDate");
            return (Criteria) this;
        }

        public Criteria andHomeworkDateNotIn(List<Date> values) {
            addCriterion("homework_date not in", values, "homeworkDate");
            return (Criteria) this;
        }

        public Criteria andHomeworkDateBetween(Date value1, Date value2) {
            addCriterion("homework_date between", value1, value2, "homeworkDate");
            return (Criteria) this;
        }

        public Criteria andHomeworkDateNotBetween(Date value1, Date value2) {
            addCriterion("homework_date not between", value1, value2, "homeworkDate");
            return (Criteria) this;
        }

        public Criteria andTclassIdIsNull() {
            addCriterion("tclass_id is null");
            return (Criteria) this;
        }

        public Criteria andTclassIdIsNotNull() {
            addCriterion("tclass_id is not null");
            return (Criteria) this;
        }

        public Criteria andTclassIdEqualTo(Integer value) {
            addCriterion("tclass_id =", value, "tclassId");
            return (Criteria) this;
        }

        public Criteria andTclassIdNotEqualTo(Integer value) {
            addCriterion("tclass_id <>", value, "tclassId");
            return (Criteria) this;
        }

        public Criteria andTclassIdGreaterThan(Integer value) {
            addCriterion("tclass_id >", value, "tclassId");
            return (Criteria) this;
        }

        public Criteria andTclassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tclass_id >=", value, "tclassId");
            return (Criteria) this;
        }

        public Criteria andTclassIdLessThan(Integer value) {
            addCriterion("tclass_id <", value, "tclassId");
            return (Criteria) this;
        }

        public Criteria andTclassIdLessThanOrEqualTo(Integer value) {
            addCriterion("tclass_id <=", value, "tclassId");
            return (Criteria) this;
        }

        public Criteria andTclassIdIn(List<Integer> values) {
            addCriterion("tclass_id in", values, "tclassId");
            return (Criteria) this;
        }

        public Criteria andTclassIdNotIn(List<Integer> values) {
            addCriterion("tclass_id not in", values, "tclassId");
            return (Criteria) this;
        }

        public Criteria andTclassIdBetween(Integer value1, Integer value2) {
            addCriterion("tclass_id between", value1, value2, "tclassId");
            return (Criteria) this;
        }

        public Criteria andTclassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tclass_id not between", value1, value2, "tclassId");
            return (Criteria) this;
        }

        public Criteria andHomeworkAttachmentIsNull() {
            addCriterion("homework_attachment is null");
            return (Criteria) this;
        }

        public Criteria andHomeworkAttachmentIsNotNull() {
            addCriterion("homework_attachment is not null");
            return (Criteria) this;
        }

        public Criteria andHomeworkAttachmentEqualTo(String value) {
            addCriterion("homework_attachment =", value, "homeworkAttachment");
            return (Criteria) this;
        }

        public Criteria andHomeworkAttachmentNotEqualTo(String value) {
            addCriterion("homework_attachment <>", value, "homeworkAttachment");
            return (Criteria) this;
        }

        public Criteria andHomeworkAttachmentGreaterThan(String value) {
            addCriterion("homework_attachment >", value, "homeworkAttachment");
            return (Criteria) this;
        }

        public Criteria andHomeworkAttachmentGreaterThanOrEqualTo(String value) {
            addCriterion("homework_attachment >=", value, "homeworkAttachment");
            return (Criteria) this;
        }

        public Criteria andHomeworkAttachmentLessThan(String value) {
            addCriterion("homework_attachment <", value, "homeworkAttachment");
            return (Criteria) this;
        }

        public Criteria andHomeworkAttachmentLessThanOrEqualTo(String value) {
            addCriterion("homework_attachment <=", value, "homeworkAttachment");
            return (Criteria) this;
        }

        public Criteria andHomeworkAttachmentLike(String value) {
            addCriterion("homework_attachment like", value, "homeworkAttachment");
            return (Criteria) this;
        }

        public Criteria andHomeworkAttachmentNotLike(String value) {
            addCriterion("homework_attachment not like", value, "homeworkAttachment");
            return (Criteria) this;
        }

        public Criteria andHomeworkAttachmentIn(List<String> values) {
            addCriterion("homework_attachment in", values, "homeworkAttachment");
            return (Criteria) this;
        }

        public Criteria andHomeworkAttachmentNotIn(List<String> values) {
            addCriterion("homework_attachment not in", values, "homeworkAttachment");
            return (Criteria) this;
        }

        public Criteria andHomeworkAttachmentBetween(String value1, String value2) {
            addCriterion("homework_attachment between", value1, value2, "homeworkAttachment");
            return (Criteria) this;
        }

        public Criteria andHomeworkAttachmentNotBetween(String value1, String value2) {
            addCriterion("homework_attachment not between", value1, value2, "homeworkAttachment");
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