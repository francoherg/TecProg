package ejercicio2;
import java.util.Calendar;

public class Jornada {

  private Integer horas;

  private Calendar fecha;
public Jornada(Integer horas, Calendar fecha) {
	this.fecha=fecha;
	this.horas=horas;
}

  
  public int mostrarHoras() {
	return horas;
  }

public boolean pertenecePeriodo(Calendar periodo) {
	// TODO Auto-generated method stub
	return true;
}

}