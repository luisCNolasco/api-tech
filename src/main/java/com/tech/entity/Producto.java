package com.tech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProducto")
	private int idProducto;
	
	@Column(name = "nombreProducto")
	private String nombreProducto;
	
	@Column(name = "precioProducto")
	private double precioProducto;
	
	@Column(name = "stockProducto")
	private int stockProducto;
	
	@Column(name = "estadoProducto")
	private int estadoProducto;
	
	@ManyToOne
	@JoinColumn(name="idCategoria")
	private Categoria categoria;
	
	@ManyToOne
	@JoinColumn(name="idProveedor")
	private Categoria proveedor;
	
	@Column(name = "fotoProducto1")
	private String fotoProducto1;
	
	@Column(name = "fotoProducto2")
	private String fotoProducto2;
	
	@Column(name = "descripcionProducto")
	private String descripcionProducto;

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public double getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}

	public int getStockProducto() {
		return stockProducto;
	}

	public void setStockProducto(int stockProducto) {
		this.stockProducto = stockProducto;
	}

	public int getEstadoProducto() {
		return estadoProducto;
	}

	public void setEstadoProducto(int estadoProducto) {
		this.estadoProducto = estadoProducto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Categoria getProveedor() {
		return proveedor;
	}

	public void setProveedor(Categoria proveedor) {
		this.proveedor = proveedor;
	}

	public String getFotoProducto1() {
		return fotoProducto1;
	}

	public void setFotoProducto1(String fotoProducto1) {
		this.fotoProducto1 = fotoProducto1;
	}

	public String getFotoProducto2() {
		return fotoProducto2;
	}

	public void setFotoProducto2(String fotoProducto2) {
		this.fotoProducto2 = fotoProducto2;
	}

	public String getDescripcionProducto() {
		return descripcionProducto;
	}

	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}
	
	

}
