package com.crudproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//default spring boot class for auto configuration
//create the web server instance and Spring MVC dispatcher servlet.
@SpringBootApplication
public class ProductManagerApplication {
    
	public static void main(String[] args) {
		SpringApplication.run(ProductManagerApplication.class, args);
	}

}
