package tp3_2;

import java.util.Vector;

public class Catedra {

	public Integer nombre;

	public Vector<Examen> myExamen;

	public Vector<Comision> myComision;

	public Catedra(Integer nombre) {
		super();
		this.nombre = nombre;
		myExamen= new Vector<Examen>();
		myComision= new Vector<Comision>();
	}

	public void listarAlumnos() {

		for (Comision oComision : myComision) {
			if (oComision.esVigente()) {
				oComision.mostrarAlumnos();
			}
		}
	}

}