package net.ddns.freakyvicky.tmserv.ai.glove;

import org.deeplearning4j.models.glove.Glove;

public class GloveWrapper {

    private Glove glove;
    private int reference;

    GloveWrapper() {}

    public Glove getGlove() {
        return glove;
    }

    void setGlove(Glove glove) {
        this.glove = glove;
    }

    public int getReference() {
        return reference;
    }

    void setReference(int reference) {
        this.reference = reference;
    }

}
