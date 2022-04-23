package tp3_2;

import java.util.Calendar;

public class Examen {

  public Calendar fecha;

  public Integer nota;

    public TipoExamen myTipoExamen;
    
    private Catedra myCatedra;
    
    private Alumno myAlumno;

	public Examen(Calendar fecha, Integer nota, TipoExamen myTipoExamen, Catedra myCatedra, Alumno myAlumno) {
		super();
		this.fecha = fecha;
		this.nota = nota;
		this.myTipoExamen = myTipoExamen;
		this.myCatedra = myCatedra;
		this.myAlumno = myAlumno;
	}
    
    

}