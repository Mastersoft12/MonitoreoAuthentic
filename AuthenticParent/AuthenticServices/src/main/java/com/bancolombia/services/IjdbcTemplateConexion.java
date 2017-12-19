package com.bancolombia.services;

import org.springframework.jdbc.core.JdbcTemplate;

public interface IjdbcTemplateConexion {
	
	public JdbcTemplate obtenerJdbcTemplate();

}
