package com.rga.silicon;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.rga.silicon.web.SequenceNumberDto;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
// @Slf4j
public class CreateSequenceNumberApiTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void create() {

        String body = "{\"type\":\"CLAIM\"}";

        HttpHeaders header = new HttpHeaders();
        header.setContentType(MediaType.APPLICATION_JSON);
        header.set("Trace-Id", "6bfd228dc00d216b");

        ResponseEntity<SequenceNumberDto> response = restTemplate.exchange("/sequence-numbers", HttpMethod.POST,
                new HttpEntity<>(body, header), SequenceNumberDto.class);

        assertThat(response.getStatusCode(), is(HttpStatus.OK));
        assertThat(response.getBody().getNumber(), is(1L));
    }
}
