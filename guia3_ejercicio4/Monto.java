package guia3_ejercicio4;

public class Monto {

	public Float monto;

	public Float monto_pesos;

	public Moneda myMoneda;

	private Float convertirAPeso(Moneda moneda) {
		return monto_pesos;
	}

	public Monto(Float monto, Moneda myMoneda) {
		super();
		this.monto = monto;
		this.monto_pesos = myMoneda.convertirAPeso(monto);
		this.myMoneda = myMoneda;
	}

}