package tp4_4;

import java.util.Vector;

import tp4_4.Local.eLocalClasificacion;

public class Shopping {

	public Vector<Piso> myPiso;

	public Shopping() {
		super();
		this.myPiso = new Vector<Piso>();
	}

	public void mostrarBares() {
		for(Piso oPiso : myPiso) {
			oPiso.mostrarBares();
		}
	}
	public void mostrarLocalesEnPiso(Piso piso) {
		piso.mostrarLocales();
	}
}