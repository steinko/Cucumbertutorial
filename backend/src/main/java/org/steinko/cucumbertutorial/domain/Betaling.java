package org.steinko.cucumbertutorial.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Betaling {
     Bank bank;
     
	public Betaling(Bank bank) {
		this.bank = bank;
	}
	
public String validate(Long creditCardNumber, Integer validMonth, Integer validYear, Integer aCvc)  {
		
		String sCreditCardNumber = creditCardNumber.toString();
		int cardNumberLength =	sCreditCardNumber.length();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/yy");
		String cardValidTo = validMonth.toString() + "/" + validYear.toString();
		Date validTo = new Date();
		try {
			validTo = dateFormat.parse(cardValidTo);
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		Date today = new Date();
		Boolean before = today.before(validTo);
		
		if (!before)
			return "Credit Card Expired";
		if (cardNumberLength < 16 )
		    return "Please enter a 16 digits credit car number" ;
		
		if (cardNumberLength == 16 && before)
			if (!bank.creditCardValid(creditCardNumber))
				return "Credit Card Close. Contanct The Bank";
		
			else return "Valid";
		
		return "Error";
	}

}
