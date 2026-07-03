package mx.com.mrjob.service;

import mx.com.mrjob.dto.ResponseDto;
import mx.com.mrjob.dto.SaldoDto;

public interface SaldoService {

	public ResponseDto getSaldo();
	public ResponseDto insertSaldo(SaldoDto saldo);

}
