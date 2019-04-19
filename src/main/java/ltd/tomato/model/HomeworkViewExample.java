package ltd.tomato.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HomeworkViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HomeworkViewExample() {
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

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Integer value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Integer value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Integer value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Integer value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Integer> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Integer> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
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

        public Criteria andTclassValidationIsNull() {
            addCriterion("tclass_validation is null");
            return (Criteria) this;
        }

        public Criteria andTclassValidationIsNotNull() {
            addCriterion("tclass_validation is not null");
            return (Criteria) this;
        }

        public Criteria andTclassValidationEqualTo(String value) {
            addCriterion("tclass_validation =", value, "tclassValidation");
            return (Criteria) this;
        }

        public Criteria andTclassValidationNotEqualTo(String value) {
            addCriterion("tclass_validation <>", value, "tclassValidation");
            return (Criteria) this;
        }

        public Criteria andTclassValidationGreaterThan(String value) {
            addCriterion("tclass_validation >", value, "tclassValidation");
            return (Criteria) this;
        }

        public Criteria andTclassValidationGreaterThanOrEqualTo(String value) {
            addCriterion("tclass_validation >=", value, "tclassValidation");
            return (Criteria) this;
        }

        public Criteria andTclassValidationLessThan(String value) {
            addCriterion("tclass_validation <", value, "tclassValidation");
            return (Criteria) this;
        }

        public Criteria andTclassValidationLessThanOrEqualTo(String value) {
            addCriterion("tclass_validation <=", value, "tclassValidation");
            return (Criteria) this;
        }

        public Criteria andTclassValidationLike(String value) {
            addCriterion("tclass_validation like", value, "tclassValidation");
            return (Criteria) this;
        }

        public Criteria andTclassValidationNotLike(String value) {
            addCriterion("tclass_validation not like", value, "tclassValidation");
            return (Criteria) this;
        }

        public Criteria andTclassValidationIn(List<String> values) {
            addCriterion("tclass_validation in", values, "tclassValidation");
            return (Criteria) this;
        }

        public Criteria andTclassValidationNotIn(List<String> values) {
            addCriterion("tclass_validation not in", values, "tclassValidation");
            return (Criteria) this;
        }

        public Criteria andTclassValidationBetween(String value1, String value2) {
            addCriterion("tclass_validation between", value1, value2, "tclassValidation");
            return (Criteria) this;
        }

        public Criteria andTclassValidationNotBetween(String value1, String value2) {
            addCriterion("tclass_validation not between", value1, value2, "tclassValidation");
            return (Criteria) this;
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

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Integer value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Integer value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Integer value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Integer value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Integer> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Integer> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Integer value1, Integer value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_id not between", value1, value2, "classId");
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