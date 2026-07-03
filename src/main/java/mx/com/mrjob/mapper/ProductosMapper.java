package mx.com.mrjob.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.com.mrjob.dto.ProductosDto;

public class ProductosMapper<T> implements RowMapper<ProductosDto> {

	@Override
	public ProductosDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductosDto objeto = new ProductosDto();
		
		objeto.setIdProducto(rs.getLong("ID_PRODUCTO"));
		objeto.setNombreProducto(rs.getString("NOMBRE_PRODUCTO"));
		objeto.setInversion(rs.getLong("INVERSION"));
		java.sql.Date fechaCreac = rs.getDate("FECHA_CREACION");
		objeto.setCodigoProducto(rs.getNString("CODIGO_PRODUCTO"));
		objeto.setTipoProducto(rs.getString("TIPO_PRODUCTO"));
		objeto.setTasaInteres(rs.getDouble("TASA_INTERES"));
		objeto.setComision(rs.getDouble("COMISION"));
						
		return objeto;
		
	}

}
