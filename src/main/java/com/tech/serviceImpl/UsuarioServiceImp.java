package com.tech.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.entity.Usuario;
import com.tech.repository.UsuarioRepository;
import com.tech.service.UsuarioService;

@Service
public class UsuarioServiceImp implements UsuarioService{

	@Autowired
	UsuarioRepository repository;
	

	@Override
	public List<Usuario> listarUsuarios() {
		return repository.findAll();
	}

	@Override
	public Usuario registrarUsuario(Usuario usuario) {
		return repository.save(usuario);
	}

	@Override
	public Usuario iniciarSesion(String usuario, String password) {
		return repository.iniciarSesion(usuario, password);
	}

}
