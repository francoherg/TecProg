package tp3_4;

import java.util.Calendar;
import java.util.Vector;

public class Cuenta {

	public Titular myTitular;

	public Vector<Transaccion> myTransaccion;

	public Cuenta(Titular myTitular) {
		super();
		this.myTitular = myTitular;
		this.myTransaccion = new Vector<Transaccion>();
	}

	private int cantidadTransacciones() {
		Integer cantidad = 0;
		
		for(Transaccion oTransaccion : myTransaccion) {
		
				cantidad += 1;
			
		}
		
		return cantidad;
	}

	private Float sumatoriaTransacciones() {
		Float sumatoria= 0f;
		for (Transaccion oTransaccion : myTransaccion) {
			sumatoria+=oTransaccion.getMontoPesos();
		}
		return sumatoria;
	}

	public float obtenerComision() {
		float comision = 0f;
		float a= cantidadTransacciones();
		float b= sumatoriaTransacciones();
		
		comision = 30 - ( (b/ a) * 0.005f );
		return comision;
	}

	public void addTransaccion(Transaccion t) {
		myTransaccion.add(t);
	}

	@Override
	public String toString() {
		return "Titular=" + myTitular.toString();
	}

}