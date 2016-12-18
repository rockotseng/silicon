package com.rga.silicon;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rga.silicon.model.SequenceNumber;
import com.rga.silicon.model.SequenceNumberType;
import com.rga.silicon.model.data.SequenceNumberRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Ignore
public class SequenceNumberRepositoryTest {

    @Autowired
    SequenceNumberRepository repository;

    @Before
    @After
    public void clearDb() {
        repository.deleteAll();
    }

    @Test
    public void getNextSequenceNumber() {
        SequenceNumber sequenceNumber = repository.getNextSequenceNumber(SequenceNumberType.CLAIM, "2016-10");
        assertThat(sequenceNumber.getNumber(), is(1L));
        sequenceNumber = repository.getNextSequenceNumber(SequenceNumberType.CLAIM, "2016-10");
        assertThat(sequenceNumber.getNumber(), is(2L));
    }

}
