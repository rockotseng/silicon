package com.rga.silicon.web;

import com.rga.silicon.domain.SequenceNumber;
import com.rga.silicon.domain.SequenceNumberType;

import lombok.Data;

@Data
public class SequenceNumberDto {

    private String yearMonth;
    private SequenceNumberType type;
    private Long number;

    public static SequenceNumberDto of(SequenceNumber sequenceNumber) {
        SequenceNumberDto dto = new SequenceNumberDto();
        dto.setYearMonth(sequenceNumber.getYearMonth());
        dto.setType(sequenceNumber.getType());
        dto.setNumber(sequenceNumber.getNumber());
        return dto;
    }

}
