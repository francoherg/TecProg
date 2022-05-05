package tp4_3;
import java.util.Vector;

public class Amarra {

  private Integer posicion;

  public Vector<Alquiler> myAlquiler;

	public Amarra(Integer posicion) {
		super();
		this.posicion = posicion;
		myAlquiler= new Vector<Alquiler>();
	}

}