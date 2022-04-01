package ejercicio2;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Vector;

public class Jornalizado extends Trabajador {


  public Vector<Jornada>  myJornada;
      public Jefe myJefe;

  public Vector <HorasJornal> myHorasJornal;
	public Jornalizado( String nombre, String apellido, String direccion, Integer dni, Jefe jefe, Vector<HorasJornal> preciosHora) {
		super(nombre, apellido,direccion,dni);
		myJefe=jefe;
		myJornada= new Vector<Jornada>();
		myHorasJornal=preciosHora;
	}
	public Float calcularSueldo(Calendar periodo) {
		
		float sueldo = 0f;
		
		Float horasTrabajadas= 0f;
		for(Jornada oJornada : myJornada) {
			if(oJornada.pertenecePeriodo(periodo)) {
				horasTrabajadas+= oJornada.mostrarHoras();	
			}
	
			
		}
		
		Boolean noEncontre=true;
		Iterator<HorasJornal> iPreciosHora=myHorasJornal.iterator();
		while(iPreciosHora.hasNext() && noEncontre) {
			for ( HorasJornal oHorasJornal : myHorasJornal) {
				if(oHorasJornal.pertenecePeriodo(periodo)) {
					oHorasJornal.calcularSueldo(horasTrabajadas);
					noEncontre=false;
				}
			}
		}//float total = myJornada.horas()* myHorasJornal.ho
		return sueldo;
	}

}