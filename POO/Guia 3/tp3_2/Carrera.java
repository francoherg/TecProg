package tp3_2;
import java.util.Vector;

public class Carrera {

  public String nombre;

  public Vector<Alumno>  myAlumno;
  
  public Carrera(String nombre, Vector<Alumno> myAlumno) {
	super();
	this.nombre = nombre;
	this.myAlumno = new Vector<Alumno>();
}

public void listar_egresados() {
  }

}