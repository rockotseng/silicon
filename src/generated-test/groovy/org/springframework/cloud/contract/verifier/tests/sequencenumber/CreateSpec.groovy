package org.springframework.cloud.contract.verifier.tests.sequencenumber

import com.jayway.jsonpath.DocumentContext
import com.jayway.jsonpath.JsonPath
import com.rga.silicon.base.SequencenumberCreateBase

import static com.jayway.restassured.RestAssured.*
import static com.toomuchcoding.jsonassert.JsonAssertion.assertThatJson

class CreateSpec extends SequencenumberCreateBase {

	def validate_shouldReturn200() throws Exception {
		given:
			def request = given()
					.header("Content-Type", "application/json")
					.body('''{"type":"BLOCK"}''')

		when:
			def response = given().spec(request)
					.post("/sequence-numbers")

		then:
			response.statusCode == 200
		and:
			DocumentContext parsedJson = JsonPath.parse(response.body.asString())
			assertThatJson(parsedJson).field("type").isEqualTo("BLOCK")
			assertThatJson(parsedJson).field("number").isNull()
			isCurrentYearMonth(parsedJson.read('$.yearMonth'))
	}

}
