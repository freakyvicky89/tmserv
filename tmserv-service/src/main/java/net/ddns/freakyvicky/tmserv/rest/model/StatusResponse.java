package net.ddns.freakyvicky.tmserv.rest.model;

public class StatusResponse {

    Integer errorCode;
    String message;

    public StatusResponse(Integer errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public static StatusResponse ok() {
        return new StatusResponse(0, "OK.");
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }

}
