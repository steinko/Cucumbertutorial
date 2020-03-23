package org.steinko.cucumbertutorial.steps;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TictactoeSteps {
	
	private List<List<String>> board;
	
	@Given("a board like this:")
	public void aBoardLikeThis(List<List<String>> dataTable) {
		this.board = dataTable;
	}

	@When("player x plays in row {int}, column {int}")
	public void playerXPlaysInRowColumn(Integer row, Integer column) {
	   List<String> aRow = board.get(row);
	   aRow.set(column, "x");
	   board.set(row, aRow);
	}

	@Then("the board should look like this:")
	public void theBoardShouldLookLikeThis(List<List<String>> expectedTable) {
		assertTrue(expectedTable.equals(this.board));
	}
	

}
