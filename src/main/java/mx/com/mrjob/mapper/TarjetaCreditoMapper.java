package mx.com.mrjob.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.com.mrjob.dto.TarjetaCreditoDto;

public class TarjetaCreditoMapper<T> implements RowMapper<TarjetaCreditoDto> {

	@Override
	public TarjetaCreditoDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		TarjetaCreditoDto objeto = new TarjetaCreditoDto();
		
		objeto.setIdTarjetaCredito(rs.getLong("ID_TARJETA_CREDITO"));
		objeto.setIdCliente(rs.getLong("ID_CLIENTE"));
		objeto.setIdProducto(rs.getLong("ID_PRODUCTO"));
		objeto.setNumeroTarjeta(rs.getLong("NUMERO_TARJETA"));
		objeto.setCvv(rs.getInt("CVV"));
		objeto.setLineaCredito(rs.getLong("LINEA_CREDITO"));
		objeto.setSaldoUtilizado(rs.getLong("SALDO_UTILIZADO"));
		java.sql.Date fechaVenci = rs.getDate("FECHA_VENCIMIENTO");
		java.sql.Date fechaCort = rs.getDate("FECHA_CORTE");
		objeto.setEstatus(rs.getString("ESTATUS"));
		
		return objeto;
	}

}
