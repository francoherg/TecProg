package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Alumno {
	private Calendar fecha_inscripcion;
	private Persona persona;
	private Carrera carrera;
	
	public Alumno(Calendar fecha_inscripcion, Persona persona, Carrera carrera) {
		this.carrera=carrera;
		this.persona=persona;
		this.fecha_inscripcion= fecha_inscripcion;
	}
	
	public String toString() {
		
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(fecha_inscripcion.getTimeZone());
		return (persona.toString() +" - "+ sdf.format(fecha_inscripcion.getTime()));
	}
}