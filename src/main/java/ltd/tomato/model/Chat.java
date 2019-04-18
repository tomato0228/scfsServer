package ltd.tomato.model;

import java.io.Serializable;
import java.util.Date;

/**
 * chat
 * @author 
 */
public class Chat implements Serializable {
    /**
     * 聊天信息ID
     */
    private Integer chatId;

    /**
     * 聊天信息时间
     */
    private Date chatDate;

    /**
     * 聊天信息内容
     */
    private String chatContent;

    /**
     * 发送者ID
     */
    private Integer sendId;

    /**
     * 接收者ID
     */
    private Integer receiveId;

    /**
     * 是否接受消息
     */
    private Integer chatMesg;

    private static final long serialVersionUID = 1L;

    public Integer getChatId() {
        return chatId;
    }

    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }

    public Date getChatDate() {
        return chatDate;
    }

    public void setChatDate(Date chatDate) {
        this.chatDate = chatDate;
    }

    public String getChatContent() {
        return chatContent;
    }

    public void setChatContent(String chatContent) {
        this.chatContent = chatContent;
    }

    public Integer getSendId() {
        return sendId;
    }

    public void setSendId(Integer sendId) {
        this.sendId = sendId;
    }

    public Integer getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(Integer receiveId) {
        this.receiveId = receiveId;
    }

    public Integer getChatMesg() {
        return chatMesg;
    }

    public void setChatMesg(Integer chatMesg) {
        this.chatMesg = chatMesg;
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
        Chat other = (Chat) that;
        return (this.getChatId() == null ? other.getChatId() == null : this.getChatId().equals(other.getChatId()))
            && (this.getChatDate() == null ? other.getChatDate() == null : this.getChatDate().equals(other.getChatDate()))
            && (this.getChatContent() == null ? other.getChatContent() == null : this.getChatContent().equals(other.getChatContent()))
            && (this.getSendId() == null ? other.getSendId() == null : this.getSendId().equals(other.getSendId()))
            && (this.getReceiveId() == null ? other.getReceiveId() == null : this.getReceiveId().equals(other.getReceiveId()))
            && (this.getChatMesg() == null ? other.getChatMesg() == null : this.getChatMesg().equals(other.getChatMesg()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChatId() == null) ? 0 : getChatId().hashCode());
        result = prime * result + ((getChatDate() == null) ? 0 : getChatDate().hashCode());
        result = prime * result + ((getChatContent() == null) ? 0 : getChatContent().hashCode());
        result = prime * result + ((getSendId() == null) ? 0 : getSendId().hashCode());
        result = prime * result + ((getReceiveId() == null) ? 0 : getReceiveId().hashCode());
        result = prime * result + ((getChatMesg() == null) ? 0 : getChatMesg().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", chatId=").append(chatId);
        sb.append(", chatDate=").append(chatDate);
        sb.append(", chatContent=").append(chatContent);
        sb.append(", sendId=").append(sendId);
        sb.append(", receiveId=").append(receiveId);
        sb.append(", chatMesg=").append(chatMesg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}