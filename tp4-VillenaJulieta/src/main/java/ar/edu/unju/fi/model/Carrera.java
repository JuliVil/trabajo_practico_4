package ar.edu.unju.fi.model;

public class Carrera {
	private String codigo;
	private String nombre;
	private Integer cant_años;
	private Boolean estado;
	
	
	public Carrera(String codigo, String nombre, Integer cant_años, Boolean estado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.cant_años = cant_años;
		this.estado = estado;
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
	public Integer getCant_años() {
		return cant_años;
	}
	public void setCant_años(Integer cant_años) {
		this.cant_años = cant_años;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	
	
}
