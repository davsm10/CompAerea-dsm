package es.iescanaveral.daw1.ed.inm;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class GestorAlumnos {
public void imprimirAlumno(Alumno alumno) {
System.out.println(alumno);
}

public void imprimirListaAlumnos(List<Alumno> listaAlumnos) {
for (Alumno alumno : listaAlumnos) {
System.out.println(alumno);
}
}
}
