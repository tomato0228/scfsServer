package ltd.tomato.model;

import java.io.Serializable;

/**
 * validation
 * @author 
 */
public class Validation implements Serializable {
    /**
     * 验证者的ID
     */
    private Integer validationId;

    /**
     * 验证者的账号（手机号，邮箱）
     */
    private String validationAcc;

    /**
     * 验证码
     */
    private String validationCode;

    private static final long serialVersionUID = 1L;

    public Integer getValidationId() {
        return validationId;
    }

    public void setValidationId(Integer validationId) {
        this.validationId = validationId;
    }

    public String getValidationAcc() {
        return validationAcc;
    }

    public void setValidationAcc(String validationAcc) {
        this.validationAcc = validationAcc;
    }

    public String getValidationCode() {
        return validationCode;
    }

    public void setValidationCode(String validationCode) {
        this.validationCode = validationCode;
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
        Validation other = (Validation) that;
        return (this.getValidationId() == null ? other.getValidationId() == null : this.getValidationId().equals(other.getValidationId()))
            && (this.getValidationAcc() == null ? other.getValidationAcc() == null : this.getValidationAcc().equals(other.getValidationAcc()))
            && (this.getValidationCode() == null ? other.getValidationCode() == null : this.getValidationCode().equals(other.getValidationCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getValidationId() == null) ? 0 : getValidationId().hashCode());
        result = prime * result + ((getValidationAcc() == null) ? 0 : getValidationAcc().hashCode());
        result = prime * result + ((getValidationCode() == null) ? 0 : getValidationCode().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", validationId=").append(validationId);
        sb.append(", validationAcc=").append(validationAcc);
        sb.append(", validationCode=").append(validationCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}