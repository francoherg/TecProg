package tp3_2;

import java.util.Vector;

public class Facultad {

	public String nombre;

	public Universidad myUniversidad;

	public Vector<Carrera> myCarrera;

	public Facultad(String nombre, Universidad myUniversidad) {
		super();
		this.nombre = nombre;
		this.myUniversidad = myUniversidad;
		this.myCarrera =  new Vector<Carrera>();
	}

}