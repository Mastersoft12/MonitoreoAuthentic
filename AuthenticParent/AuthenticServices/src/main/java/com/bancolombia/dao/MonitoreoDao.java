package com.bancolombia.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.bancolombia.entity.FiltroMonitoreoRechazo;
import com.bancolombia.entity.Monitoreo;
import com.bancolombia.exception.DaoException;
import com.bancolombia.mapper.FiltroMonitoreoMapper;
import com.bancolombia.mapper.MonitoreoMapper;
import com.bancolombia.services.IjdbcTemplateConexion;
import com.bancolombia.util.UtilidadMonitoreoQuery;

@Component("monitoreoDao")
public class MonitoreoDao implements ImonitoreoDao{
	
	@Autowired
	@Qualifier("jdbcTemplateConexion")
	private IjdbcTemplateConexion jdbcTemplateConexion;
	
	public List<Monitoreo> obtenerMonitoreoAprobado() throws DaoException{
		Supplier<String> monitoreoSupplier = UtilidadMonitoreoQuery::queryMonitoreoAprobadas;	
		return consultarMonitoreo(monitoreoSupplier);
	}
	
	
	public List<Monitoreo> obtenerMonitoreoRechazadas() throws DaoException{
		Supplier<String> monitoreoSupplier = UtilidadMonitoreoQuery::queryMonitoreoRechazada;	
		return consultarMonitoreo(monitoreoSupplier);		
	}
	
	public List<FiltroMonitoreoRechazo> filtarRechazos() throws DaoException{
		List<FiltroMonitoreoRechazo> resultado = new ArrayList<>();
		Supplier<String> filtroSupplier = UtilidadMonitoreoQuery::queryFiltroMonitoreoRechazadas;
		try{
			resultado = jdbcTemplateConexion.obtenerJdbcTemplate().query(filtroSupplier.get(), new FiltroMonitoreoMapper());
		}catch (DataAccessException e) {
			throw new DaoException(e.getMessage());
		}
		return resultado;
	}
	
	private List<Monitoreo> consultarMonitoreo(Supplier<String> monitoreoSupplier) throws DaoException {
		List<Monitoreo> resultado = new ArrayList<>();
		try{
			resultado =  jdbcTemplateConexion.obtenerJdbcTemplate().query(monitoreoSupplier.get(), new MonitoreoMapper());
		}catch (DataAccessException e) {
			throw new DaoException(e.getMessage());
		}
		return resultado;
	}

}
