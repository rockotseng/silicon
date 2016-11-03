package com.rga.silicon.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SequenceNumberRepository extends MongoRepository<SequenceNumber, String>, SequenceNumberRepositoryCustom {

}
