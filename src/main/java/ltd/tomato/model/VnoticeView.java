package ltd.tomato.model;

import java.io.Serializable;
import java.util.Date;

/**
 * vnotice_view
 * @author 
 */
public class VnoticeView implements Serializable {
    /**
     * 通知查看ID
     */
    private Integer vnoticeId;

    /**
     * 是否查看
     */
    private String vnoticeFlag;

    /**
     * 通知ID
     */
    private Integer noticeId;

    /**
     * 学生ID
     */
    private Integer studentId;

    /**
     * 家长ID
     */
    private Integer parentsId;

    /**
     * 用户名字
     */
    private String userName;

    /**
     * 用户性别
     */
    private String userSex;

    /**
     * 用户生日
     */
    private Date userBirth;

    /**
     * 用户电话
     */
    private String userTel;

    /**
     * 用户地址
     */
    private String userAddr;

    /**
     * 用户类别
     */
    private String userType;

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
     * 用户名字
     */
    private String parentsName;

    /**
     * 用户性别
     */
    private String parentsSex;

    /**
     * 用户生日
     */
    private Date parentsBirth;

    /**
     * 用户电话
     */
    private String parentsTel;

    /**
     * 用户地址
     */
    private String parentsAddr;

    /**
     * 用户类别
     */
    private String parentsType;

    /**
     * 用户邮箱
     */
    private String parentsEmail;

    /**
     * 用户头像
     */
    private String parentsProfile;

    /**
     * 用户签名
     */
    private String parentsSignature;

    /**
     * 用户注册日期
     */
    private Date userDate;

    /**
     * 家长和学生的关系
     */
    private String parentsRelation;

    private static final long serialVersionUID = 1L;

    public Integer getVnoticeId() {
        return vnoticeId;
    }

    public void setVnoticeId(Integer vnoticeId) {
        this.vnoticeId = vnoticeId;
    }

    public String getVnoticeFlag() {
        return vnoticeFlag;
    }

    public void setVnoticeFlag(String vnoticeFlag) {
        this.vnoticeFlag = vnoticeFlag;
    }

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getParentsId() {
        return parentsId;
    }

    public void setParentsId(Integer parentsId) {
        this.parentsId = parentsId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public Date getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(Date userBirth) {
        this.userBirth = userBirth;
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

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
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

    public String getParentsName() {
        return parentsName;
    }

    public void setParentsName(String parentsName) {
        this.parentsName = parentsName;
    }

    public String getParentsSex() {
        return parentsSex;
    }

    public void setParentsSex(String parentsSex) {
        this.parentsSex = parentsSex;
    }

    public Date getParentsBirth() {
        return parentsBirth;
    }

    public void setParentsBirth(Date parentsBirth) {
        this.parentsBirth = parentsBirth;
    }

    public String getParentsTel() {
        return parentsTel;
    }

    public void setParentsTel(String parentsTel) {
        this.parentsTel = parentsTel;
    }

    public String getParentsAddr() {
        return parentsAddr;
    }

    public void setParentsAddr(String parentsAddr) {
        this.parentsAddr = parentsAddr;
    }

    public String getParentsType() {
        return parentsType;
    }

    public void setParentsType(String parentsType) {
        this.parentsType = parentsType;
    }

    public String getParentsEmail() {
        return parentsEmail;
    }

    public void setParentsEmail(String parentsEmail) {
        this.parentsEmail = parentsEmail;
    }

    public String getParentsProfile() {
        return parentsProfile;
    }

    public void setParentsProfile(String parentsProfile) {
        this.parentsProfile = parentsProfile;
    }

    public String getParentsSignature() {
        return parentsSignature;
    }

    public void setParentsSignature(String parentsSignature) {
        this.parentsSignature = parentsSignature;
    }

    public Date getUserDate() {
        return userDate;
    }

    public void setUserDate(Date userDate) {
        this.userDate = userDate;
    }

    public String getParentsRelation() {
        return parentsRelation;
    }

    public void setParentsRelation(String parentsRelation) {
        this.parentsRelation = parentsRelation;
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
        VnoticeView other = (VnoticeView) that;
        return (this.getVnoticeId() == null ? other.getVnoticeId() == null : this.getVnoticeId().equals(other.getVnoticeId()))
            && (this.getVnoticeFlag() == null ? other.getVnoticeFlag() == null : this.getVnoticeFlag().equals(other.getVnoticeFlag()))
            && (this.getNoticeId() == null ? other.getNoticeId() == null : this.getNoticeId().equals(other.getNoticeId()))
            && (this.getStudentId() == null ? other.getStudentId() == null : this.getStudentId().equals(other.getStudentId()))
            && (this.getParentsId() == null ? other.getParentsId() == null : this.getParentsId().equals(other.getParentsId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserSex() == null ? other.getUserSex() == null : this.getUserSex().equals(other.getUserSex()))
            && (this.getUserBirth() == null ? other.getUserBirth() == null : this.getUserBirth().equals(other.getUserBirth()))
            && (this.getUserTel() == null ? other.getUserTel() == null : this.getUserTel().equals(other.getUserTel()))
            && (this.getUserAddr() == null ? other.getUserAddr() == null : this.getUserAddr().equals(other.getUserAddr()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getUserEmail() == null ? other.getUserEmail() == null : this.getUserEmail().equals(other.getUserEmail()))
            && (this.getUserProfile() == null ? other.getUserProfile() == null : this.getUserProfile().equals(other.getUserProfile()))
            && (this.getUserSignature() == null ? other.getUserSignature() == null : this.getUserSignature().equals(other.getUserSignature()))
            && (this.getParentsName() == null ? other.getParentsName() == null : this.getParentsName().equals(other.getParentsName()))
            && (this.getParentsSex() == null ? other.getParentsSex() == null : this.getParentsSex().equals(other.getParentsSex()))
            && (this.getParentsBirth() == null ? other.getParentsBirth() == null : this.getParentsBirth().equals(other.getParentsBirth()))
            && (this.getParentsTel() == null ? other.getParentsTel() == null : this.getParentsTel().equals(other.getParentsTel()))
            && (this.getParentsAddr() == null ? other.getParentsAddr() == null : this.getParentsAddr().equals(other.getParentsAddr()))
            && (this.getParentsType() == null ? other.getParentsType() == null : this.getParentsType().equals(other.getParentsType()))
            && (this.getParentsEmail() == null ? other.getParentsEmail() == null : this.getParentsEmail().equals(other.getParentsEmail()))
            && (this.getParentsProfile() == null ? other.getParentsProfile() == null : this.getParentsProfile().equals(other.getParentsProfile()))
            && (this.getParentsSignature() == null ? other.getParentsSignature() == null : this.getParentsSignature().equals(other.getParentsSignature()))
            && (this.getUserDate() == null ? other.getUserDate() == null : this.getUserDate().equals(other.getUserDate()))
            && (this.getParentsRelation() == null ? other.getParentsRelation() == null : this.getParentsRelation().equals(other.getParentsRelation()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVnoticeId() == null) ? 0 : getVnoticeId().hashCode());
        result = prime * result + ((getVnoticeFlag() == null) ? 0 : getVnoticeFlag().hashCode());
        result = prime * result + ((getNoticeId() == null) ? 0 : getNoticeId().hashCode());
        result = prime * result + ((getStudentId() == null) ? 0 : getStudentId().hashCode());
        result = prime * result + ((getParentsId() == null) ? 0 : getParentsId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserSex() == null) ? 0 : getUserSex().hashCode());
        result = prime * result + ((getUserBirth() == null) ? 0 : getUserBirth().hashCode());
        result = prime * result + ((getUserTel() == null) ? 0 : getUserTel().hashCode());
        result = prime * result + ((getUserAddr() == null) ? 0 : getUserAddr().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getUserEmail() == null) ? 0 : getUserEmail().hashCode());
        result = prime * result + ((getUserProfile() == null) ? 0 : getUserProfile().hashCode());
        result = prime * result + ((getUserSignature() == null) ? 0 : getUserSignature().hashCode());
        result = prime * result + ((getParentsName() == null) ? 0 : getParentsName().hashCode());
        result = prime * result + ((getParentsSex() == null) ? 0 : getParentsSex().hashCode());
        result = prime * result + ((getParentsBirth() == null) ? 0 : getParentsBirth().hashCode());
        result = prime * result + ((getParentsTel() == null) ? 0 : getParentsTel().hashCode());
        result = prime * result + ((getParentsAddr() == null) ? 0 : getParentsAddr().hashCode());
        result = prime * result + ((getParentsType() == null) ? 0 : getParentsType().hashCode());
        result = prime * result + ((getParentsEmail() == null) ? 0 : getParentsEmail().hashCode());
        result = prime * result + ((getParentsProfile() == null) ? 0 : getParentsProfile().hashCode());
        result = prime * result + ((getParentsSignature() == null) ? 0 : getParentsSignature().hashCode());
        result = prime * result + ((getUserDate() == null) ? 0 : getUserDate().hashCode());
        result = prime * result + ((getParentsRelation() == null) ? 0 : getParentsRelation().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", vnoticeId=").append(vnoticeId);
        sb.append(", vnoticeFlag=").append(vnoticeFlag);
        sb.append(", noticeId=").append(noticeId);
        sb.append(", studentId=").append(studentId);
        sb.append(", parentsId=").append(parentsId);
        sb.append(", userName=").append(userName);
        sb.append(", userSex=").append(userSex);
        sb.append(", userBirth=").append(userBirth);
        sb.append(", userTel=").append(userTel);
        sb.append(", userAddr=").append(userAddr);
        sb.append(", userType=").append(userType);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userProfile=").append(userProfile);
        sb.append(", userSignature=").append(userSignature);
        sb.append(", parentsName=").append(parentsName);
        sb.append(", parentsSex=").append(parentsSex);
        sb.append(", parentsBirth=").append(parentsBirth);
        sb.append(", parentsTel=").append(parentsTel);
        sb.append(", parentsAddr=").append(parentsAddr);
        sb.append(", parentsType=").append(parentsType);
        sb.append(", parentsEmail=").append(parentsEmail);
        sb.append(", parentsProfile=").append(parentsProfile);
        sb.append(", parentsSignature=").append(parentsSignature);
        sb.append(", userDate=").append(userDate);
        sb.append(", parentsRelation=").append(parentsRelation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}