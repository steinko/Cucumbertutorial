package org.steinko.cucumbertutorial;

import org.steinko.cucumbertutorial.CreditCard;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CreditCardTest {
	
	
	@Test
	void shouldReturnMessageCreditCardNumbreToShort() {
		CreditCard creditCard = new CreditCard(416985000106406L, 02, 23, 074,1235);
		String message =  creditCard.validate(416985000106406L, 02, 23, 074);
		String expected = "Please enter a 16 digits credit car number";
		assertEquals(message,expected);
	}
	
	@Test
	void shouldReturnMessageValid() {
		CreditCard creditCard = new CreditCard(416985000106406L, 02, 23, 074,1235);
		String message =  creditCard.validate(4169850001064061L, 02, 23, 074);
		String expected = "Valid";
		assertEquals(message,expected);
	}
	
	@Test
	void shouldReturnMessage() {
		CreditCard creditCard = new CreditCard(416985000106406L, 02, 23, 074,1235);
		String message =  creditCard.validate(4169850001064061L, 02, 19, 074);
		String expected = "Credit Card Expired";
		assertEquals(message,expected);
	}
	
	@Test
	void shouldReturnCloseMessage() {
		CreditCard creditCard = new CreditCard(416985000106406L, 02, 23, 074,1235);
		creditCard.invalidate();
		String message =  creditCard.validate(4169850001064061L, 02, 19, 074);
		String expected = "Credit Card Close. Contanct The Bank";
		assertEquals(expected,message);
	}
	
	@Test
	void shouldReturnSamePinMessage() {
		Bank bank = new Bank();
		
		CreditCard creditCard = bank.issueCreditCard(416985000106406L, 02, 23, 074,1235);
		bank.changePin(416985000106406L,1234);
		String message =  bank.validate(4169850001064061L, 02, 19, 074);
		String expected = "Same Pin as before. Pin is not changed";
		assertEquals(expected,message);
	}
	

}
