package mx.com.mrjob.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.com.mrjob.dto.AlumnosDto;

public class AlumnosMapper<T> implements RowMapper<AlumnosDto> {
	
	public AlumnosDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		AlumnosDto objeto = new AlumnosDto();
		
		objeto.setIdAlumno(rs.getLong("ID_ALUMNO"));
		objeto.setNombre(rs.getString("NOMBRE_ALUMNO"));
		objeto.setApellidoPaterno(rs.getString("APELLIDO_PATERNO"));
		objeto.setApellidoMaterno(rs.getString("APELLIDO_MATERNO"));
		objeto.setEscuela(rs.getString("ESCUELA"));
		objeto.setIdEscuela(rs.getLong("ID_ESCUELA"));
		
		return objeto;
	}

}
