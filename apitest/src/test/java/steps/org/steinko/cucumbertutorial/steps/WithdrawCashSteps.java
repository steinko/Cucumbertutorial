package org.steinko.cucumbertutorial.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;



import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;

public class WithdrawCashSteps {
	
	
	
	
	
	
	@Given("I have $\\({int}) in my account")
	public void iHave$InMyAccount( int amount) {

     
	}

	@When("I request $\\({int})")
	public void iRequest$(int amount) {
	       
	}

	@Then("$\\({int}) should be dispensed")
	public void $ShouldBeDispensed(int expectedAmount) {
	    
	}
	
	@Given("my card is invalid")
	public void myCardIsInvalid() {
	  
	}

	@Then("my card should not be returned")
	public void myCardShouldNotBeReturned() {
		
	}

	@Then("I should be told  that {string}")
	public void iShouldBeToldThat(String expectedMessage) {
		
	}
	
	@When("I choose to witdraw the fixed amount of $\\({int})")
	public void iChooseToWitdrawTheFixedAmountOf$(int amount) {
			  
			
	}

	@Then("I should recive $\\({int}) cash")
	public void iShouldRecive$Cash(int int1) {
	    
	}

	@Then("the balance of my accout should be $\\({int})")
	public void theBalanceOfMyAccoutShouldBe$(int amount) {
		 
	}
	
	@Then("I should recive recive $50 in cash")
	public void iShouldReciveRecive$50InCash() {
		
	   
	}

	@Then("I should recive recive $100 in cash")
	public void iShouldReciveRecive$100InCash() {
		
	}

	@Then("I should recive recive $200 in cash")
	public void iShouldReciveRecive$200InCash() {
		
	}

	@Then("I should recive Amount to witdraw to high")
	public void iShouldReciveAmountToWitdrawToHigh() {
		
	}
}
