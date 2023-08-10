package com.springboot.insurance.provider.api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/insurance-service")
public class InsuranceProviderApplication {

	// if provider changer any end point in future, all clients do not need to change their configured url, only you need to
	// update in git, where we have our application.properties file in "insurance-config-server" repository
//	@GetMapping("/getAllPlans")
	@GetMapping("/getUpdatedPlans")
	public List<String> getPlans() {
		return Stream.of("Prenium", "Gold", "Platinum").collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		SpringApplication.run(InsuranceProviderApplication.class, args);
	}

}
