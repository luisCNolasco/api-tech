package com.tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tech.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
