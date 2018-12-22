package net.ddns.freakyvicky.tmserv.db;

import net.ddns.freakyvicky.tmserv.util.model.Sample;

public interface SamplePersistanceService {

    void addOrUpdateSample(Sample sample);

    Sample getSampleByReference(int reference);

}
