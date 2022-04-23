package tp3_2;

import java.util.Vector;

public class Universidad {

	public String nombre;

	public Vector<Facultad> myFacultad;

	public Universidad(String nombre) {
		super();
		this.nombre = nombre;
		this.myFacultad = new Vector<Facultad>();
	}

	public void listarAlumno(Catedra obj) {
		
		obj.listarAlumnos();
	}

	public void addFacultad(Facultad f) {
		myFacultad.add(f);
	}
}