package org.steinko.cucumbertutorial.unittest;

import org.steinko.cucumbertutorial.Bank;
import org.steinko.cucumbertutorial.CreditCard;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CreditCardTest {
	
	
	
	
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
