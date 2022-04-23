package tp2_2;

import java.util.Calendar;

public abstract class Trabajador {
	  private String nombre, apellidos, direccion;
	  private Integer dni;
	  
	  public Trabajador(String nombre, String apellidos, String direccion, Integer dni) {
		  this.nombre = nombre;
		  this.apellidos = apellidos;
		  this.dni = dni;
		  this.direccion = direccion;
	  }
	  
	  public String mostrarTrabajador() {
		  return this.apellidos + ", " + this.nombre + " - DNI: " + this.dni + " - Direccion: " + this.direccion;
	  }
	  
	  public abstract Float calcularSueldo(Calendar periodo);
}