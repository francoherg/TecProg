package ejercicio2;

import java.util.Calendar;

public class Mensualizado extends Trabajador {
	private Categoria myCategoria;
    public Jefe myJefe;
          public Mensualizado(String nombre, String apellido, String direccion, Integer dni, Categoria categoria) {
		super(nombre, apellido, direccion, dni);
			myCategoria=categoria;
		}

	public Float calcularSueldo(Calendar periodo) {
		
		float sueldo = myCategoria.sueldo;
		return sueldo;
	}

}