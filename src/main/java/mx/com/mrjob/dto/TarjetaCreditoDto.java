package mx.com.mrjob.dto;

import java.time.LocalDate;

public class TarjetaCreditoDto {

	private Long idTarjetaCredito;
	private Long idCliente;
	private Long idProducto;
	private Long numeroTarjeta;
	private int cvv;
	private Long lineaCredito;
	private Long saldoUtilizado;
	private LocalDate fechaVencimiento;
	private LocalDate fechaCorte;
	private String estatus;
	
	public TarjetaCreditoDto() {
		super();
	}

	public TarjetaCreditoDto(Long idTarjetaCredito, Long idCliente, Long idProducto, Long numeroTarjeta, int cvv,
			Long lineaCredito, Long saldoUtilizado, LocalDate fechaVencimiento, LocalDate fechaCorte, String estatus) {
		super();
		this.idTarjetaCredito = idTarjetaCredito;
		this.idCliente = idCliente;
		this.idProducto = idProducto;
		this.numeroTarjeta = numeroTarjeta;
		this.cvv = cvv;
		this.lineaCredito = lineaCredito;
		this.saldoUtilizado = saldoUtilizado;
		this.fechaVencimiento = fechaVencimiento;
		this.fechaCorte = fechaCorte;
		this.estatus = estatus;
	}

	public Long getIdTarjetaCredito() {
		return idTarjetaCredito;
	}

	public void setIdTarjetaCredito(Long idTarjetaCredito) {
		this.idTarjetaCredito = idTarjetaCredito;
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

	public Long getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(Long numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public Long getLineaCredito() {
		return lineaCredito;
	}

	public void setLineaCredito(Long lineaCredito) {
		this.lineaCredito = lineaCredito;
	}

	public Long getSaldoUtilizado() {
		return saldoUtilizado;
	}

	public void setSaldoUtilizado(Long saldoUtilizado) {
		this.saldoUtilizado = saldoUtilizado;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public LocalDate getFechaCorte() {
		return fechaCorte;
	}

	public void setFechaCorte(LocalDate fechaCorte) {
		this.fechaCorte = fechaCorte;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	@Override
	public String toString() {
		return "TarjetaCreditoDto [idTarjetaCredito=" + idTarjetaCredito + ", idCliente=" + idCliente + ", idProducto="
				+ idProducto + ", numeroTarjeta=" + numeroTarjeta + ", cvv=" + cvv + ", lineaCredito=" + lineaCredito
				+ ", saldoUtilizado=" + saldoUtilizado + ", fechaVencimiento=" + fechaVencimiento + ", fechaCorte="
				+ fechaCorte + ", estatus=" + estatus + "]";
	}
	
	
	
}
