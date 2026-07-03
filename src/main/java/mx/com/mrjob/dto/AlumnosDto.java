package mx.com.mrjob.dto;

public class AlumnosDto {

	private Long idAlumno;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String escuela;
	private Long idEscuela;
	
	
	public AlumnosDto() {
		super();
	}

	public AlumnosDto(Long idAlumno, String nombre, String apellidoPaterno, String apellidoMaterno, String escuela,
			Long idEscuela) {
		super();
		this.idAlumno = idAlumno;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.escuela = escuela;
		this.idEscuela = idEscuela;
	}

	public Long getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Long idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getEscuela() {
		return escuela;
	}

	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}

	public Long getIdEscuela() {
		return idEscuela;
	}

	public void setIdEscuela(Long idEscuela) {
		this.idEscuela = idEscuela;
	}

	@Override
	public String toString() {
		return "AlumnosDto [idAlumno=" + idAlumno + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno
				+ ", apellidoMaterno=" + apellidoMaterno + ", escuela=" + escuela + ", idEscuela=" + idEscuela + "]";
	}
	
			
}
