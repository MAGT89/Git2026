package mx.com.mrjob.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mx.com.mrjob.dto.AlumnosDto;
import mx.com.mrjob.dto.ResponseDto;
import mx.com.mrjob.repository.AlumnosRepository;

//Se maneja la logica del negocio
//Validaciones
//Si el correo no es nulo, no es vacio
//Si es menor que, mayor que, si es un valor especifico
//El usuario no puede ser borrado ya que tiene ventas realizadas
@Service
public class AlumnosServiceImpl implements AlumnosService {

	@Autowired
	private AlumnosRepository alumnosRepository;
	
	
	@Override
	public ResponseDto getAlumnos() {
		ResponseDto response = new ResponseDto();
		
		try {
			List<AlumnosDto> alumnos = alumnosRepository.getAlumnos();
			
			if(alumnos != null && !alumnos.isEmpty()) {
				response.setCode(1);
				response.setMessage("Registros de alumnos obtenidos");
				response.setContent(alumnos);
			}
			else {
				response.setCode(-1);
				response.setMessage("No se obtuvieron alumnos");
			}
		}
		catch (NullPointerException nullPointerException) {
			response.setCode(-10);
			response.setMessage("Alg n dato viene nulo");
		}
		catch (Exception exception) {
			response.setCode(-100);
			response.setMessage("Error al consultar los alumnos, verifique");
		}
		
		
		return response;
	}
	
	@Override
	public ResponseDto getAlumnoById(Integer idAlumno) {
		ResponseDto response = new ResponseDto();
		
		try {
			List<AlumnosDto> alumnos = alumnosRepository.getAlumnos();
			
			if(alumnos != null && !alumnos.isEmpty()) {
				response.setCode(1);
				response.setMessage("Registros de alumnos obtenidos");
				response.setContent(alumnos);
			}
			else {
				response.setCode(-1);
				response.setMessage("No se obtuvieron alumnos");
			}
		}
		catch (NullPointerException nullPointerException) {
			response.setCode(-10);
			response.setMessage("Alg n dato viene nulo");
		}
		catch (Exception exception) {
			response.setCode(-100);
			response.setMessage("Error al consultar los alumnos, verifique");
		}
		
		
		return response;
	}


	@Override
	public ResponseDto insertAlumno(AlumnosDto alumno) {
		ResponseDto response = new ResponseDto();
		response.setCode(-1);
		response.setMessage("No se insertaron registros");
		
		try {
	        Integer insertResponse = alumnosRepository.insertAlumno(alumno);
	        
	        if(insertResponse ==1 ) {
	        	response.setCode(1);
	        	response.setMessage("Se insert  correctamente");
	        }
		}
		catch (NullPointerException nullPointerException) {
			response.setCode(-10);
			response.setMessage("No se pudo insertar por algun valor nulo");
		}
		catch (Exception exception) {
			response.setCode(-100);
			response.setMessage("Error al insertar los alumnos, verifique"+exception);
		}

		return response;
	}


	@Override
	public ResponseDto updateAlumno(AlumnosDto alumno) {
		ResponseDto response = new ResponseDto();
		response.setCode(-1);
		response.setMessage("No se actualizaron registros");
		
		try {
	        Integer updateResponse = alumnosRepository.insertAlumno(alumno);
	        
	        if(updateResponse ==1 ) {
	        	response.setCode(1);
	        	response.setMessage("Se actualiz  correctamente");
	        }
		}
		catch (NullPointerException nullPointerException) {
			response.setCode(-10);
			response.setMessage("No se pudo actualizar por algun valor nulo");
		}
		catch (Exception exception) {
			response.setCode(-100);
			response.setMessage("Error al actualizar los alumnos, verifique");
		}

		return response;
	}


	@Override
	public ResponseDto deleteAlumno(AlumnosDto alumno) {
		ResponseDto response = new ResponseDto();
		response.setCode(-1);
		response.setMessage("No se eliminaron registros");
		
		AlumnosDto alumnos = null;
		try {
	        Integer deleteResponse = alumnosRepository.deleteAlumno(alumno);
	        
	        if(deleteResponse ==1 ) {
//	        	alumnos = new AlumnosDto(1L);
//	        	alumnos = new AlumnosDto(1L, "as");
	        	
	        	response.setCode(1);
	        	response.setMessage("Se elimin  correctamente");
	        }
		}
		catch (NullPointerException nullPointerException) {
			response.setCode(-10);
			response.setMessage("No se pudo eliminar por algun valor nulo");
		}
		catch (Exception exception) {
			response.setCode(-100);
			response.setMessage("Error al eliminar los alumnos, verifique");
		}

		return response;
	}
		
}