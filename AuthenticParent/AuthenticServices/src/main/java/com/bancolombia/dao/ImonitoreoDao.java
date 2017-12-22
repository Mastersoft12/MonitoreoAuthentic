package com.bancolombia.dao;

import java.util.List;

import com.bancolombia.entity.FiltroMonitoreoRechazo;
import com.bancolombia.entity.Monitoreo;
import com.bancolombia.exception.DaoException;

public interface ImonitoreoDao {
	
	public List<Monitoreo> obtenerMonitoreoAprobado() throws DaoException;
	
	public List<Monitoreo> obtenerMonitoreoRechazadas() throws DaoException;
	
	public List<FiltroMonitoreoRechazo> filtarRechazos() throws DaoException;

}
