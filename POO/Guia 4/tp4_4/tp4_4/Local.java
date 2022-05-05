package tp4_4;

import java.util.Vector;

import tp4_4.Comida.tipoComida;

public class Local {

	private String identificacion;

	private Float horarioInicio;

	private Float horarioFin;

	private Vector<LocalClasificacion> myLocalClasificacion;

	private Vector<Empleado> myEmpleado;

	public static enum eLocalClasificacion {
		COMIDA, LIRERIA, ROPA
	}

	public Local(String identificacion, Float horarioInicio, Float horarioFin) {
		super();
		this.identificacion = identificacion;
		this.horarioInicio = horarioInicio;
		this.horarioFin = horarioFin;
		this.myLocalClasificacion = new Vector<LocalClasificacion>();
		this.myEmpleado = new Vector<Empleado>();
	}

	public void mostrar() {

		System.out.println("identificacion" + identificacion);

		for (LocalClasificacion oLC : myLocalClasificacion) {
			oLC.mostrar();

		}

	}

	public Boolean esBar() {
		Boolean aux = false;
		int i = 0;
		while (i < myLocalClasificacion.size() && aux == false) {
			i++;

			aux = myLocalClasificacion.get(i).esBar();
		}

		return aux;
	}

}