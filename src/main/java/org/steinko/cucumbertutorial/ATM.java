package org.steinko.cucumbertutorial;

/**
 * An ATM that manages the bank services offered to a customer
 */

public class ATM {
	Integer withDrawn;
	boolean isWithDrawn;
	
	/**
	*  insert a credit card 
    *  @param creditCardNumber  credit card number that identifies the  inserted credit card
    */

	public void insertedCard(long creditCardNumber) {
		// TODO Auto-generated method stub
		
	}

	/**
	*  enter pin 
    *  @param pinCode  pin code for the  inserted credit card
    */
	public void enterPin(int pinCode) {
		// TODO Auto-generated method stub
		
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

	public int dispenced() {
		return withDrawn;
	}

	public Boolean returnCard() {
		return false;
	}

	public String message() {
		if (isWithDrawn)
		 return "recive $" + withDrawn.toString() + " in chash";
		else
		 return  "Amount to witdraw to high";
	}

	public void withdrawn(Integer amount, boolean isWithDrawn) {
		 withDrawn = amount;
		this.isWithDrawn = isWithDrawn;
		
	}
}
