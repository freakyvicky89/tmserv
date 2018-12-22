package net.ddns.freakyvicky.tmserv.ai;

import net.ddns.freakyvicky.tmserv.ai.glove.GloveWrapper;
import net.ddns.freakyvicky.tmserv.db.SamplePersistanceService;
import net.ddns.freakyvicky.tmserv.util.model.Sample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DefaultLoadingService implements LoadingService {

    @Resource
    private GloveFactory gloveFactory;

    @Resource
    private SamplePersistanceService persistanceService;

    public DefaultLoadingService(GloveFactory gloveFactory,
                                 SamplePersistanceService persistanceService) {

        this.gloveFactory = gloveFactory;
        this.persistanceService = persistanceService;
    }

    @Override
    public void loadAndCheckData(Sample sample) {
        gloveFactory.getFittedGlove(sample);
        persistanceService.addOrUpdateSample(sample);
    }

}
