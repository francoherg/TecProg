package ejercicio2;
import java.util.Calendar;
import java.util.Vector;

public class Jefe extends Trabajador {


    private Vector<Jornalizado>  myJornalizado;
    private Vector<Mensualizado>  myMensualizado;
	private Float sueldo;
  public Jefe(String nombre, String apellido, String direccion, Integer dni, Float sueldo) {
		super(nombre, apellido, direccion, dni);
		this.sueldo=sueldo;
		myJornalizado= new Vector<Jornalizado>();
		myMensualizado= new Vector<Mensualizado>();
	}



	
	public Float calcularSueldo(Calendar periodo) {
		
		return sueldo;
	}


}