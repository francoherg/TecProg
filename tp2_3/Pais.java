package tp2_3;
public class Pais {

  private Float Impuesto;

  private String paisOrigen;

  public Boolean esArgentina() {
	  Boolean aux;
	  if(paisOrigen=="Argentina") {
		  	aux=true;
		  }
	  else{aux= false;}
		  return aux;
  }
}