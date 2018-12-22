package net.ddns.freakyvicky.tmserv.util.model;

public class Sample {

    protected Integer reference;

    protected String text;

    public Sample() {
    }

    public Sample(Integer reference, String text) {
        this.reference = reference;
        this.text = text;
    }

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
