package test;

import java.util.Collection;
import java.util.Vector;

public class Facultad {
	private String nombre;
	private Collection<Carrera> carreras;
	
	public Facultad(String nombre) {
		this.nombre=nombre;
		this.carreras=new Vector<Carrera>();
		
	}
	
	public void addCarrera(Carrera carrera) {
		this.carreras.add(carrera);
	}
	
	public String toString() {
		return nombre;
	}
	
	public void mostrarCarrerasyAlumnos() {
		System.out.println("Facultad: "+ nombre);
		for(Carrera carrera:carreras) {
			
			System.out.println("Carrera: "+carrera.toString());
			
			if(!carrera.isEmpty()) {
				System.out.println("Alumnos: ");
				carrera.mostrarAlumnos();
			}
			
		}
	}
}