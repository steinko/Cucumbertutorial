package org.steinko.cucumbertutorial;

import org.junit.jupiter.api.Test;
import org.steinko.cucumbertutorial.Checkout;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CheckoutTest {
	
	@Test
	void shouldExist() {
		assertNotNull(new Checkout());
	}
	
	@Test
	void shouldReturnTotal() {
	 Checkout  checkout =	new Checkout();
	 checkout.add(2, 5);
	 assertEquals(10,checkout.total() );
	}

}
