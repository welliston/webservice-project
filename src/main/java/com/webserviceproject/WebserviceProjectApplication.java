package com.webserviceproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class WebserviceProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebserviceProjectApplication.class, args);
		
		System.out.println(new BCryptPasswordEncoder().encode("produto"));
	}

}
