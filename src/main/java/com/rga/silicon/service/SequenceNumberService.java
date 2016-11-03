package com.rga.silicon.service;

import com.rga.silicon.domain.SequenceNumber;
import com.rga.silicon.domain.SequenceNumberType;

public interface SequenceNumberService {

    SequenceNumber next(SequenceNumberType type);

}
