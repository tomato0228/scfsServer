package ltd.tomato.model;

import java.io.Serializable;
import java.util.Date;

/**
 * chat_view
 * @author 
 */
public class ChatView implements Serializable {
    /**
     * 聊天信息ID
     */
    private Integer chatId;

    /**
     * 聊天信息时间
     */
    private Date chatDate;

    /**
     * 消息类型
     */
    private Integer chatType;

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

    /**
     * 用户名字
     */
    private String sendName;

    /**
     * 用户性别
     */
    private String sendSex;

    /**
     * 用户生日
     */
    private Date sendBirth;

    /**
     * 用户电话
     */
    private String sendTel;

    /**
     * 用户地址
     */
    private String sendAddr;

    /**
     * 用户类别
     */
    private String sendType;

    /**
     * 用户邮箱
     */
    private String sendEmail;

    /**
     * 用户头像
     */
    private String sendProfile;

    /**
     * 用户签名
     */
    private String sendSignature;

    /**
     * 用户名字
     */
    private String receiveName;

    /**
     * 用户性别
     */
    private String receiveSex;

    /**
     * 用户生日
     */
    private Date receiveBirth;

    /**
     * 用户电话
     */
    private String receiveTel;

    /**
     * 用户地址
     */
    private String receiveAddr;

    /**
     * 用户类别
     */
    private String receiveType;

    /**
     * 用户邮箱
     */
    private String receiveEmail;

    /**
     * 用户头像
     */
    private String receiveProfile;

    /**
     * 用户签名
     */
    private String receiveSignature;

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

    public Integer getChatType() {
        return chatType;
    }

    public void setChatType(Integer chatType) {
        this.chatType = chatType;
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

    public String getSendName() {
        return sendName;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName;
    }

    public String getSendSex() {
        return sendSex;
    }

    public void setSendSex(String sendSex) {
        this.sendSex = sendSex;
    }

    public Date getSendBirth() {
        return sendBirth;
    }

    public void setSendBirth(Date sendBirth) {
        this.sendBirth = sendBirth;
    }

    public String getSendTel() {
        return sendTel;
    }

    public void setSendTel(String sendTel) {
        this.sendTel = sendTel;
    }

    public String getSendAddr() {
        return sendAddr;
    }

    public void setSendAddr(String sendAddr) {
        this.sendAddr = sendAddr;
    }

    public String getSendType() {
        return sendType;
    }

    public void setSendType(String sendType) {
        this.sendType = sendType;
    }

    public String getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(String sendEmail) {
        this.sendEmail = sendEmail;
    }

    public String getSendProfile() {
        return sendProfile;
    }

    public void setSendProfile(String sendProfile) {
        this.sendProfile = sendProfile;
    }

    public String getSendSignature() {
        return sendSignature;
    }

    public void setSendSignature(String sendSignature) {
        this.sendSignature = sendSignature;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
    }

    public String getReceiveSex() {
        return receiveSex;
    }

    public void setReceiveSex(String receiveSex) {
        this.receiveSex = receiveSex;
    }

    public Date getReceiveBirth() {
        return receiveBirth;
    }

    public void setReceiveBirth(Date receiveBirth) {
        this.receiveBirth = receiveBirth;
    }

    public String getReceiveTel() {
        return receiveTel;
    }

    public void setReceiveTel(String receiveTel) {
        this.receiveTel = receiveTel;
    }

    public String getReceiveAddr() {
        return receiveAddr;
    }

    public void setReceiveAddr(String receiveAddr) {
        this.receiveAddr = receiveAddr;
    }

    public String getReceiveType() {
        return receiveType;
    }

    public void setReceiveType(String receiveType) {
        this.receiveType = receiveType;
    }

    public String getReceiveEmail() {
        return receiveEmail;
    }

    public void setReceiveEmail(String receiveEmail) {
        this.receiveEmail = receiveEmail;
    }

    public String getReceiveProfile() {
        return receiveProfile;
    }

    public void setReceiveProfile(String receiveProfile) {
        this.receiveProfile = receiveProfile;
    }

    public String getReceiveSignature() {
        return receiveSignature;
    }

    public void setReceiveSignature(String receiveSignature) {
        this.receiveSignature = receiveSignature;
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
        ChatView other = (ChatView) that;
        return (this.getChatId() == null ? other.getChatId() == null : this.getChatId().equals(other.getChatId()))
            && (this.getChatDate() == null ? other.getChatDate() == null : this.getChatDate().equals(other.getChatDate()))
            && (this.getChatType() == null ? other.getChatType() == null : this.getChatType().equals(other.getChatType()))
            && (this.getChatContent() == null ? other.getChatContent() == null : this.getChatContent().equals(other.getChatContent()))
            && (this.getSendId() == null ? other.getSendId() == null : this.getSendId().equals(other.getSendId()))
            && (this.getReceiveId() == null ? other.getReceiveId() == null : this.getReceiveId().equals(other.getReceiveId()))
            && (this.getChatMesg() == null ? other.getChatMesg() == null : this.getChatMesg().equals(other.getChatMesg()))
            && (this.getSendName() == null ? other.getSendName() == null : this.getSendName().equals(other.getSendName()))
            && (this.getSendSex() == null ? other.getSendSex() == null : this.getSendSex().equals(other.getSendSex()))
            && (this.getSendBirth() == null ? other.getSendBirth() == null : this.getSendBirth().equals(other.getSendBirth()))
            && (this.getSendTel() == null ? other.getSendTel() == null : this.getSendTel().equals(other.getSendTel()))
            && (this.getSendAddr() == null ? other.getSendAddr() == null : this.getSendAddr().equals(other.getSendAddr()))
            && (this.getSendType() == null ? other.getSendType() == null : this.getSendType().equals(other.getSendType()))
            && (this.getSendEmail() == null ? other.getSendEmail() == null : this.getSendEmail().equals(other.getSendEmail()))
            && (this.getSendProfile() == null ? other.getSendProfile() == null : this.getSendProfile().equals(other.getSendProfile()))
            && (this.getSendSignature() == null ? other.getSendSignature() == null : this.getSendSignature().equals(other.getSendSignature()))
            && (this.getReceiveName() == null ? other.getReceiveName() == null : this.getReceiveName().equals(other.getReceiveName()))
            && (this.getReceiveSex() == null ? other.getReceiveSex() == null : this.getReceiveSex().equals(other.getReceiveSex()))
            && (this.getReceiveBirth() == null ? other.getReceiveBirth() == null : this.getReceiveBirth().equals(other.getReceiveBirth()))
            && (this.getReceiveTel() == null ? other.getReceiveTel() == null : this.getReceiveTel().equals(other.getReceiveTel()))
            && (this.getReceiveAddr() == null ? other.getReceiveAddr() == null : this.getReceiveAddr().equals(other.getReceiveAddr()))
            && (this.getReceiveType() == null ? other.getReceiveType() == null : this.getReceiveType().equals(other.getReceiveType()))
            && (this.getReceiveEmail() == null ? other.getReceiveEmail() == null : this.getReceiveEmail().equals(other.getReceiveEmail()))
            && (this.getReceiveProfile() == null ? other.getReceiveProfile() == null : this.getReceiveProfile().equals(other.getReceiveProfile()))
            && (this.getReceiveSignature() == null ? other.getReceiveSignature() == null : this.getReceiveSignature().equals(other.getReceiveSignature()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChatId() == null) ? 0 : getChatId().hashCode());
        result = prime * result + ((getChatDate() == null) ? 0 : getChatDate().hashCode());
        result = prime * result + ((getChatType() == null) ? 0 : getChatType().hashCode());
        result = prime * result + ((getChatContent() == null) ? 0 : getChatContent().hashCode());
        result = prime * result + ((getSendId() == null) ? 0 : getSendId().hashCode());
        result = prime * result + ((getReceiveId() == null) ? 0 : getReceiveId().hashCode());
        result = prime * result + ((getChatMesg() == null) ? 0 : getChatMesg().hashCode());
        result = prime * result + ((getSendName() == null) ? 0 : getSendName().hashCode());
        result = prime * result + ((getSendSex() == null) ? 0 : getSendSex().hashCode());
        result = prime * result + ((getSendBirth() == null) ? 0 : getSendBirth().hashCode());
        result = prime * result + ((getSendTel() == null) ? 0 : getSendTel().hashCode());
        result = prime * result + ((getSendAddr() == null) ? 0 : getSendAddr().hashCode());
        result = prime * result + ((getSendType() == null) ? 0 : getSendType().hashCode());
        result = prime * result + ((getSendEmail() == null) ? 0 : getSendEmail().hashCode());
        result = prime * result + ((getSendProfile() == null) ? 0 : getSendProfile().hashCode());
        result = prime * result + ((getSendSignature() == null) ? 0 : getSendSignature().hashCode());
        result = prime * result + ((getReceiveName() == null) ? 0 : getReceiveName().hashCode());
        result = prime * result + ((getReceiveSex() == null) ? 0 : getReceiveSex().hashCode());
        result = prime * result + ((getReceiveBirth() == null) ? 0 : getReceiveBirth().hashCode());
        result = prime * result + ((getReceiveTel() == null) ? 0 : getReceiveTel().hashCode());
        result = prime * result + ((getReceiveAddr() == null) ? 0 : getReceiveAddr().hashCode());
        result = prime * result + ((getReceiveType() == null) ? 0 : getReceiveType().hashCode());
        result = prime * result + ((getReceiveEmail() == null) ? 0 : getReceiveEmail().hashCode());
        result = prime * result + ((getReceiveProfile() == null) ? 0 : getReceiveProfile().hashCode());
        result = prime * result + ((getReceiveSignature() == null) ? 0 : getReceiveSignature().hashCode());
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
        sb.append(", chatType=").append(chatType);
        sb.append(", chatContent=").append(chatContent);
        sb.append(", sendId=").append(sendId);
        sb.append(", receiveId=").append(receiveId);
        sb.append(", chatMesg=").append(chatMesg);
        sb.append(", sendName=").append(sendName);
        sb.append(", sendSex=").append(sendSex);
        sb.append(", sendBirth=").append(sendBirth);
        sb.append(", sendTel=").append(sendTel);
        sb.append(", sendAddr=").append(sendAddr);
        sb.append(", sendType=").append(sendType);
        sb.append(", sendEmail=").append(sendEmail);
        sb.append(", sendProfile=").append(sendProfile);
        sb.append(", sendSignature=").append(sendSignature);
        sb.append(", receiveName=").append(receiveName);
        sb.append(", receiveSex=").append(receiveSex);
        sb.append(", receiveBirth=").append(receiveBirth);
        sb.append(", receiveTel=").append(receiveTel);
        sb.append(", receiveAddr=").append(receiveAddr);
        sb.append(", receiveType=").append(receiveType);
        sb.append(", receiveEmail=").append(receiveEmail);
        sb.append(", receiveProfile=").append(receiveProfile);
        sb.append(", receiveSignature=").append(receiveSignature);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}