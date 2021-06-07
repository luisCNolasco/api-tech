package com.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tech.entity.Producto;
import com.tech.service.ProductoService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
@RequestMapping("producto")
public class ProductoController {

	@Autowired
	ProductoService service;
	
	@GetMapping("listar")
	public List<Producto> listarProductos(){
		return service.listarProductos();
	}
	
	@PostMapping("registrar")
	public Producto registrarProducto(@RequestBody Producto producto) {
		return service.registraActualizaProducto(producto);
	}
	
	@PutMapping("/actualizar")
	public Producto actualizarProducto(@RequestBody Producto producto) {
		return service.registraActualizaProducto(producto);
	}
	
	@GetMapping("/obtenerProducto/{idProducto}")
	public Producto obtenerProducto(@PathVariable("idProducto") int id) {
		return service.obtenerProducto(id);
	}
	
	@GetMapping("/obtenerProducto/categoria/{idCategoria}")
	public List<Producto> listarProductosXCategoria(@PathVariable() int idCategoria) {
		return service.listarProductos(idCategoria);
	}
}
