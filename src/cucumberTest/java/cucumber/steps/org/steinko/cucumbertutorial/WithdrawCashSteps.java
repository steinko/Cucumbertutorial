package org.steinko.cucumbertutorial;

import static org.junit.Assert.assertEquals;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;


public class WithdrawCashSteps {
	
	Account account = new Account();
	CreditCard creditCard = new CreditCard(1234);
	
	@Given("I have $80 in my account")
	public void iHave$InMyAccount(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("I have $\\({int}) in my account")
	public void iHave$InMyAccount(int amount) {
		account.deposit(amount);
		 assertEquals(amount,account.balance());
	}

	@When("I request $\\({int})")
	public void iRequest$(Integer amount) {
		account.withdraw(amount);
	}

	@Then("$\\({int}) should be dispensed")
	public void $ShouldBeDispensed(Integer int1) {
	    
	}
	
	@Given("my card is invalid")
	public void myCardIsInvalid() {
	   creditCard.invalidate();
	}

	@Then("my card should not be returned")
	public void myCardShouldNotBeReturned() {
	}

	@Then("I should be told  that {string}")
	public void iShouldBeToldThat(String expectedMessage) {
		String message =  creditCard.validate(4169850001064061L, 02, 23, 074);
		assertEquals(expectedMessage,message);
	}
}
