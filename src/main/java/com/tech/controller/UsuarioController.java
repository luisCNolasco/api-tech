package com.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tech.entity.Usuario;
import com.tech.service.UsuarioService;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
@RequestMapping("usuario")
public class UsuarioController {

	
	@Autowired
	UsuarioService service;
	
	/*@GetMapping("/iniciarSesion/{correo}/{password}")
	public Usuario obtenerUsuario(@PathVariable("correo") String correo,@PathVariable("password") String password) {
			
		return service.iniciarSesion(correo, password);
	}*/
	
	@GetMapping("listar")
	public List<Usuario> listarUsuarios() {
		return service.listarUsuarios();
	}
	
	@PostMapping("registrar")
	public Usuario registrarUsuario(Usuario usuario) {
		return service.registrarUsuario(usuario);
	}
}
