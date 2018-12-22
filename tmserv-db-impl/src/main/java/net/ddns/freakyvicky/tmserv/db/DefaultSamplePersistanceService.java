package net.ddns.freakyvicky.tmserv.db;

import net.ddns.freakyvicky.tmserv.db.model.SampleEntity;
import net.ddns.freakyvicky.tmserv.util.model.Sample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class DefaultSamplePersistanceService implements SamplePersistanceService {

    @Resource
    private SamplesRepository samplesRepository;

    public DefaultSamplePersistanceService(SamplesRepository samplesRepository) {
        this.samplesRepository = samplesRepository;
    }

    @Override
    public void addOrUpdateSample(Sample sample) {
        SampleEntity sampleEntity = new SampleEntity();
        sampleEntity.setReference(sample.getReference());
        sampleEntity.setText(sample.getText());
        samplesRepository.save(sampleEntity);
    }

    @Override
    public Sample getSampleByReference(int reference) {
        Optional<SampleEntity> sampleEntity = samplesRepository.findById(reference);
        return new Sample(sampleEntity.get().getReference(), sampleEntity.get().getText());
    }

}
