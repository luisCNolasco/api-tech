package com.tech.service;

import java.util.List;

import com.tech.entity.*;

public interface BoletaService {
	
	public List<Boleta> buscarPorIdUsuario(int cod_usu);
	public Boleta insertaBoleta(Boleta obj);
	public List<Boleta> listaPedido();
	public int actualizarEstadoPedido(Integer estado,Integer numeroBoleta);

}
