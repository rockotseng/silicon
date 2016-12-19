package com.rga.silicon.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rga.silicon.dto.CreateSequenceNumberDto;
import com.rga.silicon.dto.SequenceNumberDto;
import com.rga.silicon.model.SequenceNumber;
import com.rga.silicon.model.service.SequenceNumberService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/sequence-numbers")
@RequiredArgsConstructor(onConstructor = @__(@Autowired) )
public class SequenceNumberFacade {

    private final SequenceNumberService sequenceNumberService;

    @PostMapping
    public SequenceNumberDto create(@RequestBody CreateSequenceNumberDto dto) {
        SequenceNumber sequenceNumber = sequenceNumberService.next(dto.getType());
        return SequenceNumberDto.of(sequenceNumber);
    }

}
