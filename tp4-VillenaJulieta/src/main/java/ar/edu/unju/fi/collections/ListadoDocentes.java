package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Docente;

public class ListadoDocentes {

	public static List<Docente> docentes = new ArrayList<Docente>();
	//metodo para listar docentes
			public static List<Docente> listarDocentes() {
				return docentes;
			}
			//metodo para buscar un docente por id	
			public static Docente buscarDocentePorLegajo(String legajo) {
				for (Docente docente : docentes) {
					if(docente.getLegajo().equals(legajo)) {
						return docente;
					}
				}
				return null;
			}
			//metodo para agregar docente
			public static void agregarDocente (Docente docente) {
				docentes.add(docente);
			}
			//metodo para modificar un docente
			public static void modificarDocente (Docente docenteModificado) {
				for (int i = 0; i < docentes.size(); i++) {
					Docente docente = docentes.get(i);
					if (docente.getLegajo().equals(docenteModificado.getLegajo())) {
						docentes.set(i, docenteModificado);
						break;
					}
				}
			}
			
			//metodo para eliminar un docente
			public static void eliminarDocente (String legajo) {
				docentes.removeIf(docente -> docente.getLegajo().equals(legajo));
			}
	
	
}