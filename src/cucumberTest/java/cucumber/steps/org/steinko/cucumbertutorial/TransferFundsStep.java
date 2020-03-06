package org.steinko.cucumbertutorial;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class TransferFundsStep {
	
	CheckingAccount checkingAccount = new CheckingAccount();
	SavingsAccount savingsAccount = new SavingsAccount();
	
	@Given("I have deposited $\\({int}) in my Checking Account")
	public void iHaveDeposited$InMyCheckingAccount(int amount) {
		checkingAccount.deposit(amount);
		assertEquals(amount, checkingAccount.balance());
	}

	@Given("I have deposited $\\({int}) in my Savings Account")
	public void iHaveDeposited$InMySavingsAccount(int amount) {
		savingsAccount.deposit(amount);
		assertEquals(amount, savingsAccount.balance());
	}

	@When("I transfer $\\({int}) from my Savings Account into my Checking Account")
	public void iTransfer$FromMySavingsAccountIntoMyCheckingAccount(int transferAmount) {
		savingsAccount.transfer(transferAmount,checkingAccount);
	}

	@When("the balance of the Savings Accont should be $\\({int})")
	public void theBalanceOfTheSavingsAccontShouldBe$(int expectedBalance) {
		assertEquals(savingsAccount.balance(),expectedBalance);
	}

	@When("the balance of the Checking Account should be  $\\({int})")
	public void theBalanceOfTheCheckingAccountShouldBe$(int expectedBalance) {
		assertEquals(checkingAccount.balance(),expectedBalance);
	}


}
