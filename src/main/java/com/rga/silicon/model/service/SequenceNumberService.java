package com.rga.silicon.model.service;

import com.rga.silicon.model.SequenceNumber;
import com.rga.silicon.model.SequenceNumberType;

public interface SequenceNumberService {

    SequenceNumber next(SequenceNumberType type);

}
