package mx.com.mrjob.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.com.mrjob.dto.SaldoDto;

public class SaldoMapper<T> implements RowMapper<SaldoDto> {

	@Override
	public SaldoDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		SaldoDto objeto = new SaldoDto();
		
		objeto.setIdSaldo(rs.getLong("ID_SALDO"));
		objeto.setIdCliente(rs.getLong("ID_CLIENTE"));
		objeto.setIdProducto(rs.getLong("ID_PRODUCTO"));
		objeto.setNumeroCuenta(rs.getString("NUMERO_CUENTA"));
		objeto.setMontoActual(rs.getLong("MONTO_ACTUAL"));
		objeto.setMoneda(rs.getString("MONEDA"));
		java.sql.Date fechaApert = rs.getDate("FECHA_APERTURA");
		objeto.setEstatus(rs.getString("ESTATUS"));
		
		return objeto;
	}

}
