package ltd.tomato.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ChatExample() {
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

        public Criteria andChatIdIsNull() {
            addCriterion("chat_id is null");
            return (Criteria) this;
        }

        public Criteria andChatIdIsNotNull() {
            addCriterion("chat_id is not null");
            return (Criteria) this;
        }

        public Criteria andChatIdEqualTo(Integer value) {
            addCriterion("chat_id =", value, "chatId");
            return (Criteria) this;
        }

        public Criteria andChatIdNotEqualTo(Integer value) {
            addCriterion("chat_id <>", value, "chatId");
            return (Criteria) this;
        }

        public Criteria andChatIdGreaterThan(Integer value) {
            addCriterion("chat_id >", value, "chatId");
            return (Criteria) this;
        }

        public Criteria andChatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("chat_id >=", value, "chatId");
            return (Criteria) this;
        }

        public Criteria andChatIdLessThan(Integer value) {
            addCriterion("chat_id <", value, "chatId");
            return (Criteria) this;
        }

        public Criteria andChatIdLessThanOrEqualTo(Integer value) {
            addCriterion("chat_id <=", value, "chatId");
            return (Criteria) this;
        }

        public Criteria andChatIdIn(List<Integer> values) {
            addCriterion("chat_id in", values, "chatId");
            return (Criteria) this;
        }

        public Criteria andChatIdNotIn(List<Integer> values) {
            addCriterion("chat_id not in", values, "chatId");
            return (Criteria) this;
        }

        public Criteria andChatIdBetween(Integer value1, Integer value2) {
            addCriterion("chat_id between", value1, value2, "chatId");
            return (Criteria) this;
        }

        public Criteria andChatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("chat_id not between", value1, value2, "chatId");
            return (Criteria) this;
        }

        public Criteria andChatDateIsNull() {
            addCriterion("chat_date is null");
            return (Criteria) this;
        }

        public Criteria andChatDateIsNotNull() {
            addCriterion("chat_date is not null");
            return (Criteria) this;
        }

        public Criteria andChatDateEqualTo(Date value) {
            addCriterion("chat_date =", value, "chatDate");
            return (Criteria) this;
        }

        public Criteria andChatDateNotEqualTo(Date value) {
            addCriterion("chat_date <>", value, "chatDate");
            return (Criteria) this;
        }

        public Criteria andChatDateGreaterThan(Date value) {
            addCriterion("chat_date >", value, "chatDate");
            return (Criteria) this;
        }

        public Criteria andChatDateGreaterThanOrEqualTo(Date value) {
            addCriterion("chat_date >=", value, "chatDate");
            return (Criteria) this;
        }

        public Criteria andChatDateLessThan(Date value) {
            addCriterion("chat_date <", value, "chatDate");
            return (Criteria) this;
        }

        public Criteria andChatDateLessThanOrEqualTo(Date value) {
            addCriterion("chat_date <=", value, "chatDate");
            return (Criteria) this;
        }

        public Criteria andChatDateIn(List<Date> values) {
            addCriterion("chat_date in", values, "chatDate");
            return (Criteria) this;
        }

        public Criteria andChatDateNotIn(List<Date> values) {
            addCriterion("chat_date not in", values, "chatDate");
            return (Criteria) this;
        }

        public Criteria andChatDateBetween(Date value1, Date value2) {
            addCriterion("chat_date between", value1, value2, "chatDate");
            return (Criteria) this;
        }

        public Criteria andChatDateNotBetween(Date value1, Date value2) {
            addCriterion("chat_date not between", value1, value2, "chatDate");
            return (Criteria) this;
        }

        public Criteria andChatContentIsNull() {
            addCriterion("chat_content is null");
            return (Criteria) this;
        }

        public Criteria andChatContentIsNotNull() {
            addCriterion("chat_content is not null");
            return (Criteria) this;
        }

        public Criteria andChatContentEqualTo(String value) {
            addCriterion("chat_content =", value, "chatContent");
            return (Criteria) this;
        }

        public Criteria andChatContentNotEqualTo(String value) {
            addCriterion("chat_content <>", value, "chatContent");
            return (Criteria) this;
        }

        public Criteria andChatContentGreaterThan(String value) {
            addCriterion("chat_content >", value, "chatContent");
            return (Criteria) this;
        }

        public Criteria andChatContentGreaterThanOrEqualTo(String value) {
            addCriterion("chat_content >=", value, "chatContent");
            return (Criteria) this;
        }

        public Criteria andChatContentLessThan(String value) {
            addCriterion("chat_content <", value, "chatContent");
            return (Criteria) this;
        }

        public Criteria andChatContentLessThanOrEqualTo(String value) {
            addCriterion("chat_content <=", value, "chatContent");
            return (Criteria) this;
        }

        public Criteria andChatContentLike(String value) {
            addCriterion("chat_content like", value, "chatContent");
            return (Criteria) this;
        }

        public Criteria andChatContentNotLike(String value) {
            addCriterion("chat_content not like", value, "chatContent");
            return (Criteria) this;
        }

        public Criteria andChatContentIn(List<String> values) {
            addCriterion("chat_content in", values, "chatContent");
            return (Criteria) this;
        }

        public Criteria andChatContentNotIn(List<String> values) {
            addCriterion("chat_content not in", values, "chatContent");
            return (Criteria) this;
        }

        public Criteria andChatContentBetween(String value1, String value2) {
            addCriterion("chat_content between", value1, value2, "chatContent");
            return (Criteria) this;
        }

        public Criteria andChatContentNotBetween(String value1, String value2) {
            addCriterion("chat_content not between", value1, value2, "chatContent");
            return (Criteria) this;
        }

        public Criteria andChatTypeIsNull() {
            addCriterion("chat_type is null");
            return (Criteria) this;
        }

        public Criteria andChatTypeIsNotNull() {
            addCriterion("chat_type is not null");
            return (Criteria) this;
        }

        public Criteria andChatTypeEqualTo(Integer value) {
            addCriterion("chat_type =", value, "chatType");
            return (Criteria) this;
        }

        public Criteria andChatTypeNotEqualTo(Integer value) {
            addCriterion("chat_type <>", value, "chatType");
            return (Criteria) this;
        }

        public Criteria andChatTypeGreaterThan(Integer value) {
            addCriterion("chat_type >", value, "chatType");
            return (Criteria) this;
        }

        public Criteria andChatTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("chat_type >=", value, "chatType");
            return (Criteria) this;
        }

        public Criteria andChatTypeLessThan(Integer value) {
            addCriterion("chat_type <", value, "chatType");
            return (Criteria) this;
        }

        public Criteria andChatTypeLessThanOrEqualTo(Integer value) {
            addCriterion("chat_type <=", value, "chatType");
            return (Criteria) this;
        }

        public Criteria andChatTypeIn(List<Integer> values) {
            addCriterion("chat_type in", values, "chatType");
            return (Criteria) this;
        }

        public Criteria andChatTypeNotIn(List<Integer> values) {
            addCriterion("chat_type not in", values, "chatType");
            return (Criteria) this;
        }

        public Criteria andChatTypeBetween(Integer value1, Integer value2) {
            addCriterion("chat_type between", value1, value2, "chatType");
            return (Criteria) this;
        }

        public Criteria andChatTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("chat_type not between", value1, value2, "chatType");
            return (Criteria) this;
        }

        public Criteria andSendIdIsNull() {
            addCriterion("send_id is null");
            return (Criteria) this;
        }

        public Criteria andSendIdIsNotNull() {
            addCriterion("send_id is not null");
            return (Criteria) this;
        }

        public Criteria andSendIdEqualTo(Integer value) {
            addCriterion("send_id =", value, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdNotEqualTo(Integer value) {
            addCriterion("send_id <>", value, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdGreaterThan(Integer value) {
            addCriterion("send_id >", value, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_id >=", value, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdLessThan(Integer value) {
            addCriterion("send_id <", value, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdLessThanOrEqualTo(Integer value) {
            addCriterion("send_id <=", value, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdIn(List<Integer> values) {
            addCriterion("send_id in", values, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdNotIn(List<Integer> values) {
            addCriterion("send_id not in", values, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdBetween(Integer value1, Integer value2) {
            addCriterion("send_id between", value1, value2, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdNotBetween(Integer value1, Integer value2) {
            addCriterion("send_id not between", value1, value2, "sendId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdIsNull() {
            addCriterion("receive_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiveIdIsNotNull() {
            addCriterion("receive_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveIdEqualTo(Integer value) {
            addCriterion("receive_id =", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdNotEqualTo(Integer value) {
            addCriterion("receive_id <>", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdGreaterThan(Integer value) {
            addCriterion("receive_id >", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_id >=", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdLessThan(Integer value) {
            addCriterion("receive_id <", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdLessThanOrEqualTo(Integer value) {
            addCriterion("receive_id <=", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdIn(List<Integer> values) {
            addCriterion("receive_id in", values, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdNotIn(List<Integer> values) {
            addCriterion("receive_id not in", values, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdBetween(Integer value1, Integer value2) {
            addCriterion("receive_id between", value1, value2, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_id not between", value1, value2, "receiveId");
            return (Criteria) this;
        }

        public Criteria andChatMesgIsNull() {
            addCriterion("chat_mesg is null");
            return (Criteria) this;
        }

        public Criteria andChatMesgIsNotNull() {
            addCriterion("chat_mesg is not null");
            return (Criteria) this;
        }

        public Criteria andChatMesgEqualTo(Integer value) {
            addCriterion("chat_mesg =", value, "chatMesg");
            return (Criteria) this;
        }

        public Criteria andChatMesgNotEqualTo(Integer value) {
            addCriterion("chat_mesg <>", value, "chatMesg");
            return (Criteria) this;
        }

        public Criteria andChatMesgGreaterThan(Integer value) {
            addCriterion("chat_mesg >", value, "chatMesg");
            return (Criteria) this;
        }

        public Criteria andChatMesgGreaterThanOrEqualTo(Integer value) {
            addCriterion("chat_mesg >=", value, "chatMesg");
            return (Criteria) this;
        }

        public Criteria andChatMesgLessThan(Integer value) {
            addCriterion("chat_mesg <", value, "chatMesg");
            return (Criteria) this;
        }

        public Criteria andChatMesgLessThanOrEqualTo(Integer value) {
            addCriterion("chat_mesg <=", value, "chatMesg");
            return (Criteria) this;
        }

        public Criteria andChatMesgIn(List<Integer> values) {
            addCriterion("chat_mesg in", values, "chatMesg");
            return (Criteria) this;
        }

        public Criteria andChatMesgNotIn(List<Integer> values) {
            addCriterion("chat_mesg not in", values, "chatMesg");
            return (Criteria) this;
        }

        public Criteria andChatMesgBetween(Integer value1, Integer value2) {
            addCriterion("chat_mesg between", value1, value2, "chatMesg");
            return (Criteria) this;
        }

        public Criteria andChatMesgNotBetween(Integer value1, Integer value2) {
            addCriterion("chat_mesg not between", value1, value2, "chatMesg");
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