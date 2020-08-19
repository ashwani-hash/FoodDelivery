package com.delivery.FDMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FdmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FdmsApplication.class, args);
		System.out.println("Started");
	}
}