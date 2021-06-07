package com.tech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_distrito")
public class Distrito {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idDistrito")
	private int idDistrito;
	
	@Column(name = "nombreDistrito")
	private String nombreDistrito;

	public int getIdDistrito() {
		return idDistrito;
	}

	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}

	public String getNombreDistrito() {
		return nombreDistrito;
	}

	public void setNombreDistrito(String nombreDistrito) {
		this.nombreDistrito = nombreDistrito;
	}

}
