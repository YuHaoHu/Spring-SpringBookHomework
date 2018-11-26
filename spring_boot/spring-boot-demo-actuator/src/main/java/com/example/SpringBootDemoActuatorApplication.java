package com.example;


import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoActuatorApplication {
	
	private static final Logger logger=LoggerFactory.getLogger(SpringBootDemoActuatorApplication.class);
	
	@PostConstruct
	public void logSomething() {
		logger.debug("Sample Debug Message");
		logger.info("Sample info Message");
		logger.trace("Sample trace Message");
		logger.error("Sample error Message");
		logger.warn("Sample warn Message");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoActuatorApplication.class, args);
	}
}
