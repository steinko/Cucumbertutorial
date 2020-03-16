package org.steinko.cucumbertutorial.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/bank")

/**
 * An Bank Controller 
 */
public class BankController {
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(value= "/deposit")
	
	/**
     *  deposit and amount to an account
     *  @param accountId identifer of the account
     *  @param amount amount
	 *  
     */
	public void despositAmountToAccount(@RequestParam("accountId") String accountId,@RequestParam("amount") String amount) {

	}

}
