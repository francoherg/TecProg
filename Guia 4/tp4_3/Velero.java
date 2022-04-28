package tp4_3;

public class Velero extends Embarcacion {

	public Velero(String matricula, Float estora, Short año) {
		super(matricula, estora, año);
		// TODO Auto-generated constructor stub
	}

	private Integer mastiles;

	@Override
	protected Float moduloEspecial() {
		return (moduloEspecial() + mastiles);
	}

	public float calcularAlquiler(float days) {
		return (days*moduloEspecial());
	}
}
