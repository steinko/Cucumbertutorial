package org.steinko.cucumbertutorial.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
	void shouldThrowNullPointerExeption() {
		Money one = new Money(2);
		Money two = null;
		assertThrows(NullPointerException.class,()-> {one.equals(two);});
		
	}
	
	@Test 
	void shouldThrowTypeExecption() {
		Money one = new Money(2);
		Account account = new Account();
		assertThrows(ClassCastException.class,()-> {one.equals(account);});
	}
	
	@Test 
	void shouldBeE2() {
		Money one = new Money(2);
		assertEquals(one.toString(),"2");
	}
	
	@Test
	void shouldBeHascode1() {
	  Money one = new Money(1);
	  assertEquals(1,one.hashCode());
	}
	
	@Test
	void shouldBeOne() {
	  Money one = new Money("1");
	  assertEquals(1,one.value);
	}
	
	@Disabled
	@Test
	void shouldThrowConversionExeption() {
	  assertThrows(NumberFormatException.class,()-> {new Money("One");});
	}
	@Disabled
	@Test
	void shouldThrowNullPointExeption() {
	  assertThrows(NullPointerException.class,()-> {new Money("");});
	}
	
	

}
