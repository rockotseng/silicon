package com.rga.silicon.model.data;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rga.silicon.model.SequenceNumber;

public interface SequenceNumberRepository extends MongoRepository<SequenceNumber, String>, SequenceNumberRepositoryCustom {

}
