package com.springcloud.windmill.gatewaypredicate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GatewayPredicateApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayPredicateApplication.class, args);
	}

}
