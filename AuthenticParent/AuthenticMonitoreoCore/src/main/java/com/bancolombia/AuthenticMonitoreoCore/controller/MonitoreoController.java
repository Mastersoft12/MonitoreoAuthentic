package com.bancolombia.AuthenticMonitoreoCore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancolombia.dao.ImonitoreoDao;
import com.bancolombia.entity.Monitoreo;


@RestController
public class MonitoreoController {
	
	@Autowired
	@Qualifier("monitoreoDao")
	private ImonitoreoDao monitoreoDao;
	
	@GetMapping("/monitoreo")
	public List<Monitoreo> obtenerMonitoreo(){
		monitoreoDao.obtenerMonitoreoAprobado();
		return monitoreoDao.obtenerMonitoreoAprobado();
	}

}
