package ltd.tomato.model;

import java.io.Serializable;

/**
 * college
 * @author 
 */
public class College implements Serializable {
    /**
     * 学院ID
     */
    private Integer collegeId;

    /**
     * 学院名字
     */
    private String collegeName;

    /**
     * 学院简介
     */
    private String collegeProfile;

    /**
     * 学院地址
     */
    private String collegeAddr;

    /**
     * 学院电话
     */
    private String collegeTel;

    /**
     * 学院网址
     */
    private String collegeUrl;

    /**
     * 学院logo
     */
    private String collegeLogo;

    /**
     * 学校ID
     */
    private Integer schoolId;

    private static final long serialVersionUID = 1L;

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeProfile() {
        return collegeProfile;
    }

    public void setCollegeProfile(String collegeProfile) {
        this.collegeProfile = collegeProfile;
    }

    public String getCollegeAddr() {
        return collegeAddr;
    }

    public void setCollegeAddr(String collegeAddr) {
        this.collegeAddr = collegeAddr;
    }

    public String getCollegeTel() {
        return collegeTel;
    }

    public void setCollegeTel(String collegeTel) {
        this.collegeTel = collegeTel;
    }

    public String getCollegeUrl() {
        return collegeUrl;
    }

    public void setCollegeUrl(String collegeUrl) {
        this.collegeUrl = collegeUrl;
    }

    public String getCollegeLogo() {
        return collegeLogo;
    }

    public void setCollegeLogo(String collegeLogo) {
        this.collegeLogo = collegeLogo;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
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
        College other = (College) that;
        return (this.getCollegeId() == null ? other.getCollegeId() == null : this.getCollegeId().equals(other.getCollegeId()))
            && (this.getCollegeName() == null ? other.getCollegeName() == null : this.getCollegeName().equals(other.getCollegeName()))
            && (this.getCollegeProfile() == null ? other.getCollegeProfile() == null : this.getCollegeProfile().equals(other.getCollegeProfile()))
            && (this.getCollegeAddr() == null ? other.getCollegeAddr() == null : this.getCollegeAddr().equals(other.getCollegeAddr()))
            && (this.getCollegeTel() == null ? other.getCollegeTel() == null : this.getCollegeTel().equals(other.getCollegeTel()))
            && (this.getCollegeUrl() == null ? other.getCollegeUrl() == null : this.getCollegeUrl().equals(other.getCollegeUrl()))
            && (this.getCollegeLogo() == null ? other.getCollegeLogo() == null : this.getCollegeLogo().equals(other.getCollegeLogo()))
            && (this.getSchoolId() == null ? other.getSchoolId() == null : this.getSchoolId().equals(other.getSchoolId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCollegeId() == null) ? 0 : getCollegeId().hashCode());
        result = prime * result + ((getCollegeName() == null) ? 0 : getCollegeName().hashCode());
        result = prime * result + ((getCollegeProfile() == null) ? 0 : getCollegeProfile().hashCode());
        result = prime * result + ((getCollegeAddr() == null) ? 0 : getCollegeAddr().hashCode());
        result = prime * result + ((getCollegeTel() == null) ? 0 : getCollegeTel().hashCode());
        result = prime * result + ((getCollegeUrl() == null) ? 0 : getCollegeUrl().hashCode());
        result = prime * result + ((getCollegeLogo() == null) ? 0 : getCollegeLogo().hashCode());
        result = prime * result + ((getSchoolId() == null) ? 0 : getSchoolId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", collegeId=").append(collegeId);
        sb.append(", collegeName=").append(collegeName);
        sb.append(", collegeProfile=").append(collegeProfile);
        sb.append(", collegeAddr=").append(collegeAddr);
        sb.append(", collegeTel=").append(collegeTel);
        sb.append(", collegeUrl=").append(collegeUrl);
        sb.append(", collegeLogo=").append(collegeLogo);
        sb.append(", schoolId=").append(schoolId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}