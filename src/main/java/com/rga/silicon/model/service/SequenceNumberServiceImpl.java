package com.rga.silicon.model.service;

import java.time.YearMonth;
import java.time.ZoneOffset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rga.silicon.model.SequenceNumber;
import com.rga.silicon.model.SequenceNumberType;
import com.rga.silicon.model.data.SequenceNumberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired) )
public class SequenceNumberServiceImpl implements SequenceNumberService {

    private final SequenceNumberRepository sequenceNumberRepository;

    @Override
    public SequenceNumber next(SequenceNumberType type) {
        SequenceNumber sequenceNumber =
                sequenceNumberRepository.getNextSequenceNumber(type, YearMonth.now(ZoneOffset.UTC).toString());
        return sequenceNumber;
    }

}
