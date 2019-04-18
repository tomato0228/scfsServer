package ltd.tomato.model;

import java.io.Serializable;

/**
 * tclass
 * @author 
 */
public class Tclass implements Serializable {
    /**
     * 教师班级表ID
     */
    private Integer tclassId;

    /**
     * 教师ID
     */
    private Integer teacherId;

    /**
     * 班级ID
     */
    private Integer classId;

    /**
     * 科目ID
     */
    private Integer courseId;

    /**
     * 验证信息
     */
    private String tclassValidation;

    private static final long serialVersionUID = 1L;

    public Integer getTclassId() {
        return tclassId;
    }

    public void setTclassId(Integer tclassId) {
        this.tclassId = tclassId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getTclassValidation() {
        return tclassValidation;
    }

    public void setTclassValidation(String tclassValidation) {
        this.tclassValidation = tclassValidation;
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
        Tclass other = (Tclass) that;
        return (this.getTclassId() == null ? other.getTclassId() == null : this.getTclassId().equals(other.getTclassId()))
            && (this.getTeacherId() == null ? other.getTeacherId() == null : this.getTeacherId().equals(other.getTeacherId()))
            && (this.getClassId() == null ? other.getClassId() == null : this.getClassId().equals(other.getClassId()))
            && (this.getCourseId() == null ? other.getCourseId() == null : this.getCourseId().equals(other.getCourseId()))
            && (this.getTclassValidation() == null ? other.getTclassValidation() == null : this.getTclassValidation().equals(other.getTclassValidation()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTclassId() == null) ? 0 : getTclassId().hashCode());
        result = prime * result + ((getTeacherId() == null) ? 0 : getTeacherId().hashCode());
        result = prime * result + ((getClassId() == null) ? 0 : getClassId().hashCode());
        result = prime * result + ((getCourseId() == null) ? 0 : getCourseId().hashCode());
        result = prime * result + ((getTclassValidation() == null) ? 0 : getTclassValidation().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tclassId=").append(tclassId);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", classId=").append(classId);
        sb.append(", courseId=").append(courseId);
        sb.append(", tclassValidation=").append(tclassValidation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}