package org.steinko.cucumbertutorial.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {
	
	@Test
	void shouldhaveaTotalof100 () {
		Account account = new Account();
		account.deposit(new Money(100));
	    assertEquals(new Money(100),account.balance());
	}
	
	@Test
	void shouldhaveaTotalof80 () {
		Account account = new Account();
		account.deposit(new Money(100));
		try {
		    account.withdraw(new Money(20));
		} catch (AmountToHighException a)
		{
			
		}
	    assertEquals(new Money(80),account.balance());
	}
	
	@Test
	void shouldThrowAmountToHighexeption () {
		Account account = new Account();
		account.deposit(new Money(100));
		assertThrows(AmountToHighException.class,()-> {account.withdraw(new Money(110));});
		 
	}

}
