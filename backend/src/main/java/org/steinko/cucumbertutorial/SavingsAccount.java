package org.steinko.cucumbertutorial;

/**
 * A Saveings Account
 */
public class SavingsAccount extends Account{
	
	/**
     *  transfer a amount from this saving account to a checking account
     *  @param amount the amount to transfer
     *  @param to the checking account to transfer to
     */
	public void transfer(Money amount, CheckingAccount to) {
		try {
			withdraw(amount);
		} catch (AmountToHighException e) {
			e.printStackTrace();
		}
		to.deposit(amount);
	}

}
