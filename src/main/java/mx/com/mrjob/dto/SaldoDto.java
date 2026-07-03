package mx.com.mrjob.dto;

import java.time.LocalDate;

public class SaldoDto {
	
	private Long idSaldo;
	private Long idCliente;
	private Long idProducto;
	private String numeroCuenta;
	private Long montoActual;
	private String moneda;
	private LocalDate fechaApertura;
	private String estatus;
	public SaldoDto() {
		super();
	}
	public SaldoDto(Long idSaldo, Long idCliente, Long idProducto, String numeroCuenta, Long montoActual, String moneda,
			LocalDate fechaApertura, String estatus) {
		super();
		this.idSaldo = idSaldo;
		this.idCliente = idCliente;
		this.idProducto = idProducto;
		this.numeroCuenta = numeroCuenta;
		this.montoActual = montoActual;
		this.moneda = moneda;
		this.fechaApertura = fechaApertura;
		this.estatus = estatus;
	}
	public Long getIdSaldo() {
		return idSaldo;
	}
	public void setIdSaldo(Long idSaldo) {
		this.idSaldo = idSaldo;
	}
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	public Long getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public Long getMontoActual() {
		return montoActual;
	}
	public void setMontoActual(Long montoActual) {
		this.montoActual = montoActual;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public LocalDate getFechaApertura() {
		return fechaApertura;
	}
	public void setFechaApertura(LocalDate fechaApertura) {
		this.fechaApertura = fechaApertura;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	@Override
	public String toString() {
		return "SaldoDto [idSaldo=" + idSaldo + ", idCliente=" + idCliente + ", idProducto=" + idProducto
				+ ", numeroCuenta=" + numeroCuenta + ", montoActual=" + montoActual + ", moneda=" + moneda
				+ ", fechaApertura=" + fechaApertura + ", estatus=" + estatus + "]";
	}

}
