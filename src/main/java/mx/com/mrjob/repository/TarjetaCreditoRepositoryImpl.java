package mx.com.mrjob.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.com.mrjob.dto.TarjetaCreditoDto;
import mx.com.mrjob.mapper.TarjetaCreditoMapper;

@Repository
public class TarjetaCreditoRepositoryImpl implements TarjetaCreditoRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<TarjetaCreditoDto> getTarjetaCredito() {

		return jdbcTemplate.query("SELECT * FROM TARJETA_CREDITO", new TarjetaCreditoMapper<TarjetaCreditoDto>());
	}

	@Override
	public Integer insertTarjetaCredito(TarjetaCreditoDto tarjetaCredito) {
		return jdbcTemplate.update("INSERT INTO TARJETA_CREDITO VALUES(?,?,?,?,?,?,?,?,?,?)",
				new Object[] { tarjetaCredito.getIdTarjetaCredito(), tarjetaCredito.getIdCliente(),
						tarjetaCredito.getIdProducto(), tarjetaCredito.getNumeroTarjeta(), tarjetaCredito.getCvv(),
						tarjetaCredito.getLineaCredito(), tarjetaCredito.getSaldoUtilizado(),
						tarjetaCredito.getFechaVencimiento(), tarjetaCredito.getFechaCorte(),
						tarjetaCredito.getEstatus() });
	}

	@Override
	public Integer updateTarjetaCredito(TarjetaCreditoDto tarjetaCredito) {
		return jdbcTemplate.update("UPDATE TARJETA_CREDITO SET ID_CLIENTE = ?,ID_PRODUCTO = ?,NUMERO_TARJETA = ?,"
				+ "CVV = ?,LINEA_CREDITO = ?,SALDO_UTILIZADO = ?,FECHA_VENCIMIENTO = ?,FECHA_CORTE = ?,ESTATUS = ? WHERE ID_TARJETA_CREDITO",
				new Object[] {tarjetaCredito.getIdCliente(),tarjetaCredito.getIdProducto(),tarjetaCredito.getNumeroTarjeta(),tarjetaCredito.getCvv(),
						tarjetaCredito.getLineaCredito(),tarjetaCredito.getSaldoUtilizado(),java.sql.Date.valueOf(tarjetaCredito.getFechaVencimiento()),
								java.sql.Date.valueOf(tarjetaCredito.getFechaCorte()),tarjetaCredito.getEstatus(),tarjetaCredito.getIdTarjetaCredito()});
	}

}
