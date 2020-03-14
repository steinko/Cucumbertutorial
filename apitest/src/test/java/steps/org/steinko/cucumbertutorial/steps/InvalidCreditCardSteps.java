package org.steinko.cucumbertutorial.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class InvalidCreditCardSteps {
	
	
	
	
	
	
	@Given("I have chosen some items to buy")
	public void iHaveChosenSomeItemsToBuy() {
	    
	}

	@Given("I am about to enter my credit card details")
	public void iAmAboutToEnterMyCreditCardDetails() {
		
	}
	
	@Given("I enter a card number {long}")
	public void iEnterACardNumber(Long creditCardNumber) {
	   
	}

	

	@Given("Valid To {int}\\/{int}")
	public void validTo(Integer month, Integer year) {
	   
	}

	@Given("CVC {int}")
	public void cvc(Integer cvc) {
	    
	}
	
	@When("I submit the form")
	public void iSubmitTheForm() {
		
	}
	
	@Then("the form should be redisplayed")
	public void theFormShouldBeRedisplayed() {
	    
	}

	@Then("I should see a message  {string}")
	public void iShouldSeeAMessage(String expected) {
	   
	}

}
