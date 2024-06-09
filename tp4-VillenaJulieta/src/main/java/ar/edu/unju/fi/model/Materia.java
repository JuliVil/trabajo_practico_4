package ar.edu.unju.fi.model;

public class Materia {
	private String codigo;
	private String nombre;
	private String curso;
	private Integer cant_horas;
	private Boolean modalidad;
	private String docente;
	private String carrera;
	
	public Materia() {
		// TODO Auto-generated constructor stub
	}
	public Materia(String codigo, String nombre, String curso, Integer cant_horas, Boolean modalidad, String docente,
			String carrera) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.curso = curso;
		this.cant_horas = cant_horas;
		this.modalidad = modalidad;
		this.docente = docente;
		this.carrera = carrera;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public Integer getCant_horas() {
		return cant_horas;
	}
	public void setCant_horas(Integer cant_horas) {
		this.cant_horas = cant_horas;
	}
	public Boolean isModalidad() {
		return modalidad;
	}
	public void setModalidad(Boolean modalidad) {
		this.modalidad = modalidad;
	}
	public String getDocente() {
		return docente;
	}
	public void setDocente(String docente) {
		this.docente = docente;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	
}
