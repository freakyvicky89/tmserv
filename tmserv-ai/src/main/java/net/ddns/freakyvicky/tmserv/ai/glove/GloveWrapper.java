package net.ddns.freakyvicky.tmserv.ai.glove;

import org.deeplearning4j.models.glove.Glove;

public class GloveWrapper {

    private Glove glove;
    private int reference;

    GloveWrapper(Glove glove, int reference) {
        this.glove = glove;
        this.reference = reference;
    }

    public Glove getGlove() {
        return glove;
    }

    public int getReference() {
        return reference;
    }

}
