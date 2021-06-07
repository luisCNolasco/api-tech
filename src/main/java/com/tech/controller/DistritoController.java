package com.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tech.entity.Distrito;
import com.tech.service.DistritoService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
@RequestMapping("distrito")
public class DistritoController{

	@Autowired
	DistritoService service;

	@GetMapping("/listar")
	public List<Distrito> listarDistritos() {
		return service.listarDistritos();
	}
	
	
}
