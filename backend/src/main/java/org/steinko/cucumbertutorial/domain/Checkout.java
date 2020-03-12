package org.steinko.cucumbertutorial.domain;

public class Checkout {
	private Integer total;
	
	public Checkout() {
		total = 0;
	}
	
	public void add(Integer itemCount,Integer banaPrice) {
		total = total + itemCount*banaPrice;
	}
	
	public Integer total() {
		return total;
	}


}
