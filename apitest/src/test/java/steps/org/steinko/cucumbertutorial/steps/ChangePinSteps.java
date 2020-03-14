package org.steinko.cucumbertutorial.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;


public class ChangePinSteps {
	
	
	@Given("I have been issued a new card")
	public void iHaveBeenIssuedANewCard() {
		
	}

	@Given("I insert the card, entring the correct PIN")
	public void iInsertTheCardEntringTheCorrectPIN() {
	   
	}

	@When("I choose {string} from the menu")
	public void iChooseFromTheMenu(String menuItem) {
	   
	}

	@When("I change the PIN to \\({int})")
	public void iChangeThePINTo(int pin) {
	   
	}

	@Then("the system should remember my PIN is now \\({int})")
	public void theSystemShouldRememberMyPINIsNow(int i) {
	}
	
	@Given("I insert the card, entring the correct PIN \\({int})")
	public void iInsertTheCardEntringTheCorrectPIN(Integer pin) {
		
	}


	@Then("I should see a message {string}")
	public void iShouldSeeAMessage(String expectedMessage) {
	 
	}


}
