package ejercicio2;
import java.util.Vector;
import java.util.Calendar;

public class HorasJornal {

  public Float menor40;

  public Float mayor40;

  public Calendar fechasDesde;

  public Calendar fechasHasta;

    public Vector<HorasJornal>  myHorasJornal;

    public HorasJornal(Float menor40, Float mayor40, Calendar fechasDesde, Calendar fechasHasta) {
    	this.menor40=menor40;
    	this.mayor40= mayor40;
    	this.fechasDesde= fechasDesde;
    	this.fechasHasta= fechasHasta;
    }
	public boolean pertenecePeriodo(Calendar periodo) {
		if(periodo.after(fechasDesde)) {
			if(periodo.before(fechasHasta)) {
				return true;
			}
		}
		return false;
	}

	public void calcularSueldo(Float horasTrabajadas) {
		if(horasTrabajadas>40) {
			mayor40=horasTrabajadas-40f;
			menor40=40f;
			
		}else {
			menor40=horasTrabajadas;
		}
		
	}
    
}