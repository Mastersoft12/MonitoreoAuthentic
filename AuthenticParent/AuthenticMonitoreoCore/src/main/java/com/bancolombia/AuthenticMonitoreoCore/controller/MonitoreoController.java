package com.bancolombia.AuthenticMonitoreoCore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bancolombia.services.MonitoreoServices;


@RestController
public class MonitoreoController {
	
	@Autowired
	@Qualifier("monitoreoServices")
	private MonitoreoServices monitoreoServices;
	
	@GetMapping("/monitoreo")
	public String obtenerMonitoreo(){
		return monitoreoServices.obtenerMonitoreo();
	}

}
