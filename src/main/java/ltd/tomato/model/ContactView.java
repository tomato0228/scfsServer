package ltd.tomato.model;

import java.io.Serializable;
import java.util.Date;

/**
 * contact_view
 * @author 
 */
public class ContactView implements Serializable {
    private Integer userId;

    private String userName;

    private String userTel;

    private String userType;

    private String userSignature;

    private String userEmail;

    private Integer chatId;

    private Integer otherId;

    private Date chatDate;

    private Integer chatType;

    private Long chatMesg;

    private Long chatMesgnum;

    private String chatContent;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserSignature() {
        return userSignature;
    }

    public void setUserSignature(String userSignature) {
        this.userSignature = userSignature;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Integer getChatId() {
        return chatId;
    }

    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }

    public Integer getOtherId() {
        return otherId;
    }

    public void setOtherId(Integer otherId) {
        this.otherId = otherId;
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

    public Long getChatMesg() {
        return chatMesg;
    }

    public void setChatMesg(Long chatMesg) {
        this.chatMesg = chatMesg;
    }

    public Long getChatMesgnum() {
        return chatMesgnum;
    }

    public void setChatMesgnum(Long chatMesgnum) {
        this.chatMesgnum = chatMesgnum;
    }

    public String getChatContent() {
        return chatContent;
    }

    public void setChatContent(String chatContent) {
        this.chatContent = chatContent;
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
        ContactView other = (ContactView) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserTel() == null ? other.getUserTel() == null : this.getUserTel().equals(other.getUserTel()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getUserSignature() == null ? other.getUserSignature() == null : this.getUserSignature().equals(other.getUserSignature()))
            && (this.getUserEmail() == null ? other.getUserEmail() == null : this.getUserEmail().equals(other.getUserEmail()))
            && (this.getChatId() == null ? other.getChatId() == null : this.getChatId().equals(other.getChatId()))
            && (this.getOtherId() == null ? other.getOtherId() == null : this.getOtherId().equals(other.getOtherId()))
            && (this.getChatDate() == null ? other.getChatDate() == null : this.getChatDate().equals(other.getChatDate()))
            && (this.getChatType() == null ? other.getChatType() == null : this.getChatType().equals(other.getChatType()))
            && (this.getChatMesg() == null ? other.getChatMesg() == null : this.getChatMesg().equals(other.getChatMesg()))
            && (this.getChatMesgnum() == null ? other.getChatMesgnum() == null : this.getChatMesgnum().equals(other.getChatMesgnum()))
            && (this.getChatContent() == null ? other.getChatContent() == null : this.getChatContent().equals(other.getChatContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserTel() == null) ? 0 : getUserTel().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getUserSignature() == null) ? 0 : getUserSignature().hashCode());
        result = prime * result + ((getUserEmail() == null) ? 0 : getUserEmail().hashCode());
        result = prime * result + ((getChatId() == null) ? 0 : getChatId().hashCode());
        result = prime * result + ((getOtherId() == null) ? 0 : getOtherId().hashCode());
        result = prime * result + ((getChatDate() == null) ? 0 : getChatDate().hashCode());
        result = prime * result + ((getChatType() == null) ? 0 : getChatType().hashCode());
        result = prime * result + ((getChatMesg() == null) ? 0 : getChatMesg().hashCode());
        result = prime * result + ((getChatMesgnum() == null) ? 0 : getChatMesgnum().hashCode());
        result = prime * result + ((getChatContent() == null) ? 0 : getChatContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userTel=").append(userTel);
        sb.append(", userType=").append(userType);
        sb.append(", userSignature=").append(userSignature);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", chatId=").append(chatId);
        sb.append(", otherId=").append(otherId);
        sb.append(", chatDate=").append(chatDate);
        sb.append(", chatType=").append(chatType);
        sb.append(", chatMesg=").append(chatMesg);
        sb.append(", chatMesgnum=").append(chatMesgnum);
        sb.append(", chatContent=").append(chatContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}