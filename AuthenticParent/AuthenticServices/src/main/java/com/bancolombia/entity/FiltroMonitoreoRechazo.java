package com.bancolombia.entity;

import java.io.Serializable;

public class FiltroMonitoreoRechazo implements Serializable {
	

	private static final long serialVersionUID = 1L;

	private int codigo;
	
	private String descripcion;
	
	private int cantidad;
	
	public FiltroMonitoreoRechazo(){
		
	}

	public FiltroMonitoreoRechazo(int codigo, String descripcion, int cantidad) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
}
