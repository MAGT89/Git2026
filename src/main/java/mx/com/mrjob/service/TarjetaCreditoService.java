package mx.com.mrjob.service;

import mx.com.mrjob.dto.ResponseDto;
import mx.com.mrjob.dto.TarjetaCreditoDto;

public interface TarjetaCreditoService {

	public ResponseDto getTarjetaCredito();
	public ResponseDto insertTarjetaCredito(TarjetaCreditoDto TarjetaCredito);
	public ResponseDto updateTarjetaCredito(TarjetaCreditoDto tarjetaCredito);

}
