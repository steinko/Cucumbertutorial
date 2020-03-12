package org.steinko.cucumbertutorial.domain;

/**
 * An Account
 */
public class Account {
	
    protected Money  balance = new Money(0);
    
    
    /**
     *  balance of the account
     *  @return the balance
     */
	public Money balance() {
		return balance;
	}

	
	/**
     *  withdraw from the account
     *  @param amount the amount to withdraw
	 *  @throws AmountToHighException Amount Higher than balance
     */
	public void withdraw(Money amount) throws AmountToHighException {
		if (amount.greaterThan(balance)) throw new  AmountToHighException();
		else balance = balance.minus(amount);
	}
	
	
	/**
     *  deposit to the account
     *  @param money the amount to deposit
     */
	public void deposit(Money money) {
		balance = balance.pluss(money);
		
	}

}
