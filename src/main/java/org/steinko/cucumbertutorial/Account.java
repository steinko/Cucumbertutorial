package org.steinko.cucumbertutorial;


public class Account {
    int total = 100;
        
	public int total() {
		return total;
	}

	public void withdraw(int amount) {
		total = total - amount;
	}

}
