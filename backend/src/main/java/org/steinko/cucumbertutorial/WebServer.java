package org.steinko.cucumbertutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.steinko.cucumbertutorial.domain.AmountToHighException;

/**
 * An Web Server 
 */
@SpringBootApplication
public class WebServer {
	
	/**
     *  starts the web server
     *  @param args the args
	 *  
     */

	public static void main(String[] args) {
		SpringApplication.run(WebServer.class, args);
	}

}
