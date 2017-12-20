package com.bancolombia.exception;

import java.text.MessageFormat;

public class DaoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public DaoException(String mensaje){
		super(MessageFormat.format("Error en consulta de datos: {0} ", mensaje));
	}

}
