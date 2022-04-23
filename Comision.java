package tp3_2;
import java.util.Calendar;
import java.util.Vector;

public class Comision {

  public Calendar fecha_inicio_academico;

      /**
   * 
   * @element-type Alumno
   */
  public Vector<Alumno>  myAlumno;
    public Docente myDocente;

  public Comision(Calendar fecha_inicio_academico, Vector<Alumno> myAlumno, Docente myDocente) {
		super();
		this.fecha_inicio_academico = fecha_inicio_academico;
		this.myAlumno = myAlumno;
		this.myDocente = myDocente;
	}

public Boolean esVigente() {
	  Boolean aux=false;
	  if(fecha_inicio_academico.get(Calendar.YEAR)==Calendar.getInstance().get(Calendar.YEAR)) {
		  aux=true;
	  }
  return aux;
  }

  public void mostrarAlumnos() {
	  for(Alumno oAlumno : myAlumno) {
		  oAlumno.mostrar();
	  }
  }

}