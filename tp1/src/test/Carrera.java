package test;

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
	public void addAlumno(Alumno alumno) {
		cAlumnos.add(alumno);
	}
	
	public void mostrarAlumnos() {
		for(Alumno alumno:cAlumnos) {
			
			System.out.println(alumno.toString());
		}
	}
	public boolean isEmpty() {
		return cAlumnos.isEmpty();
	}
}