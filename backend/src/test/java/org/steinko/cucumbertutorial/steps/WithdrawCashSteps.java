package org.steinko.cucumbertutorial.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.steinko.cucumbertutorial.domain.ATM;
import org.steinko.cucumbertutorial.domain.Bank;
import org.steinko.cucumbertutorial.domain.Betaling;
import org.steinko.cucumbertutorial.domain.Money;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;

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
	
	@ParameterType(".*")
	public Money money(String amount) { 
		return new Money(amount);
	}
	
	
	
	@Given("I have $\\({money}) in my account")
	public void iHave$InMyAccount( Money amount) {
		bank.issueCreditCard(creditCardNumber, month, year, cvc, pin);
		bank.deposit(accountId, amount);
		assertEquals(amount,bank.balance(accountId));
	}

	@When("I request $\\({money})")
	public void iRequest$(Money amount) {
	        atm.withdraw(accountId,amount);
	}

	@Then("$\\({money}) should be dispensed")
	public void $ShouldBeDispensed(Money expectedAmount) {
	    assertEquals(expectedAmount,atm.dispenced());
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
	
	@When("I choose to witdraw the fixed amount of $\\({money})")
	public void iChooseToWitdrawTheFixedAmountOf$(Money amount) {
			   atm.withdraw(accountId,amount);
			
	}

	@Then("I should recive $\\({money}) cash")
	public void iShouldRecive$Cash(Money int1) {
	    
	}

	@Then("the balance of my accout should be $\\({money})")
	public void theBalanceOfMyAccoutShouldBe$(Money amount) {
		 assertEquals( amount,bank.balance(accountId));
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
