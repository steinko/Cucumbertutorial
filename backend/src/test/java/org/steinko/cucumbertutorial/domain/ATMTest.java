package org.steinko.cucumbertutorial.domain;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class ATMTest {
	ATM atm;
	Bank bank;
	
    @BeforeEach
    void setUp() {
    	bank = new Bank();
    	atm = new ATM(bank);		
    }
	
	@Test
	void shouldExist() {
		assertNotNull(atm);
	}
	
	@Test
	void shouldhaveBalance200() {
		bank.deposit(1,300);
		atm.withdraw(1,100);
		assertEquals(200,atm.balance(1));
	}
	
	@Test
	void shouldhaveBalance100() {
		bank.deposit(1, 300);
		atm.withdraw(1,200);
		assertEquals(100,atm.balance(1));
	}

	
	@Test
	void shouldReciveMessageRecive$100inCash() {
		bank.deposit(1,300);
		atm.withdraw(1,100);
		assertEquals("recive $100 in cash",atm.message() );
	}
	
	@Test
	void shouldReciveMessageAmounttoWitdrawToHigh() {
		bank.deposit(1,300);
		atm.withdraw(1,400);
		assertEquals("Amount to witdraw to high",atm.message() );
	}


}
