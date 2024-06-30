package ar.edu.unju.fi.model;
import org.springframework.stereotype.Component;

@Component
public class Materia {
	private String codigo;
	private String nombre;
	private String curso;
	private Integer cant_horas;
	private Boolean modalidad;
	private Docente docente;
	private Carrera carrera;
	
	public Materia() {
		// TODO Auto-generated constructor stub
	}
	public Materia(String codigo, String nombre, String curso, Integer cant_horas, Boolean modalidad, Docente docente,
			Carrera carrera) {
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
	public Docente getDocente() {
		return docente;
	}
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	public Carrera getCarrera() {
		return carrera;
	}
	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
	
	
}
