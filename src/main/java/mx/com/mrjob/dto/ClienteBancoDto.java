package mx.com.mrjob.dto;


import java.time.LocalDate;

public class ClienteBancoDto {

	private Long id_cliente;
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private int edad;
	private String sexo;
	private String curp;
	private String rfc;
	private Long telefono;
	private String correo;
	private String direccion;
	private int cp;
	private LocalDate fechaAlta;
	private String estatus;
	
	public ClienteBancoDto() {
		super();
	}

	public ClienteBancoDto(Long id_cliente, String dni, String nombre, LocalDate fechaNacimiento, int edad, String sexo,
			String curp, String rfc, Long telefono, String correo, String direccion, int cp, LocalDate fechaAlta,
			String estatus) {
		super();
		this.id_cliente = id_cliente;
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
		this.sexo = sexo;
		this.curp = curp;
		this.rfc = rfc;
		this.telefono = telefono;
		this.correo = correo;
		this.direccion = direccion;
		this.cp = cp;
		this.fechaAlta = fechaAlta;
		this.estatus = estatus;
	}

	
	
	
	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	@Override
	public String toString() {
		return "ClienteBancoDto [id_cliente=" + id_cliente + ", dni=" + dni + ", nombre=" + nombre
				+ ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad + ", sexo=" + sexo + ", curp=" + curp
				+ ", rfc=" + rfc + ", telefono=" + telefono + ", correo=" + correo + ", direccion=" + direccion
				+ ", cp=" + cp + ", fechaAlta=" + fechaAlta + ", estatus=" + estatus + "]";
	}
	
	
	
}
