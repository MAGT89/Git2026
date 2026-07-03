package mx.com.mrjob.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import mx.com.mrjob.dto.AlumnosDto;
import mx.com.mrjob.mapper.AlumnosMapper;

//Para consultas a base de datos

//Aqui no hay validaciones, ni nada que no sean consultas a bd
@Repository
public class AlumnosRepositoryImpl implements AlumnosRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<AlumnosDto> getAlumnos() {
		return jdbcTemplate.query("SELECT * FROM ALUMNO", new AlumnosMapper<AlumnosDto>());
	}

	@Override
	public AlumnosDto getAlumnoById(Integer idAlumno) {
		return jdbcTemplate.queryForObject("SELECT * FROM ALUMNO WHERE ID_ALUMNO = ?", new Object[] { idAlumno },
				new AlumnosMapper<AlumnosDto>());
	}

	@Override
	public Integer insertAlumno(AlumnosDto alumno) {
		return jdbcTemplate.update("INSERT INTO ALUMNO VALUES (SEQ_ALUMNO.NEXTVAL,?,?,?,?,?)",
				new Object[] { alumno.getNombre(), alumno.getApellidoPaterno(), alumno.getApellidoMaterno(),
						alumno.getEscuela(), alumno.getIdEscuela() });
	}

	@Override
	public Integer updateAlumno(AlumnosDto alumno) {
		return jdbcTemplate.update("UPDATE ALUMNO SET NOMBRE_ALUMNO = ?,APELLIDO_PATERNO = ?,APELLIDO_MATERNO = ?,"
				+ " ESCUELA = ?,ID_ESCUELA = ? WHERE ID_ALUMNO = ?",
				new Object[] { alumno.getNombre(),alumno.getApellidoPaterno(), alumno.getApellidoMaterno(),
						alumno.getEscuela(),alumno.getIdEscuela(), alumno.getIdAlumno() });
	}

	@Override
	public Integer deleteAlumno(AlumnosDto alumno) {
		return jdbcTemplate.update("DELETE FROM ALUMNO WHERE ID_ALUMNO = ?", new Object[] { alumno.getIdAlumno() });
	}

}
