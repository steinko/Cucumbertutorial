package org.steinko.cucumbertutorial;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransferFundsStep {
	
	CheckingAccount checkingAccount = new CheckingAccount();
	SavingsAccount savingsAccount = new SavingsAccount();
	
	@Given("I have deposited $\\({int}) in my Checking Account")
	public void iHaveDeposited$InMyCheckingAccount(int amount) {
		Money money = new Money(amount);
		checkingAccount.deposit(money);
		assertEquals(money, checkingAccount.balance());
	}

	@Given("I have deposited $\\({int}) in my Savings Account")
	public void iHaveDeposited$InMySavingsAccount(int amount) {
		Money money = new Money(amount);
		savingsAccount.deposit(money);
		assertEquals(money, savingsAccount.balance());
	}

	@When("I transfer $\\({int}) from my Savings Account into my Checking Account")
	public void iTransfer$FromMySavingsAccountIntoMyCheckingAccount(int transferAmount) {
		Money money = new Money(transferAmount);
		savingsAccount.transfer(money,checkingAccount);
	}

	@When("the balance of the Savings Accont should be $\\({int})")
	public void theBalanceOfTheSavingsAccontShouldBe$(int expectedBalance) {
		Money money = new Money(expectedBalance);
		assertEquals(savingsAccount.balance(),money);
	}

	@When("the balance of the Checking Account should be  $\\({int})")
	public void theBalanceOfTheCheckingAccountShouldBe$(int expectedBalance) {
		Money money = new Money(expectedBalance);
		assertEquals(checkingAccount.balance(),money);
	}


}
