package org.steinko.cucumbertutorial.controller;

import org.junit.jupiter.api.Test;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.post;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static io.restassured.http.ContentType.JSON;
import static org.springframework.http.HttpStatus.CREATED;


public class BankControllerTest {
	
	@Test
	  public void shouldDeposit()  {
	    
	    String url = "/bank/deposit";
	    
	     
	    given()
	     .param("accountId","2")
	     .param("amount","100")
	     .standaloneSetup(new BankController()).
	    when()
	       .post(url).
	    then()
	        .log().ifValidationFails()
	        .statusCode(CREATED.value());
	  }

}
