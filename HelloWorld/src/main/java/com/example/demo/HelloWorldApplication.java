package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		System.out.println("Kavyas first project");
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
