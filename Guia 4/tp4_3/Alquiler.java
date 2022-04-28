package tp4_3;

import java.util.Calendar;

public class Alquiler {

  private Calendar fechainicio;

  private Calendar fechafin;

    public Amarra myAmarra;
    public Cliente myCliente;
    public Embarcacion myEmbarcacion;
    public Puerto myPuerto;


  public Alquiler(Calendar fechainicio, Calendar fechafin, Amarra myAmarra, Cliente myCliente,
			Embarcacion myEmbarcacion, Puerto myPuerto) {
		super();
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.myAmarra = myAmarra;
		this.myCliente = myCliente;
		this.myEmbarcacion = myEmbarcacion;
		this.myPuerto = myPuerto;
	}

/*Un alquiler se calcula multiplicando el número de días de ocupación (incluyendo los días inicial y
final) por un módulo función de cada barco (obtenido simplemente multiplicando por 10 los metros
de eslora) y por un valor fijo*/
public float CalcularAlquiler() {
	float days= (fechafin.getTimeInMillis() - fechainicio.getTimeInMillis())/86400000;
	float alquiler = myEmbarcacion.calcularAlquiler(days);
	return alquiler;
  }

}