package tp3_2;

import java.util.Calendar;
import java.util.Vector;

public class Alumno {

	private Calendar fecha_ingreso;

	private Calendar fecha_egreso;

	private Carrera myCarrera;
	private Vector<Catedra> myCatedra;

	private Vector<Examen> myExamen;
	private Persona myPersona;

	public Alumno(Calendar fecha_ingreso, Calendar fecha_egreso, Carrera myCarrera, Persona myPersona) {
		super();
		this.fecha_ingreso = fecha_ingreso;
		this.fecha_egreso = fecha_egreso;
		this.myCarrera = myCarrera;
		this.myCatedra = new Vector<Catedra>();
		this.myExamen = new Vector<Examen>();
		this.myPersona = myPersona;
	}

	public void mostrar() {
		myPersona.mostrar();
	}



}