package com.rga.silicon.base


import org.springframework.boot.context.embedded.LocalServerPort
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment
import org.springframework.test.context.TestExecutionListeners
import org.springframework.test.context.TestExecutionListeners.MergeMode

import com.jayway.restassured.RestAssured
import com.rga.silicon.Application
import com.rocko.test.MongoDataTestExecutionListener

import spock.lang.Specification;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = Application.class)
@TestExecutionListeners(listeners = MongoDataTestExecutionListener.class, mergeMode = MergeMode.MERGE_WITH_DEFAULTS)
abstract class AbstractBase extends Specification {

    @LocalServerPort
    int port

    def setup() {
        RestAssured.port = port
    }
}

