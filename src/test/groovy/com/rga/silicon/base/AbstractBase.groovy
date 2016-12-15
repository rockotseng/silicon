package com.rga.silicon.base


import org.springframework.boot.context.embedded.LocalServerPort
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment

import com.jayway.restassured.RestAssured
import com.rga.silicon.Application

import spock.lang.Specification;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = Application.class)
abstract class AbstractBase extends Specification {

    @LocalServerPort
    int port
    
    def setup() {
        RestAssured.port = port
    }
    
}

