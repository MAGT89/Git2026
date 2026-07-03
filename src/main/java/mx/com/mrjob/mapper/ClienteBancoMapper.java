package mx.com.mrjob.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.com.mrjob.dto.ClienteBancoDto;

public class ClienteBancoMapper<T> implements RowMapper<ClienteBancoDto> {
	
	@Override
	public ClienteBancoDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		ClienteBancoDto objeto = new ClienteBancoDto();
		
		objeto.setId_cliente(rs.getLong("ID_CLIENTE"));
		objeto.setDni(rs.getString("DNI"));
		objeto.setNombre(rs.getString("NOMBRE"));
		java.sql.Date fechaNac = rs.getDate("FECHA_NACIMIENTO");
		objeto.setFechaNacimiento(fechaNac != null ? fechaNac.toLocalDate():null);
		objeto.setEdad(rs.getInt("EDAD"));
		objeto.setSexo(rs.getString("SEXO"));
		objeto.setCurp(rs.getString("CURP"));
		objeto.setRfc(rs.getString("RFC"));
		objeto.setTelefono(rs.getLong("TELEFONO"));
		objeto.setCorreo(rs.getString("CORREO"));
		objeto.setDireccion(rs.getString("DIRECCION"));
		objeto.setCp(rs.getInt("CP"));
		java.sql.Date fechaAlt = rs.getDate("FECHA_ALTA");
		objeto.setFechaAlta(fechaAlt != null ? fechaAlt.toLocalDate():null);
		objeto.setEstatus(rs.getString("ESTATUS"));
		
		return objeto;
	}

}
