package net.ddns.freakyvicky.tmserv.db.model;

import javax.persistence.*;

@Entity
@Table(name = "samples")
public class SampleEntity {

    @Id
    @Column
    private int reference;

    @Lob
    @Column
    private String text;

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
