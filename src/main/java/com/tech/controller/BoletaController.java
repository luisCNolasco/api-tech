package com.tech.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tech.entity.*;
import com.tech.service.*;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,
		RequestMethod.PUT })
@RequestMapping("boleta")
public class BoletaController {

	@Autowired
	private BoletaService boletaService;

	// Se almacenan los productos seleccionados
	private List<Seleccion> seleccionados = new ArrayList<Seleccion>();

	@PostMapping("/enviarProducto")
	public int registra(@RequestBody Seleccion seleccion) {
		seleccionados.add(seleccion);
		System.out.println(seleccionados.size());
		return seleccionados.size();
	}

	@GetMapping("obtenerBoleta")
	public String registrarBoleta(List<Seleccion> seleccionados) {
		int estadoBoleta = 1;
		String mensajeSalida = null;

		List<ProductoHasBoleta> detalles = new ArrayList<ProductoHasBoleta>();
		for (Seleccion x : seleccionados) {
			ProductoHasBoletaPK pk = new ProductoHasBoletaPK();

			pk.setIdProducto(x.getIdProducto());

			ProductoHasBoleta phb = new ProductoHasBoleta();

			phb.setPrecio(x.getPrecio());
			phb.setCantidad(x.getCantidad());
			phb.setProductoHasBoletaPK(pk);// num_boleta y cod_pro

			detalles.add(phb);

		}
		Boleta objBoleta = new Boleta();
		objBoleta.setIdUsuario(2);
		objBoleta.setEstado(estadoBoleta);
		objBoleta.setDetallesBoleta(detalles);

		Boleta objIns = boletaService.insertaBoleta(objBoleta);

		if (objIns != null) {
			mensajeSalida = "Boleta registrada";
			seleccionados.clear();
		}
		return mensajeSalida;
	}

	@GetMapping("/cargarXIdUsuario/{id}")
	@ResponseBody
	public List<Boleta> cargarPedidosxCodUsuario(@PathVariable("id") int codigoUsuario) {
		return boletaService.buscarPorIdUsuario(codigoUsuario);
	}

	@GetMapping("/listar")
	@ResponseBody
	public List<Boleta> listarBoletas() {
		return boletaService.listaPedido();
	}

	@PostMapping("/actualizar/{estado}/{numeroBoleta}")
	@ResponseBody
	public int actualizarEstadoPedido(@PathVariable("estado") int estado, @PathVariable("estado") int numeroBoleta) {
		return boletaService.actualizarEstadoPedido(estado, numeroBoleta);
	}

}
