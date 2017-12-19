package com.bancolombia.services;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component("dataSourceBD")
public class DataSourceBd implements IdataSourceBd {
	
	public DataSource obtenerDataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:oracle:thin:@10.8.72.168:1521:AUTHEDDB");
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUsername("bcolombia_owner");
		dataSource.setPassword("bcolombia_owner");
		return dataSource;
	}

}
