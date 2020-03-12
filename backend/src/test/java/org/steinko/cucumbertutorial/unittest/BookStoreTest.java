package org.steinko.cucumbertutorial.unittest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.steinko.cucumbertutorial.Book;
import org.steinko.cucumbertutorial.BookStore;

import java.util.List;

class BookStoreTest {

	@Test
	void shouldExist() {
		assertNotNull(new BookStore());
	}
	
	@Test
	void shouldReturn2FoundBooks() {
		BookStore store = new BookStore();
		List<Book> foundBooks = store.booksByAuthor("Erik Larson");
		assertEquals(2,foundBooks.size());
	}

}
