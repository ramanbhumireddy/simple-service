package com.coder.simple_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class SimpleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleServiceApplication.class, args);
	}


	@GetMapping("/")
	public String welcome(){
		return "welcome to simple service, " + System.currentTimeMillis();
	}

}
