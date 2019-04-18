package ltd.tomato.model;

import java.io.Serializable;

/**
 * school
 * @author 
 */
public class School implements Serializable {
    /**
     * 学校ID
     */
    private Integer schoolId;

    /**
     * 学校名字
     */
    private String schoolName;

    /**
     * 学校简介
     */
    private String schoolProfile;

    /**
     * 学校地址
     */
    private String schoolAddr;

    /**
     * 学校电话
     */
    private String schoolTel;

    /**
     * 学校网址
     */
    private String schoolUrl;

    /**
     * 学校logo
     */
    private String schoolLogo;

    private static final long serialVersionUID = 1L;

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolProfile() {
        return schoolProfile;
    }

    public void setSchoolProfile(String schoolProfile) {
        this.schoolProfile = schoolProfile;
    }

    public String getSchoolAddr() {
        return schoolAddr;
    }

    public void setSchoolAddr(String schoolAddr) {
        this.schoolAddr = schoolAddr;
    }

    public String getSchoolTel() {
        return schoolTel;
    }

    public void setSchoolTel(String schoolTel) {
        this.schoolTel = schoolTel;
    }

    public String getSchoolUrl() {
        return schoolUrl;
    }

    public void setSchoolUrl(String schoolUrl) {
        this.schoolUrl = schoolUrl;
    }

    public String getSchoolLogo() {
        return schoolLogo;
    }

    public void setSchoolLogo(String schoolLogo) {
        this.schoolLogo = schoolLogo;
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
        School other = (School) that;
        return (this.getSchoolId() == null ? other.getSchoolId() == null : this.getSchoolId().equals(other.getSchoolId()))
            && (this.getSchoolName() == null ? other.getSchoolName() == null : this.getSchoolName().equals(other.getSchoolName()))
            && (this.getSchoolProfile() == null ? other.getSchoolProfile() == null : this.getSchoolProfile().equals(other.getSchoolProfile()))
            && (this.getSchoolAddr() == null ? other.getSchoolAddr() == null : this.getSchoolAddr().equals(other.getSchoolAddr()))
            && (this.getSchoolTel() == null ? other.getSchoolTel() == null : this.getSchoolTel().equals(other.getSchoolTel()))
            && (this.getSchoolUrl() == null ? other.getSchoolUrl() == null : this.getSchoolUrl().equals(other.getSchoolUrl()))
            && (this.getSchoolLogo() == null ? other.getSchoolLogo() == null : this.getSchoolLogo().equals(other.getSchoolLogo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSchoolId() == null) ? 0 : getSchoolId().hashCode());
        result = prime * result + ((getSchoolName() == null) ? 0 : getSchoolName().hashCode());
        result = prime * result + ((getSchoolProfile() == null) ? 0 : getSchoolProfile().hashCode());
        result = prime * result + ((getSchoolAddr() == null) ? 0 : getSchoolAddr().hashCode());
        result = prime * result + ((getSchoolTel() == null) ? 0 : getSchoolTel().hashCode());
        result = prime * result + ((getSchoolUrl() == null) ? 0 : getSchoolUrl().hashCode());
        result = prime * result + ((getSchoolLogo() == null) ? 0 : getSchoolLogo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", schoolId=").append(schoolId);
        sb.append(", schoolName=").append(schoolName);
        sb.append(", schoolProfile=").append(schoolProfile);
        sb.append(", schoolAddr=").append(schoolAddr);
        sb.append(", schoolTel=").append(schoolTel);
        sb.append(", schoolUrl=").append(schoolUrl);
        sb.append(", schoolLogo=").append(schoolLogo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}