package org.steinko.cucumbertutorial.domain;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SavingsAccountTest {

	@Test
	void shouldExist() {
		assertNotNull(new SavingsAccount());
	}
	
	@Test
	void shouldhaveaBalanceon500() {
		Account savingsAccount  =  new SavingsAccount();
		savingsAccount.deposit(500);
		assertEquals(500,savingsAccount.balance());
	}
	
	@Test
	void shouldhaveaBalanceon0() {
		Account savingsAccount  =  new SavingsAccount();
		savingsAccount.deposit(500);
		
		try {
		   savingsAccount.withdraw(500);
		} catch (AmountToHighException a)
		{
			
		}
		
		assertEquals(0,savingsAccount.balance());
	}
	
	@Test
	void shouldhaveAsavingAccontBalanceOf0andCheckingAccountBalanceOf510() {
		SavingsAccount savingsAccount  =  new SavingsAccount();
		savingsAccount.deposit(500);
		CheckingAccount checkingAccount = new CheckingAccount();
		checkingAccount.deposit(10);
		savingsAccount.transfer(500,checkingAccount);
		assertEquals(0,savingsAccount.balance());
		assertEquals(510,checkingAccount.balance());
	}


}
