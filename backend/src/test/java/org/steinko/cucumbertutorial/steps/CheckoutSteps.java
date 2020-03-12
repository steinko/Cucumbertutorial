package org.steinko.cucumbertutorial.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;

import java.util.HashMap;
import java.util.Map;

import org.steinko.cucumbertutorial.Checkout;

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
