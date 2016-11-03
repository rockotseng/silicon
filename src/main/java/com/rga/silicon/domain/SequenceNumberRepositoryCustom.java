package com.rga.silicon.domain;

public interface SequenceNumberRepositoryCustom {

    SequenceNumber getNextSequenceNumber(SequenceNumberType type, String yearMonth);

}
