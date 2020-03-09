package org.steinko.cucumbertutorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {

	@Test
	void shouldExist() {
		assertNotNull(new Book("The Devil in the White City", "Erik Larson"));
	}

}
