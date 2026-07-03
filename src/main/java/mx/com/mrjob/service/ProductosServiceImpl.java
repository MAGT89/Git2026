package mx.com.mrjob.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.com.mrjob.dto.ProductosDto;
import mx.com.mrjob.dto.ResponseDto;
import mx.com.mrjob.repository.ProductosRepository;

@Service
@Transactional
public class ProductosServiceImpl implements ProductosService {

	@Autowired
	private ProductosRepository productosRepository;

	@Override
	public ResponseDto getProductos() {
		ResponseDto response = new ResponseDto();
		try {
			List<ProductosDto> productos = productosRepository.getProductos();
			if (productos != null && !productos.isEmpty()) { // Si la lista de productos existe y contiene elementos
				response.setCode(1);
				response.setMessage("Registro de productos obtenidos");
				response.setContent(productos);
			} else {
				response.setCode(-1);
				response.setMessage("No se obtuvieron registros de productos");
			}
		} catch (NullPointerException nullPointerException) {
			response.setCode(-10);
			response.setMessage("Algun dato viene nulo");
		} catch (Exception exception) {
			response.setCode(-100);
			response.setMessage("Error al consultar a los productos");
		}
		return response;
	}

	@Override
	public ResponseDto insertProducto(ProductosDto producto) {
		ResponseDto response = new ResponseDto();
		try {
			if (producto.getIdProducto() == null) {
				throw new IllegalArgumentException("El id es obligatorio");
			}
			if (producto.getNombreProducto().length() > 100) {
				throw new IllegalArgumentException("El nombre como maximo debe tener 100 caracteres");
			}
			if (producto.getInversion() < 10000) {
				throw new IllegalArgumentException("la inversion minima es a partir de 10000");
			}
			if (producto.getTipoProducto() == null) {
				throw new IllegalArgumentException(
						"El tipo de producto es obligatorio y los valores permitidos son TARJETA_DEBITO, TARJETA_CREDITO,INVERSION");
			}
			Integer insertResponse = productosRepository.insertProducto(producto);
			if (insertResponse == 1) {
				response.setCode(1);
				response.setMessage("producto insertado correctamente");
			}
		} catch (NullPointerException nullPointerException) {
			response.setCode(-10);
			response.setMessage("Problemas al insertar el producto");
		} catch (Exception exception) {
			response.setCode(-100);
			response.setMessage("verifica lo siguiente" + exception);
		}

		return response;
	}

	@Override
	public ResponseDto updateCliente(ProductosDto producto) {
		ResponseDto response = new ResponseDto();
		try {
			Integer updateResponse = productosRepository.updateProducto(producto);
			if (updateResponse == 1) {
				response.setCode(1);
				response.setMessage("Actualizado correctamente");
			}
		} catch (NullPointerException nullPointerException) {
			response.setCode(-10);
			response.setMessage("No se puede actualizar con un valor nulo");
		} catch (Exception exception) {
			response.setCode(-100);
			response.setMessage("Verifica lo siguiente " + exception);
		}

		return response;
	}

	@Override
	public ResponseDto deleteProducto(ProductosDto producto) {
		ResponseDto response = new ResponseDto();
		try {
			Integer deleteResponse = productosRepository.deleteProducto(producto);
			if (deleteResponse == 1) {
				response.setCode(1);
				response.setMessage("Producto eliminado");
			}
		} catch (NullPointerException nullPointerException) {
			response.setCode(-10);
			response.setMessage("El producto no fue eliminado");
		} catch (Exception exception) {
			response.setCode(-100);
			response.setMessage("Verificar lo siguiente " + exception);
		}

		return response;
	}

}
