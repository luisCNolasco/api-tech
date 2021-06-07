package com.tech.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.entity.Categoria;
import com.tech.repository.CategoriaRepository;
import com.tech.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService{

	@Autowired
	CategoriaRepository repository;
	
	@Override
	public List<Categoria> listarCategoria() {
		return repository.findAll();
	}

	@Override
	public Categoria obtenerCategoria(int id) {
		return repository.findById(id).get();
	}

}
