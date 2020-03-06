package org.steinko.cucumbertutorial;

import static org.junit.Assert.assertEquals;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;


public class ChangePinSteps {
	ATM atm = new ATM();
	Bank bank = new Bank();
	CreditCard creditCard;
	@Given("I have been issued a new card")
	public void iHaveBeenIssuedANewCard() {
		creditCard = bank.issueCreditCard();
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


}
