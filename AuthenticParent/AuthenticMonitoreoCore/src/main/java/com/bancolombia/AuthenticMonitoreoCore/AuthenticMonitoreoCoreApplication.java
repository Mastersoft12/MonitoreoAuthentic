package com.bancolombia.AuthenticMonitoreoCore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.bancolombia.AuthenticMonitoreoCore","com.bancolombia.AuthenticMonitoreoCore.controller", "com.bancolombia.services", "com.bancolombia.entity",
		"com.bancolombia.mapper", "com.bancolombia.dao"})
@SpringBootApplication
public class AuthenticMonitoreoCoreApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticMonitoreoCoreApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AuthenticMonitoreoCoreApplication.class);
    }
}
