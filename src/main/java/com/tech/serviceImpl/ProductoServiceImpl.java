package com.tech.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.entity.Producto;
import com.tech.repository.ProductoRepository;
import com.tech.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	ProductoRepository repository;
	
	@Override
	public List<Producto> listarProductos() {
		return repository.findAll();
	}
	
	@Override
	public List<Producto> listarProductos(int idCategoria) {
		return repository.buscarProductosCategoria(idCategoria);
	}

	@Override
	public Producto registraActualizaProducto(Producto producto) {
		return repository.save(producto);
	}

	@Override
	public Optional<Producto> obtenerProducto(int id) {
		return repository.findById(id);
	}

	@Override
	public void eliminarProducto(int id) {
		repository.deleteById(id);
		
	}

	@Override
	public Producto obtenerProductoPorId(int id) {
		return repository.findById(id).get();
	}

}
