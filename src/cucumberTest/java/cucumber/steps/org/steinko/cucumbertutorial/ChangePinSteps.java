package org.steinko.cucumbertutorial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;


public class ChangePinSteps {
	Bank bank = new Bank();
	ATM atm = new ATM(bank);
	CreditCard creditCard;
	Long creditCardNumber = 4169850001064067L;
	int month = 07;
	int year = 23;
    int cvc = 753;			
	int issuedPin = 1234;
	
	
	@Given("I have been issued a new card")
	public void iHaveBeenIssuedANewCard() {
		creditCard = bank.issueCreditCard(creditCardNumber, month, year, cvc, issuedPin);
	}

	@Given("I insert the card, entring the correct PIN")
	public void iInsertTheCardEntringTheCorrectPIN() {
	   atm.insertedCard(creditCardNumber);
	   atm.enterPin(issuedPin);
	}

	@When("I choose {string} from the menu")
	public void iChooseFromTheMenu(String menuItem) {
	    atm.selectMenuItem(menuItem);
	}

	@When("I change the PIN to \\({int})")
	public void iChangeThePINTo(int pin) {
	   atm.changePin(pin);
	}

	@Then("the system should remember my PIN is now \\({int})")
	public void theSystemShouldRememberMyPINIsNow(int expectedPin) {
	    assertEquals(expectedPin,creditCard.getPin());
	}
	
	@Given("I insert the card, entring the correct PIN \\({int})")
	public void iInsertTheCardEntringTheCorrectPIN(Integer pin) {
		atm.insertedCard(4169850001064067L);
		atm.enterPin(pin);
		assertTrue(atm.corectPin());
	}


	@Then("I should see a message {string}")
	public void iShouldSeeAMessage(String expectedMessage) {
	    assertEquals(expectedMessage,bank.validate(creditCardNumber, month,year, cvc));
	}


}
