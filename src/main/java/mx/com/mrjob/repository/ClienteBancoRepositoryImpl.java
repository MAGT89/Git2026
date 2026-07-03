package mx.com.mrjob.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.com.mrjob.dto.ClienteBancoDto;
import mx.com.mrjob.mapper.ClienteBancoMapper;

@Repository
public class ClienteBancoRepositoryImpl implements ClienteBancoRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<ClienteBancoDto> getClientes() {

		return jdbcTemplate.query("SELECT * FROM CLIENTE_BANCO", new ClienteBancoMapper<ClienteBancoDto>());

	}

	@Override
	public Integer insertCliente(ClienteBancoDto cliente) {
		return jdbcTemplate.update("INSERT INTO CLIENTE_BANCO VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
				new Object[] { cliente.getId_cliente(), cliente.getDni(), cliente.getNombre(),
						java.sql.Date.valueOf(cliente.getFechaNacimiento()), cliente.getEdad(), cliente.getSexo(),
						cliente.getCurp(), cliente.getRfc(), cliente.getTelefono(), cliente.getCorreo(),
						cliente.getDireccion(), cliente.getCp(), java.sql.Date.valueOf(cliente.getFechaAlta()),
						cliente.getEstatus() });
		
	}
	
	@Override
	public ClienteBancoDto getClienteBancoById(Integer idClienteBanco) {
		return jdbcTemplate.queryForObject("SELECT * FROM CLIENTE_BANCO WHERE ID_CLIENTE = ?", new Object[] {idClienteBanco},
				new ClienteBancoMapper<ClienteBancoDto>());
	}
	
	@Override
	public Integer updateCliente(ClienteBancoDto cliente) {
		return jdbcTemplate.update(
				"UPDATE CLIENTE_BANCO SET DNI = ?,NOMBRE = ?,FECHA_NACIMIENTO = ?,EDAD = ?,SEXO = ?,CURP = ?,"
						+ "RFC = ?,TELEFONO = ?,CORREO = ?,DIRECCION = ?,CP = ?,FECHA_ALTA = ?,ESTATUS = ? WHERE ID_CLIENTE = ? ",
				new Object[] { cliente.getDni(), cliente.getNombre(),
						java.sql.Date.valueOf(cliente.getFechaNacimiento()), cliente.getEdad(), cliente.getSexo(),
						cliente.getCurp(), cliente.getRfc(), cliente.getTelefono(), cliente.getCorreo(),
						cliente.getDireccion(), cliente.getCp(), java.sql.Date.valueOf(cliente.getFechaAlta()),
						cliente.getEstatus(), cliente.getId_cliente() });
	}

	@Override
	public Integer deleteCliente(ClienteBancoDto cliente) {
		return jdbcTemplate.update("DELETE FROM CLIENTE_BANCO WHERE ID_CLIENTE = ? ",
				new Object[] { cliente.getId_cliente() });
	}

	
}
