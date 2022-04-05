package tp2_2;

import java.util.Calendar;

public class Jornada {
	  private Integer horas;
	  private Calendar fecha;
	  
	  public Jornada(Integer horas, Calendar fecha) {
		  this.horas = horas;
		  this.fecha = fecha;
	  }
	  
	  public Boolean perteneceAlPeriodo(Calendar fecha) {
		  if (fecha.getTime().equals(this.fecha.getTime()))
			  return true;
		  return false;
	  }
	  
	  public Integer getHoras() {
		  return horas;
	  }
}