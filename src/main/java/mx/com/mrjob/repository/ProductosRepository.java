package mx.com.mrjob.repository;

import java.util.List;

import mx.com.mrjob.dto.ProductosDto;

public interface ProductosRepository {

	public List<ProductosDto> getProductos();
	public Integer insertProducto(ProductosDto producto);
	public Integer updateProducto(ProductosDto producto);
	public Integer deleteProducto(ProductosDto producto);
	
}
