package com.tech.service;

import java.util.List;
import java.util.Optional;

import com.tech.entity.Producto;

public interface ProductoService {

	public List<Producto> listarProductos();
	public Producto registraActualizaProducto(Producto producto);
	public Optional<Producto> obtenerProducto(int id);
	public Producto obtenerProductoPorId(int id);
	public List<Producto> listarProductos(int idCategoria);
	public void eliminarProductos(int id);
}
