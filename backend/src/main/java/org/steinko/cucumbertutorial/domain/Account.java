package org.steinko.cucumbertutorial.domain;

/**
 * An Account
 */
public class Account {
	
    protected int  balance = 0;
    
    
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
	 *  @throws AmountToHighException Amount Higher than balance
     */
	public void withdraw(int amount) throws AmountToHighException {
		if (amount > balance) throw new  AmountToHighException();
		else balance = balance-amount;
	}
	
	
	/**
     *  deposit to the account
     *  @param money the amount to deposit
     */
	public void deposit(int money) {
		balance = balance + money;
		
	}

}
