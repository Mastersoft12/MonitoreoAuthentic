package com.bancolombia.business;

import java.util.List;

import com.bancolombia.entity.FiltroMonitoreoRechazo;
import com.bancolombia.entity.Monitoreo;
import com.bancolombia.exception.DaoException;

public interface ImonitoreoBusiness {
	public List<Monitoreo> obtenerMonitoreo() throws DaoException;
	public List<FiltroMonitoreoRechazo> obtenerFiltroMonitoreoRechazo() throws DaoException;
}
