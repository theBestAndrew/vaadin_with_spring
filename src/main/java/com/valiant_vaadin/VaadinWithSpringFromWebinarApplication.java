package com.valiant_vaadin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class VaadinWithSpringFromWebinarApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaadinWithSpringFromWebinarApplication.class, args);
	}

	@Service
	public static class MyService {
		public String sayHi(){
			return "Hello Spring users!";
		}
	}
}
