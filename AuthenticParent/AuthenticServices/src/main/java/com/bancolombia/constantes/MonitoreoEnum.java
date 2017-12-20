package com.bancolombia.constantes;

public enum MonitoreoEnum {

	APROBADO("Aprobadas"),
	RECHAZADA("Rechazadas");
	
	private String nombre;

	private MonitoreoEnum(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

}
