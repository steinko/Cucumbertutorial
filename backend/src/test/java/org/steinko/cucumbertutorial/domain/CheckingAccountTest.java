package org.steinko.cucumbertutorial.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckingAccountTest {

	
	@Test
	void shouldExist() {
		assertNotNull(new CheckingAccount());
	}
	
	@Test
	void shouldHaveAbalnceOf10() {
		CheckingAccount checkingAccount  =  new CheckingAccount(); 
		checkingAccount.deposit(10);
		assertEquals(10,checkingAccount.balance());
	}


}
