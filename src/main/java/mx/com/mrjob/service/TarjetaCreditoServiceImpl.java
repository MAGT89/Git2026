package mx.com.mrjob.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.com.mrjob.dto.ResponseDto;
import mx.com.mrjob.dto.TarjetaCreditoDto;
import mx.com.mrjob.repository.TarjetaCreditoRepository;

@Service
@Transactional
public class TarjetaCreditoServiceImpl implements TarjetaCreditoService {
	
	@Autowired
	private TarjetaCreditoRepository tarjetaCreditoRepository; 

	@Override
	public ResponseDto getTarjetaCredito() {
		ResponseDto response = new ResponseDto();
		try {
			List<TarjetaCreditoDto> tarjetaCredito = tarjetaCreditoRepository.getTarjetaCredito();
			if(tarjetaCredito != null && !tarjetaCredito.isEmpty()) {
				response.setCode(1);
				response.setMessage("Registro obtenido correctamente");
				response.setContent(tarjetaCredito);
			}else {
				response.setCode(-1);
				response.setMessage("No hay informacion que mostrar");
			}
		}catch(NullPointerException nullPointerException) {
			response.setCode(-10);
			response.setMessage("Algun dato es nulo");
		}catch(Exception exception) {
			response.setCode(-100);
			response.setMessage("Error al realizar la consulta "+exception);
		}
		return response;
	}

	@Override
	public ResponseDto insertTarjetaCredito(TarjetaCreditoDto tarjetaCredito) {
		ResponseDto response = new ResponseDto();
			
		try {
			Integer insertResponse = tarjetaCreditoRepository.insertTarjetaCredito(tarjetaCredito);
			if(insertResponse == 1) {
				response.setCode(1);
				response.setMessage("Tarjeta agregada correctamente");
			}			
		}catch(NullPointerException nullPointerException) {
			response.setCode(-10);
			response.setMessage("Tarjeta no insertada");
		}catch(Exception exception) {
			response.setCode(-100);
			response.setMessage("Revisa lo siguiente "+exception);
		}
		
		return response;
	}

	@Override
	public ResponseDto updateTarjetaCredito(TarjetaCreditoDto tarjetaCredito) {
		ResponseDto response = new ResponseDto();
		try {
			Integer updateResponse = tarjetaCreditoRepository.updateTarjetaCredito(tarjetaCredito);
			if(updateResponse==1 ) {
				response.setCode(1);
				response.setMessage("Actualizado correctamente");
			}
		}catch(NullPointerException nullPointerException){
			response.setCode(-10);
			response.setMessage("No se puede actualizar con un valor nulo");
		}catch(Exception exception) {
			response.setCode(-100);
			response.setMessage("Verifica lo siguiente "+exception);
		}
		
		return response;
	}
	

}
