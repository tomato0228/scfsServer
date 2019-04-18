package ltd.tomato.model;

import java.io.Serializable;
import java.util.Date;

/**
 * notice
 * @author 
 */
public class Notice implements Serializable {
    /**
     * 通知ID
     */
    private Integer noticeId;

    /**
     * 通知标题
     */
    private String noticeTitle;

    /**
     * 通知内容
     */
    private String noticeContent;

    /**
     * 通知发布日期
     */
    private Date noticeDate;

    /**
     * 通知附件的地址
     */
    private String noticeAttachment;

    /**
     * 发布者ID
     */
    private Integer userId;

    /**
     * 班级ID
     */
    private Integer classId;

    private static final long serialVersionUID = 1L;

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    public Date getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(Date noticeDate) {
        this.noticeDate = noticeDate;
    }

    public String getNoticeAttachment() {
        return noticeAttachment;
    }

    public void setNoticeAttachment(String noticeAttachment) {
        this.noticeAttachment = noticeAttachment;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
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
        Notice other = (Notice) that;
        return (this.getNoticeId() == null ? other.getNoticeId() == null : this.getNoticeId().equals(other.getNoticeId()))
            && (this.getNoticeTitle() == null ? other.getNoticeTitle() == null : this.getNoticeTitle().equals(other.getNoticeTitle()))
            && (this.getNoticeContent() == null ? other.getNoticeContent() == null : this.getNoticeContent().equals(other.getNoticeContent()))
            && (this.getNoticeDate() == null ? other.getNoticeDate() == null : this.getNoticeDate().equals(other.getNoticeDate()))
            && (this.getNoticeAttachment() == null ? other.getNoticeAttachment() == null : this.getNoticeAttachment().equals(other.getNoticeAttachment()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getClassId() == null ? other.getClassId() == null : this.getClassId().equals(other.getClassId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNoticeId() == null) ? 0 : getNoticeId().hashCode());
        result = prime * result + ((getNoticeTitle() == null) ? 0 : getNoticeTitle().hashCode());
        result = prime * result + ((getNoticeContent() == null) ? 0 : getNoticeContent().hashCode());
        result = prime * result + ((getNoticeDate() == null) ? 0 : getNoticeDate().hashCode());
        result = prime * result + ((getNoticeAttachment() == null) ? 0 : getNoticeAttachment().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getClassId() == null) ? 0 : getClassId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", noticeId=").append(noticeId);
        sb.append(", noticeTitle=").append(noticeTitle);
        sb.append(", noticeContent=").append(noticeContent);
        sb.append(", noticeDate=").append(noticeDate);
        sb.append(", noticeAttachment=").append(noticeAttachment);
        sb.append(", userId=").append(userId);
        sb.append(", classId=").append(classId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}