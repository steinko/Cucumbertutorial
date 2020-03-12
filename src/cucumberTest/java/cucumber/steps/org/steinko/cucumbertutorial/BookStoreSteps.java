package org.steinko.cucumbertutorial;

import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookStoreSteps {
	
	BookStore store = new BookStore();
	private List<Book> foundBooks;
	
	@Before
	public void setUp() {
		store = new BookStore();
        foundBooks = new ArrayList<>();
		
	}
	
	@Given("I have the following books in the store")
	public void iHaveTheFollowingBooksInTheStore(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> rows = dataTable.asMaps(String.class,String.class );
	     
	    for (Map<String,String> columns : rows) {
	        store.addBook(new Book(columns.get("title"), columns.get("author")));
	    }
	}
	
	@When("I search for books by author {string}")
	public void iSearchForBooksByAuthor(String author) {
		foundBooks = store.booksByAuthor(author);
	}


	@Then("I find {int} books")
	public void iFindBooks(int numberOfBooks) {
	    assertEquals(numberOfBooks,foundBooks.size());
	}



}
