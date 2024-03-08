package edu.fisa.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import de.codecentric.boot.admin.server.config.EnableAdminServer;


@SpringBootApplication
@EnableEurekaServer
@EnableAdminServer
public class Step08ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Step08ServerApplication.class, args);
	}

}
