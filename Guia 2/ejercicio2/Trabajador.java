package ejercicio2;
import java.util.Vector;
import java.util.Calendar;

public abstract class Trabajador {

  public String nombre;

  public String apellido;

  public String direccion;

  public Integer dni;

      private Vector<Jornalizado>  myJornalizado;
    private Vector<Mensualizado>  myMensualizado;
    private Jefe myJefe;

    public Trabajador(String nombre, String apellido, String direccion, Integer dni) {
    	this.apellido= apellido;
    	this.direccion=direccion;
    	this.nombre= nombre;
    	this.dni=dni;
    }
  public abstract Float calcularSueldo(Calendar periodo);

}