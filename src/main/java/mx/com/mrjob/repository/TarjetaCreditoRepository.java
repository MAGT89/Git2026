package mx.com.mrjob.repository;

import java.util.List;

import mx.com.mrjob.dto.TarjetaCreditoDto;

public interface TarjetaCreditoRepository {

	public List<TarjetaCreditoDto> getTarjetaCredito();
	public Integer insertTarjetaCredito(TarjetaCreditoDto tarjetaCredito);
	public Integer updateTarjetaCredito(TarjetaCreditoDto tarjetaCredito);
	

}
