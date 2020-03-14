package org.steinko.cucumbertutorial.controller;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import org.junit.jupiter.api.Test;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.post;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static io.restassured.http.ContentType.JSON;
import static org.springframework.http.HttpStatus.CREATED;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class BankControllerIT {
	
	@LocalServerPort
	 private  int localServerPort;
	 private String url;
	 
	 @Autowired
	  private WebApplicationContext webApplicationContext;
	   
	 
	 @Test
	  void shouldDepositAmount()  {
		url =  "http://localhost:" + localServerPort + "/bank/deposit";
		given()
	     .param("accountId","2")
	     .param("amount","100").
	     webAppContextSetup(webApplicationContext).
	    when()
	       .post(url).
	    then()
	        .log().ifValidationFails()
	        .statusCode(CREATED.value());	
	  }

}
