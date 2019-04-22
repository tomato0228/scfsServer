package ltd.tomato.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ChatViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ChatViewExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andSendNameIsNull() {
            addCriterion("send_name is null");
            return (Criteria) this;
        }

        public Criteria andSendNameIsNotNull() {
            addCriterion("send_name is not null");
            return (Criteria) this;
        }

        public Criteria andSendNameEqualTo(String value) {
            addCriterion("send_name =", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameNotEqualTo(String value) {
            addCriterion("send_name <>", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameGreaterThan(String value) {
            addCriterion("send_name >", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameGreaterThanOrEqualTo(String value) {
            addCriterion("send_name >=", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameLessThan(String value) {
            addCriterion("send_name <", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameLessThanOrEqualTo(String value) {
            addCriterion("send_name <=", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameLike(String value) {
            addCriterion("send_name like", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameNotLike(String value) {
            addCriterion("send_name not like", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameIn(List<String> values) {
            addCriterion("send_name in", values, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameNotIn(List<String> values) {
            addCriterion("send_name not in", values, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameBetween(String value1, String value2) {
            addCriterion("send_name between", value1, value2, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameNotBetween(String value1, String value2) {
            addCriterion("send_name not between", value1, value2, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendSexIsNull() {
            addCriterion("send_sex is null");
            return (Criteria) this;
        }

        public Criteria andSendSexIsNotNull() {
            addCriterion("send_sex is not null");
            return (Criteria) this;
        }

        public Criteria andSendSexEqualTo(String value) {
            addCriterion("send_sex =", value, "sendSex");
            return (Criteria) this;
        }

        public Criteria andSendSexNotEqualTo(String value) {
            addCriterion("send_sex <>", value, "sendSex");
            return (Criteria) this;
        }

        public Criteria andSendSexGreaterThan(String value) {
            addCriterion("send_sex >", value, "sendSex");
            return (Criteria) this;
        }

        public Criteria andSendSexGreaterThanOrEqualTo(String value) {
            addCriterion("send_sex >=", value, "sendSex");
            return (Criteria) this;
        }

        public Criteria andSendSexLessThan(String value) {
            addCriterion("send_sex <", value, "sendSex");
            return (Criteria) this;
        }

        public Criteria andSendSexLessThanOrEqualTo(String value) {
            addCriterion("send_sex <=", value, "sendSex");
            return (Criteria) this;
        }

        public Criteria andSendSexLike(String value) {
            addCriterion("send_sex like", value, "sendSex");
            return (Criteria) this;
        }

        public Criteria andSendSexNotLike(String value) {
            addCriterion("send_sex not like", value, "sendSex");
            return (Criteria) this;
        }

        public Criteria andSendSexIn(List<String> values) {
            addCriterion("send_sex in", values, "sendSex");
            return (Criteria) this;
        }

        public Criteria andSendSexNotIn(List<String> values) {
            addCriterion("send_sex not in", values, "sendSex");
            return (Criteria) this;
        }

        public Criteria andSendSexBetween(String value1, String value2) {
            addCriterion("send_sex between", value1, value2, "sendSex");
            return (Criteria) this;
        }

        public Criteria andSendSexNotBetween(String value1, String value2) {
            addCriterion("send_sex not between", value1, value2, "sendSex");
            return (Criteria) this;
        }

        public Criteria andSendBirthIsNull() {
            addCriterion("send_birth is null");
            return (Criteria) this;
        }

        public Criteria andSendBirthIsNotNull() {
            addCriterion("send_birth is not null");
            return (Criteria) this;
        }

        public Criteria andSendBirthEqualTo(Date value) {
            addCriterionForJDBCDate("send_birth =", value, "sendBirth");
            return (Criteria) this;
        }

        public Criteria andSendBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("send_birth <>", value, "sendBirth");
            return (Criteria) this;
        }

        public Criteria andSendBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("send_birth >", value, "sendBirth");
            return (Criteria) this;
        }

        public Criteria andSendBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("send_birth >=", value, "sendBirth");
            return (Criteria) this;
        }

        public Criteria andSendBirthLessThan(Date value) {
            addCriterionForJDBCDate("send_birth <", value, "sendBirth");
            return (Criteria) this;
        }

        public Criteria andSendBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("send_birth <=", value, "sendBirth");
            return (Criteria) this;
        }

        public Criteria andSendBirthIn(List<Date> values) {
            addCriterionForJDBCDate("send_birth in", values, "sendBirth");
            return (Criteria) this;
        }

        public Criteria andSendBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("send_birth not in", values, "sendBirth");
            return (Criteria) this;
        }

        public Criteria andSendBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("send_birth between", value1, value2, "sendBirth");
            return (Criteria) this;
        }

        public Criteria andSendBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("send_birth not between", value1, value2, "sendBirth");
            return (Criteria) this;
        }

        public Criteria andSendTelIsNull() {
            addCriterion("send_tel is null");
            return (Criteria) this;
        }

        public Criteria andSendTelIsNotNull() {
            addCriterion("send_tel is not null");
            return (Criteria) this;
        }

        public Criteria andSendTelEqualTo(String value) {
            addCriterion("send_tel =", value, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelNotEqualTo(String value) {
            addCriterion("send_tel <>", value, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelGreaterThan(String value) {
            addCriterion("send_tel >", value, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelGreaterThanOrEqualTo(String value) {
            addCriterion("send_tel >=", value, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelLessThan(String value) {
            addCriterion("send_tel <", value, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelLessThanOrEqualTo(String value) {
            addCriterion("send_tel <=", value, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelLike(String value) {
            addCriterion("send_tel like", value, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelNotLike(String value) {
            addCriterion("send_tel not like", value, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelIn(List<String> values) {
            addCriterion("send_tel in", values, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelNotIn(List<String> values) {
            addCriterion("send_tel not in", values, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelBetween(String value1, String value2) {
            addCriterion("send_tel between", value1, value2, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelNotBetween(String value1, String value2) {
            addCriterion("send_tel not between", value1, value2, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendAddrIsNull() {
            addCriterion("send_addr is null");
            return (Criteria) this;
        }

        public Criteria andSendAddrIsNotNull() {
            addCriterion("send_addr is not null");
            return (Criteria) this;
        }

        public Criteria andSendAddrEqualTo(String value) {
            addCriterion("send_addr =", value, "sendAddr");
            return (Criteria) this;
        }

        public Criteria andSendAddrNotEqualTo(String value) {
            addCriterion("send_addr <>", value, "sendAddr");
            return (Criteria) this;
        }

        public Criteria andSendAddrGreaterThan(String value) {
            addCriterion("send_addr >", value, "sendAddr");
            return (Criteria) this;
        }

        public Criteria andSendAddrGreaterThanOrEqualTo(String value) {
            addCriterion("send_addr >=", value, "sendAddr");
            return (Criteria) this;
        }

        public Criteria andSendAddrLessThan(String value) {
            addCriterion("send_addr <", value, "sendAddr");
            return (Criteria) this;
        }

        public Criteria andSendAddrLessThanOrEqualTo(String value) {
            addCriterion("send_addr <=", value, "sendAddr");
            return (Criteria) this;
        }

        public Criteria andSendAddrLike(String value) {
            addCriterion("send_addr like", value, "sendAddr");
            return (Criteria) this;
        }

        public Criteria andSendAddrNotLike(String value) {
            addCriterion("send_addr not like", value, "sendAddr");
            return (Criteria) this;
        }

        public Criteria andSendAddrIn(List<String> values) {
            addCriterion("send_addr in", values, "sendAddr");
            return (Criteria) this;
        }

        public Criteria andSendAddrNotIn(List<String> values) {
            addCriterion("send_addr not in", values, "sendAddr");
            return (Criteria) this;
        }

        public Criteria andSendAddrBetween(String value1, String value2) {
            addCriterion("send_addr between", value1, value2, "sendAddr");
            return (Criteria) this;
        }

        public Criteria andSendAddrNotBetween(String value1, String value2) {
            addCriterion("send_addr not between", value1, value2, "sendAddr");
            return (Criteria) this;
        }

        public Criteria andSendTypeIsNull() {
            addCriterion("send_type is null");
            return (Criteria) this;
        }

        public Criteria andSendTypeIsNotNull() {
            addCriterion("send_type is not null");
            return (Criteria) this;
        }

        public Criteria andSendTypeEqualTo(String value) {
            addCriterion("send_type =", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotEqualTo(String value) {
            addCriterion("send_type <>", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeGreaterThan(String value) {
            addCriterion("send_type >", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeGreaterThanOrEqualTo(String value) {
            addCriterion("send_type >=", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeLessThan(String value) {
            addCriterion("send_type <", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeLessThanOrEqualTo(String value) {
            addCriterion("send_type <=", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeLike(String value) {
            addCriterion("send_type like", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotLike(String value) {
            addCriterion("send_type not like", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeIn(List<String> values) {
            addCriterion("send_type in", values, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotIn(List<String> values) {
            addCriterion("send_type not in", values, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeBetween(String value1, String value2) {
            addCriterion("send_type between", value1, value2, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotBetween(String value1, String value2) {
            addCriterion("send_type not between", value1, value2, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendEmailIsNull() {
            addCriterion("send_email is null");
            return (Criteria) this;
        }

        public Criteria andSendEmailIsNotNull() {
            addCriterion("send_email is not null");
            return (Criteria) this;
        }

        public Criteria andSendEmailEqualTo(String value) {
            addCriterion("send_email =", value, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailNotEqualTo(String value) {
            addCriterion("send_email <>", value, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailGreaterThan(String value) {
            addCriterion("send_email >", value, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailGreaterThanOrEqualTo(String value) {
            addCriterion("send_email >=", value, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailLessThan(String value) {
            addCriterion("send_email <", value, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailLessThanOrEqualTo(String value) {
            addCriterion("send_email <=", value, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailLike(String value) {
            addCriterion("send_email like", value, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailNotLike(String value) {
            addCriterion("send_email not like", value, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailIn(List<String> values) {
            addCriterion("send_email in", values, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailNotIn(List<String> values) {
            addCriterion("send_email not in", values, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailBetween(String value1, String value2) {
            addCriterion("send_email between", value1, value2, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailNotBetween(String value1, String value2) {
            addCriterion("send_email not between", value1, value2, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendProfileIsNull() {
            addCriterion("send_profile is null");
            return (Criteria) this;
        }

        public Criteria andSendProfileIsNotNull() {
            addCriterion("send_profile is not null");
            return (Criteria) this;
        }

        public Criteria andSendProfileEqualTo(String value) {
            addCriterion("send_profile =", value, "sendProfile");
            return (Criteria) this;
        }

        public Criteria andSendProfileNotEqualTo(String value) {
            addCriterion("send_profile <>", value, "sendProfile");
            return (Criteria) this;
        }

        public Criteria andSendProfileGreaterThan(String value) {
            addCriterion("send_profile >", value, "sendProfile");
            return (Criteria) this;
        }

        public Criteria andSendProfileGreaterThanOrEqualTo(String value) {
            addCriterion("send_profile >=", value, "sendProfile");
            return (Criteria) this;
        }

        public Criteria andSendProfileLessThan(String value) {
            addCriterion("send_profile <", value, "sendProfile");
            return (Criteria) this;
        }

        public Criteria andSendProfileLessThanOrEqualTo(String value) {
            addCriterion("send_profile <=", value, "sendProfile");
            return (Criteria) this;
        }

        public Criteria andSendProfileLike(String value) {
            addCriterion("send_profile like", value, "sendProfile");
            return (Criteria) this;
        }

        public Criteria andSendProfileNotLike(String value) {
            addCriterion("send_profile not like", value, "sendProfile");
            return (Criteria) this;
        }

        public Criteria andSendProfileIn(List<String> values) {
            addCriterion("send_profile in", values, "sendProfile");
            return (Criteria) this;
        }

        public Criteria andSendProfileNotIn(List<String> values) {
            addCriterion("send_profile not in", values, "sendProfile");
            return (Criteria) this;
        }

        public Criteria andSendProfileBetween(String value1, String value2) {
            addCriterion("send_profile between", value1, value2, "sendProfile");
            return (Criteria) this;
        }

        public Criteria andSendProfileNotBetween(String value1, String value2) {
            addCriterion("send_profile not between", value1, value2, "sendProfile");
            return (Criteria) this;
        }

        public Criteria andSendSignatureIsNull() {
            addCriterion("send_signature is null");
            return (Criteria) this;
        }

        public Criteria andSendSignatureIsNotNull() {
            addCriterion("send_signature is not null");
            return (Criteria) this;
        }

        public Criteria andSendSignatureEqualTo(String value) {
            addCriterion("send_signature =", value, "sendSignature");
            return (Criteria) this;
        }

        public Criteria andSendSignatureNotEqualTo(String value) {
            addCriterion("send_signature <>", value, "sendSignature");
            return (Criteria) this;
        }

        public Criteria andSendSignatureGreaterThan(String value) {
            addCriterion("send_signature >", value, "sendSignature");
            return (Criteria) this;
        }

        public Criteria andSendSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("send_signature >=", value, "sendSignature");
            return (Criteria) this;
        }

        public Criteria andSendSignatureLessThan(String value) {
            addCriterion("send_signature <", value, "sendSignature");
            return (Criteria) this;
        }

        public Criteria andSendSignatureLessThanOrEqualTo(String value) {
            addCriterion("send_signature <=", value, "sendSignature");
            return (Criteria) this;
        }

        public Criteria andSendSignatureLike(String value) {
            addCriterion("send_signature like", value, "sendSignature");
            return (Criteria) this;
        }

        public Criteria andSendSignatureNotLike(String value) {
            addCriterion("send_signature not like", value, "sendSignature");
            return (Criteria) this;
        }

        public Criteria andSendSignatureIn(List<String> values) {
            addCriterion("send_signature in", values, "sendSignature");
            return (Criteria) this;
        }

        public Criteria andSendSignatureNotIn(List<String> values) {
            addCriterion("send_signature not in", values, "sendSignature");
            return (Criteria) this;
        }

        public Criteria andSendSignatureBetween(String value1, String value2) {
            addCriterion("send_signature between", value1, value2, "sendSignature");
            return (Criteria) this;
        }

        public Criteria andSendSignatureNotBetween(String value1, String value2) {
            addCriterion("send_signature not between", value1, value2, "sendSignature");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIsNull() {
            addCriterion("receive_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIsNotNull() {
            addCriterion("receive_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveNameEqualTo(String value) {
            addCriterion("receive_name =", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotEqualTo(String value) {
            addCriterion("receive_name <>", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameGreaterThan(String value) {
            addCriterion("receive_name >", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameGreaterThanOrEqualTo(String value) {
            addCriterion("receive_name >=", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLessThan(String value) {
            addCriterion("receive_name <", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLessThanOrEqualTo(String value) {
            addCriterion("receive_name <=", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLike(String value) {
            addCriterion("receive_name like", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotLike(String value) {
            addCriterion("receive_name not like", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIn(List<String> values) {
            addCriterion("receive_name in", values, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotIn(List<String> values) {
            addCriterion("receive_name not in", values, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameBetween(String value1, String value2) {
            addCriterion("receive_name between", value1, value2, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotBetween(String value1, String value2) {
            addCriterion("receive_name not between", value1, value2, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveSexIsNull() {
            addCriterion("receive_sex is null");
            return (Criteria) this;
        }

        public Criteria andReceiveSexIsNotNull() {
            addCriterion("receive_sex is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveSexEqualTo(String value) {
            addCriterion("receive_sex =", value, "receiveSex");
            return (Criteria) this;
        }

        public Criteria andReceiveSexNotEqualTo(String value) {
            addCriterion("receive_sex <>", value, "receiveSex");
            return (Criteria) this;
        }

        public Criteria andReceiveSexGreaterThan(String value) {
            addCriterion("receive_sex >", value, "receiveSex");
            return (Criteria) this;
        }

        public Criteria andReceiveSexGreaterThanOrEqualTo(String value) {
            addCriterion("receive_sex >=", value, "receiveSex");
            return (Criteria) this;
        }

        public Criteria andReceiveSexLessThan(String value) {
            addCriterion("receive_sex <", value, "receiveSex");
            return (Criteria) this;
        }

        public Criteria andReceiveSexLessThanOrEqualTo(String value) {
            addCriterion("receive_sex <=", value, "receiveSex");
            return (Criteria) this;
        }

        public Criteria andReceiveSexLike(String value) {
            addCriterion("receive_sex like", value, "receiveSex");
            return (Criteria) this;
        }

        public Criteria andReceiveSexNotLike(String value) {
            addCriterion("receive_sex not like", value, "receiveSex");
            return (Criteria) this;
        }

        public Criteria andReceiveSexIn(List<String> values) {
            addCriterion("receive_sex in", values, "receiveSex");
            return (Criteria) this;
        }

        public Criteria andReceiveSexNotIn(List<String> values) {
            addCriterion("receive_sex not in", values, "receiveSex");
            return (Criteria) this;
        }

        public Criteria andReceiveSexBetween(String value1, String value2) {
            addCriterion("receive_sex between", value1, value2, "receiveSex");
            return (Criteria) this;
        }

        public Criteria andReceiveSexNotBetween(String value1, String value2) {
            addCriterion("receive_sex not between", value1, value2, "receiveSex");
            return (Criteria) this;
        }

        public Criteria andReceiveBirthIsNull() {
            addCriterion("receive_birth is null");
            return (Criteria) this;
        }

        public Criteria andReceiveBirthIsNotNull() {
            addCriterion("receive_birth is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveBirthEqualTo(Date value) {
            addCriterionForJDBCDate("receive_birth =", value, "receiveBirth");
            return (Criteria) this;
        }

        public Criteria andReceiveBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("receive_birth <>", value, "receiveBirth");
            return (Criteria) this;
        }

        public Criteria andReceiveBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("receive_birth >", value, "receiveBirth");
            return (Criteria) this;
        }

        public Criteria andReceiveBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("receive_birth >=", value, "receiveBirth");
            return (Criteria) this;
        }

        public Criteria andReceiveBirthLessThan(Date value) {
            addCriterionForJDBCDate("receive_birth <", value, "receiveBirth");
            return (Criteria) this;
        }

        public Criteria andReceiveBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("receive_birth <=", value, "receiveBirth");
            return (Criteria) this;
        }

        public Criteria andReceiveBirthIn(List<Date> values) {
            addCriterionForJDBCDate("receive_birth in", values, "receiveBirth");
            return (Criteria) this;
        }

        public Criteria andReceiveBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("receive_birth not in", values, "receiveBirth");
            return (Criteria) this;
        }

        public Criteria andReceiveBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("receive_birth between", value1, value2, "receiveBirth");
            return (Criteria) this;
        }

        public Criteria andReceiveBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("receive_birth not between", value1, value2, "receiveBirth");
            return (Criteria) this;
        }

        public Criteria andReceiveTelIsNull() {
            addCriterion("receive_tel is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTelIsNotNull() {
            addCriterion("receive_tel is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTelEqualTo(String value) {
            addCriterion("receive_tel =", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelNotEqualTo(String value) {
            addCriterion("receive_tel <>", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelGreaterThan(String value) {
            addCriterion("receive_tel >", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelGreaterThanOrEqualTo(String value) {
            addCriterion("receive_tel >=", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelLessThan(String value) {
            addCriterion("receive_tel <", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelLessThanOrEqualTo(String value) {
            addCriterion("receive_tel <=", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelLike(String value) {
            addCriterion("receive_tel like", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelNotLike(String value) {
            addCriterion("receive_tel not like", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelIn(List<String> values) {
            addCriterion("receive_tel in", values, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelNotIn(List<String> values) {
            addCriterion("receive_tel not in", values, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelBetween(String value1, String value2) {
            addCriterion("receive_tel between", value1, value2, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelNotBetween(String value1, String value2) {
            addCriterion("receive_tel not between", value1, value2, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrIsNull() {
            addCriterion("receive_addr is null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrIsNotNull() {
            addCriterion("receive_addr is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrEqualTo(String value) {
            addCriterion("receive_addr =", value, "receiveAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrNotEqualTo(String value) {
            addCriterion("receive_addr <>", value, "receiveAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrGreaterThan(String value) {
            addCriterion("receive_addr >", value, "receiveAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrGreaterThanOrEqualTo(String value) {
            addCriterion("receive_addr >=", value, "receiveAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrLessThan(String value) {
            addCriterion("receive_addr <", value, "receiveAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrLessThanOrEqualTo(String value) {
            addCriterion("receive_addr <=", value, "receiveAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrLike(String value) {
            addCriterion("receive_addr like", value, "receiveAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrNotLike(String value) {
            addCriterion("receive_addr not like", value, "receiveAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrIn(List<String> values) {
            addCriterion("receive_addr in", values, "receiveAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrNotIn(List<String> values) {
            addCriterion("receive_addr not in", values, "receiveAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrBetween(String value1, String value2) {
            addCriterion("receive_addr between", value1, value2, "receiveAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrNotBetween(String value1, String value2) {
            addCriterion("receive_addr not between", value1, value2, "receiveAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeIsNull() {
            addCriterion("receive_type is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeIsNotNull() {
            addCriterion("receive_type is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeEqualTo(String value) {
            addCriterion("receive_type =", value, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeNotEqualTo(String value) {
            addCriterion("receive_type <>", value, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeGreaterThan(String value) {
            addCriterion("receive_type >", value, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeGreaterThanOrEqualTo(String value) {
            addCriterion("receive_type >=", value, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeLessThan(String value) {
            addCriterion("receive_type <", value, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeLessThanOrEqualTo(String value) {
            addCriterion("receive_type <=", value, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeLike(String value) {
            addCriterion("receive_type like", value, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeNotLike(String value) {
            addCriterion("receive_type not like", value, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeIn(List<String> values) {
            addCriterion("receive_type in", values, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeNotIn(List<String> values) {
            addCriterion("receive_type not in", values, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeBetween(String value1, String value2) {
            addCriterion("receive_type between", value1, value2, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeNotBetween(String value1, String value2) {
            addCriterion("receive_type not between", value1, value2, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailIsNull() {
            addCriterion("receive_email is null");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailIsNotNull() {
            addCriterion("receive_email is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailEqualTo(String value) {
            addCriterion("receive_email =", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailNotEqualTo(String value) {
            addCriterion("receive_email <>", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailGreaterThan(String value) {
            addCriterion("receive_email >", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailGreaterThanOrEqualTo(String value) {
            addCriterion("receive_email >=", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailLessThan(String value) {
            addCriterion("receive_email <", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailLessThanOrEqualTo(String value) {
            addCriterion("receive_email <=", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailLike(String value) {
            addCriterion("receive_email like", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailNotLike(String value) {
            addCriterion("receive_email not like", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailIn(List<String> values) {
            addCriterion("receive_email in", values, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailNotIn(List<String> values) {
            addCriterion("receive_email not in", values, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailBetween(String value1, String value2) {
            addCriterion("receive_email between", value1, value2, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailNotBetween(String value1, String value2) {
            addCriterion("receive_email not between", value1, value2, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveProfileIsNull() {
            addCriterion("receive_profile is null");
            return (Criteria) this;
        }

        public Criteria andReceiveProfileIsNotNull() {
            addCriterion("receive_profile is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveProfileEqualTo(String value) {
            addCriterion("receive_profile =", value, "receiveProfile");
            return (Criteria) this;
        }

        public Criteria andReceiveProfileNotEqualTo(String value) {
            addCriterion("receive_profile <>", value, "receiveProfile");
            return (Criteria) this;
        }

        public Criteria andReceiveProfileGreaterThan(String value) {
            addCriterion("receive_profile >", value, "receiveProfile");
            return (Criteria) this;
        }

        public Criteria andReceiveProfileGreaterThanOrEqualTo(String value) {
            addCriterion("receive_profile >=", value, "receiveProfile");
            return (Criteria) this;
        }

        public Criteria andReceiveProfileLessThan(String value) {
            addCriterion("receive_profile <", value, "receiveProfile");
            return (Criteria) this;
        }

        public Criteria andReceiveProfileLessThanOrEqualTo(String value) {
            addCriterion("receive_profile <=", value, "receiveProfile");
            return (Criteria) this;
        }

        public Criteria andReceiveProfileLike(String value) {
            addCriterion("receive_profile like", value, "receiveProfile");
            return (Criteria) this;
        }

        public Criteria andReceiveProfileNotLike(String value) {
            addCriterion("receive_profile not like", value, "receiveProfile");
            return (Criteria) this;
        }

        public Criteria andReceiveProfileIn(List<String> values) {
            addCriterion("receive_profile in", values, "receiveProfile");
            return (Criteria) this;
        }

        public Criteria andReceiveProfileNotIn(List<String> values) {
            addCriterion("receive_profile not in", values, "receiveProfile");
            return (Criteria) this;
        }

        public Criteria andReceiveProfileBetween(String value1, String value2) {
            addCriterion("receive_profile between", value1, value2, "receiveProfile");
            return (Criteria) this;
        }

        public Criteria andReceiveProfileNotBetween(String value1, String value2) {
            addCriterion("receive_profile not between", value1, value2, "receiveProfile");
            return (Criteria) this;
        }

        public Criteria andReceiveSignatureIsNull() {
            addCriterion("receive_signature is null");
            return (Criteria) this;
        }

        public Criteria andReceiveSignatureIsNotNull() {
            addCriterion("receive_signature is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveSignatureEqualTo(String value) {
            addCriterion("receive_signature =", value, "receiveSignature");
            return (Criteria) this;
        }

        public Criteria andReceiveSignatureNotEqualTo(String value) {
            addCriterion("receive_signature <>", value, "receiveSignature");
            return (Criteria) this;
        }

        public Criteria andReceiveSignatureGreaterThan(String value) {
            addCriterion("receive_signature >", value, "receiveSignature");
            return (Criteria) this;
        }

        public Criteria andReceiveSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("receive_signature >=", value, "receiveSignature");
            return (Criteria) this;
        }

        public Criteria andReceiveSignatureLessThan(String value) {
            addCriterion("receive_signature <", value, "receiveSignature");
            return (Criteria) this;
        }

        public Criteria andReceiveSignatureLessThanOrEqualTo(String value) {
            addCriterion("receive_signature <=", value, "receiveSignature");
            return (Criteria) this;
        }

        public Criteria andReceiveSignatureLike(String value) {
            addCriterion("receive_signature like", value, "receiveSignature");
            return (Criteria) this;
        }

        public Criteria andReceiveSignatureNotLike(String value) {
            addCriterion("receive_signature not like", value, "receiveSignature");
            return (Criteria) this;
        }

        public Criteria andReceiveSignatureIn(List<String> values) {
            addCriterion("receive_signature in", values, "receiveSignature");
            return (Criteria) this;
        }

        public Criteria andReceiveSignatureNotIn(List<String> values) {
            addCriterion("receive_signature not in", values, "receiveSignature");
            return (Criteria) this;
        }

        public Criteria andReceiveSignatureBetween(String value1, String value2) {
            addCriterion("receive_signature between", value1, value2, "receiveSignature");
            return (Criteria) this;
        }

        public Criteria andReceiveSignatureNotBetween(String value1, String value2) {
            addCriterion("receive_signature not between", value1, value2, "receiveSignature");
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