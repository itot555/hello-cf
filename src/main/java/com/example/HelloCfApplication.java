package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// ここから追加
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// ここまで

@SpringBootApplication
@RestController // 追加
public class HelloCfApplication {

	// ここから追加
	@GetMapping("/") 
	String hello() {
			return "Hello, CF v1!!";
	}
	// ここまで

	public static void main(String[] args) {
		SpringApplication.run(HelloCfApplication.class, args);
	}

}
