package tp4_4;

import tp4_4.Local.eLocalClasificacion;

public class Ropa extends LocalClasificacion {
	public static enum tipoRopa {
		HOMBRE, MUJER
	}

	private tipoRopa tipo;

	public Ropa(Local myLocal, tipoRopa tipo) {
		super(myLocal, eLocalClasificacion.ROPA);
		this.tipo = tipo;
		
	}

}