package mx.com.mrjob.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.com.mrjob.dto.ClienteBancoDto;
import mx.com.mrjob.dto.ResponseDto;
import mx.com.mrjob.repository.ClienteBancoRepository;

@Service
@Transactional
public class ClienteBancoServiceImpl implements ClienteBancoService {

	@Autowired
	private ClienteBancoRepository clienteBancoRepository;

	@Override
	public ResponseDto getClientes() {
		ResponseDto response = new ResponseDto();
		try {
			List<ClienteBancoDto> clientes = clienteBancoRepository.getClientes();

			if (clientes != null && !clientes.isEmpty()) { // Si la lista de clientes existe y contiene elementos
				response.setCode(1);
				response.setMessage("Registro de clientes obtenidos");
				response.setContent(clientes);
			} else {
				response.setCode(-1);
				response.setMessage("No se obtuvieron registros de clientes");
			}
		} catch (NullPointerException nullPointerException) {
			response.setCode(-10);
			response.setMessage("Algun dato viene nulo");
		} catch (Exception exception) {
			response.setCode(-100);
			response.setMessage("Error al consultar a los clientes");
		}
		return response;
	}

	@Override
	public ResponseDto getClienteBancoById(Integer idClienteBanco) {
		ResponseDto response = new ResponseDto();
		
		List<ClienteBancoDto> cliente = clienteBancoRepository.getClientes();
		return response;
	}
	
	public ResponseDto insertCliente(ClienteBancoDto cliente) {
		ResponseDto response = new ResponseDto();

		try {
			// Si el cliente no tiene nombre OR si su nombre está en blanco". Se utiliza
			// para validar datos obligatorios y
			// asegurar que el usuario no haya ingresado solo espacios con la barra
			// espaciadora.
			if(cliente.getId_cliente() == null) {
				throw new IllegalArgumentException("El id es obligatorio");
			}
			if (cliente.getNombre() == null || cliente.getNombre().trim().isEmpty()) {
				throw new IllegalArgumentException("El nombre es obligatorio");
			}
			if (cliente.getNombre().length() > 150) {
				throw new IllegalArgumentException("El nombre como maximo debe tener 150 caracteres");
			}
			if (cliente.getEdad() < 18) {
				throw new IllegalArgumentException("Debe ser mayor de edad");
			}
			if (cliente.getCurp() != null && !cliente.getCurp().isEmpty() && cliente.getCurp().length() != 18) {
				throw new IllegalArgumentException("La CURP debe tener 18 caracteres");
			}
			if (cliente.getRfc() != null && !cliente.getRfc().isEmpty() && cliente.getRfc().length() != 13) {
				throw new IllegalArgumentException("El RFC debe tener 13 caracteres");
			}
			if(cliente.getTelefono() < 1000000000L ||cliente.getTelefono()  > 9999999999L) {
				throw new IllegalArgumentException("Ingresa tu numero a 10 digitos");
			}
			if(cliente.getCorreo().length() >= 151) {
				throw new IllegalArgumentException("El correo como maximo debe tener 150 caracteres");
			}

			Integer insertResponse = clienteBancoRepository.insertCliente(cliente);

			if (insertResponse == 1) {
				response.setCode(1);
				response.setMessage("Se inserto  correctamente");
				response.setContent(cliente);
			} else {
				response.setCode(-10);
				response.setMessage("No se inserto el registro");
			}
		} catch (IllegalArgumentException e) {
			response.setCode(-100);
			response.setMessage("Error al insertar los clientes, verifique " + e.getMessage());
		} catch (NullPointerException nullPointerException) {
			response.setCode(-10);
			response.setMessage("No se puede insertar un valor nulo");
		} catch (Exception exception) {
			response.setCode(-100);
			response.setMessage("Error al insertar el cliente: " + exception.getMessage());
		}

		return response;

	}

	@Override
	public ResponseDto updateCliente(ClienteBancoDto cliente) {
		ResponseDto response = new ResponseDto();

		response.setCode(-1);
		response.setMessage("No se actualizo el registro");

		try {
			if(cliente.getId_cliente() == null) {
				throw new IllegalArgumentException("El id es obligatorio");
			}
			if (cliente.getNombre() == null || cliente.getNombre().trim().isEmpty()) {
				throw new IllegalArgumentException("El nombre es obligatorio");
			}
			if (cliente.getNombre().length() > 150) {
				throw new IllegalArgumentException("El nombre como maximo debe tener 150 caracteres");
			}
			if (cliente.getEdad() < 18) {
				throw new IllegalArgumentException("Debe ser mayor de edad");
			}
			if (cliente.getCurp() != null && !cliente.getCurp().isEmpty() && cliente.getCurp().length() != 18) {
				throw new IllegalArgumentException("La CURP debe tener 18 caracteres");
			}
			if (cliente.getRfc() != null && !cliente.getRfc().isEmpty() && cliente.getRfc().length() != 13) {
				throw new IllegalArgumentException("El RFC debe tener 13 caracteres");
			}
			if(cliente.getTelefono() < 1000000000L ||cliente.getTelefono()  > 9999999999L) {
				throw new IllegalArgumentException("Ingresa tu numero a 10 digitos");
			}
			if(cliente.getCorreo().length() >= 151) {
				throw new IllegalArgumentException("El correo como maximo debe tener 150 caracteres");
			}
			Integer updateResponse = clienteBancoRepository.updateCliente(cliente);

			if (updateResponse == 1) {
				response.setCode(1);
				response.setMessage("Se actualizo correctamente");
			}
		} catch (NullPointerException nullPointerException) {
			response.setCode(-100);
			response.setMessage("Error al actualizar al cliente");
		} catch (Exception exception) {
			response.setCode(-100);
			response.setMessage("Error al actualizar los alumnos, verifique");
		}

		return response;
	}

	@Override
	public ResponseDto deleteCliente(ClienteBancoDto cliente) {
		ResponseDto response = new ResponseDto();

		response.setCode(-1);
		response.setMessage("No se elimino el registro");

		try {
			Integer deleteResponse = clienteBancoRepository.deleteCliente(cliente);

			if (deleteResponse == 1) {
				response.setCode(1);
				response.setMessage("Se elimino correctamente");
			}
		} catch (NullPointerException nullPointerException) {
			response.setCode(-100);
			response.setMessage("Error al eliminar al cliente");
		} catch (Exception exception) {

		}

		return response;

	}

	
}
