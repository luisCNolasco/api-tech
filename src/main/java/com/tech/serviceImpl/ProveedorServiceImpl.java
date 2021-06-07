package com.tech.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.entity.Proveedor;
import com.tech.repository.ProveedorRespository;
import com.tech.service.ProveedorService;

@Service
public class ProveedorServiceImpl implements ProveedorService{

	@Autowired
	ProveedorRespository repository;
	
	@Override
	public List<Proveedor> listarProveedor() {
		return repository.findAll();
	}

}
