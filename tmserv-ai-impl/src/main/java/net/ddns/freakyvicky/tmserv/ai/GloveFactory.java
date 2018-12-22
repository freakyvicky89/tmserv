package net.ddns.freakyvicky.tmserv.ai;

import net.ddns.freakyvicky.tmserv.ai.glove.GloveWrapper;
import net.ddns.freakyvicky.tmserv.util.model.Sample;

public interface GloveFactory {

    GloveWrapper getFittedGlove(Sample sample);

}
