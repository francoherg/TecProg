package tp2_2;

import java.util.Calendar;
import java.util.Vector;

public class Mensualizado extends Trabajador {
    private Jefe myJefe;
    private Categoria myCategoria;
    
    public Mensualizado(String nombre, String apellidos, String direccion, Integer dni, Jefe jefe, Categoria categoria) {
  	  super(nombre, apellidos, direccion, dni);
  	  this.myJefe = jefe;
  	  this.myCategoria = categoria;
    }
    
	@Override
	public Float calcularSueldo(Calendar periodo) {
		return myCategoria.verSueldo();
	}
}