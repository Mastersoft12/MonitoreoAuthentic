package com.bancolombia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("jdbcTemplateConexion")
public class JdbcTemplateConexion implements IjdbcTemplateConexion {
	
	@Autowired
	@Qualifier("dataSource")
	private IdataSourceBd dataSourceBD;
	
	public JdbcTemplate obtenerJdbcTemplate(){
		return new JdbcTemplate(dataSourceBD.obtenerDataSource());
	}

}
