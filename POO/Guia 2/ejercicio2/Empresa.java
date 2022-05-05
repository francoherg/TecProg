package ejercicio2;
import java.util.Vector;
import java.util.Calendar;
public class Empresa {

  public String nombre;

    public Vector  myJefe;
    /**
   * 
   * @element-type Trabajador
   */
  public Vector <Trabajador> myTrabajador;

  public void calcularSueldos(Calendar periodo) {
	  float total = 0f;
	  for(Trabajador oTrabajador: myTrabajador) {
		  total+= oTrabajador.calcularSueldo(periodo);
	  }
	  System.out.println(total);
  }

}