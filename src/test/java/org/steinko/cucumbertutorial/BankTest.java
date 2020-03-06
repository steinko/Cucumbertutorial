package org.steinko.cucumbertutorial;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

class BankTest {

	@Test
	void shouldExist() {
		assertNotNull(new Bank());
	}
	
	@Test
	void shouldIssuedACreditCard() {
		Bank bank = new Bank();
	    CreditCard creditcard = bank.issueCreditCard();			
		assertNotNull(creditcard);
	}

}
