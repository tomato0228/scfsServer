package ltd.tomato.model;

import java.io.Serializable;

/**
 * score
 * @author 
 */
public class Score implements Serializable {
    /**
     * 成绩ID
     */
    private Integer scoreId;

    /**
     * 成绩分数
     */
    private Float scoreNum;

    /**
     * 成绩评语
     */
    private String scoreComment;

    /**
     * 学生ID
     */
    private Integer studentId;

    /**
     * 科目ID
     */
    private Integer courseId;

    /**
     * 学期ID
     */
    private Integer semesterId;

    private static final long serialVersionUID = 1L;

    public Integer getScoreId() {
        return scoreId;
    }

    public void setScoreId(Integer scoreId) {
        this.scoreId = scoreId;
    }

    public Float getScoreNum() {
        return scoreNum;
    }

    public void setScoreNum(Float scoreNum) {
        this.scoreNum = scoreNum;
    }

    public String getScoreComment() {
        return scoreComment;
    }

    public void setScoreComment(String scoreComment) {
        this.scoreComment = scoreComment;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(Integer semesterId) {
        this.semesterId = semesterId;
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
        Score other = (Score) that;
        return (this.getScoreId() == null ? other.getScoreId() == null : this.getScoreId().equals(other.getScoreId()))
            && (this.getScoreNum() == null ? other.getScoreNum() == null : this.getScoreNum().equals(other.getScoreNum()))
            && (this.getScoreComment() == null ? other.getScoreComment() == null : this.getScoreComment().equals(other.getScoreComment()))
            && (this.getStudentId() == null ? other.getStudentId() == null : this.getStudentId().equals(other.getStudentId()))
            && (this.getCourseId() == null ? other.getCourseId() == null : this.getCourseId().equals(other.getCourseId()))
            && (this.getSemesterId() == null ? other.getSemesterId() == null : this.getSemesterId().equals(other.getSemesterId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getScoreId() == null) ? 0 : getScoreId().hashCode());
        result = prime * result + ((getScoreNum() == null) ? 0 : getScoreNum().hashCode());
        result = prime * result + ((getScoreComment() == null) ? 0 : getScoreComment().hashCode());
        result = prime * result + ((getStudentId() == null) ? 0 : getStudentId().hashCode());
        result = prime * result + ((getCourseId() == null) ? 0 : getCourseId().hashCode());
        result = prime * result + ((getSemesterId() == null) ? 0 : getSemesterId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scoreId=").append(scoreId);
        sb.append(", scoreNum=").append(scoreNum);
        sb.append(", scoreComment=").append(scoreComment);
        sb.append(", studentId=").append(studentId);
        sb.append(", courseId=").append(courseId);
        sb.append(", semesterId=").append(semesterId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}