package test;

import java.util.Calendar;
import java.util.Vector;
public class main {

	public static void main(String[] args) {

		Calendar inscripcion = new java.util.GregorianCalendar(2008,Calendar.DECEMBER,10);
		Calendar inscripcion2 = new java.util.GregorianCalendar(2008,Calendar.DECEMBER,11);
		
		Calendar nacimiento = new java.util.GregorianCalendar(1990,Calendar.DECEMBER,12);
		Calendar nacimiento2 = new java.util.GregorianCalendar(1990,Calendar.NOVEMBER,11);
		Persona p1= new Persona("Alumno1", 1111111, nacimiento2);
		Persona p2= new Persona("Alumno2", 22222222, nacimiento);
		
		p1.mostrar();
		
		
		boolean aux = p1.Validate("5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8");
		
		if(aux) {
			System.out.println("\nValidated");
		}
		else System.out.println("\nNot Validated");
		
		Carrera carr= new Carrera("Ingenieria en Informática");
		Alumno alum1= new Alumno(inscripcion, p1, carr);
		Alumno alum2= new Alumno(inscripcion2,p2,carr);
		carr.addAlumno(alum1);
		carr.addAlumno(alum2);
		Carrera carr2= new Carrera("Ingeniería en Recursos Hídricos");
		Facultad fac= new Facultad("FICH");
		fac.addCarrera(carr);
		fac.addCarrera(carr2);
		fac.mostrarCarrerasyAlumnos();
		
		
	}

}