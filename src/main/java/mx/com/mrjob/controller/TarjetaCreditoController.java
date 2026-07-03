package mx.com.mrjob.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mx.com.mrjob.dto.ProductosDto;
import mx.com.mrjob.dto.ResponseDto;
import mx.com.mrjob.dto.TarjetaCreditoDto;
import mx.com.mrjob.service.TarjetaCreditoService;

@Controller
@RequestMapping("tarjetaCredito")
public class TarjetaCreditoController {
	
	@Autowired
	private TarjetaCreditoService tarjetaCreditoService;
	
	@ResponseBody
	@RequestMapping(value = "/getTarjetaCredito", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<ResponseDto> getTarjetaCredito() {
		final HttpHeaders httpHeaders = new HttpHeaders();
		ResponseDto response = tarjetaCreditoService.getTarjetaCredito();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<ResponseDto>(response, httpHeaders, HttpStatus.OK);

	}
	
	@ResponseBody
	@RequestMapping(value = "/insertTarjetaCredito", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResponseDto> insertTarjetaCredito(@RequestBody TarjetaCreditoDto nuevaTarjetaCredito) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		ResponseDto response = tarjetaCreditoService.insertTarjetaCredito(nuevaTarjetaCredito);
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<ResponseDto>(response, httpHeaders, HttpStatus.OK);
	
	}

	@ResponseBody
	@RequestMapping(value = "/updateTarjetaCredito", method = RequestMethod.PUT, produces = "application/json")
	public ResponseEntity<String> updateTarjetaCredito(@RequestBody TarjetaCreditoDto tarjetaCredito) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		ResponseDto response = tarjetaCreditoService.updateTarjetaCredito(tarjetaCredito);
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>("TarjetaCredito actualizada", httpHeaders, HttpStatus.OK);

	}
	
}
