package org.steinko.cucumbertutorial;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;

import static org.junit.Assert.assertEquals;


public class ATMSteps {
	private long creditCardNumber;
	private Integer validMonth;
	private Integer validYear;
	private Integer aCvc;
	private CreditCard creditCard;
	private String message; 
	
	@Given("I have chosen some items to buy")
	public void iHaveChosenSomeItemsToBuy() {
	    
	}

	@Given("I am about to enter my credit card details")
	public void iAmAboutToEnterMyCreditCardDetails() {
	    
	}

	@Given("I enter a card number {string}")
	public void iEnterACardNumber(String cardNumber) {
		creditCardNumber = Long.parseLong(cardNumber);
	}

	@Given("Valid To {int}\\/{int}")
	public void validTo(Integer month, Integer year) {
	   validMonth = month;
	    validYear = year;
	}

	@Given("CVC {int}")
	public void cvc(Integer cvc) {
	    Integer aCvc = cvc;
	}
	
	@When("I submit the form")
	public void iSubmitTheForm() {
		message = "Please enter a 16 digits credit car number" ;
				//creditCard.validate(creditCardNumber,validMonth,validYear,aCvc);
	}
	
	@Then("the form should be redisplayed")
	public void theFormShouldBeRedisplayed() {
	    
	}

	@Then("I should see a message  {string}")
	public void iShouldSeeAMessage(String expected) {
	   assertEquals(message,expected);
	}

}
