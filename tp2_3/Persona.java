package tp2_3;
import java.util.Vector;

public class Persona {

	private String apellido;

  private String nombre;

    public Vector<Venta>  myVenta;

	public Persona(String apellido, String nombre) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		
		myVenta= new Vector<Venta>();
	}
        
}