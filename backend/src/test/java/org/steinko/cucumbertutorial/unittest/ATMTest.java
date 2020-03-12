package org.steinko.cucumbertutorial.unittest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.steinko.cucumbertutorial.ATM;
import org.steinko.cucumbertutorial.Bank;
import org.steinko.cucumbertutorial.Money;
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
		bank.deposit(1,new Money(300));
		atm.withdraw(1,new Money(100));
		assertEquals(new Money(200),atm.balance(1));
	}
	
	@Test
	void shouldhaveBalance100() {
		bank.deposit(1, new Money(300));
		atm.withdraw(1,new Money(200));
		assertEquals(new Money(100),atm.balance(1));
	}

	
	@Test
	void shouldReciveMessageRecive$100inCash() {
		bank.deposit(1,new Money(300));
		atm.withdraw(1,new Money(100));
		assertEquals("recive $100 in cash",atm.message() );
	}
	
	@Test
	void shouldReciveMessageAmounttoWitdrawToHigh() {
		bank.deposit(1,new Money(300));
		atm.withdraw(1,new Money(400));
		assertEquals("Amount to witdraw to high",atm.message() );
	}


}
