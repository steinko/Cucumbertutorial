package org.steinko.cucumbertutorial;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;


public class ChangePinSteps {
	ATM atm = new ATM();
	Bank bank = new Bank();
	CreditCard creditCard;
	@Given("I have been issued a new card")
	public void iHaveBeenIssuedANewCard() {
		creditCard = bank.issueCreditCard(null, null, null, null, null);
	}

	@Given("I insert the card, entring the correct PIN")
	public void iInsertTheCardEntringTheCorrectPIN() {
	   atm.insertedCard(4169850001064067L);
	   atm.enterPin(1234);
	}

	@When("I choose {string} from the menu")
	public void iChooseFromTheMenu(String menuItem) {
	    atm.selectMenuItem(menuItem);
	}

	@When("I change the PIN to \\({int})")
	public void iChangeThePINTo(int pin) {
	   creditCard.changePin(pin);
	}

	@Then("the system should remember my PIN is now \\({int})")
	public void theSystemShouldRememberMyPINIsNow(int expectedPin) {
	    assertEquals(expectedPin,creditCard.pin());
	}
	
	@Given("I insert the card, entring the correct PIN \\({int})")
	public void iInsertTheCardEntringTheCorrectPIN(Integer pin) {
		atm.insertedCard(4169850001064067L);
		atm.enterPin(pin);
		assertTrue(atm.corectPin());
	}


	@Then("I should see a message {string}")
	public void iShouldSeeAMessage(String expectedMessage) {
	    assertEquals(expectedMessage,bank.validate(4169850001064067L, 07,23, 753));
	}


}
