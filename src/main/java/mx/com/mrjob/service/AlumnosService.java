package mx.com.mrjob.service;

import java.util.List;

import mx.com.mrjob.dto.AlumnosDto;
import mx.com.mrjob.dto.ResponseDto;

public interface AlumnosService {

	 public ResponseDto getAlumnos();
	 public ResponseDto getAlumnoById(Integer idAlumno);
	 public ResponseDto insertAlumno(AlumnosDto alumno);
	 public ResponseDto updateAlumno(AlumnosDto alumno);
	 public ResponseDto deleteAlumno(AlumnosDto alumno);
	 
}
