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
			float comision = oCuenta.obtenerComision();
			
			System.out.println(oCuenta.toString() + ", Comision: "+ comision);
		}
		
	}

	public void addCuenta(Cuenta c) {
		myCuenta.add(c);
		
	}
	
}