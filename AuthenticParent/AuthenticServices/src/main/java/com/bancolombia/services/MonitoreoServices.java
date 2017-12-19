package com.bancolombia.services;

import org.springframework.stereotype.Component;

@Component("monitoreoServices")
public class MonitoreoServices {
	
	public String obtenerMonitoreo(){
		return "primer monitoreo";
	}

}
