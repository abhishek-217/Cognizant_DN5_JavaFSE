package com.cognizant.account_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@EnableDiscoveryClient
public class AccountClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountClientApplication.class, args);
	}
}