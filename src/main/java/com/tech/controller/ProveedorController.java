package com.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tech.entity.Proveedor;
import com.tech.service.ProveedorService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
@RequestMapping("proveedor")
public class ProveedorController{

	@Autowired
	ProveedorService service;

	@GetMapping("/listar")
	public List<Proveedor> listarProveedor() {
		return service.listarProveedor();
	}

	
}
