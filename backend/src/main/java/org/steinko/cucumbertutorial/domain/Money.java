package org.steinko.cucumbertutorial.domain;

public class Money {
	public Integer value;
	
	public Money(String amount) {
		try { 
			value =  Integer.parseInt(amount.trim()); 
	    } catch(NumberFormatException e) { 
	        
	    } catch(NullPointerException e) {
	        
	    }
		
	}
	
	public Money(Integer amount) {
		value = amount;
	}
	
	public Integer getValue() {
		return value;
	}

	public Money pluss(Money two) {
		return new Money(this.value + two.value);
	}

	public Money minus(Money two) {
		return new Money(this.value - two.value);
	}

	public boolean greaterThan(Money balance) {
		return this.value > balance.value;
	}
	
	@Override
	public boolean equals(Object obj) {
		Money arg;
		if (obj !=null)
		{	
		  if (obj instanceof Money)	
		    arg = (Money)obj;
		  else throw new ClassCastException("argument must be object of Money class");
		}
		else
			throw new NullPointerException();
		return this.value.equals(arg.value);
	}
	
	@Override
    public String toString() {
		return value.toString();
	}
	
	@Override
	public int hashCode() {
		return value;
	}
}
