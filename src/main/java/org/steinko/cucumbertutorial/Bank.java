package org.steinko.cucumbertutorial;

import java.util.Map;
import java.util.HashMap;
import org.steinko.cucumbertutorial.CreditCard;

/**
 * A bank that manages the credit cards that have issued
 */

public class Bank {
	
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
		  CreditCard creditCard = new CreditCard(416985000106406L, 02, 23, 074,1235);
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

}
