package com.bancolombia.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bancolombia.entity.FiltroMonitoreoRechazo;

public class FiltroMonitoreoMapper implements RowMapper<FiltroMonitoreoRechazo> {

	@Override
	public FiltroMonitoreoRechazo mapRow(ResultSet arg0, int arg1) throws SQLException {
		return new FiltroMonitoreoRechazo(arg0.getInt("CodigoRsp"), arg0.getString("Descripcion"), arg0.getInt("Cantida"));
	}	

}
