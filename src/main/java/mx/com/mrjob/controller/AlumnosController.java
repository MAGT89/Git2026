package mx.com.mrjob.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import mx.com.mrjob.dto.AlumnosDto;
import mx.com.mrjob.dto.ResponseDto;
import mx.com.mrjob.service.AlumnosService;

@Controller
@RequestMapping("alumnos")
public class AlumnosController {
	
	@Autowired
	private AlumnosService alumnosService;
	
	//ServicioRest
		//GET- POST- PUT- DELETE 
		
		//GET = OBTENER INFORMACIÓN
		//POST = ENVIAR Y RECIBIR INFORMACIÓN
		//PUT = ENVIA INFORMACIÓN Y RECIBE UN ESTADO
	    //DELETE = ENVIA INFORMACIÓN Y RECIBE UN ESTADO
		
//		LOCALHOTS:8000/Miscelanea
//		3 imagenes
//		información que responde la url 
//		un archivo js que se carga desde el portal s  un recurso 
		
		//CODIGO DE RESPUESTA HTTP
		//404 = NO SE ENCONTRO EL RECURSO
		//400 = BAD REQUEST
		//503 = SIN PERMISO
		//500 = EXCEPCION DEL SERVIDOR
		//200 = SE HIZO LA PETICIÓN EXITOSAMENTE
		//202 = SE HIZO LA PETICIÓN EXITOSAMENTE Y RESPONDIÓ EXITOSAMENTE
		
	//Servicios rest
	@ResponseBody  // NOS PERMITE RETORNAR UNICAMENTE VALORES
	@RequestMapping(value="/getAlumnos", method=RequestMethod.GET,produces="application/json")
	public ResponseEntity <  ResponseDto >  getAlumnos() {
		final HttpHeaders httpHeaders = new HttpHeaders();
		ResponseDto response = alumnosService.getAlumnos();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
	return new ResponseEntity <ResponseDto> (response, httpHeaders, HttpStatus.OK);	
	}
	
	@ResponseBody  // NOS PERMITE RETORNAR UNICAMENTE VALORES
	@RequestMapping(value="/getAlumnosById/id", method=RequestMethod.GET,produces="application/json")
	public ResponseEntity <  ResponseDto >  getAlumnosById(@RequestParam("id") Integer id) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		ResponseDto response = alumnosService.getAlumnos();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
	return new ResponseEntity <ResponseDto> (response, httpHeaders, HttpStatus.OK);	
	}
	
	@ResponseBody  // NOS PERMITE RETORNAR UNICAMENTE VALORES
	@RequestMapping(value="/insertAlumno", method=RequestMethod.POST,produces="application/json")
	public ResponseEntity < ResponseDto >  insertAlumno(@RequestBody AlumnosDto nuevoAlumno) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		
		ResponseDto response = alumnosService.insertAlumno(nuevoAlumno);
		
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
	return new ResponseEntity <ResponseDto> (response, httpHeaders, HttpStatus.OK);	 //CODIGO 202
	}
	
	@ResponseBody  // NOS PERMITE RETORNAR UNICAMENTE VALORES
	@RequestMapping(value="/updateAlumno", method=RequestMethod.PUT,produces="application/json")
	public ResponseEntity < ResponseDto >  updateAlumnos(@RequestBody AlumnosDto nuevoAlumno) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		
		ResponseDto response = alumnosService.updateAlumno(nuevoAlumno);
		
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
	return new ResponseEntity <ResponseDto> (response, httpHeaders, HttpStatus.OK);	 //CODIGO 202
	}
	
	
	@ResponseBody  // NOS PERMITE RETORNAR UNICAMENTE VALORES
	@RequestMapping(value="/deleteAlumno", method=RequestMethod.DELETE,produces="application/json")
	public ResponseEntity < ResponseDto >  deleteAlumno(@RequestBody AlumnosDto nuevoAlumno) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		
		ResponseDto response = alumnosService.deleteAlumno(nuevoAlumno);
		
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
	return new ResponseEntity <ResponseDto> (response, httpHeaders, HttpStatus.OK);	 //CODIGO 202
	}



}