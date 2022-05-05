package com.foodorderingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class FoodorderingappOrderMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodorderingappOrderMsApiApplication.class, args);
	}

}
