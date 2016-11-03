package com.rga.silicon.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

import lombok.Data;

@Data
public class SequenceNumber {

    @Id
    private String id;

    @Version
    private Long version;

    private String yearMonth;
    private SequenceNumberType type;
    private Long number;

}
