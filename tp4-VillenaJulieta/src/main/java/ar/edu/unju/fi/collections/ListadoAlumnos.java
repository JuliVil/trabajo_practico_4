package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Alumno;

public class ListadoAlumnos {

	public static List<Alumno> alumnos = new ArrayList<Alumno>();
	//metodo para listar alumnos
			public static List<Alumno> listarAlumnos() {
				return alumnos;
			}
			//metodo para buscar un alumno por id	
			public static Alumno buscarAlumnoPorDNI(String dni) {
				for (Alumno alumno : alumnos) {
					if(alumno.getLu().equals(dni)) {
						return alumno;
					}
				}
				return null;
			}
			//metodo para agregar alumno
			public static void agregarAlumno (Alumno alumno) {
				alumnos.add(alumno);
			}
			//metodo para modificar un alumno
			public static void modificarAlumno (Alumno alumnoModificado) {
				for (int i = 0; i < alumnos.size(); i++) {
					Alumno alumno = alumnos.get(i);
					if (alumno.getDni().equals(alumnoModificado.getDni())) {
						alumnos.set(i, alumnoModificado);
						break;
					}
				}
			}
			
			//metodo para eliminar un alumno
			public static void eliminarAlumno (String dni) {
				alumnos.removeIf(alumno -> alumno.getDni().equals(dni));
			}
	
	
}