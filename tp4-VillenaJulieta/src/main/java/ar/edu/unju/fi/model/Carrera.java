package ar.edu.unju.fi.model;

public class Carrera {
	private String codigo;
	private String nombre;
	private Integer cant_anios;
	private Boolean estado;
	

	public Carrera(String codigo, String nombre, Integer cant_anios, Boolean estado) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.cant_anios = cant_anios;
		this.estado = estado;
	}
	public Carrera() {
		// TODO Auto-generated constructor stub
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
		return cant_anios;
	}
	public void setCant_años(Integer cant_anios) {
		this.cant_anios = cant_anios;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	
	
}
