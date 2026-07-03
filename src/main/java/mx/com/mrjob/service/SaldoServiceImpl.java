package mx.com.mrjob.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.com.mrjob.dto.ResponseDto;
import mx.com.mrjob.dto.SaldoDto;
import mx.com.mrjob.repository.SaldoRepository;

@Service
@Transactional
public class SaldoServiceImpl implements SaldoService{
	
	@Autowired
	private SaldoRepository saldoRepository;

	@Override
	public ResponseDto getSaldo() {
		ResponseDto response = new ResponseDto();
		try {
			List<SaldoDto> saldo = saldoRepository.getSaldo();
			if(saldo != null && !saldo.isEmpty()) {
				response.setCode(1);
				response.setMessage("Registro de productos obtenidos");
				response.setContent(saldo);
			}else {
				response.setCode(-1);
				response.setMessage("No hay registro de saldo");
			}
		}catch (NullPointerException nullPointerException) {
			response.setCode(-10);
			response.setMessage("Algun dato viene nulo");
		} catch (Exception exception) {
			response.setCode(-100);
			response.setMessage("Error al consultar a los productos");
		}
		return response;
	}

	@Override
	public ResponseDto insertSaldo(SaldoDto saldo) {
		ResponseDto response = new ResponseDto();
		try {
			Integer insertResponse = saldoRepository.insertSaldo(saldo);
			if(insertResponse == 1) {
				response.setCode(1);
				response.setMessage("El saldo se agrego correctamente");
			}
		}catch(NullPointerException nullPointerException) {
			response.setCode(-10);
			response.setMessage("Problemas al insertar saldo");
		}catch(Exception exception) {
			response.setCode(-100);
			response.setMessage("verifica lo siguiente"+exception);
		}
		return response;
	}

}
