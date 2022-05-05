package tp4_3;

public class Deportivo extends Embarcacion {

	public Deportivo(String matricula, Float estora, Short año) {
		super(matricula, estora, año);
		// TODO Auto-generated constructor stub
	}

	private Float potencia;

	@Override
	protected Float moduloEspecial() {

		return (moduloNormal() + potencia);
	}

	public float calcularAlquiler(float days) {
		return (days * moduloEspecial());
	}

}