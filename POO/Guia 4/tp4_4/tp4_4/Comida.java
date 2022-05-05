package tp4_4;

import tp4_4.Local.eLocalClasificacion;

public class Comida extends LocalClasificacion {

	public static enum tipoComida {
		RESTAURANTE, BAR
	}

	private tipoComida tipo;

	public Comida(Local myLocal, tipoComida tipo) {
		super(myLocal, eLocalClasificacion.COMIDA);
		this.tipo = tipo;
	}

	@Override
	public Boolean esBar() {
		Boolean aux=false;
		if(this.tipo==tipoComida.BAR) {
			aux= true;
		}
		return aux;
	}
	
}