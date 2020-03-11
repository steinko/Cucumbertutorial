package org.steinko.cucumbertutorial;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class BankTest {
	
	Bank bank;
	
	@BeforeEach
	void setUp() {
		bank = new Bank();
	}

	@Test
	void shouldExist() {
		assertNotNull(bank);
	}
	
	
	
	@Test
	void shouldIssuedACreditCard() {
		
		Long creditCardNumber = 1234567891234567L;
		Integer validMonth = 07;
		Integer validYear = 23;
		Integer cvc = 012;
		Integer pin = 1234;
	    CreditCard creditcard = bank.issueCreditCard(creditCardNumber, validMonth, validYear,cvc,pin);			
		assertNotNull(creditcard);
		
	}
	
	@Test
	void shouldhaveAAccont1WithBalance100()  {
		
		bank.deposit(1,new Money(100));
		assertEquals(bank.balance(1),new Money(100));
	}
	
	@Test
	void shouldhaveAAccont1WithBalance200()  {
		;
		bank.deposit(1,new Money(200));
		assertEquals(bank.balance(1),new Money(200));
	}
	
	@Test
	void shouldhaveAAccont1WithBalance300() throws AmountToHighException {
		
		bank.deposit(1,new Money(400));
		bank.withdraw(1,new Money(100));
		assertEquals(bank.balance(1),new Money(300));
	}
	
	@Test
	void shouldhaveaAmountToHighExeption()  {
		
		bank.deposit(1,new Money(100));
		assertThrows(AmountToHighException.class,()-> {bank.withdraw(1, new Money(200));});
	}
	
	@Test
	void shouldhaveAValidCard() { 
		Long validCredtiCardNumber = 1234567891234544L;
		bank.issueCreditCard(validCredtiCardNumber, 01,23, 234, 1234);
		assertTrue(bank.creditCardValid(validCredtiCardNumber));
	}
	
	@Test
	void shouldhaveAInvalidCard() { 
		Long credtiCardNumber = 1234567891234544L;
		bank.issueCreditCard(credtiCardNumber, 01,23, 234, 1234);
		bank.invalidate(credtiCardNumber);
		assertFalse(bank.creditCardValid(credtiCardNumber));
	}
		
}
