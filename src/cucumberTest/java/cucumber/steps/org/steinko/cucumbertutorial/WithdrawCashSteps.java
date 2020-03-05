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
	

}
