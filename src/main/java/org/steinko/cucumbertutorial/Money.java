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
		Money arg = (Money)obj;
		
		return this.value.equals(arg.value);
	}
	
	@Override
    public String toString() {
		return value.toString();
	}
}
