package com.tech.entity;

public class Seleccion {

	private int codigo;
	private String nombre;
	private double precio;
	private int cantidad;
	private double totalParcial;

	public double getTotalParcial() {
		totalParcial = precio * cantidad;
		return totalParcial;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
