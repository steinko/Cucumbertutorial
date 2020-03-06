package org.steinko.cucumbertutorial;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;


public class InvalidCreditCardSteps {
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
		creditCard = new CreditCard(0L, 0, 0, 0 ,0);
	}
	
	@Given("I enter a card number {long}")
	public void iEnterACardNumber(Long creditCardNumber) {
	   this.creditCardNumber = creditCardNumber;
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
		message = creditCard.validate(creditCardNumber,validMonth,validYear,aCvc);
	}
	
	@Then("the form should be redisplayed")
	public void theFormShouldBeRedisplayed() {
	    
	}

	@Then("I should see a message  {string}")
	public void iShouldSeeAMessage(String expected) {
	   assertEquals(message,expected);
	}

}
