package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.collections.ListadoAlumnos;
import ar.edu.unju.fi.model.Alumno;


@Controller
public class AlumnoController {
	
	@GetMapping("/formularioAlumno")
	public ModelAndView getFormAlumno() {
		ModelAndView modelView = new ModelAndView("formAlumno");
		modelView.addObject(new Alumno());
		
		ListadoAlumnos.agregarAlumno(new Alumno());
		return modelView;
	}
}
