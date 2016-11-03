package com.rga.silicon.service;

import java.time.YearMonth;
import java.time.ZoneOffset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rga.silicon.domain.SequenceNumber;
import com.rga.silicon.domain.SequenceNumberRepository;
import com.rga.silicon.domain.SequenceNumberType;

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
