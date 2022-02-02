package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VarunApplication {
	
	public static final Logger LOGGER = LogManager.getLogger(VarunApplication.class);

	public static void main(String[] args) {
		
		SpringApplication.run(VarunApplication.class, args);
		LOGGER.info("Server started at port 8081");
	}

}
