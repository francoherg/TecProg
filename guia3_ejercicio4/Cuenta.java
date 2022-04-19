package guia3_ejercicio4;

import java.util.Calendar;
import java.util.Vector;

public class Cuenta {

	public Titular myTitular;

	public Vector<Transaccion> myTransaccion;

	public Cuenta(Titular myTitular, Vector<Transaccion> myTransaccion) {
		super();
		this.myTitular = myTitular;
		this.myTransaccion = new Vector<Transaccion>();
	}

	public int cantidadTransacciones() {
		return myTransaccion.size();
	}

	public Float sumatoriaTransacciones() {
		Float sumatoria= 0f;
		for (Transaccion oTransaccion : myTransaccion) {
			sumatoria+=oTransaccion.getMontoPesos();
		}
		return sumatoria;
	}

	public void obtenerComision() {
	}

}