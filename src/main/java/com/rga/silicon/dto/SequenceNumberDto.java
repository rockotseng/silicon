package com.rga.silicon.dto;

import com.rga.silicon.model.SequenceNumber;
import com.rga.silicon.model.SequenceNumberType;

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
