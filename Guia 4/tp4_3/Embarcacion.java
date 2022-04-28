package tp4_3;

public abstract class Embarcacion {

	private String matricula;

	private Float estora;

	private Short año;

	public Embarcacion(String matricula, Float estora, Short año) {
		super();
		this.matricula = matricula;
		this.estora = estora;
		this.año = año;
	}

	protected abstract Float moduloEspecial();

	protected Float moduloNormal() {
		return (10 * estora);
	}

	public float calcularAlquiler(float days) {
		return (days * moduloNormal());
	}
}