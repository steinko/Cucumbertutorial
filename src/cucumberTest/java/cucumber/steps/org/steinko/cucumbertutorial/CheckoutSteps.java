package org.steinko.cucumbertutorial;
import cucumber.api.java.en.Given;
import static org.junit.Assert.assertEquals;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;

public class CheckoutSteps {
	
	private  int bananaPrice;
	private Checkout checkout;
	
	@Given("the price of a {string} is {int}c")
	public void thePriceOfAIsC(String name, Integer price) {
	    bananaPrice = price;
	}

	@When("I checkout {int} {string}")
	public void iCheckout(Integer itemCount, String itemName) {
	    checkout = new Checkout();
	    checkout.add(itemCount,bananaPrice);
	}

	@Then("the total price should be {int}c")
	public void theTotalPriceShouldBeC(Integer total) {
	   assertEquals(total,checkout.total());

	}
}
