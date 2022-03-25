package tp1;

import java.util.Calendar;
import java.util.Vector;
public class main {

	public static void main(String[] args) {
		
		Calendar nacimiento = new java.util.GregorianCalendar(1999,Calendar.OCTOBER,23);

		Persona yo= new Persona("Hergenreder", "Franco", 42206918, nacimiento);
		
		yo.mostrar();
		
		
		boolean aux = yo.Validate("5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8");
		
		if(aux) {
			System.out.println("\n True");
		}
		else System.out.println("\n False");
		
		Carrera carr= new Carrera("Ingenieria en Informática");
		Alumno alum= new Alumno(nacimiento, yo, carr);
		

		Facultad fac= new Facultad("FICH");
		fac.addCarrera(carr);
		System.out.println("Facultad: "+ fac.toString()+
				"\nCarrera: " + carr.toString()
				+"\nAlumnos:  ");
		carr.mostrarAlumnos();
		
		
	}

}
