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
public class BankController {
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(value= "/deposit")
	public void despositAmountToAccount(@RequestParam("accountId") String accountId,@RequestParam("amount") String amount) {

	}

}
