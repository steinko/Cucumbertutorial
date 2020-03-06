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
		savingsAccount.deposit(500);
		assertEquals(savingsAccount.balance(),500);
	}
	
	@Test
	void shouldhaveaBalanceon0() {
		Account savingsAccount  =  new SavingsAccount();
		savingsAccount.deposit(500);
		savingsAccount.withdraw(500);
		assertEquals(savingsAccount.balance(),0);
	}
	
	@Test
	void shouldhaveAsavingAccontBalanceOf0andCheckingAccountBalanceOf510() {
		SavingsAccount savingsAccount  =  new SavingsAccount();
		savingsAccount.deposit(500);
		CheckingAccount checkingAccount = new CheckingAccount();
		checkingAccount.deposit(10);
		savingsAccount.transfer(500,checkingAccount);
		assertEquals(savingsAccount.balance(),0);
		assertEquals(checkingAccount.balance(),510);
	}


}
