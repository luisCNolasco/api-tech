package com.tech.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tech.entity.Boleta;

public interface BoletaRepository extends JpaRepository<Boleta, Integer>{

	
	@Query("Select u from Boleta u where u.idUsuario= :idUsuario")
	public abstract List<Boleta> buscarPorIdUsuario(@Param("idUsuario") int idUsuario);
	
	@Transactional
	@Modifying
	@Query("update Boleta m set m.estado = ?1 where m.numeroBoleta = ?2")
	public abstract int actualizarEstadoPedido(int estado,int numeroBoleta);
}
