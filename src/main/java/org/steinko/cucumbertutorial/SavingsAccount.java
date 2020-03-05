package org.steinko.cucumbertutorial;

public class SavingsAccount {
	int balance;
	

	public int balance() {
		
		return balance;
	}

	public void transfer(int amount, CheckingAccount checkingAccount) {
		takeout(amount);
		checkingAccount.deposit(amount);
	}

	public void deposit(int amount) {
		balance = balance + amount;
		
	}

	public void takeout(int amount) {
		balance = balance - amount;
	}

}
