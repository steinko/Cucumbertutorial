package org.steinko.cucumbertutorial.domain;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CreditCard {
	
	private boolean valid;
	private long number;

	public CreditCard(long creditCardNumber, int validMonth, int validYear, int cvc, int pin) {
		number = creditCardNumber;
		this.valid = true;
	}

	public void invalidate() {
		this.valid = false;
	}

	public void changePin(int pin) {
	}

	public int getPin() {
		return 9876;
	}
	
	public long getNumber() { 
		return number;
	}
	
	public boolean valid() {
		 return valid;
	}

	

}
