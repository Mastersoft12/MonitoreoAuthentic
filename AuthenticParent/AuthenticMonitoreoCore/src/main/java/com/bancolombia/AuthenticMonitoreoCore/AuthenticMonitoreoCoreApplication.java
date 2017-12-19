package com.bancolombia.AuthenticMonitoreoCore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.bancolombia.AuthenticMonitoreoCore","com.bancolombia.AuthenticMonitoreoCore.controller", "com.bancolombia.services", "com.bancolombia.entity"})
@SpringBootApplication
public class AuthenticMonitoreoCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticMonitoreoCoreApplication.class, args);
	}
}
