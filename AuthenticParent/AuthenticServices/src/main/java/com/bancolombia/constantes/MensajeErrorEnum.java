package com.bancolombia.constantes;

public enum MensajeErrorEnum {
	
	ERROR_CONSULTADO_MONITOREO("Error consultando monitoreo"),
	ERROR_FILTRO_RECHAZO("Error consultando los rechazos");
	
	private String mensaje;	
	

	private MensajeErrorEnum(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}

	

}
