package tp4_3;

public class Yate extends Embarcacion {

	public Yate(String matricula, Float estora, Short año) {
		super(matricula, estora, año);
		// TODO Auto-generated constructor stub
	}

	private Float potencia;

	private Integer camarotes;

	@Override
	protected Float moduloEspecial() {
		return (moduloNormal() + potencia + camarotes);
	}

	public float calcularAlquiler(float days) {
		return (days * moduloEspecial());
	}

}