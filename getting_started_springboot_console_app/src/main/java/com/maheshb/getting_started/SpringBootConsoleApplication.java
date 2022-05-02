package com.maheshb.getting_started;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//We're using Spring's @SpringBootApplication annotation on our main class to enable auto-configuration.
//
//This class also implements Spring's CommandLineRunner interface. CommandLineRunner is a simple Spring Boot
// interface with a run method. Spring Boot will automatically call the run method of all beans implementing
// this interface after the application context has been loaded.

@SpringBootApplication
public class SpringBootConsoleApplication	implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(SpringBootConsoleApplication.class);

	public static void main(String[] args) {
		LOG.info("STARTING THE APPLICATION");
		SpringApplication.run(SpringBootConsoleApplication.class, args);
		LOG.info("APPLICATION FINISHED");
	}

	@Override
	public void run(String... args) {
		LOG.info("EXECUTING : command line runner");

		for (int i = 0; i < args.length; ++i) {
			LOG.info("args[{}]: {}", i, args[i]);
		}

		for (int i = 0; i < 3; ++i) {
			LOG.info("Inside run  {}", i);
		}
	}
}