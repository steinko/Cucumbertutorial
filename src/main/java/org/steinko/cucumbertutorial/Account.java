package org.steinko.cucumbertutorial;


public class Account {
    protected int balance = 0;
        
	public int balance() {
		return balance;
	}

	public void withdraw(int amount) {
		balance = balance - amount;
	}

	public void deposit(int amount) {
		balance = balance + amount;
		
	}

}
