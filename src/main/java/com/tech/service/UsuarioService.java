package com.tech.service;

import java.util.List;

import com.tech.entity.Usuario;

public interface UsuarioService {

	public Usuario iniciarSesion(String usuario,String password);
	public Usuario registrarUsuario(Usuario usuario);
	public List<Usuario>listarUsuarios();
}
