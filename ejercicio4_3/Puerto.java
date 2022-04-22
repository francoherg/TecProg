package ejercicio4_3;
import java.util.Calendar;
import java.util.Vector;

public class Puerto {

  private String nombre;

  public Vector<Amarra> myAmarra;

  public Vector<Alquiler> myAlquiler;

  public Puerto(String nombre) {
	super();
	this.nombre = nombre;
	this.myAmarra = new Vector<Amarra>();
	this.myAlquiler = new Vector<Alquiler>();
}
/*Diseñe el diagrama de clases y sus relaciones, con detalle de atributos y métodos necesarios.
Programe en JAVA los métodos que permitan calcular el alquiler de todos los barcos del puerto en
un período (Por ejemplo el alquiler correspondiente al mes de junio del 2016).*/
public void CalcularTotalAlquileres( Calendar fechainicio,  Calendar fechafin) {
	  float total = 0;
	  
	  
	  for(Alquiler oAlquiler : myAlquiler) {
		  total += oAlquiler.CalcularAlquiler();
	  }
  }

}