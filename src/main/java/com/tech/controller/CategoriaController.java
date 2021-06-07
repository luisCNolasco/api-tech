package com.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tech.entity.Categoria;
import com.tech.service.CategoriaService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
@RequestMapping("categoria")
public class CategoriaController {

	@Autowired
	CategoriaService service;

	@GetMapping("/listar")
	public List<Categoria> listarCategoria(){
		return service.listarCategoria();
	}
	
	@GetMapping("/obtenerCategoria/{id}")
	public Categoria obtenerCategoria(@PathVariable("id") int id) {
		return service.obtenerCategoria(id);
	}
}
