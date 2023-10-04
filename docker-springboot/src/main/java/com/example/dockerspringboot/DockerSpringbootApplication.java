package com.example.dockerspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerSpringbootApplication {

	@GetMapping("/message")
	public String getMessage(){
		return "Welcome to Natwest Bank. ";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringbootApplication.class, args);
	}

}
