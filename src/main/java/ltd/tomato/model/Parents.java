package ltd.tomato.model;

import java.io.Serializable;

/**
 * parents
 * @author 
 */
public class Parents implements Serializable {
    /**
     * 家长关系key
     */
    private Integer parentsKey;

    /**
     * 家长ID
     */
    private Integer parentsId;

    /**
     * 家长和学生的关系
     */
    private String parentsRelation;

    /**
     * 学生ID
     */
    private Integer studentId;

    private static final long serialVersionUID = 1L;

    public Integer getParentsKey() {
        return parentsKey;
    }

    public void setParentsKey(Integer parentsKey) {
        this.parentsKey = parentsKey;
    }

    public Integer getParentsId() {
        return parentsId;
    }

    public void setParentsId(Integer parentsId) {
        this.parentsId = parentsId;
    }

    public String getParentsRelation() {
        return parentsRelation;
    }

    public void setParentsRelation(String parentsRelation) {
        this.parentsRelation = parentsRelation;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
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
        Parents other = (Parents) that;
        return (this.getParentsKey() == null ? other.getParentsKey() == null : this.getParentsKey().equals(other.getParentsKey()))
            && (this.getParentsId() == null ? other.getParentsId() == null : this.getParentsId().equals(other.getParentsId()))
            && (this.getParentsRelation() == null ? other.getParentsRelation() == null : this.getParentsRelation().equals(other.getParentsRelation()))
            && (this.getStudentId() == null ? other.getStudentId() == null : this.getStudentId().equals(other.getStudentId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getParentsKey() == null) ? 0 : getParentsKey().hashCode());
        result = prime * result + ((getParentsId() == null) ? 0 : getParentsId().hashCode());
        result = prime * result + ((getParentsRelation() == null) ? 0 : getParentsRelation().hashCode());
        result = prime * result + ((getStudentId() == null) ? 0 : getStudentId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", parentsKey=").append(parentsKey);
        sb.append(", parentsId=").append(parentsId);
        sb.append(", parentsRelation=").append(parentsRelation);
        sb.append(", studentId=").append(studentId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}