package guia3_ejercicio4;

import java.util.Calendar;
import java.util.Vector;

public class Banco {

	public String nombre;

	public Vector<Cuenta> myCuenta;

	public Banco(String nombre) {
		super();
		this.nombre = nombre;
		this.myCuenta = new Vector<Cuenta>();
	}

	public void listarComisiones() {

		for(Cuenta oCuenta : myCuenta) {
			float comision = 0f;
			float a= oCuenta.cantidadTransacciones();
			float b= oCuenta.sumatoriaTransacciones();
			
			comision = 30 - ( (b/ a) * 0.005f );
			
		}
		
	}

}