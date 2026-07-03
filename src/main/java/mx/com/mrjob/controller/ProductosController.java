package mx.com.mrjob.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mx.com.mrjob.dto.ProductosDto;
import mx.com.mrjob.dto.ResponseDto;
import mx.com.mrjob.service.ProductosService;

@Controller
@RequestMapping("productos")
public class ProductosController {

	@Autowired
	private ProductosService productosService;
	
	@ResponseBody
	@RequestMapping(value = "/getProductos", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<ResponseDto> getProductos() {
		final HttpHeaders httpHeaders = new HttpHeaders();
		ResponseDto response = productosService.getProductos();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<ResponseDto>(response, httpHeaders, HttpStatus.OK);
		
	}
	
	@ResponseBody
	@RequestMapping(value = "/insertProducto", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResponseDto> insertProducto(@RequestBody ProductosDto nuevoProducto) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		ResponseDto response = productosService.insertProducto(nuevoProducto);
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<ResponseDto>(response, httpHeaders, HttpStatus.OK);
	
	}
	
	@ResponseBody
	@RequestMapping(value = "/updateProducto", method = RequestMethod.PUT, produces = "application/json")
	public ResponseEntity<String> updateProducto(@RequestBody ProductosDto producto) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		ResponseDto response = productosService.updateCliente(producto);
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>("Producto actualizado", httpHeaders, HttpStatus.OK);

	}
	
	@ResponseBody
	@RequestMapping(value = "/deleteProducto", method = RequestMethod.DELETE, produces = "application/json")
	public ResponseEntity<String> deleteProducto(@RequestBody ProductosDto producto) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		ResponseDto response = productosService.deleteProducto(producto);
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>("Producto eliminado", httpHeaders, HttpStatus.OK);

	}
	
	
}
