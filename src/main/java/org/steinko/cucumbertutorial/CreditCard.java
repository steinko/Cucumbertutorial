package org.steinko.cucumbertutorial;

public class CreditCard {

	public String validate(Long creditCardNumber, Integer validMonth, Integer validYear, Integer aCvc) {
		String sCreditCardNumber = creditCardNumber.toString();
		int cardNumberLength =	sCreditCardNumber.length();
		if (cardNumberLength == 16)
			return "Valid";
		return "Please enter a 16 digits credit car number" ;
	}

}
