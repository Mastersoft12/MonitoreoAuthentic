package com.bancolombia.entity;

import java.io.Serializable;

public class Monitoreo implements Serializable {

	private static final long serialVersionUID = 1L;

	private double promedio;
	
	private String descripcion;

	private int cantidad;

	public Monitoreo() {

	}

	public Monitoreo(double promedio, String descripcion, int cantidad) {
		this.promedio = promedio;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
