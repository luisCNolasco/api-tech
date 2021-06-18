package com.tech.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ProductoHasBoletaPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "numeroBoleta", unique = true, nullable = false, length = 10, insertable = true, updatable = false)
	private int numeroBoleta;

	@Column(name = "idProducto", unique = true, nullable = false, length = 10, insertable = true, updatable = false)
	private int idProducto;

	public int getNumeroBoleta() {
		return numeroBoleta;
	}

	public void setNumeroBoleta(int numeroBoleta) {
		this.numeroBoleta = numeroBoleta;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
