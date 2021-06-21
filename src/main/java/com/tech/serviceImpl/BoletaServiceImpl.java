package com.tech.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tech.entity.*;
import com.tech.entity.ProductoHasBoleta;
import com.tech.repository.*;
import com.tech.service.BoletaService;

@Service
public class BoletaServiceImpl implements BoletaService {

	@Autowired
	private BoletaRepository boletaRepository;

	@Autowired
	private ProductoHasBoletaRepository detalleRepository;

	@Override
	@Transactional
	public Boleta insertaBoleta(Boleta obj) {
		Boleta cabecera = boletaRepository.save(obj);
		for (ProductoHasBoleta d : cabecera.getDetallesBoleta()) {
			d.getProductoHasBoletaPK().setNumeroBoleta(cabecera.getNumeroBoleta());
			detalleRepository.actualizaStock(d.getCantidad(), d.getProductoHasBoletaPK().getIdProducto());
			detalleRepository.save(d);
		}
		return cabecera;
	}

	@Override
	public List<Boleta> buscarPorIdUsuario(int cod_usu) {
		return boletaRepository.buscarPorIdUsuario(cod_usu);
	}

	@Override
	public List<Boleta> listaBoletas() {
		return boletaRepository.findAll();
	}

	@Override
	public int actualizarEstadoBoleta(Integer estado, Integer num_boleta) {
		return boletaRepository.actualizarEstadoPedido(estado, num_boleta);
	}

	@Override
	public List<ProductoHasBoleta> detallesBoleta(int numeroBoleta) {
		return detalleRepository.detalleBoleta(numeroBoleta);
	}

}
