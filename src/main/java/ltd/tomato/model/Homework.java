package ltd.tomato.model;

import java.io.Serializable;
import java.util.Date;

/**
 * homework
 * @author 
 */
public class Homework implements Serializable {
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
     * 教师、科目、班级信息
     */
    private Integer tclassId;

    /**
     * 作业附件的地址
     */
    private String homeworkAttachment;

    private static final long serialVersionUID = 1L;

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

    public Integer getTclassId() {
        return tclassId;
    }

    public void setTclassId(Integer tclassId) {
        this.tclassId = tclassId;
    }

    public String getHomeworkAttachment() {
        return homeworkAttachment;
    }

    public void setHomeworkAttachment(String homeworkAttachment) {
        this.homeworkAttachment = homeworkAttachment;
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
        Homework other = (Homework) that;
        return (this.getHomeworkId() == null ? other.getHomeworkId() == null : this.getHomeworkId().equals(other.getHomeworkId()))
            && (this.getHomeworkContent() == null ? other.getHomeworkContent() == null : this.getHomeworkContent().equals(other.getHomeworkContent()))
            && (this.getHomeworkDate() == null ? other.getHomeworkDate() == null : this.getHomeworkDate().equals(other.getHomeworkDate()))
            && (this.getTclassId() == null ? other.getTclassId() == null : this.getTclassId().equals(other.getTclassId()))
            && (this.getHomeworkAttachment() == null ? other.getHomeworkAttachment() == null : this.getHomeworkAttachment().equals(other.getHomeworkAttachment()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHomeworkId() == null) ? 0 : getHomeworkId().hashCode());
        result = prime * result + ((getHomeworkContent() == null) ? 0 : getHomeworkContent().hashCode());
        result = prime * result + ((getHomeworkDate() == null) ? 0 : getHomeworkDate().hashCode());
        result = prime * result + ((getTclassId() == null) ? 0 : getTclassId().hashCode());
        result = prime * result + ((getHomeworkAttachment() == null) ? 0 : getHomeworkAttachment().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", homeworkId=").append(homeworkId);
        sb.append(", homeworkContent=").append(homeworkContent);
        sb.append(", homeworkDate=").append(homeworkDate);
        sb.append(", tclassId=").append(tclassId);
        sb.append(", homeworkAttachment=").append(homeworkAttachment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}