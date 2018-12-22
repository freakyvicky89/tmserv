package net.ddns.freakyvicky.tmserv.ai;

import net.ddns.freakyvicky.tmserv.ai.glove.GloveWrapper;

public interface GloveFactory {

    GloveWrapper getFittedGlove(String input, int reference);

}
