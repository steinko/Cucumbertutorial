package org.steinko.cucumbertutorial;

public class Money {
	Integer value;
	public Money(Integer amount) {
		value = amount;
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
