package tp2_2;

public class Categoria {
	  private String nombre;
	  private Float sueldo;
	  
	  public Categoria(String nombre, Float sueldo) {
		  this.nombre = nombre;
		  this.sueldo = sueldo;
	  }
	  
	  public String verNombre() {
		  return this.nombre;
	  }
	  
	  public Float verSueldo() {
		  return this.sueldo;
	  }
}