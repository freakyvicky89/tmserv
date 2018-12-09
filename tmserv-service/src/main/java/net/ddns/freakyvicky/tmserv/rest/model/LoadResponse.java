package net.ddns.freakyvicky.tmserv.rest.model;

public class LoadResponse {

    Integer errorCode;
    String message;

    public LoadResponse(Integer errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }

}
