package org.steinko.cucumbertutorial;

/**
 * A Save Account
 */
public class SavingsAccount extends Account{
	
	/**
     *  transfer a amount from this saving account to a checking account
     *  @param amount the amount to transfer
     *  @param to the checking account to transfer to
     */
	public void transfer(int amount, CheckingAccount to) {
		withdraw(amount);
		to.deposit(amount);
	}

}
