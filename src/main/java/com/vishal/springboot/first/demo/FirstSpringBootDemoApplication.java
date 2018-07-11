package com.vishal.springboot.first.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstSpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootDemoApplication.class, args);
	}
	
	@RequestMapping("/")
	public String hello(){
		return "Hello First Spring Boot Application";
	}
}
