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
		Long creditCardNumber = 1234567891234567L;
		Integer validMonth = 07;
		Integer validYear = 23;
		Integer cvc = 012;
		Integer pin = 1234;
	    CreditCard creditcard = bank.issueCreditCard(creditCardNumber, validMonth, validYear,cvc,pin);			
		assertNotNull(creditcard);
		
	}

}
