package org.steinko.cucumbertutorial.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
/**
 * An Hello Controller 
 */
public class HelloController {
	
	/**
     *  @return Greeting from Spring Boot
     */
	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}