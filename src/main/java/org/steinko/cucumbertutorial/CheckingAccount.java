package org.steinko.cucumbertutorial;

public class CheckingAccount {
	
	int balance;

	public int balance() {
		return balance;
	}

	
	public void deposit(int amount) {
		balance = balance + amount;
	}

}
