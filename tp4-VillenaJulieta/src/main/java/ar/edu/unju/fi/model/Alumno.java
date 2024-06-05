package ar.edu.unju.fi.model;

import java.util.Calendar;

public class Alumno {
	private int dni;
	private String nombre;
	private String apellido;
	private String email;
	private int telefono;
	private Calendar fechadenacimiento;
	private String domicilio;
	private int lu;
	
	
	public Alumno(int dni, String nombre, String apellido, String email, int telefono, Calendar fechadenacimiento,
			String domicilio, int lu) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.fechadenacimiento = fechadenacimiento;
		this.domicilio = domicilio;
		this.lu = lu;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public Calendar getFechadenacimiento() {
		return fechadenacimiento;
	}
	public void setFechadenacimiento(Calendar fechadenacimiento) {
		this.fechadenacimiento = fechadenacimiento;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public int getLu() {
		return lu;
	}
	public void setLu(int lu) {
		this.lu = lu;
	}
	
	
	
	
}
