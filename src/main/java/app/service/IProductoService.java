package app.service;

import java.util.List;

import app.models.entity.Producto;

public interface IProductoService {
	
	// obtener una lista
	public List<Producto> findAll();

	// obtener un producto
	public Producto findById(Long id);
}
