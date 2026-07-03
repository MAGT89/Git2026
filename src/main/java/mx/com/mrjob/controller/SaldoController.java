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

import mx.com.mrjob.dto.ResponseDto;
import mx.com.mrjob.dto.SaldoDto;
import mx.com.mrjob.service.SaldoService;

@Controller
@RequestMapping("saldo")
public class SaldoController {
	
	@Autowired
	private SaldoService saldoService;
	
	@ResponseBody
	@RequestMapping(value = "/getSaldo", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<ResponseDto> getSaldo() {
		final HttpHeaders httpHeaders = new HttpHeaders();
		ResponseDto response = saldoService.getSaldo();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<ResponseDto>(response, httpHeaders, HttpStatus.OK);
	}
	@ResponseBody
	@RequestMapping(value = "/insertSaldo", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResponseDto> insertSaldo(@RequestBody SaldoDto nuevoSaldo) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		ResponseDto response = saldoService.insertSaldo(nuevoSaldo);
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<ResponseDto>(response, httpHeaders, HttpStatus.OK);

	}
}
