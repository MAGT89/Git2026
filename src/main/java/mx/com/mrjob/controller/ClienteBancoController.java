package mx.com.mrjob.controller;

import java.util.ArrayList;
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

import mx.com.mrjob.dto.ClienteBancoDto;
import mx.com.mrjob.dto.ResponseDto;
import mx.com.mrjob.service.ClienteBancoService;

@Controller
@RequestMapping("clientesBanco")
public class ClienteBancoController {

	@Autowired
	private ClienteBancoService clienteBancoService;

	@ResponseBody
	@RequestMapping(value = "/getClientes", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<ResponseDto> getClientes() {
		final HttpHeaders httpHeaders = new HttpHeaders();
		ResponseDto response = clienteBancoService.getClientes();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<ResponseDto>(response, httpHeaders, HttpStatus.OK);

	}
	
	@ResponseBody  // NOS PERMITE RETORNAR UNICAMENTE VALORES
	@RequestMapping(value="/getClienteBancoById/id", method=RequestMethod.GET,produces="application/json")
	public ResponseEntity <  ResponseDto >  getClienteById(@RequestParam("id") Integer id) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		ResponseDto response = clienteBancoService.getClientes();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
	return new ResponseEntity <ResponseDto> (response, httpHeaders, HttpStatus.OK);	
	}

	@ResponseBody
	@RequestMapping(value = "/insertClientes", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResponseDto> insertCliente(@RequestBody ClienteBancoDto nuevoCliente) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		ResponseDto response = clienteBancoService.insertCliente(nuevoCliente);
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<ResponseDto>(response, httpHeaders, HttpStatus.OK);
	}

	@ResponseBody
	@RequestMapping(value = "/updateClientes", method = RequestMethod.PUT, produces = "application/json")
	public ResponseEntity<String> updateCliente(@RequestBody ClienteBancoDto cliente) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		ResponseDto response = clienteBancoService.updateCliente(cliente);
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>("Cliente actualizado", httpHeaders, HttpStatus.OK);

	}

	@ResponseBody
	@RequestMapping(value = "/deleteClientes", method = RequestMethod.DELETE, produces = "application/json")
	public ResponseEntity<String> deleteCliente(@RequestBody ClienteBancoDto cliente) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		ResponseDto response = clienteBancoService.deleteCliente(cliente);
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>("Cliente eliminado", httpHeaders, HttpStatus.OK);

	}
}
