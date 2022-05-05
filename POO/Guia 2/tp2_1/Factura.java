package tp2;
import java.util.Calendar;
import java.util.Vector;

public class Factura {

  private String numero;

  private Calendar fecha;

    private Vector<Empresa>  myEmpresa;
      private Cliente myCliente;
      private Vector<Producto>  myProducto;
    /**
   * 
   * @element-type DetalleFactura
   */
      private Vector<DetalleFactura>  myDetalleFactura;
      
      public Factura(String numero, Calendar fecha, Cliente myCliente) {
    	  
    	  this.fecha=fecha;
    	  this.numero=numero;
    	  this.myCliente= myCliente;
    	  myDetalleFactura= new Vector<DetalleFactura>();
    	  myEmpresa= new Vector<Empresa>();
    	  myProducto= new Vector<Producto>();
      }

  public Float calcularTotal() {
	  Float total=0f;
	  
	  
	  for (DetalleFactura oDetalle : myDetalleFactura) {
		  total += oDetalle.CalcularTotal();
  }
	  return total;
  }

}