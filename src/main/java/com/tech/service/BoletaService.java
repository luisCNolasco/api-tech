package com.tech.service;

import java.util.List;

import com.tech.entity.*;

public interface BoletaService {
	
	public List<Boleta> buscarPorIdUsuario(int idUsuario);
	public Boleta insertaBoleta(Boleta obj);
	public List<Boleta> listaBoletas();
	public int actualizarEstadoBoleta(Integer estado,Integer numeroBoleta);

}
