package ltd.tomato.model;

import java.io.Serializable;

/**
 * major
 * @author 
 */
public class Major implements Serializable {
    /**
     * 专业ID
     */
    private Integer majorId;

    /**
     * 专业名字
     */
    private String majorName;

    /**
     * 专业简介
     */
    private String majorProfile;

    /**
     * 专业地址
     */
    private String majorAddr;

    /**
     * 专业电话
     */
    private String majorTel;

    /**
     * 专业网址
     */
    private String majorUrl;

    /**
     * 专业logo
     */
    private String majorLogo;

    /**
     * 学院ID
     */
    private Integer collegeId;

    private static final long serialVersionUID = 1L;

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getMajorProfile() {
        return majorProfile;
    }

    public void setMajorProfile(String majorProfile) {
        this.majorProfile = majorProfile;
    }

    public String getMajorAddr() {
        return majorAddr;
    }

    public void setMajorAddr(String majorAddr) {
        this.majorAddr = majorAddr;
    }

    public String getMajorTel() {
        return majorTel;
    }

    public void setMajorTel(String majorTel) {
        this.majorTel = majorTel;
    }

    public String getMajorUrl() {
        return majorUrl;
    }

    public void setMajorUrl(String majorUrl) {
        this.majorUrl = majorUrl;
    }

    public String getMajorLogo() {
        return majorLogo;
    }

    public void setMajorLogo(String majorLogo) {
        this.majorLogo = majorLogo;
    }

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
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
        Major other = (Major) that;
        return (this.getMajorId() == null ? other.getMajorId() == null : this.getMajorId().equals(other.getMajorId()))
            && (this.getMajorName() == null ? other.getMajorName() == null : this.getMajorName().equals(other.getMajorName()))
            && (this.getMajorProfile() == null ? other.getMajorProfile() == null : this.getMajorProfile().equals(other.getMajorProfile()))
            && (this.getMajorAddr() == null ? other.getMajorAddr() == null : this.getMajorAddr().equals(other.getMajorAddr()))
            && (this.getMajorTel() == null ? other.getMajorTel() == null : this.getMajorTel().equals(other.getMajorTel()))
            && (this.getMajorUrl() == null ? other.getMajorUrl() == null : this.getMajorUrl().equals(other.getMajorUrl()))
            && (this.getMajorLogo() == null ? other.getMajorLogo() == null : this.getMajorLogo().equals(other.getMajorLogo()))
            && (this.getCollegeId() == null ? other.getCollegeId() == null : this.getCollegeId().equals(other.getCollegeId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMajorId() == null) ? 0 : getMajorId().hashCode());
        result = prime * result + ((getMajorName() == null) ? 0 : getMajorName().hashCode());
        result = prime * result + ((getMajorProfile() == null) ? 0 : getMajorProfile().hashCode());
        result = prime * result + ((getMajorAddr() == null) ? 0 : getMajorAddr().hashCode());
        result = prime * result + ((getMajorTel() == null) ? 0 : getMajorTel().hashCode());
        result = prime * result + ((getMajorUrl() == null) ? 0 : getMajorUrl().hashCode());
        result = prime * result + ((getMajorLogo() == null) ? 0 : getMajorLogo().hashCode());
        result = prime * result + ((getCollegeId() == null) ? 0 : getCollegeId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", majorId=").append(majorId);
        sb.append(", majorName=").append(majorName);
        sb.append(", majorProfile=").append(majorProfile);
        sb.append(", majorAddr=").append(majorAddr);
        sb.append(", majorTel=").append(majorTel);
        sb.append(", majorUrl=").append(majorUrl);
        sb.append(", majorLogo=").append(majorLogo);
        sb.append(", collegeId=").append(collegeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}