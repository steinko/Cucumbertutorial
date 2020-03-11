package org.steinko.cucumbertutorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {
	
	
	
	@Test
	void shouldExist() {
		assertNotNull(new Money(1));
	}
	
	@Test
	void shouldBe3() {
		Money one = new Money(1);
		Money two = new Money(2);
		Money tree = one.pluss(two);
		assertEquals(tree,new Money(3));
	}
	
	@Test
	void shouldBe4() {
		Money one = new Money(2);
		Money two = new Money(2);
		Money tree = one.pluss(two);
		assertEquals(tree,new Money(4));
	}
	
	
	@Test
	void shouldBe2() {
		Money one = new Money(5);
		Money two = new Money(3);
		Money tree = one.minus(two);
		assertEquals(tree,new Money(2));
	}
	
	@Test
	void shouldBe1() {
		Money one = new Money(4);
		Money two = new Money(3);
		Money tree = one.minus(two);
		assertEquals(tree,new Money(1));
	}
	
	@Test
	void shouldBeTrue() {
		Money one = new Money(5);
		Money two = new Money(3);
		assertTrue(one.greaterThan(two));
	}
	
	@Test
	void shouldBeFalse() {
		Money one = new Money(2);
		Money two = new Money(3);
		assertFalse(one.greaterThan(two));
	}
	
	@Test 
	void shouldBeEquals() {
		Money one = new Money(1);
		Money two = new Money(1);
		assertTrue(one.equals(two));
	}
	
	@Test 
	void shouldNotBeEquals() {
		Money one = new Money(2);
		Money two = new Money(1);
		assertFalse(one.equals(two));
	}
	
	@Test 
	void shouldBeE2() {
		Money one = new Money(2);
		assertEquals(one.toString(),"2");
	}
	
	
	

}
