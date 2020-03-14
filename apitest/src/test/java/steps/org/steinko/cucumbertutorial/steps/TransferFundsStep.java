package org.steinko.cucumbertutorial.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TransferFundsStep {
	
	
	
	@Given("I have deposited $\\({int}) in my Checking Account")
	public void iHaveDeposited$InMyCheckingAccount(int amount) {
		
	}

	@Given("I have deposited $\\({int}) in my Savings Account")
	public void iHaveDeposited$InMySavingsAccount(int amount) {
		
	}

	@When("I transfer $\\({int}) from my Savings Account into my Checking Account")
	public void iTransfer$FromMySavingsAccountIntoMyCheckingAccount(int transferAmount) {
		
	}

	@When("the balance of the Savings Accont should be $\\({int})")
	public void theBalanceOfTheSavingsAccontShouldBe$(int expectedBalance) {
		
	}

	@When("the balance of the Checking Account should be  $\\({int})")
	public void theBalanceOfTheCheckingAccountShouldBe$(int expectedBalance) {
		
	}


}
