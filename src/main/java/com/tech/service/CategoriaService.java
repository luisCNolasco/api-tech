package com.tech.service;

import java.util.List;

import com.tech.entity.Categoria;

public interface CategoriaService {

	public List<Categoria> listarCategoria();
	public Categoria obtenerCategoria(int id);
}
