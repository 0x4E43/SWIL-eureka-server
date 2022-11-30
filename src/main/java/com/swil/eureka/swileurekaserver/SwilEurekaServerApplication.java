package com.swil.eureka.swileurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SwilEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwilEurekaServerApplication.class, args);
	}

}
