package org.steinko.cucumbertutorial;


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
		savingsAccount.deposit(new Money(500));
		assertEquals(new Money(500),savingsAccount.balance());
	}
	
	@Test
	void shouldhaveaBalanceon0() {
		Account savingsAccount  =  new SavingsAccount();
		savingsAccount.deposit(new Money(500));
		
		try {
		   savingsAccount.withdraw(new Money(500));
		} catch (AmountToHighException a)
		{
			
		}
		
		assertEquals(new Money(0),savingsAccount.balance());
	}
	
	@Test
	void shouldhaveAsavingAccontBalanceOf0andCheckingAccountBalanceOf510() {
		SavingsAccount savingsAccount  =  new SavingsAccount();
		savingsAccount.deposit(new Money(500));
		CheckingAccount checkingAccount = new CheckingAccount();
		checkingAccount.deposit(new Money(10));
		savingsAccount.transfer(new Money(500),checkingAccount);
		assertEquals(new Money(0),savingsAccount.balance());
		assertEquals(new Money(510),checkingAccount.balance());
	}


}
