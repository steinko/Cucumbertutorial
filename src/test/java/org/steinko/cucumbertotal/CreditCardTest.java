package org.steinko.cucumbertotal;

import org.steinko.cucumbertutorial.CreditCard;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CreditCardTest {
	
	@Test
	void shouldReturnMessageCreditCardNumbreToShort() {
		CreditCard creditCard = new CreditCard();
		String message =  creditCard.validate(416985000106406L, 02, 23, 074);
		String expected = "Please enter a 16 digits credit car number";
		assertEquals(message,expected);
	}
	
	@Test
	void shouldReturnMessageValid() {
		CreditCard creditCard = new CreditCard();
		String message =  creditCard.validate(4169850001064061L, 02, 23, 074);
		String expected = "Valid";
		assertEquals(message,expected);
	}
	

}
