package com.bancolombia.AuthenticMonitoreoCore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancolombia.entity.Monitoreo;
import com.bancolombia.services.IjdbcTemplateConexion;


@RestController
public class MonitoreoController {
	
	@Autowired
	@Qualifier("jdbcTemplateConexion")
	private IjdbcTemplateConexion dataSourceBD;
	
	@GetMapping("/monitoreo")
	public Monitoreo obtenerMonitoreo(){
		dataSourceBD.obtenerJdbcTemplate();
		return new Monitoreo();
	}

}
