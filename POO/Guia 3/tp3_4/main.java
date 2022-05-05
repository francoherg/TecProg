package tp3_4;

public class main {

	public static void main(String[] args) {
		Moneda moneda = new Moneda("peso",1f);
		Banco banco = new Banco("banco");
		Titular t1 = new Titular("nombre");
		Cuenta c1 = new Cuenta(t1);
		Monto monto = new Monto(1200f, moneda);
		Monto monto2 = new Monto(1400f, moneda);
		Deposito d1 = new Deposito(monto);
		Extraccion e1 = new Extraccion(monto2);
		c1.addTransaccion(e1);
		c1.addTransaccion(d1);
		banco.addCuenta(c1);
		banco.listarComisiones();
	}

}
