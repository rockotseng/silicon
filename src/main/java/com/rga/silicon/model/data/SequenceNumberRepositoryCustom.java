package com.rga.silicon.model.data;

import com.rga.silicon.model.SequenceNumber;
import com.rga.silicon.model.SequenceNumberType;

public interface SequenceNumberRepositoryCustom {

    SequenceNumber getNextSequenceNumber(SequenceNumberType type, String yearMonth);

}
