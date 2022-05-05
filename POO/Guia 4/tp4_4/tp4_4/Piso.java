package tp4_4;

import java.util.Vector;

public class Piso {

	public Vector<Local> myLocal;
	private Integer numero;
	
	public Piso(Integer numero) {
		super();
		this.numero= numero;
	}

	public void mostrarBares() {
		for ( Local oLocal : myLocal) {
			if(oLocal.esBar()) {
				
				System.out.println("Piso " +numero );
				oLocal.mostrar();
			}
		}
		
	}

	public void mostrarLocales() {
		for ( Local oLocal : myLocal) {
			oLocal.mostrar();
		}
		
	}

}