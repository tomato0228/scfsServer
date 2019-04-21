package ltd.tomato.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VnoticeViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public VnoticeViewExample() {
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

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(String value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(String value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(String value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(String value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(String value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(String value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLike(String value) {
            addCriterion("user_sex like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotLike(String value) {
            addCriterion("user_sex not like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<String> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<String> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(String value1, String value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(String value1, String value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserBirthIsNull() {
            addCriterion("user_birth is null");
            return (Criteria) this;
        }

        public Criteria andUserBirthIsNotNull() {
            addCriterion("user_birth is not null");
            return (Criteria) this;
        }

        public Criteria andUserBirthEqualTo(Date value) {
            addCriterionForJDBCDate("user_birth =", value, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("user_birth <>", value, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("user_birth >", value, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_birth >=", value, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthLessThan(Date value) {
            addCriterionForJDBCDate("user_birth <", value, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_birth <=", value, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthIn(List<Date> values) {
            addCriterionForJDBCDate("user_birth in", values, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("user_birth not in", values, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_birth between", value1, value2, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_birth not between", value1, value2, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserTelIsNull() {
            addCriterion("user_tel is null");
            return (Criteria) this;
        }

        public Criteria andUserTelIsNotNull() {
            addCriterion("user_tel is not null");
            return (Criteria) this;
        }

        public Criteria andUserTelEqualTo(String value) {
            addCriterion("user_tel =", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotEqualTo(String value) {
            addCriterion("user_tel <>", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelGreaterThan(String value) {
            addCriterion("user_tel >", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelGreaterThanOrEqualTo(String value) {
            addCriterion("user_tel >=", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLessThan(String value) {
            addCriterion("user_tel <", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLessThanOrEqualTo(String value) {
            addCriterion("user_tel <=", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLike(String value) {
            addCriterion("user_tel like", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotLike(String value) {
            addCriterion("user_tel not like", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelIn(List<String> values) {
            addCriterion("user_tel in", values, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotIn(List<String> values) {
            addCriterion("user_tel not in", values, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelBetween(String value1, String value2) {
            addCriterion("user_tel between", value1, value2, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotBetween(String value1, String value2) {
            addCriterion("user_tel not between", value1, value2, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserAddrIsNull() {
            addCriterion("user_addr is null");
            return (Criteria) this;
        }

        public Criteria andUserAddrIsNotNull() {
            addCriterion("user_addr is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddrEqualTo(String value) {
            addCriterion("user_addr =", value, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrNotEqualTo(String value) {
            addCriterion("user_addr <>", value, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrGreaterThan(String value) {
            addCriterion("user_addr >", value, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrGreaterThanOrEqualTo(String value) {
            addCriterion("user_addr >=", value, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrLessThan(String value) {
            addCriterion("user_addr <", value, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrLessThanOrEqualTo(String value) {
            addCriterion("user_addr <=", value, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrLike(String value) {
            addCriterion("user_addr like", value, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrNotLike(String value) {
            addCriterion("user_addr not like", value, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrIn(List<String> values) {
            addCriterion("user_addr in", values, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrNotIn(List<String> values) {
            addCriterion("user_addr not in", values, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrBetween(String value1, String value2) {
            addCriterion("user_addr between", value1, value2, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrNotBetween(String value1, String value2) {
            addCriterion("user_addr not between", value1, value2, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("user_type like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("user_type not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserProfileIsNull() {
            addCriterion("user_profile is null");
            return (Criteria) this;
        }

        public Criteria andUserProfileIsNotNull() {
            addCriterion("user_profile is not null");
            return (Criteria) this;
        }

        public Criteria andUserProfileEqualTo(String value) {
            addCriterion("user_profile =", value, "userProfile");
            return (Criteria) this;
        }

        public Criteria andUserProfileNotEqualTo(String value) {
            addCriterion("user_profile <>", value, "userProfile");
            return (Criteria) this;
        }

        public Criteria andUserProfileGreaterThan(String value) {
            addCriterion("user_profile >", value, "userProfile");
            return (Criteria) this;
        }

        public Criteria andUserProfileGreaterThanOrEqualTo(String value) {
            addCriterion("user_profile >=", value, "userProfile");
            return (Criteria) this;
        }

        public Criteria andUserProfileLessThan(String value) {
            addCriterion("user_profile <", value, "userProfile");
            return (Criteria) this;
        }

        public Criteria andUserProfileLessThanOrEqualTo(String value) {
            addCriterion("user_profile <=", value, "userProfile");
            return (Criteria) this;
        }

        public Criteria andUserProfileLike(String value) {
            addCriterion("user_profile like", value, "userProfile");
            return (Criteria) this;
        }

        public Criteria andUserProfileNotLike(String value) {
            addCriterion("user_profile not like", value, "userProfile");
            return (Criteria) this;
        }

        public Criteria andUserProfileIn(List<String> values) {
            addCriterion("user_profile in", values, "userProfile");
            return (Criteria) this;
        }

        public Criteria andUserProfileNotIn(List<String> values) {
            addCriterion("user_profile not in", values, "userProfile");
            return (Criteria) this;
        }

        public Criteria andUserProfileBetween(String value1, String value2) {
            addCriterion("user_profile between", value1, value2, "userProfile");
            return (Criteria) this;
        }

        public Criteria andUserProfileNotBetween(String value1, String value2) {
            addCriterion("user_profile not between", value1, value2, "userProfile");
            return (Criteria) this;
        }

        public Criteria andUserSignatureIsNull() {
            addCriterion("user_signature is null");
            return (Criteria) this;
        }

        public Criteria andUserSignatureIsNotNull() {
            addCriterion("user_signature is not null");
            return (Criteria) this;
        }

        public Criteria andUserSignatureEqualTo(String value) {
            addCriterion("user_signature =", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureNotEqualTo(String value) {
            addCriterion("user_signature <>", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureGreaterThan(String value) {
            addCriterion("user_signature >", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("user_signature >=", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureLessThan(String value) {
            addCriterion("user_signature <", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureLessThanOrEqualTo(String value) {
            addCriterion("user_signature <=", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureLike(String value) {
            addCriterion("user_signature like", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureNotLike(String value) {
            addCriterion("user_signature not like", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureIn(List<String> values) {
            addCriterion("user_signature in", values, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureNotIn(List<String> values) {
            addCriterion("user_signature not in", values, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureBetween(String value1, String value2) {
            addCriterion("user_signature between", value1, value2, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureNotBetween(String value1, String value2) {
            addCriterion("user_signature not between", value1, value2, "userSignature");
            return (Criteria) this;
        }

        public Criteria andParentsNameIsNull() {
            addCriterion("parents_name is null");
            return (Criteria) this;
        }

        public Criteria andParentsNameIsNotNull() {
            addCriterion("parents_name is not null");
            return (Criteria) this;
        }

        public Criteria andParentsNameEqualTo(String value) {
            addCriterion("parents_name =", value, "parentsName");
            return (Criteria) this;
        }

        public Criteria andParentsNameNotEqualTo(String value) {
            addCriterion("parents_name <>", value, "parentsName");
            return (Criteria) this;
        }

        public Criteria andParentsNameGreaterThan(String value) {
            addCriterion("parents_name >", value, "parentsName");
            return (Criteria) this;
        }

        public Criteria andParentsNameGreaterThanOrEqualTo(String value) {
            addCriterion("parents_name >=", value, "parentsName");
            return (Criteria) this;
        }

        public Criteria andParentsNameLessThan(String value) {
            addCriterion("parents_name <", value, "parentsName");
            return (Criteria) this;
        }

        public Criteria andParentsNameLessThanOrEqualTo(String value) {
            addCriterion("parents_name <=", value, "parentsName");
            return (Criteria) this;
        }

        public Criteria andParentsNameLike(String value) {
            addCriterion("parents_name like", value, "parentsName");
            return (Criteria) this;
        }

        public Criteria andParentsNameNotLike(String value) {
            addCriterion("parents_name not like", value, "parentsName");
            return (Criteria) this;
        }

        public Criteria andParentsNameIn(List<String> values) {
            addCriterion("parents_name in", values, "parentsName");
            return (Criteria) this;
        }

        public Criteria andParentsNameNotIn(List<String> values) {
            addCriterion("parents_name not in", values, "parentsName");
            return (Criteria) this;
        }

        public Criteria andParentsNameBetween(String value1, String value2) {
            addCriterion("parents_name between", value1, value2, "parentsName");
            return (Criteria) this;
        }

        public Criteria andParentsNameNotBetween(String value1, String value2) {
            addCriterion("parents_name not between", value1, value2, "parentsName");
            return (Criteria) this;
        }

        public Criteria andParentsSexIsNull() {
            addCriterion("parents_sex is null");
            return (Criteria) this;
        }

        public Criteria andParentsSexIsNotNull() {
            addCriterion("parents_sex is not null");
            return (Criteria) this;
        }

        public Criteria andParentsSexEqualTo(String value) {
            addCriterion("parents_sex =", value, "parentsSex");
            return (Criteria) this;
        }

        public Criteria andParentsSexNotEqualTo(String value) {
            addCriterion("parents_sex <>", value, "parentsSex");
            return (Criteria) this;
        }

        public Criteria andParentsSexGreaterThan(String value) {
            addCriterion("parents_sex >", value, "parentsSex");
            return (Criteria) this;
        }

        public Criteria andParentsSexGreaterThanOrEqualTo(String value) {
            addCriterion("parents_sex >=", value, "parentsSex");
            return (Criteria) this;
        }

        public Criteria andParentsSexLessThan(String value) {
            addCriterion("parents_sex <", value, "parentsSex");
            return (Criteria) this;
        }

        public Criteria andParentsSexLessThanOrEqualTo(String value) {
            addCriterion("parents_sex <=", value, "parentsSex");
            return (Criteria) this;
        }

        public Criteria andParentsSexLike(String value) {
            addCriterion("parents_sex like", value, "parentsSex");
            return (Criteria) this;
        }

        public Criteria andParentsSexNotLike(String value) {
            addCriterion("parents_sex not like", value, "parentsSex");
            return (Criteria) this;
        }

        public Criteria andParentsSexIn(List<String> values) {
            addCriterion("parents_sex in", values, "parentsSex");
            return (Criteria) this;
        }

        public Criteria andParentsSexNotIn(List<String> values) {
            addCriterion("parents_sex not in", values, "parentsSex");
            return (Criteria) this;
        }

        public Criteria andParentsSexBetween(String value1, String value2) {
            addCriterion("parents_sex between", value1, value2, "parentsSex");
            return (Criteria) this;
        }

        public Criteria andParentsSexNotBetween(String value1, String value2) {
            addCriterion("parents_sex not between", value1, value2, "parentsSex");
            return (Criteria) this;
        }

        public Criteria andParentsBirthIsNull() {
            addCriterion("parents_birth is null");
            return (Criteria) this;
        }

        public Criteria andParentsBirthIsNotNull() {
            addCriterion("parents_birth is not null");
            return (Criteria) this;
        }

        public Criteria andParentsBirthEqualTo(Date value) {
            addCriterionForJDBCDate("parents_birth =", value, "parentsBirth");
            return (Criteria) this;
        }

        public Criteria andParentsBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("parents_birth <>", value, "parentsBirth");
            return (Criteria) this;
        }

        public Criteria andParentsBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("parents_birth >", value, "parentsBirth");
            return (Criteria) this;
        }

        public Criteria andParentsBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("parents_birth >=", value, "parentsBirth");
            return (Criteria) this;
        }

        public Criteria andParentsBirthLessThan(Date value) {
            addCriterionForJDBCDate("parents_birth <", value, "parentsBirth");
            return (Criteria) this;
        }

        public Criteria andParentsBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("parents_birth <=", value, "parentsBirth");
            return (Criteria) this;
        }

        public Criteria andParentsBirthIn(List<Date> values) {
            addCriterionForJDBCDate("parents_birth in", values, "parentsBirth");
            return (Criteria) this;
        }

        public Criteria andParentsBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("parents_birth not in", values, "parentsBirth");
            return (Criteria) this;
        }

        public Criteria andParentsBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("parents_birth between", value1, value2, "parentsBirth");
            return (Criteria) this;
        }

        public Criteria andParentsBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("parents_birth not between", value1, value2, "parentsBirth");
            return (Criteria) this;
        }

        public Criteria andParentsTelIsNull() {
            addCriterion("parents_tel is null");
            return (Criteria) this;
        }

        public Criteria andParentsTelIsNotNull() {
            addCriterion("parents_tel is not null");
            return (Criteria) this;
        }

        public Criteria andParentsTelEqualTo(String value) {
            addCriterion("parents_tel =", value, "parentsTel");
            return (Criteria) this;
        }

        public Criteria andParentsTelNotEqualTo(String value) {
            addCriterion("parents_tel <>", value, "parentsTel");
            return (Criteria) this;
        }

        public Criteria andParentsTelGreaterThan(String value) {
            addCriterion("parents_tel >", value, "parentsTel");
            return (Criteria) this;
        }

        public Criteria andParentsTelGreaterThanOrEqualTo(String value) {
            addCriterion("parents_tel >=", value, "parentsTel");
            return (Criteria) this;
        }

        public Criteria andParentsTelLessThan(String value) {
            addCriterion("parents_tel <", value, "parentsTel");
            return (Criteria) this;
        }

        public Criteria andParentsTelLessThanOrEqualTo(String value) {
            addCriterion("parents_tel <=", value, "parentsTel");
            return (Criteria) this;
        }

        public Criteria andParentsTelLike(String value) {
            addCriterion("parents_tel like", value, "parentsTel");
            return (Criteria) this;
        }

        public Criteria andParentsTelNotLike(String value) {
            addCriterion("parents_tel not like", value, "parentsTel");
            return (Criteria) this;
        }

        public Criteria andParentsTelIn(List<String> values) {
            addCriterion("parents_tel in", values, "parentsTel");
            return (Criteria) this;
        }

        public Criteria andParentsTelNotIn(List<String> values) {
            addCriterion("parents_tel not in", values, "parentsTel");
            return (Criteria) this;
        }

        public Criteria andParentsTelBetween(String value1, String value2) {
            addCriterion("parents_tel between", value1, value2, "parentsTel");
            return (Criteria) this;
        }

        public Criteria andParentsTelNotBetween(String value1, String value2) {
            addCriterion("parents_tel not between", value1, value2, "parentsTel");
            return (Criteria) this;
        }

        public Criteria andParentsAddrIsNull() {
            addCriterion("parents_addr is null");
            return (Criteria) this;
        }

        public Criteria andParentsAddrIsNotNull() {
            addCriterion("parents_addr is not null");
            return (Criteria) this;
        }

        public Criteria andParentsAddrEqualTo(String value) {
            addCriterion("parents_addr =", value, "parentsAddr");
            return (Criteria) this;
        }

        public Criteria andParentsAddrNotEqualTo(String value) {
            addCriterion("parents_addr <>", value, "parentsAddr");
            return (Criteria) this;
        }

        public Criteria andParentsAddrGreaterThan(String value) {
            addCriterion("parents_addr >", value, "parentsAddr");
            return (Criteria) this;
        }

        public Criteria andParentsAddrGreaterThanOrEqualTo(String value) {
            addCriterion("parents_addr >=", value, "parentsAddr");
            return (Criteria) this;
        }

        public Criteria andParentsAddrLessThan(String value) {
            addCriterion("parents_addr <", value, "parentsAddr");
            return (Criteria) this;
        }

        public Criteria andParentsAddrLessThanOrEqualTo(String value) {
            addCriterion("parents_addr <=", value, "parentsAddr");
            return (Criteria) this;
        }

        public Criteria andParentsAddrLike(String value) {
            addCriterion("parents_addr like", value, "parentsAddr");
            return (Criteria) this;
        }

        public Criteria andParentsAddrNotLike(String value) {
            addCriterion("parents_addr not like", value, "parentsAddr");
            return (Criteria) this;
        }

        public Criteria andParentsAddrIn(List<String> values) {
            addCriterion("parents_addr in", values, "parentsAddr");
            return (Criteria) this;
        }

        public Criteria andParentsAddrNotIn(List<String> values) {
            addCriterion("parents_addr not in", values, "parentsAddr");
            return (Criteria) this;
        }

        public Criteria andParentsAddrBetween(String value1, String value2) {
            addCriterion("parents_addr between", value1, value2, "parentsAddr");
            return (Criteria) this;
        }

        public Criteria andParentsAddrNotBetween(String value1, String value2) {
            addCriterion("parents_addr not between", value1, value2, "parentsAddr");
            return (Criteria) this;
        }

        public Criteria andParentsTypeIsNull() {
            addCriterion("parents_type is null");
            return (Criteria) this;
        }

        public Criteria andParentsTypeIsNotNull() {
            addCriterion("parents_type is not null");
            return (Criteria) this;
        }

        public Criteria andParentsTypeEqualTo(String value) {
            addCriterion("parents_type =", value, "parentsType");
            return (Criteria) this;
        }

        public Criteria andParentsTypeNotEqualTo(String value) {
            addCriterion("parents_type <>", value, "parentsType");
            return (Criteria) this;
        }

        public Criteria andParentsTypeGreaterThan(String value) {
            addCriterion("parents_type >", value, "parentsType");
            return (Criteria) this;
        }

        public Criteria andParentsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("parents_type >=", value, "parentsType");
            return (Criteria) this;
        }

        public Criteria andParentsTypeLessThan(String value) {
            addCriterion("parents_type <", value, "parentsType");
            return (Criteria) this;
        }

        public Criteria andParentsTypeLessThanOrEqualTo(String value) {
            addCriterion("parents_type <=", value, "parentsType");
            return (Criteria) this;
        }

        public Criteria andParentsTypeLike(String value) {
            addCriterion("parents_type like", value, "parentsType");
            return (Criteria) this;
        }

        public Criteria andParentsTypeNotLike(String value) {
            addCriterion("parents_type not like", value, "parentsType");
            return (Criteria) this;
        }

        public Criteria andParentsTypeIn(List<String> values) {
            addCriterion("parents_type in", values, "parentsType");
            return (Criteria) this;
        }

        public Criteria andParentsTypeNotIn(List<String> values) {
            addCriterion("parents_type not in", values, "parentsType");
            return (Criteria) this;
        }

        public Criteria andParentsTypeBetween(String value1, String value2) {
            addCriterion("parents_type between", value1, value2, "parentsType");
            return (Criteria) this;
        }

        public Criteria andParentsTypeNotBetween(String value1, String value2) {
            addCriterion("parents_type not between", value1, value2, "parentsType");
            return (Criteria) this;
        }

        public Criteria andParentsEmailIsNull() {
            addCriterion("parents_email is null");
            return (Criteria) this;
        }

        public Criteria andParentsEmailIsNotNull() {
            addCriterion("parents_email is not null");
            return (Criteria) this;
        }

        public Criteria andParentsEmailEqualTo(String value) {
            addCriterion("parents_email =", value, "parentsEmail");
            return (Criteria) this;
        }

        public Criteria andParentsEmailNotEqualTo(String value) {
            addCriterion("parents_email <>", value, "parentsEmail");
            return (Criteria) this;
        }

        public Criteria andParentsEmailGreaterThan(String value) {
            addCriterion("parents_email >", value, "parentsEmail");
            return (Criteria) this;
        }

        public Criteria andParentsEmailGreaterThanOrEqualTo(String value) {
            addCriterion("parents_email >=", value, "parentsEmail");
            return (Criteria) this;
        }

        public Criteria andParentsEmailLessThan(String value) {
            addCriterion("parents_email <", value, "parentsEmail");
            return (Criteria) this;
        }

        public Criteria andParentsEmailLessThanOrEqualTo(String value) {
            addCriterion("parents_email <=", value, "parentsEmail");
            return (Criteria) this;
        }

        public Criteria andParentsEmailLike(String value) {
            addCriterion("parents_email like", value, "parentsEmail");
            return (Criteria) this;
        }

        public Criteria andParentsEmailNotLike(String value) {
            addCriterion("parents_email not like", value, "parentsEmail");
            return (Criteria) this;
        }

        public Criteria andParentsEmailIn(List<String> values) {
            addCriterion("parents_email in", values, "parentsEmail");
            return (Criteria) this;
        }

        public Criteria andParentsEmailNotIn(List<String> values) {
            addCriterion("parents_email not in", values, "parentsEmail");
            return (Criteria) this;
        }

        public Criteria andParentsEmailBetween(String value1, String value2) {
            addCriterion("parents_email between", value1, value2, "parentsEmail");
            return (Criteria) this;
        }

        public Criteria andParentsEmailNotBetween(String value1, String value2) {
            addCriterion("parents_email not between", value1, value2, "parentsEmail");
            return (Criteria) this;
        }

        public Criteria andParentsProfileIsNull() {
            addCriterion("parents_profile is null");
            return (Criteria) this;
        }

        public Criteria andParentsProfileIsNotNull() {
            addCriterion("parents_profile is not null");
            return (Criteria) this;
        }

        public Criteria andParentsProfileEqualTo(String value) {
            addCriterion("parents_profile =", value, "parentsProfile");
            return (Criteria) this;
        }

        public Criteria andParentsProfileNotEqualTo(String value) {
            addCriterion("parents_profile <>", value, "parentsProfile");
            return (Criteria) this;
        }

        public Criteria andParentsProfileGreaterThan(String value) {
            addCriterion("parents_profile >", value, "parentsProfile");
            return (Criteria) this;
        }

        public Criteria andParentsProfileGreaterThanOrEqualTo(String value) {
            addCriterion("parents_profile >=", value, "parentsProfile");
            return (Criteria) this;
        }

        public Criteria andParentsProfileLessThan(String value) {
            addCriterion("parents_profile <", value, "parentsProfile");
            return (Criteria) this;
        }

        public Criteria andParentsProfileLessThanOrEqualTo(String value) {
            addCriterion("parents_profile <=", value, "parentsProfile");
            return (Criteria) this;
        }

        public Criteria andParentsProfileLike(String value) {
            addCriterion("parents_profile like", value, "parentsProfile");
            return (Criteria) this;
        }

        public Criteria andParentsProfileNotLike(String value) {
            addCriterion("parents_profile not like", value, "parentsProfile");
            return (Criteria) this;
        }

        public Criteria andParentsProfileIn(List<String> values) {
            addCriterion("parents_profile in", values, "parentsProfile");
            return (Criteria) this;
        }

        public Criteria andParentsProfileNotIn(List<String> values) {
            addCriterion("parents_profile not in", values, "parentsProfile");
            return (Criteria) this;
        }

        public Criteria andParentsProfileBetween(String value1, String value2) {
            addCriterion("parents_profile between", value1, value2, "parentsProfile");
            return (Criteria) this;
        }

        public Criteria andParentsProfileNotBetween(String value1, String value2) {
            addCriterion("parents_profile not between", value1, value2, "parentsProfile");
            return (Criteria) this;
        }

        public Criteria andParentsSignatureIsNull() {
            addCriterion("parents_signature is null");
            return (Criteria) this;
        }

        public Criteria andParentsSignatureIsNotNull() {
            addCriterion("parents_signature is not null");
            return (Criteria) this;
        }

        public Criteria andParentsSignatureEqualTo(String value) {
            addCriterion("parents_signature =", value, "parentsSignature");
            return (Criteria) this;
        }

        public Criteria andParentsSignatureNotEqualTo(String value) {
            addCriterion("parents_signature <>", value, "parentsSignature");
            return (Criteria) this;
        }

        public Criteria andParentsSignatureGreaterThan(String value) {
            addCriterion("parents_signature >", value, "parentsSignature");
            return (Criteria) this;
        }

        public Criteria andParentsSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("parents_signature >=", value, "parentsSignature");
            return (Criteria) this;
        }

        public Criteria andParentsSignatureLessThan(String value) {
            addCriterion("parents_signature <", value, "parentsSignature");
            return (Criteria) this;
        }

        public Criteria andParentsSignatureLessThanOrEqualTo(String value) {
            addCriterion("parents_signature <=", value, "parentsSignature");
            return (Criteria) this;
        }

        public Criteria andParentsSignatureLike(String value) {
            addCriterion("parents_signature like", value, "parentsSignature");
            return (Criteria) this;
        }

        public Criteria andParentsSignatureNotLike(String value) {
            addCriterion("parents_signature not like", value, "parentsSignature");
            return (Criteria) this;
        }

        public Criteria andParentsSignatureIn(List<String> values) {
            addCriterion("parents_signature in", values, "parentsSignature");
            return (Criteria) this;
        }

        public Criteria andParentsSignatureNotIn(List<String> values) {
            addCriterion("parents_signature not in", values, "parentsSignature");
            return (Criteria) this;
        }

        public Criteria andParentsSignatureBetween(String value1, String value2) {
            addCriterion("parents_signature between", value1, value2, "parentsSignature");
            return (Criteria) this;
        }

        public Criteria andParentsSignatureNotBetween(String value1, String value2) {
            addCriterion("parents_signature not between", value1, value2, "parentsSignature");
            return (Criteria) this;
        }

        public Criteria andUserDateIsNull() {
            addCriterion("user_date is null");
            return (Criteria) this;
        }

        public Criteria andUserDateIsNotNull() {
            addCriterion("user_date is not null");
            return (Criteria) this;
        }

        public Criteria andUserDateEqualTo(Date value) {
            addCriterion("user_date =", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateNotEqualTo(Date value) {
            addCriterion("user_date <>", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateGreaterThan(Date value) {
            addCriterion("user_date >", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateGreaterThanOrEqualTo(Date value) {
            addCriterion("user_date >=", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateLessThan(Date value) {
            addCriterion("user_date <", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateLessThanOrEqualTo(Date value) {
            addCriterion("user_date <=", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateIn(List<Date> values) {
            addCriterion("user_date in", values, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateNotIn(List<Date> values) {
            addCriterion("user_date not in", values, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateBetween(Date value1, Date value2) {
            addCriterion("user_date between", value1, value2, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateNotBetween(Date value1, Date value2) {
            addCriterion("user_date not between", value1, value2, "userDate");
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