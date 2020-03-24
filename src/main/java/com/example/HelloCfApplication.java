package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloCfApplication {

	@GetMapping("/") 
	String hello() {
			return "Hello, CF v2!!";
	}


	public static void main(String[] args) {
		SpringApplication.run(HelloCfApplication.class, args);
	}

}
