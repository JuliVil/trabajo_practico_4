package ar.edu.unju.fi.model;

public class Carrera {
	private int codigo;
	private String nombre;
	private int cant_años;
	private String estado;
	
	
	public Carrera(int codigo, String nombre, int cant_años, String estado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.cant_años = cant_años;
		this.estado = estado;
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
	public int getCant_años() {
		return cant_años;
	}
	public void setCant_años(int cant_años) {
		this.cant_años = cant_años;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
