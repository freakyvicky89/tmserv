package net.ddns.freakyvicky.tmserv.rest.model;

public class TextRequest {

    protected Integer reference;
    protected String text;

    public TextRequest(String text) {
        this.text = text;
    }

    public TextRequest(Integer reference, String text) {
        this.reference = reference;
        this.text = text;
    }

    public Integer getReference() {
        return reference;
    }

    public String getText() {
        return text;
    }

}
