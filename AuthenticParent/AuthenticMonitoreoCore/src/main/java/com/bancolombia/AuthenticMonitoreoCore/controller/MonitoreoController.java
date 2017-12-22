package com.bancolombia.AuthenticMonitoreoCore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancolombia.AuthenticMonitoreoCore.exception.ErrorRest;
import com.bancolombia.business.ImonitoreoBusiness;
import com.bancolombia.constantes.MensajeErrorEnum;
import com.bancolombia.entity.FiltroMonitoreoRechazo;
import com.bancolombia.entity.Monitoreo;
import com.bancolombia.exception.DaoException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
public class MonitoreoController {
	
	@Autowired
	@Qualifier("monitoreoBusiness")
	private ImonitoreoBusiness monitoreoBusiness;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/monitoreo")
	public ResponseEntity<?> obtenerMonitoreo(){
		List<Monitoreo> resultados = new ArrayList<>();
		try {
			resultados =  monitoreoBusiness.obtenerMonitoreo();
		} catch (DaoException e) {
			logger.error(MensajeErrorEnum.ERROR_CONSULTADO_MONITOREO.getMensaje() + e);
			return new ResponseEntity<>(new ErrorRest(MensajeErrorEnum.ERROR_CONSULTADO_MONITOREO.getMensaje()),HttpStatus.BAD_REQUEST);	
		}
		return new ResponseEntity<>(resultados,HttpStatus.FOUND);
	}
	
	@GetMapping("/rechazos")
	public ResponseEntity<?> obtenerFiltroRechazos(){
		List<FiltroMonitoreoRechazo> resultado = new ArrayList<>();
		try {
			resultado = monitoreoBusiness.obtenerFiltroMonitoreoRechazo();
		} catch (DaoException e) {
			logger.error(MensajeErrorEnum.ERROR_CONSULTADO_MONITOREO.getMensaje() + e);
			return new ResponseEntity<>(new ErrorRest(MensajeErrorEnum.ERROR_FILTRO_RECHAZO.getMensaje()),HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(resultado,HttpStatus.FOUND );
		
	}

}
