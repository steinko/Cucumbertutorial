package org.steinko.cucumbertutorial;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CreditCard {
	
	boolean valid = true;

	public String validate(Long creditCardNumber, Integer validMonth, Integer validYear, Integer aCvc)  {
		
		String sCreditCardNumber = creditCardNumber.toString();
		int cardNumberLength =	sCreditCardNumber.length();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/yy");
		String cardValidTo = validMonth.toString() + "/" + validYear.toString();
		Date validTo = new Date();
		try {
			validTo = dateFormat.parse(cardValidTo);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		Date today = new Date();
		Boolean before = today.before(validTo);
		if (!valid)
			return "Credit Card Close. Contanct The Bank";
		
		if (cardNumberLength == 16 && before)
			return "Valid";
		if (!before)
			return "Credit Card Expired";
		if (cardNumberLength < 16 )
		    return "Please enter a 16 digits credit car number" ;
		return "Error";
	}

	public void invalidate() {
		valid = false;
		
	}

	

}
