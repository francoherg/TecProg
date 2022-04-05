package tp2_3;
public abstract class Vehiculo {

	private String marca;

	private Integer modelo;

	private Integer patente;

	private Float precio;

	private Float kilometraje;

	private Dueño myDueño;
	private Venta Detalle;

  public Vehiculo(String marca, Integer modelo, Integer patente, Float precio, Float kilometraje, Dueño myDueño,
			Venta detalle) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.precio = precio;
		this.kilometraje = kilometraje;
		this.myDueño = myDueño;
		Detalle = detalle;
	}

public Boolean esAuto() {
  return false;
  }

}