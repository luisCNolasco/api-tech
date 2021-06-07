package com.tech.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.entity.Distrito;
import com.tech.repository.DistritoRepository;
import com.tech.service.DistritoService;

@Service
public class DistritoServiceImpl implements DistritoService{

	@Autowired
	DistritoRepository repository;

	@Override
	public List<Distrito> listarDistritos() {
		return repository.findAll();
	}
	
	
}
