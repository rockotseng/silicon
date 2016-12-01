package com.rga.silicon.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rga.silicon.domain.SequenceNumber;
import com.rga.silicon.service.SequenceNumberService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/sequence-numbers")
@RequiredArgsConstructor
public class SequenceNumberController {

    private final SequenceNumberService sequenceNumberService;

    @PostMapping
    public SequenceNumberDto create(@RequestBody CreateSequenceNumberDto dto) {
        SequenceNumber sequenceNumber = sequenceNumberService.next(dto.getType());
        return SequenceNumberDto.of(sequenceNumber);
    }

}
