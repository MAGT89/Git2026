package mx.com.mrjob.repository;
import java.util.ArrayList;
import java.util.List;

import mx.com.mrjob.dto.ClienteBancoDto;

public interface ClienteBancoRepository {

	public List<ClienteBancoDto> getClientes();
	public ClienteBancoDto getClienteBancoById(Integer idClienteBanco);
	public Integer insertCliente(ClienteBancoDto cliente);
	public Integer updateCliente(ClienteBancoDto cliente);
	public Integer deleteCliente(ClienteBancoDto cliente);	
}
