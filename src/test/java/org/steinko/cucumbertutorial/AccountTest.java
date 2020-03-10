package org.steinko.cucumbertutorial;

import org.steinko.cucumbertutorial.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {
	
	@Test
	void shouldhaveaTotalof100 () {
		Account account = new Account();
		account.deposit(100);
	    assertEquals(100,account.balance());
	}
	
	@Test
	void shouldhaveaTotalof80 () {
		Account account = new Account();
		account.deposit(100);
		try {
		    account.withdraw(20);
		} catch (AmountToHighException a)
		{
			
		}
	    assertEquals(80,account.balance());
	}
	
	@Test
	void shouldTrhrowAmountToHighexeption () {
		Account account = new Account();
		account.deposit(100);
		assertThrows(AmountToHighException.class,()-> {account.withdraw(110);});
		 
	}

}
