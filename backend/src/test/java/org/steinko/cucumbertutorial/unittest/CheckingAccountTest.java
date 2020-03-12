package org.steinko.cucumbertutorial.unittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.steinko.cucumbertutorial.CheckingAccount;
import org.steinko.cucumbertutorial.Money;

class CheckingAccountTest {

	
	@Test
	void shouldExist() {
		assertNotNull(new CheckingAccount());
	}
	
	@Test
	void shouldHaveAbalnceOf10() {
		CheckingAccount checkingAccount  =  new CheckingAccount(); 
		checkingAccount.deposit(new Money(10));
		assertEquals(new Money(10),checkingAccount.balance());
	}


}
