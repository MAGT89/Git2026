package mx.com.mrjob.service;

import mx.com.mrjob.dto.ProductosDto;
import mx.com.mrjob.dto.ResponseDto;

public interface ProductosService {
	
	public ResponseDto getProductos();
	public ResponseDto insertProducto(ProductosDto producto);
	public ResponseDto updateCliente(ProductosDto producto);
	public ResponseDto deleteProducto(ProductosDto producto);
	

}
