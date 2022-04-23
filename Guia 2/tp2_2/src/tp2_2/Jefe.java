package tp2_2;

import java.util.Calendar;
import java.util.Vector;

public class Jefe extends Trabajador {
  private Float sueldo;
  
  private Vector<Mensualizado>  myMensualizado;
  private Vector<Jornalizado>  myJornalizado;
  
  public Jefe(String nombre, String apellidos, String direccion, Integer dni, Float sueldo) {
	  super(nombre, apellidos, direccion, dni);
	  definirSueldo(sueldo);
  }
  
  @Override
  public Float calcularSueldo(Calendar periodo) {
	return sueldo;
  } 
  
  public void definirSueldo(Float sueldo) {
	  this.sueldo = sueldo;
  }
}