package mx.com.mrjob.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.com.mrjob.dto.SaldoDto;
import mx.com.mrjob.mapper.SaldoMapper;

@Repository
public class SaldoRepositoryImpl implements SaldoRepository{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<SaldoDto> getSaldo() {
		return jdbcTemplate.query("SELECT * FROM SALDO" , new SaldoMapper<SaldoDto>());
	}

	@Override
	public Integer insertSaldo(SaldoDto saldo) {
		return jdbcTemplate.update("INSERT INTO SALDO VALUES(?,?,?,?,?,?,?,?)", 
				new Object[] {saldo.getIdSaldo(),saldo.getIdCliente(),saldo.getIdProducto(),
						saldo.getNumeroCuenta(),saldo.getMontoActual(),saldo.getMoneda(),
						java.sql.Date.valueOf(saldo.getFechaApertura()),saldo.getEstatus()});
	}

}
