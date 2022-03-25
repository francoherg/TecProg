package tp1;

import java.util.Collection;
import java.util.Vector;

public class Carrera {
	private String Nombre;
	private Collection<Alumno> cAlumnos;
	
	public Carrera(String Nombre){
		this.Nombre=Nombre;
		this.cAlumnos= new Vector<Alumno>();
	}
	public String toString() {
		
		return this.Nombre;
	}
	
	public void mostrarAlumnos() {
		for(Alumno alumno:cAlumnos) {
			System.out.println(alumno.toString()+ "\n");
		}
	}
	
}