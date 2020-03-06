package org.steinko.cucumbertutorial;

/**
 * An Account
 */
public class Account {
	
    protected int balance = 0;
    
    
    /**
     *  balance of the account
     *  @return the balance
     */
	public int balance() {
		return balance;
	}

	
	/**
     *  withdraw from the account
     *  @param amount the amount to withdraw
     */
	public void withdraw(int amount) {
		balance = balance - amount;
	}
	
	
	/**
     *  deposit to the account
     *  @param amount the amount to deposit
     */
	public void deposit(int amount) {
		balance = balance + amount;
		
	}

}
