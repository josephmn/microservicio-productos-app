package app.models.dao;

import org.springframework.data.repository.CrudRepository;

import app.models.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long> {

}
