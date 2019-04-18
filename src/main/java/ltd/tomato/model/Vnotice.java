package ltd.tomato.model;

import java.io.Serializable;

/**
 * vnotice
 * @author 
 */
public class Vnotice implements Serializable {
    /**
     * 通知查看ID
     */
    private Integer vnoticeId;

    /**
     * 是否完成任务
     */
    private String vnoticeFinish;

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

    private static final long serialVersionUID = 1L;

    public Integer getVnoticeId() {
        return vnoticeId;
    }

    public void setVnoticeId(Integer vnoticeId) {
        this.vnoticeId = vnoticeId;
    }

    public String getVnoticeFinish() {
        return vnoticeFinish;
    }

    public void setVnoticeFinish(String vnoticeFinish) {
        this.vnoticeFinish = vnoticeFinish;
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
        Vnotice other = (Vnotice) that;
        return (this.getVnoticeId() == null ? other.getVnoticeId() == null : this.getVnoticeId().equals(other.getVnoticeId()))
            && (this.getVnoticeFinish() == null ? other.getVnoticeFinish() == null : this.getVnoticeFinish().equals(other.getVnoticeFinish()))
            && (this.getNoticeId() == null ? other.getNoticeId() == null : this.getNoticeId().equals(other.getNoticeId()))
            && (this.getStudentId() == null ? other.getStudentId() == null : this.getStudentId().equals(other.getStudentId()))
            && (this.getParentsId() == null ? other.getParentsId() == null : this.getParentsId().equals(other.getParentsId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVnoticeId() == null) ? 0 : getVnoticeId().hashCode());
        result = prime * result + ((getVnoticeFinish() == null) ? 0 : getVnoticeFinish().hashCode());
        result = prime * result + ((getNoticeId() == null) ? 0 : getNoticeId().hashCode());
        result = prime * result + ((getStudentId() == null) ? 0 : getStudentId().hashCode());
        result = prime * result + ((getParentsId() == null) ? 0 : getParentsId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", vnoticeId=").append(vnoticeId);
        sb.append(", vnoticeFinish=").append(vnoticeFinish);
        sb.append(", noticeId=").append(noticeId);
        sb.append(", studentId=").append(studentId);
        sb.append(", parentsId=").append(parentsId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}