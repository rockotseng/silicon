package com.rga.silicon.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(onConstructor = @__(@Autowired) )
public class SequenceNumberRepositoryImpl implements SequenceNumberRepositoryCustom {

    private final MongoOperations operations;

    @Override
    public SequenceNumber getNextSequenceNumber(SequenceNumberType type, String yearMonth) {
        Query query = new Query(Criteria.where("type").is(type).and("yearMonth").is(yearMonth));
        Update update = new Update().inc("number", 1);
        SequenceNumber sequenceNumber = operations.findAndModify(query, update,
                new FindAndModifyOptions().returnNew(true).upsert(true), SequenceNumber.class);
        return sequenceNumber;
    }

}
