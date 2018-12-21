package net.ddns.freakyvicky.tmserv.util;

public enum ServerMessage {

    BAD_TEXT(1, "Text too short");

    int code;
    String message;

    ServerMessage(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
