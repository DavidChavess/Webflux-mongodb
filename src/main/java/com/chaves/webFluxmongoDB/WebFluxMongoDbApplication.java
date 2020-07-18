package com.chaves.webFluxmongoDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebFluxMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebFluxMongoDbApplication.class, args);
		System.out.println("Hellow Word, with web flux");
	}

}
