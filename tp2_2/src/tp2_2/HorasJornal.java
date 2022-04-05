package tp2_2;

import java.util.Calendar;

public class HorasJornal {
	  private Float menor40;
	  private Float mayor40;
	  private Calendar fechasDesde;
	  private Calendar fechasHasta;
	  
	  public HorasJornal(Float menor40, Float mayor40, Calendar fechasDesde, Calendar fechasHasta) {
		  this.menor40 = menor40;
		  this.mayor40 = mayor40;
		  this.fechasDesde = fechasDesde;
		  definirFechasHasta(fechasHasta);
	  }

	  public HorasJornal(Float menor40, Float mayor40, Calendar fechasDesde) {
		  this.menor40 = menor40;
		  this.mayor40 = mayor40;
		  this.fechasDesde = fechasDesde;
	  }
	  
	  public void definirFechasHasta(Calendar fechasHasta) {
		  this.fechasHasta = fechasHasta;
	  }
	  
	  public Float getSueldo(Integer horas) {
		  if (horas > 40)
			  return (horas - 40) * mayor40 + 40 * menor40;
		  return horas * menor40;
	  }
	  
	  public Boolean perteneceAlPeriodo(Calendar periodo) {
		  if (periodo.getTimeInMillis() >= this.fechasDesde.getTimeInMillis() && (fechasHasta == null || periodo.getTimeInMillis() <= this.fechasHasta.getTimeInMillis()))
			  return true;
		  return false;
	  }
}