package com.tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tech.entity.TipoUsuario;

public interface TipoUsuarioRespository extends JpaRepository<TipoUsuario, Integer>{
	
}
