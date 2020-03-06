package org.steinko.cucumbertutorial;

public class SavingsAccount extends Account{
	

	public void transfer(int amount, CheckingAccount checkingAccount) {
		withdraw(amount);
		checkingAccount.deposit(amount);
	}

}
