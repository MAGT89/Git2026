package mx.com.mrjob.repository;

import java.util.List;

import mx.com.mrjob.dto.AlumnosDto;
import mx.com.mrjob.dto.ResponseDto;

public interface AlumnosRepository {

	public List<AlumnosDto> getAlumnos();
	public AlumnosDto getAlumnoById(Integer idAlumno);
	public Integer insertAlumno(AlumnosDto alumno);
	public Integer updateAlumno(AlumnosDto alumno);
	public Integer deleteAlumno(AlumnosDto alumno);

	
}
