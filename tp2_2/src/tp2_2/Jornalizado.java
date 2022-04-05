package tp2_2;

import java.util.Calendar;
import java.util.Vector;

public class Jornalizado extends Trabajador {
  private Vector<Jornada>  myJornada;
  public Vector<HorasJornal>  myHorasJornal;
  private Jefe myJefe;
  
  public Jornalizado(String nombre, String apellidos, String direccion, Integer dni, Jefe jefe) {
	  super(nombre, apellidos, direccion, dni);
	  this.myJefe = jefe;
	  myJornada = new Vector<Jornada>();
	  myHorasJornal = new Vector<HorasJornal>();
  }
  
  public void addJornada(Jornada jornada) {
	  myJornada.add(jornada);
  }
  
  public void addHorasJornal(HorasJornal horasJornal) {
	  myHorasJornal.add(horasJornal);
  }
  
  @Override
  public Float calcularSueldo(Calendar periodo) {
	Float sueldo = 0.f;
	
	// Cantidad de horas:
	Integer horasTrabajadas = 0;
	for (Jornada oJornada : myJornada)
		if (oJornada.perteneceAlPeriodo(periodo))
			horasTrabajadas += oJornada.getHoras();
	
	// Precio horas:
	for (HorasJornal jornal : myHorasJornal)
		  if (jornal.perteneceAlPeriodo(periodo))
			  sueldo = jornal.getSueldo(horasTrabajadas);
	
	return sueldo;
  }
}