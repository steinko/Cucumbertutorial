package org.steinko.cucumbertutorial.unittest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.steinko.cucumbertutorial.Bank;
import org.steinko.cucumbertutorial.Betaling;
import org.junit.jupiter.api.BeforeEach;

public class BetalingTest {
	Bank bank = new Bank();
	Betaling betaling = new Betaling(bank);
	Long validCard = 4169850001064061L;
	
	
	
	@BeforeEach
	void setUp() {
		
		bank.issueCreditCard(validCard, 02, 23, 074, 1234);
	}
	
	@Test
	void shouldExist() {
		assertNotNull(betaling);
	}
	
	@Test
	void shouldReturnMessageCreditCardNumbreToShort() {
		String message =  betaling.validate(416985000106406L, 02, 23, 074);
		String expected = "Please enter a 16 digits credit car number";
		assertEquals(message,expected);
	}
	
	@Test
	void shouldReturnMessageValid() {
		String message =  betaling.validate(validCard, 02, 23, 074);
		String expected = "Valid";
		assertEquals(message,expected);
	}
	
	@Test
	void shouldReturnMessageExpired() {
		
		String message =  betaling.validate(validCard, 02, 19, 074);
		String expected = "Credit Card Expired";
		assertEquals(message,expected);
     }
	

}
