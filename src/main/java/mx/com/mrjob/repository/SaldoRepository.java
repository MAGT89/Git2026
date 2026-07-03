package mx.com.mrjob.repository;

import java.util.List;

import mx.com.mrjob.dto.SaldoDto;

public interface SaldoRepository {
	
	public List<SaldoDto> getSaldo();
	public Integer insertSaldo(SaldoDto saldo);

}
