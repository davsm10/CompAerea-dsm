package es.iescanaveral.daw1.ed.inm;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AppPrincipal {

	public static void main(String[] args) {
		// Imprimir alumnos
		imprimirAlumnos();
	}

	private static void imprimirAlumnos() {
		GestorAlumnos gestor = new GestorAlumnos();

		Alumno alumno = obtenerAlumno();
		gestor.imprimirAlumno(alumno);

		List<Alumno> listaAlumnos = obtenerListaAlumnos();
		gestor.imprimirListaAlumnos(listaAlumnos);
	}

	private static Alumno obtenerAlumno() {
		Alumno alumno1 = new Alumno();
		alumno1.setId(10);
		alumno1.setNombre("Isabel");
		alumno1.setApellido1("Domínguez");
		alumno1.setApellido2("Salva");

		return alumno1;
	}

	private static List<Alumno> obtenerListaAlumnos() {
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();

		Alumno alumno1 = new Alumno();
		alumno1.setId(10);
		alumno1.setNombre("Isabel");
		alumno1.setApellido1("Domínguez");
		alumno1.setApellido2("Salva");
		listaAlumnos.add(alumno1);

		Alumno alumno2 = new Alumno();
		alumno2.setId(10);
		alumno2.setNombre("Carlos");
		alumno2.setApellido1("Maldonado");
		alumno2.setApellido2("Blas");
		listaAlumnos.add(alumno2);

		Alumno alumno3 = new Alumno();
		alumno3.setId(10);
		alumno3.setNombre("Yurena");
		alumno3.setApellido1("Ramiro");
		alumno3.setApellido2("Cos");
		listaAlumnos.add(alumno3);

		return listaAlumnos;
	}

}
