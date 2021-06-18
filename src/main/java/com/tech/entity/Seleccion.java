package com.tech.entity;

public class Seleccion {

	private int idProducto;
	private String nombre;
	private double precio;
	private int cantidad;
	private double totalParcial;

	public double getTotalParcial() {
		totalParcial = precio * cantidad;
		return totalParcial;
	}

	
	public int getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void setTotalParcial(double totalParcial) {
		this.totalParcial = totalParcial;
	}

}
