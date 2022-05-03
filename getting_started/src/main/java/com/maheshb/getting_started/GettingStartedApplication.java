package com.maheshb.getting_started;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GettingStartedApplication {

	public static void main(String[] args) {
		SpringApplication.run(GettingStartedApplication.class, args);
	}

	//This is another way to return a "run()" method for CommandLineRunner Bean.
	//Spring Boot will run the lambda function returned.
	@Bean
	public CommandLineRunner demo() {
		return (args) -> {
			System.out.println("You can put your codes here. Spring Boot will run it.");
		};
	}
}
