package org.steinko.cucumbertutorial;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.Before;

public class WithdrawCashSteps {
	Bank bank = new Bank();
	ATM atm = new ATM(bank);
	Betaling betaling = new Betaling(bank);
	
	Long creditCardNumber = 4169850001064061L;
	int month = 07;
	int year = 23;
	int cvc = 074;
	int pin = 1234;
	Integer amountWithDrawn= 0;
	boolean amountRecived = true;
	int accountId = 1;
	
	
	
	@Given("I have $\\({int}) in my account")
	public void iHave$InMyAccount(int amount) {
		bank.issueCreditCard(creditCardNumber, month, year, cvc, pin);
		Money money = new Money(amount);
		bank.deposit(accountId, money);
		assertEquals(money,bank.balance(accountId));
	}

	@When("I request $\\({int})")
	public void iRequest$(int amount) {
	        Money money = new Money(amount);
			atm.withdraw(accountId,money);
	}

	@Then("$\\({int}) should be dispensed")
	public void $ShouldBeDispensed(int expectedAmount) {
		Money money = new Money(expectedAmount);
	    assertEquals(money,atm.dispenced());
	}
	
	@Given("my card is invalid")
	public void myCardIsInvalid() {
	   bank.invalidate(creditCardNumber);
	}

	@Then("my card should not be returned")
	public void myCardShouldNotBeReturned() {
		assertFalse(atm.returnCard());
	}

	@Then("I should be told  that {string}")
	public void iShouldBeToldThat(String expectedMessage) {
		String message =  betaling.validate(4169850001064061L, 02, 23, 074);
		assertEquals(expectedMessage,message);
	}
	
	@When("I choose to witdraw the fixed amount of $\\({int})")
	public void iChooseToWitdrawTheFixedAmountOf$(int amount) {
		       Money money = new Money(amount);
			   atm.withdraw(accountId,money);
			
	}

	@Then("I should recive $\\({int}) cash")
	public void iShouldRecive$Cash(Integer int1) {
	    
	}

	@Then("the balance of my accout should be $\\({int})")
	public void theBalanceOfMyAccoutShouldBe$(int amount) {
		Money money = new Money(amount);
		 assertEquals( money,bank.balance(accountId));
	}
	
	@Then("I should recive recive $50 in cash")
	public void iShouldReciveRecive$50InCash() {
		 assertEquals("recive $50 in cash",atm.message());
	   
	}

	@Then("I should recive recive $100 in cash")
	public void iShouldReciveRecive$100InCash() {
		 assertEquals("recive $100 in cash",atm.message());
	}

	@Then("I should recive recive $200 in cash")
	public void iShouldReciveRecive$200InCash() {
		assertEquals("recive $200 in cash",atm.message());
	}

	@Then("I should recive Amount to witdraw to high")
	public void iShouldReciveAmountToWitdrawToHigh() {
		assertEquals("Amount to witdraw to high",atm.message());
	}
}
