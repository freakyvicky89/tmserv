package net.ddns.freakyvicky.tmserv.ai;

import net.ddns.freakyvicky.tmserv.ai.glove.GloveWrapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DefaultLoadingService implements LoadingService {

    @Resource
    GloveFactory gloveFactory;

    public DefaultLoadingService(GloveFactory gloveFactory) {
        this.gloveFactory = gloveFactory;
    }

    @Override
    public void loadData(String input, int reference) {
        GloveWrapper glove = gloveFactory.getFittedGlove(input, reference);
    }

}
