package ar.edu.unju.fi.model;

public class Materia {
	private int codigo;
	private String nombre;
	private String curso;
	private int cant_horas;
	private boolean modalidad;
	private String docente;
	private String carrera;
	
	
	public Materia(int codigo, String nombre, String curso, int cant_horas, boolean modalidad, String docente,
			String carrera) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.curso = curso;
		this.cant_horas = cant_horas;
		this.modalidad = modalidad;
		this.docente = docente;
		this.carrera = carrera;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
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
	public int getCant_horas() {
		return cant_horas;
	}
	public void setCant_horas(int cant_horas) {
		this.cant_horas = cant_horas;
	}
	public boolean isModalidad() {
		return modalidad;
	}
	public void setModalidad(boolean modalidad) {
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
