package net.ddns.freakyvicky.tmserv.rest.model;

public class TextRequest {

    protected Integer reference;

    protected String text;

    public void setReference(Integer reference) {
        this.reference = reference;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getReference() {
        return reference;
    }

    public String getText() {
        return text;
    }

}
