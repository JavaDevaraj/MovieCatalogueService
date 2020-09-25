package com.kumar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MovieCatalogServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogServerApplication.class, args);
	}

}
