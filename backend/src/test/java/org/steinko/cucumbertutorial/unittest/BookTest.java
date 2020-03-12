package org.steinko.cucumbertutorial.unittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.steinko.cucumbertutorial.Book;

class BookTest {

	@Test
	void shouldExist() {
		assertNotNull(new Book("The Devil in the White City", "Erik Larson"));
	}

}
