package org.steinko.cucumbertutorial;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;


public class ATMSteps {
	private long creditCardNumber;
	private Integer validMonth;
	private Integer validYear;
	private Integer aCvc;
	private CreditCard creditCard;
	private String message; 
	
	CheckingAccount checkingAccount = new CheckingAccount();
	SavingsAccount savingsAccount = new SavingsAccount();
	
	@Given("I have deposited $10 in my Checking Account")
	public void iHaveDeposited$10InMyCheckingAccount() {
		checkingAccount.deposit(10);
	   assertEquals(10, checkingAccount.balance());
	}

	@Given("I have deposited $500 in my Savings Account")
	public void iHaveDeposited$500InMySavingsAccount() {
		savingsAccount.deposit(500);
		assertEquals(500, savingsAccount.balance());
	}

	@When("I transfer $500 from my Savings Account into my Checking Account")
	public void iTransfer$500FromMySavingsAccountIntoMyCheckingAccount() {
	   savingsAccount.transfer(500,checkingAccount);
	}

	@When("the balance of the Savings Accont should be $0")
	public void theBalanceOfTheSavingsAccontShouldBe$0() {
	   assertEquals(savingsAccount.balance(),0);
	}

	@When("the balance of the Checking Account should be  $501")
	public void theBalanceOfTheCheckingAccountShouldBe$501() {
		assertEquals(checkingAccount.balance(),510);
	}
	
	@Given("I have chosen some items to buy")
	public void iHaveChosenSomeItemsToBuy() {
	    
	}

	@Given("I am about to enter my credit card details")
	public void iAmAboutToEnterMyCreditCardDetails() {
		creditCard = new CreditCard();
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
