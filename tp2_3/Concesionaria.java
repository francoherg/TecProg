package tp2_3;
import java.util.Vector;

public class Concesionaria {

	private String nombre;

	private Vector<Vehiculo>  myVehiculo;

	private Vector<Venta>  myVenta;

	public Concesionaria(String nombre) {
		super();
		this.nombre = nombre;
		this.myVenta= new Vector<Venta>();
		this.myVehiculo= new Vector<Vehiculo>();
	}

}