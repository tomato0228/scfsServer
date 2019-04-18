package ltd.tomato.model;

import java.io.Serializable;

/**
 * semester
 * @author 
 */
public class Semester implements Serializable {
    /**
     * 学期ID
     */
    private Integer semesterId;

    /**
     * 学期名字
     */
    private String semesterName;

    private static final long serialVersionUID = 1L;

    public Integer getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(Integer semesterId) {
        this.semesterId = semesterId;
    }

    public String getSemesterName() {
        return semesterName;
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
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
        Semester other = (Semester) that;
        return (this.getSemesterId() == null ? other.getSemesterId() == null : this.getSemesterId().equals(other.getSemesterId()))
            && (this.getSemesterName() == null ? other.getSemesterName() == null : this.getSemesterName().equals(other.getSemesterName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSemesterId() == null) ? 0 : getSemesterId().hashCode());
        result = prime * result + ((getSemesterName() == null) ? 0 : getSemesterName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", semesterId=").append(semesterId);
        sb.append(", semesterName=").append(semesterName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}