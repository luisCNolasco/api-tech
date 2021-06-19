package com.tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tech.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	@Query("select u from Usuario u where u.usuario = ?1 and u.passwordUsuario = ?2")
	  public Usuario iniciarSesion(String usuario,String password);
}
