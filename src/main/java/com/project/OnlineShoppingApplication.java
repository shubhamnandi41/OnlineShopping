package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineShoppingApplication {

	public static void main(String[] args) { 
		SpringApplication.run(OnlineShoppingApplication.class, args);
		System.out.println("Online Shopping App Started");
	}
}