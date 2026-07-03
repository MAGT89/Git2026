package mx.com.mrjob.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.com.mrjob.dto.ProductosDto;
import mx.com.mrjob.mapper.ProductosMapper;

@Repository
public class ProductosRepositoryImpl implements ProductosRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<ProductosDto> getProductos() {

		return jdbcTemplate.query("SELECT * FROM PRODUCTOS", new ProductosMapper<ProductosDto>());
	}

	@Override
	public Integer insertProducto(ProductosDto producto) {
		return jdbcTemplate.update("INSERT INTO PRODUCTOS VALUES(?,?,?,?,?,?,?,?)",
				new Object[] { producto.getIdProducto(), producto.getNombreProducto(), producto.getInversion(),
						java.sql.Date.valueOf(producto.getFechaCreacion()), producto.getCodigoProducto(),
						producto.getTipoProducto(), producto.getTasaInteres(), producto.getComision() });

	}

	@Override
	public Integer updateProducto(ProductosDto producto) {		
		return jdbcTemplate.update("UPDATE PRODUCTOS SET NOMBRE_PRODUCTO = ?,INVERSION = ?,FECHA_CREACION = ?,"
				+ "CODIGO_PRODUCTO = ?,TIPO_PRODUCTO = ?,TASA_INTERES = ?,COMISION = ? WHERE ID_PRODUCTO = ?",
				new Object[] {producto.getNombreProducto(),producto.getInversion(),java.sql.Date.valueOf(producto.getFechaCreacion()),
						producto.getCodigoProducto(),producto.getTipoProducto(),producto.getTasaInteres(),producto.getComision(),
						producto.getIdProducto()});
	}

	@Override
	public Integer deleteProducto(ProductosDto producto) {
		return jdbcTemplate.update("DELETE FROM PRODUCTOS WHERE ID_PRODUCTO = ? ",
				new Object[] { producto.getIdProducto()});
	}

	
}
