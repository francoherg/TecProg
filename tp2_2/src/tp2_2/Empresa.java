package tp2_2;

import java.util.Vector;
import java.util.Calendar;

public class Empresa {
  private String nombre;
  private Vector<Trabajador> trabajadores;
  
  public Empresa(String nombre) {
	  this.nombre = nombre;
	  this.trabajadores = new Vector<Trabajador>();
  }
  
  public void agregarTrabajador(Trabajador trabajador) {
	  trabajadores.add(trabajador);
  }

  public void calcularSueldos(Calendar periodo) {
	  for (Trabajador trabajador : trabajadores)
		  System.out.println(trabajador.mostrarTrabajador() + " - Sueldo: $" + trabajador.calcularSueldo(periodo));
  }
}