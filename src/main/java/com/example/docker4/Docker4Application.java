package com.example.docker4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController

public class Docker4Application {
@RequestMapping("/home")
  public String home() {
    return "Hello Docker4 World";
  }

	public static void main(String[] args) {
		SpringApplication.run(Docker4Application.class, args);
	}

}
