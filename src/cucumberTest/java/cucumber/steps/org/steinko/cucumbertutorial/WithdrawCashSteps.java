package org.steinko.cucumbertutorial;

import static org.junit.Assert.assertEquals;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;


public class WithdrawCashSteps {
	
	Account account = new Account();
	
	@Given("I have $(100) in my account")
	public void iHave$100InMyAccount() {
	   assertEquals(100,account.total());
	}

	@When("I request $20")
	public void iRequest$20() {
		account.withdraw(20);
	}

	@Then("$20 should be dispensed")
	public void $20ShouldBeDispensed() {
	    assertEquals(80,account.total());
	}
	

	
	@Given("I have $80 in my account")
	public void iHave$InMyAccount(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	@Given("I have $\\({int}) in my account")
	public void iHave$InMyAccount(int amount) {
		 assertEquals(amount,account.total());
	}

	@When("I request $\\({int})")
	public void iRequest$(Integer amount) {
		account.withdraw(amount);
	}

	@Then("$\\({int}) should be dispensed")
	public void $ShouldBeDispensed(Integer int1) {
	    
	}
}
