package tp2;

public class DetalleFactura {

	private int unidades;
	private Producto myProducto;
	private Float precioUnitario;
	public DetalleFactura(Integer unidades, Producto myProducto) {
		this.unidades=unidades;
		this.myProducto= myProducto;
		this.precioUnitario= myProducto.calcularPrecioVenta();
	}


  public Float CalcularTotal() {
return unidades * precioUnitario;
  }
  
}
  