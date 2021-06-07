package com.tech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tech.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{

	@Query("Select u from Producto u where u.categoria.idCategoria = :idCategoria")
	public abstract List<Producto> buscarProductosCategoria(@Param("idCategoria") int idCategoria);
}
