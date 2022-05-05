package tp3_4;
public class Extraccion extends Transaccion {

    public Monto myMonto;
    
	public Extraccion(Monto myMonto) {
		super();
		this.myMonto = myMonto;
	}
	
	public Float getMontoPesos() {
		return -1*(myMonto.getMontoPeso());
	}
    
}