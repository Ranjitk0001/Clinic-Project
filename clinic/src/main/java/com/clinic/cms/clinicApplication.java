package com.clinic.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class clinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(clinicApplication.class, args);
		System.out.println("Hospital Management ");
	}

}
