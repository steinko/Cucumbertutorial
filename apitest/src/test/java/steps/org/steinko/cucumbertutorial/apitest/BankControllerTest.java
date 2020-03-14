package org.steinko.cucumbertutorial.apitest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.post;

public class BankControllerTest {
	
	@Test
	void shouldHaveDeposinedAmmount() {
		RestAssured.baseURI = "http://localhost:8080";
		Response response =  given().
	    	   param("accountId","1" ).
	    	   param("amount","100" ).
	          when()
	          .post("/bank/deposit");
	          response.then()
		       .statusCode(201);
	}

}
