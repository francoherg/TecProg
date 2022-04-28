package tp4_3;

import java.util.Calendar;
import java.util.Vector;

public class Puerto {

	private String nombre;

	public Vector<Amarra> myAmarra;

	public Vector<Alquiler> myAlquiler;

	public Puerto(String nombre) {
		super();
		this.nombre = nombre;
		this.myAmarra = new Vector<Amarra>();
		this.myAlquiler = new Vector<Alquiler>();
	}

	public void CalcularTotalAlquileres(Calendar fechainicio, Calendar fechafin) {
		float total = 0;

		for (Alquiler oAlquiler : myAlquiler) {
			total += oAlquiler.CalcularAlquiler();
		}
	}

}