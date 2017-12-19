package com.bancolombia.dao;

import java.util.List;

import com.bancolombia.entity.Monitoreo;

public interface ImonitoreoDao {
	
	public List<Monitoreo> obtenerMonitoreoAprobado();

}
