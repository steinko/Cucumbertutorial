package org.steinko.cucumbertotal;

import org.steinko.cucumbertutorial.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
	Account account = new Account();
	
	@Test
	void shouldhaveaTotalof100 () {
		Account account = new Account();
	    assertEquals(100,account.total());
	}
	
	@Test
	void shouldhaveaTotalof80 () {
		Account account = new Account();
		account.withdraw(20);
	    assertEquals(80,account.total());
	}

}
