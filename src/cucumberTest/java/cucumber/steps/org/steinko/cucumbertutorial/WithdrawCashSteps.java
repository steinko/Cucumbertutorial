package org.steinko.cucumbertutorial;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.Before;

public class WithdrawCashSteps {
	ATM atm = new ATM();
	Account account= new Account();
	CreditCard creditCard = new CreditCard(0L, 0, 0, 0, 0);;
	Integer amountWithDrawn= 0;
	boolean amountRecived = true;
	
	
	
	@Given("I have $\\({int}) in my account")
	public void iHave$InMyAccount(int amount) {
		account.deposit(amount);
		 assertEquals(amount,account.balance());
	}

	@When("I request $\\({int})")
	public void iRequest$(int amount) {
		try {
			account.withdraw(amount);
			amountRecived = true;
		}  catch (AmountToHighException e) {
			amountRecived = false;
		}
		
		atm.withdrawn(new Integer(amount),amountRecived);
	}

	@Then("$\\({int}) should be dispensed")
	public void $ShouldBeDispensed(int expectedAmount) {
	    assertEquals(expectedAmount,atm.dispenced());
	}
	
	@Given("my card is invalid")
	public void myCardIsInvalid() {
	   creditCard.invalidate();
	}

	@Then("my card should not be returned")
	public void myCardShouldNotBeReturned() {
		assertFalse(atm.returnCard());
	}

	@Then("I should be told  that {string}")
	public void iShouldBeToldThat(String expectedMessage) {
		String message =  creditCard.validate(4169850001064061L, 02, 23, 074);
		assertEquals(expectedMessage,message);
	}
	
	@When("I choose to witdraw the fixed amount of $\\({int})")
	public void iChooseToWitdrawTheFixedAmountOf$(int amount) {
		try {
			   account.withdraw(amount);
			   amountRecived = true;
		    }
	        catch (AmountToHighException e) {
	        	amountRecived = false;
	        }
		atm.withdrawn(amount,amountRecived);
	}

	@Then("I should recive $\\({int}) cash")
	public void iShouldRecive$Cash(Integer int1) {
	    
	}

	@Then("the balance of my accout should be $\\({int})")
	public void theBalanceOfMyAccoutShouldBe$(int amount) {
		 assertEquals(amount,account.balance());
	}
	
	@Then("I should recive recive $50 in chash")
	public void iShouldReciveRecive$50InChash() {
		 assertEquals("recive $50 in chash",atm.message());
	   
	}

	@Then("I should recive recive $100 in chash")
	public void iShouldReciveRecive$100InChash() {
		 assertEquals("recive $100 in chash",atm.message());
	}

	@Then("I should recive recive $200 in chash")
	public void iShouldReciveRecive$200InChash() {
		assertEquals("recive $200 in chash",atm.message());
	}

	@Then("I should recive Amount to witdraw to high")
	public void iShouldReciveAmountToWitdrawToHigh() {
		assertEquals("Amount to witdraw to high",atm.message());
	}
}
