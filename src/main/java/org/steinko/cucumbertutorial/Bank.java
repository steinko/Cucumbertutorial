package org.steinko.cucumbertutorial;

import java.util.Map;
import java.util.HashMap;
import org.steinko.cucumbertutorial.CreditCard;

public class Bank {
	
	Map<Long,CreditCard> creditCards = new HashMap<Long, CreditCard>();

	public CreditCard issueCreditCard(Long creditCardNumber, Integer validMonth, Integer validYear, Integer cvc, Integer pin) {
		  CreditCard creditCard = new CreditCard(416985000106406L, 02, 23, 074,1235);
		  creditCards.put(creditCard.getNumber(),creditCard);
		  return creditCard;
	}

	public String validate(long l, int i, int j, int k) {
		return "Same Pin as before. Pin is not changed";
	}

	public void changePin(long l, int i) {
		
	}

}
