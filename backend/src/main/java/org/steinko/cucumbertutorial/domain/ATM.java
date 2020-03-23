package org.steinko.cucumbertutorial.domain;

/**
 * An ATM that manages the bank services offered to a customer
 */

public class ATM {
	
	int withDrawn;
	boolean isWithDrawn;
	Bank bank;
	
	public ATM(Bank bank) {
		this.bank = bank;
	}

	/**
	*  insert a credit card 
    *  @param creditCardNumber  credit card number that identifies the  inserted credit card
    */

	public void insertedCard(long creditCardNumber) {
		
	}

	/**
	*  enter pin 
    *  @param pinCode  pin code for the  inserted credit card
    */
	public void enterPin(int pinCode) {
		
	}
	
	/**
	*  select menu item for selecting service 
    *  @param menuItem  selected menu item
    */
	public void selectMenuItem(String menuItem) {
		
	}
	
	
	/**
	*  verify if the  pin code  is correct for  the inserted credit card
    *  @return pin code status true correct pin for the insered card fale not the correct pin for the inserted card
    */
	public Boolean corectPin() {
		return true;
	}
	
	/**
	* The amount dispenced from the ATM
	*  @return the amount dispenced from the ATM
    */
	public int dispenced() {
		return withDrawn;
	}

	/**
	* Verify status of if the credit card returned from the ATM
	*  @return true the credit card is returned, false the credit card is not returned 
    */
	public Boolean returnCard() {
		return false;
	}

	public String message() {
		if (isWithDrawn)
		 return "recive $" + Integer.toString(withDrawn) + " in cash";
		else
		 return  "Amount to witdraw to high";
	}

	

	public void withdraw(int accountId, int money)  {
		try {
			bank.withdraw(accountId, money);
			withDrawn = money;
			isWithDrawn = true;
		}  catch (AmountToHighException e) {
			isWithDrawn = false;
		}
		
		
	}

	public int balance(int acountId) {	
		return bank.balance(acountId);
	}

	public void changePin(int pin) {
		// TODO Auto-generated method stub
		
	}

}
