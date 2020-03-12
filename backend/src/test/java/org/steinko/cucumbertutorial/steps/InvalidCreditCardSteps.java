package org.steinko.cucumbertutorial.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.steinko.cucumbertutorial.domain.Bank;
import org.steinko.cucumbertutorial.domain.Betaling;


public class InvalidCreditCardSteps {
	private Bank bank = new Bank();
	private Betaling betaling = new Betaling(bank);
	
	private long creditCardNumber;
	private Integer validMonth;
	private Integer validYear;
	private Integer aCvc;
	private String message; 
	
	
	
	
	
	@Given("I have chosen some items to buy")
	public void iHaveChosenSomeItemsToBuy() {
	    
	}

	@Given("I am about to enter my credit card details")
	public void iAmAboutToEnterMyCreditCardDetails() {
		Long creditCardNumber = 123456789123456L;
		bank.issueCreditCard(creditCardNumber, 07, 23, 737 ,1234);
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
		message = betaling.validate(creditCardNumber,validMonth,validYear,aCvc);
	}
	
	@Then("the form should be redisplayed")
	public void theFormShouldBeRedisplayed() {
	    
	}

	@Then("I should see a message  {string}")
	public void iShouldSeeAMessage(String expected) {
	   assertEquals(message,expected);
	}

}
