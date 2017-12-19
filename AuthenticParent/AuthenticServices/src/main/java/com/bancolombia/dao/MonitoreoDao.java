package com.bancolombia.dao;

import java.util.List;
import java.util.function.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.bancolombia.entity.Monitoreo;
import com.bancolombia.mapper.MonitoreoMapper;
import com.bancolombia.services.IjdbcTemplateConexion;
import com.bancolombia.util.UtilidadMonitoreoQuery;

@Component("monitoreoDao")
public class MonitoreoDao implements ImonitoreoDao{
	
	@Autowired
	@Qualifier("jdbcTemplateConexion")
	private IjdbcTemplateConexion jdbcTemplateConexion;
	
	public List<Monitoreo> obtenerMonitoreoAprobado(){
		Supplier<String> monitoreoSupplier = UtilidadMonitoreoQuery::queryMonitoreoAprobadas;		
		return jdbcTemplateConexion.obtenerJdbcTemplate().query(monitoreoSupplier.get(), new MonitoreoMapper());
	}

}
