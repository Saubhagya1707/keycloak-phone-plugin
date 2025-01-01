package cc.coopersoft.keycloak.phone.providers.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Objects;

public class MessageSendException extends Exception {

    private Integer statusCode = -1;
    private String errorCode = "";
    private String errorMessage = "";

    public MessageSendException(String message, Throwable cause) {
        super(message, cause);
    }

    public MessageSendException(Integer statusCode, String errorCode, String errorMessage) {
        this.statusCode = statusCode;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public MessageSendException(String message, Integer statusCode, String errorCode, String errorMessage) {
        super(message);
        this.statusCode = statusCode;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public MessageSendException(String message, Throwable cause, Integer statusCode, String errorCode, String errorMessage) {
        super(message, cause);
        this.statusCode = statusCode;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public MessageSendException(Throwable cause, Integer statusCode, String errorCode, String errorMessage) {
        super(cause);
        this.statusCode = statusCode;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public MessageSendException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Integer statusCode, String errorCode, String errorMessage) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.statusCode = statusCode;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public MessageSendException() {
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageSendException that = (MessageSendException) o;
        return Objects.equals(statusCode, that.statusCode) && Objects.equals(errorCode, that.errorCode) && Objects.equals(errorMessage, that.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusCode, errorCode, errorMessage);
    }
}
