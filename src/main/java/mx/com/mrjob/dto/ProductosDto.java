package mx.com.mrjob.dto;

import java.time.LocalDate;

public class ProductosDto {

		private Long idProducto;
		private String nombreProducto;
		private Long inversion;
		private LocalDate fechaCreacion;
		private String codigoProducto;
		private String tipoProducto;
		private double tasaInteres;
		private double comision;
		
		public ProductosDto() {
			super();
		}

		public ProductosDto(Long idProducto, String nombreProducto, Long inversion, LocalDate fechaCreacion,
				String codigoProducto, String tipoProducto, double tasaInteres, double comision) {
			super();
			this.idProducto = idProducto;
			this.nombreProducto = nombreProducto;
			this.inversion = inversion;
			this.fechaCreacion = fechaCreacion;
			this.codigoProducto = codigoProducto;
			this.tipoProducto = tipoProducto;
			this.tasaInteres = tasaInteres;
			this.comision = comision;
		}

		public Long getIdProducto() {
			return idProducto;
		}

		public void setIdProducto(Long idProducto) {
			this.idProducto = idProducto;
		}

		public String getNombreProducto() {
			return nombreProducto;
		}

		public void setNombreProducto(String nombreProducto) {
			this.nombreProducto = nombreProducto;
		}

		public Long getInversion() {
			return inversion;
		}

		public void setInversion(Long inversion) {
			this.inversion = inversion;
		}

		public LocalDate getFechaCreacion() {
			return fechaCreacion;
		}

		public void setFechaCreacion(LocalDate fechaCreacion) {
			this.fechaCreacion = fechaCreacion;
		}

		public String getCodigoProducto() {
			return codigoProducto;
		}

		public void setCodigoProducto(String codigoProducto) {
			this.codigoProducto = codigoProducto;
		}

		public String getTipoProducto() {
			return tipoProducto;
		}

		public void setTipoProducto(String tipoProducto) {
			this.tipoProducto = tipoProducto;
		}

		public double getTasaInteres() {
			return tasaInteres;
		}

		public void setTasaInteres(double tasaInteres) {
			this.tasaInteres = tasaInteres;
		}

		public double getComision() {
			return comision;
		}

		public void setComision(double comision) {
			this.comision = comision;
		}

		@Override
		public String toString() {
			return "ProductosDto [idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", inversion="
					+ inversion + ", fechaCreacion=" + fechaCreacion + ", codigoProducto=" + codigoProducto
					+ ", tipoProducto=" + tipoProducto + ", tasaInteres=" + tasaInteres + ", comision=" + comision
					+ "]";
		}
		
		
	
}
