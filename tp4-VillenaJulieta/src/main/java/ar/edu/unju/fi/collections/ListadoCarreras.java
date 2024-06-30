package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Carrera;


public class ListadoCarreras {
	
	public static List<Carrera> carreras = new ArrayList<Carrera>();
		//metodo para lisar carreras
	public static List<Carrera> carrerasDisponibles = new ArrayList<Carrera>();
		public static List<Carrera> listarCarreras() {
			return carrerasDisponibles;
		}
		//metodo para buscar una carrera por id	
		public static Carrera buscarCarreraPorCodigo(String codigo) {
			for (Carrera c : carrerasDisponibles) {
				if(c.getCodigo().equals(codigo)) {
					return c;
				}
			}
			return null;
		}
		//metodo para agregar carrera
		public static void agregarCarrera (Carrera carrera) {
			carrera.setEstado(true);
			carreras.add(carrera);
			carrerasDisponibles.add(carrera);
		}
		//metodo para modificar una carrera
		public static void modificarCarrera (Carrera carreraModificada) {
			carreraModificada.setEstado(true);
			int i=0;
			for (Carrera carrera : carrerasDisponibles) {
				if (carrera.getCodigo().equals(carreraModificada.getCodigo())) {
					carreras.set(i, carreraModificada);
					carrerasDisponibles.clear();
					for(Carrera carrera1 : carreras) {
						if(carrera1.getEstado()) {
							carrerasDisponibles.add(carrera1);
						}
					}
					break;
				}
				i++;
			}
		}
		
		//metodo para eliminar una carrera
		public static void eliminarCarrera (String codigo) {
			for (Carrera carrera : carreras) {
				if (carrera.getCodigo().equals(codigo)) { 
					carrera.setEstado(false);				
				    break;
				}
			}
			carrerasDisponibles.clear();
			for(Carrera carrera : carreras) {
				if(carrera.getEstado()) {
					carrerasDisponibles.add(carrera);
				}
			}
		}
}