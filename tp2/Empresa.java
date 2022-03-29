package tp2;

import java.util.Vector;

public class Empresa {

	private String nombre;

	private Vector<Factura>  myFactura;

    private IVA myIVA;
    private Vector<Producto> myProducto;

    private Vector<Cliente>  myCliente;

public Empresa(String nombre, IVA myIVA) {
	this.nombre= nombre;
	this.myIVA= myIVA;
	  myCliente= new Vector<Cliente>();
	  myProducto= new Vector<Producto>();
	  myFactura= new Vector<Factura>();
}

public void calcularTotalFacturas() {

	Vector<Factura> fac=myFactura;
		Float totalFacturacion =0f;
		for(Factura ofac: fac) {
			totalFacturacion+= ofac.calcularTotal();
		}
		System.out.println("Total Facturado: " + totalFacturacion);
	}
}