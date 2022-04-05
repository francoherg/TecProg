package tp2_3;

public class Auto extends Vehiculo {

	private Pais myPais;
	public Auto(String marca, Integer modelo, Integer patente, Float precio, Float kilometraje, Dueño myDueño,
			Venta detalle, Pais myPais) {
		super(marca, modelo, patente, precio, kilometraje, myDueño, detalle);
		
		this.myPais = myPais;
	}


	public Boolean esAuto() {
		  return true;
		  }
  public Boolean esAutoNacional() {
	  boolean aux;
	  if(myPais.esArgentina()) {
		  	aux=true;
		  }
	  else{aux= false;}
		  return aux;
  }

}