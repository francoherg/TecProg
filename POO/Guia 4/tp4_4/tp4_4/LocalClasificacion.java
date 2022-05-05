package tp4_4;

import tp4_4.Local.eLocalClasificacion;
public abstract class LocalClasificacion {

	private Local myLocal;
	protected eLocalClasificacion myClasificacion;
	public LocalClasificacion(Local myLocal, eLocalClasificacion myClasificacion) {
		super();
		this.myLocal = myLocal;
		this.myClasificacion = myClasificacion;
	}
	
	public Boolean esBar() {
		return false;
	}

	protected void mostrar() {
		if(myClasificacion == eLocalClasificacion.COMIDA) {
			System.out.println("COMIDA");
		}
		if(myClasificacion == eLocalClasificacion.LIRERIA) {
			System.out.println("LIRERIA");
		}
		if(myClasificacion == eLocalClasificacion.ROPA) {
			System.out.println("ROPA");
		}
		
	}


}