package mx.com.mrjob.service;

import java.util.ArrayList;
import mx.com.mrjob.dto.ClienteBancoDto;
import mx.com.mrjob.dto.ResponseDto;

public interface ClienteBancoService {

	public ResponseDto getClientes();
	public ResponseDto getClienteBancoById(Integer idClienteBanco);
	public ResponseDto insertCliente(ClienteBancoDto cliente);
	public ResponseDto updateCliente(ClienteBancoDto cliente);
	public ResponseDto deleteCliente(ClienteBancoDto cliente);
}
