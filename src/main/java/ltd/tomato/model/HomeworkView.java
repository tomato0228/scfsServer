package ltd.tomato.model;

import java.io.Serializable;
import java.util.Date;

/**
 * homework_view
 *
 * @author
 */
public class HomeworkView implements Serializable {
    /**
     * 科目名字
     */
    private String courseName;

    /**
     * 科目ID
     */
    private Integer courseId;

    /**
     * 教师ID
     */
    private Integer teacherId;

    /**
     * 用户名字
     */
    private String userName;

    /**
     * 用户电话
     */
    private String userTel;

    /**
     * 用户地址
     */
    private String userAddr;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * 用户头像
     */
    private String userProfile;

    /**
     * 用户签名
     */
    private String userSignature;

    /**
     * 用户性别
     */
    private String userSex;

    /**
     * 验证信息
     */
    private String tclassValidation;

    /**
     * 作业ID
     */
    private Integer homeworkId;

    /**
     * 作业内容
     */
    private String homeworkContent;

    /**
     * 作业发布日期
     */
    private Date homeworkDate;

    /**
     * 作业附件的地址
     */
    private String homeworkAttachment;

    /**
     * 教师、科目、班级信息
     */
    private Integer tclassId;

    /**
     * 用户生日
     */
    private Date userBirth;

    /**
     * 班级ID
     */
    private Integer classId;

    private static final long serialVersionUID = 1L;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(String userProfile) {
        this.userProfile = userProfile;
    }

    public String getUserSignature() {
        return userSignature;
    }

    public void setUserSignature(String userSignature) {
        this.userSignature = userSignature;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getTclassValidation() {
        return tclassValidation;
    }

    public void setTclassValidation(String tclassValidation) {
        this.tclassValidation = tclassValidation;
    }

    public Integer getHomeworkId() {
        return homeworkId;
    }

    public void setHomeworkId(Integer homeworkId) {
        this.homeworkId = homeworkId;
    }

    public String getHomeworkContent() {
        return homeworkContent;
    }

    public void setHomeworkContent(String homeworkContent) {
        this.homeworkContent = homeworkContent;
    }

    public Date getHomeworkDate() {
        return homeworkDate;
    }

    public void setHomeworkDate(Date homeworkDate) {
        this.homeworkDate = homeworkDate;
    }

    public String getHomeworkAttachment() {
        return homeworkAttachment;
    }

    public void setHomeworkAttachment(String homeworkAttachment) {
        this.homeworkAttachment = homeworkAttachment;
    }

    public Integer getTclassId() {
        return tclassId;
    }

    public void setTclassId(Integer tclassId) {
        this.tclassId = tclassId;
    }

    public Date getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(Date userBirth) {
        this.userBirth = userBirth;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        HomeworkView other = (HomeworkView) that;
        return (this.getCourseName() == null ? other.getCourseName() == null : this.getCourseName().equals(other.getCourseName()))
                && (this.getCourseId() == null ? other.getCourseId() == null : this.getCourseId().equals(other.getCourseId()))
                && (this.getTeacherId() == null ? other.getTeacherId() == null : this.getTeacherId().equals(other.getTeacherId()))
                && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
                && (this.getUserTel() == null ? other.getUserTel() == null : this.getUserTel().equals(other.getUserTel()))
                && (this.getUserAddr() == null ? other.getUserAddr() == null : this.getUserAddr().equals(other.getUserAddr()))
                && (this.getUserEmail() == null ? other.getUserEmail() == null : this.getUserEmail().equals(other.getUserEmail()))
                && (this.getUserProfile() == null ? other.getUserProfile() == null : this.getUserProfile().equals(other.getUserProfile()))
                && (this.getUserSignature() == null ? other.getUserSignature() == null : this.getUserSignature().equals(other.getUserSignature()))
                && (this.getUserSex() == null ? other.getUserSex() == null : this.getUserSex().equals(other.getUserSex()))
                && (this.getTclassValidation() == null ? other.getTclassValidation() == null : this.getTclassValidation().equals(other.getTclassValidation()))
                && (this.getHomeworkId() == null ? other.getHomeworkId() == null : this.getHomeworkId().equals(other.getHomeworkId()))
                && (this.getHomeworkContent() == null ? other.getHomeworkContent() == null : this.getHomeworkContent().equals(other.getHomeworkContent()))
                && (this.getHomeworkDate() == null ? other.getHomeworkDate() == null : this.getHomeworkDate().equals(other.getHomeworkDate()))
                && (this.getHomeworkAttachment() == null ? other.getHomeworkAttachment() == null : this.getHomeworkAttachment().equals(other.getHomeworkAttachment()))
                && (this.getTclassId() == null ? other.getTclassId() == null : this.getTclassId().equals(other.getTclassId()))
                && (this.getUserBirth() == null ? other.getUserBirth() == null : this.getUserBirth().equals(other.getUserBirth()))
                && (this.getClassId() == null ? other.getClassId() == null : this.getClassId().equals(other.getClassId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCourseName() == null) ? 0 : getCourseName().hashCode());
        result = prime * result + ((getCourseId() == null) ? 0 : getCourseId().hashCode());
        result = prime * result + ((getTeacherId() == null) ? 0 : getTeacherId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserTel() == null) ? 0 : getUserTel().hashCode());
        result = prime * result + ((getUserAddr() == null) ? 0 : getUserAddr().hashCode());
        result = prime * result + ((getUserEmail() == null) ? 0 : getUserEmail().hashCode());
        result = prime * result + ((getUserProfile() == null) ? 0 : getUserProfile().hashCode());
        result = prime * result + ((getUserSignature() == null) ? 0 : getUserSignature().hashCode());
        result = prime * result + ((getUserSex() == null) ? 0 : getUserSex().hashCode());
        result = prime * result + ((getTclassValidation() == null) ? 0 : getTclassValidation().hashCode());
        result = prime * result + ((getHomeworkId() == null) ? 0 : getHomeworkId().hashCode());
        result = prime * result + ((getHomeworkContent() == null) ? 0 : getHomeworkContent().hashCode());
        result = prime * result + ((getHomeworkDate() == null) ? 0 : getHomeworkDate().hashCode());
        result = prime * result + ((getHomeworkAttachment() == null) ? 0 : getHomeworkAttachment().hashCode());
        result = prime * result + ((getTclassId() == null) ? 0 : getTclassId().hashCode());
        result = prime * result + ((getUserBirth() == null) ? 0 : getUserBirth().hashCode());
        result = prime * result + ((getClassId() == null) ? 0 : getClassId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", courseName=").append(courseName);
        sb.append(", courseId=").append(courseId);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", userName=").append(userName);
        sb.append(", userTel=").append(userTel);
        sb.append(", userAddr=").append(userAddr);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userProfile=").append(userProfile);
        sb.append(", userSignature=").append(userSignature);
        sb.append(", userSex=").append(userSex);
        sb.append(", tclassValidation=").append(tclassValidation);
        sb.append(", homeworkId=").append(homeworkId);
        sb.append(", homeworkContent=").append(homeworkContent);
        sb.append(", homeworkDate=").append(homeworkDate);
        sb.append(", homeworkAttachment=").append(homeworkAttachment);
        sb.append(", tclassId=").append(tclassId);
        sb.append(", userBirth=").append(userBirth);
        sb.append(", classId=").append(classId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}