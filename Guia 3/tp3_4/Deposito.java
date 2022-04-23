package tp3_4;
public class Deposito extends Transaccion {

    public Monto myMonto;

	public Deposito(Monto myMonto) {
		super();
		this.myMonto = myMonto;
	}

	public Float getMontoPesos() {
		return (myMonto.getMontoPeso());
	}
}