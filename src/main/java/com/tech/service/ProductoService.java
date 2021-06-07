package com.tech.service;

import java.util.List;

import com.tech.entity.Producto;

public interface ProductoService {

	public List<Producto> listarProductos();
	public Producto registraActualizaProducto(Producto producto);
	public Producto obtenerProducto(int id);
	public List<Producto> listarProductos(int idCategoria);
}
