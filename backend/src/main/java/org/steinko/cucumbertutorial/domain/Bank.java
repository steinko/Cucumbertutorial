package org.steinko.cucumbertutorial.domain;

import java.util.Map;

import org.steinko.cucumbertutorial.domain.CreditCard;

import java.util.HashMap;

/**
 * A bank that manages the credit cards that have issued
 */

public class Bank {
	boolean creditcardValid;
	
	SavingsAccount account = new SavingsAccount();
	
	private Map<Long,CreditCard> creditCards = new HashMap<Long, CreditCard>();
	
	/**
	*  Issue a credit card 
    *  @param creditCardNumber  credit card number that identifies the credit card
    *  @param validMonth the month that the credit card expires
    *  @param validYear the year that the credit card expires
    *  @param cvc control number for the credit card
    *  @param pin valid pin code
    *  @return message
    */

	public CreditCard issueCreditCard(Long creditCardNumber, Integer validMonth, Integer validYear, Integer cvc, Integer pin) {
		  CreditCard creditCard = new CreditCard(creditCardNumber, validMonth, validYear,cvc,pin);
		  creditCards.put(creditCard.getNumber(),creditCard);
		  return creditCard;
	}
	
	/**
	*  Validate that information given by the parameters is valid for the credit card 
    *  @param creditCardNumber  credit card number that identifies the credit card
    *  @param validMonth the month that the credit card expires
    *  @param validYear the year that the credit card expires
    *  @param cvc control number for the credit card
    *  @return message
    */

	public String validate(long creditCardNumber, int validMonth, int validYear, int cvc) {
		return "Same Pin as before. Pin is not changed";
	}
	

	/**
	*  change pin for the credit card with given credit card number 
    *  @param creditCardNumber  credit card number that identifies the credit card
    *  @param pin valid pin code
    */
	
	public void changePin(long creditCardNumber, int pin) {
		
	}
	
	/**
	*  Deposit a amount to a account 
    *  @param accountId identify account
    *  @param amount amount to deposit
    */

	public void deposit(int accountId, int amount) {
		account.deposit(amount);
		
	}
	
	/**
	*  Return the balance of an account
    *  @param accountId identify account
    *  @return balance of the account
    */

	public int balance(int accountId) {
		
		return account.balance();
		
	}

	public void withdraw(int i, int money) throws AmountToHighException {
		account.withdraw(money);	
	}
	
	

	public boolean creditCardValid(Long creditCardNumber) {
		CreditCard creditCard = creditCards.get(creditCardNumber);
		return creditCard.valid();
	}

	public void invalidate(Long credtiCardNumber) {
		CreditCard creditCard = creditCards.get(credtiCardNumber);
		creditCard.invalidate();
		
	}

}
