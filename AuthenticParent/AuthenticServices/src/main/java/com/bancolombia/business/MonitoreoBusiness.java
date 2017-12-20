package com.bancolombia.business;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.bancolombia.constantes.MonitoreoEnum;
import com.bancolombia.dao.ImonitoreoDao;
import com.bancolombia.entity.Monitoreo;
import com.bancolombia.exception.DaoException;

@Component("monitoreoBusiness")
public class MonitoreoBusiness implements ImonitoreoBusiness {
	
	@Autowired
	@Qualifier("monitoreoDao")
	private ImonitoreoDao monitoreoDao;
	
	private Predicate<List<Monitoreo>> predicate = s-> s.isEmpty();
	
	public List<Monitoreo> obtenerMonitoreo() throws DaoException{
		List<Monitoreo> resultado = new ArrayList<>();
		resultado.addAll(monitoreoDao.obtenerMonitoreoAprobado());	
		resultado.addAll(monitoreoDao.obtenerMonitoreoRechazadas());	
		validarResultado(resultado);
		return resultado;
	}
	
	private void validarResultado(List<Monitoreo> resultado){
		if(predicate.test(resultado)){
			resultado.add(obtenerMonitoreoPorDefecto(MonitoreoEnum.APROBADO.getNombre()));	
			resultado.add(obtenerMonitoreoPorDefecto(MonitoreoEnum.RECHAZADA.getNombre()));	
		}else{
			valorporDefecto(resultado);

		}
	}
	
	private void valorporDefecto(List<Monitoreo> resultado){
		if(resultado.stream().filter(x -> x.getDescripcion().equalsIgnoreCase(MonitoreoEnum.APROBADO.getNombre())).count() <= 0){
			resultado.add(obtenerMonitoreoPorDefecto(MonitoreoEnum.APROBADO.getNombre()));
		}
		if(resultado.stream().filter(x -> x.getDescripcion().equalsIgnoreCase(MonitoreoEnum.RECHAZADA.getNombre())).count() <= 0){
			resultado.add(obtenerMonitoreoPorDefecto(MonitoreoEnum.RECHAZADA.getNombre()));
		}
	}
	
	private Monitoreo obtenerMonitoreoPorDefecto(String tipoMonitoreo){
		return new Monitoreo(0, tipoMonitoreo, 0);
	}

}
