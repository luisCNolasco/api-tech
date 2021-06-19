package com.tech.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

	@Autowired
	UsuarioController usuarioSesion;

	@Autowired
	SeleccionController arraySeleccion;

	@GetMapping("registrar")
	public int registrarBoleta() {

		int estadoBoleta = 1;
		int salida = -1;

		List<ProductoHasBoleta> detalles = new ArrayList<ProductoHasBoleta>();
		for (Seleccion x : arraySeleccion.seleccionados) {
			ProductoHasBoletaPK pk = new ProductoHasBoletaPK();

			pk.setIdProducto(x.getCodigo());

			ProductoHasBoleta phb = new ProductoHasBoleta();

			phb.setPrecio(x.getPrecio());
			phb.setCantidad(x.getCantidad());
			phb.setProductoHasBoletaPK(pk);

			detalles.add(phb);

		}

		Boleta objBoleta = new Boleta();
		objBoleta.setIdUsuario(usuarioSesion.usuario.getIdUsuario());
		objBoleta.setEstado(estadoBoleta);
		objBoleta.setDetallesBoleta(detalles);
		System.out.println("linea 83");
		Boleta objIns = boletaService.insertaBoleta(objBoleta);
		System.out.println("linea 85");
		if (objIns != null) {
			System.out.println("línea 87 llegó");
			salida = 1;
			arraySeleccion.seleccionados.clear();
		}
		return salida;

	}

	@GetMapping("/cargarXIdUsuario/{id}")
	@ResponseBody
	public List<Boleta> cargarPedidosxCodUsuario(@PathVariable("id") int codigoUsuario) {
		return boletaService.buscarPorIdUsuario(codigoUsuario);
	}

	@GetMapping("/listar")
	@ResponseBody
	public List<Boleta> listarBoletas() {
		return boletaService.listaBoletas();
	}

	@PostMapping("/actualizar/{estado}/{numeroBoleta}")
	@ResponseBody
	public int actualizarEstadoPedido(@PathVariable("estado") int estado, @PathVariable("estado") int numeroBoleta) {
		return boletaService.actualizarEstadoBoleta(estado, numeroBoleta);
	}

}
