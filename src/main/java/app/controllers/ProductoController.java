package app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import app.models.entity.Producto;
import app.service.IProductoService;

@RestController
public class ProductoController {

	@Autowired
	IProductoService productoservicio;
	
	@GetMapping("/productos")
	public List<Producto> productos(){
		return productoservicio.findAll();
	}
	
	@GetMapping("/producto/{id}")
	public Producto producto(@PathVariable Long id) {
		return productoservicio.findById(id);
	}
}
