package org.steinko.cucumbertutorial;
import cucumber.api.java.en.Given;

import static org.junit.Assert.assertEquals;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;

import java.util.HashMap;
import java.util.Map;

public class CheckoutSteps {
	
	private  int bananaPrice;
	private  Map<String,Integer> prices = new  HashMap<String,Integer>();
	private Checkout checkout = new Checkout();;
	
	@Given("the price of a {string} is {int} c")
	public void thePriceOfAIsC(String name, Integer price) {
		 prices.put(name,price);
	}

	@When("I checkout {int} {string}")
	public void iCheckout(Integer itemCount, String itemName) {
		Integer price = prices.get(itemName);
	    checkout.add(itemCount,price);
	}


	@Then("the total price should be {int} c")
	public void theTotalPriceShouldBeC(Integer total) {
		 assertEquals(total,checkout.total());
	}
	
}
