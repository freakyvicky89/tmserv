package net.ddns.freakyvicky.tmserv.db;

import net.ddns.freakyvicky.tmserv.db.model.SampleEntity;
import org.springframework.data.repository.CrudRepository;

interface SamplesRepository extends CrudRepository<SampleEntity, Integer> {

}
