package guia3_ejercicio4;

public class Moneda {

	public String tipo;

	public Float cotizacion;

	public Float convertirAPeso(Float monto) {
		return monto * cotizacion;

	}

	public Moneda(String tipo, Float cotizacion) {
		super();
		this.tipo = tipo;
		this.cotizacion = cotizacion;
	}

}