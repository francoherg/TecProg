package tp2_2;

import java.util.Calendar;

public class Principal {
	public static void main(String[] args) {
		Empresa myEmpresa = new Empresa("Empresa asdasda");
		
		Jefe jefe = new Jefe("a", "b", "123", 20000000, 123456.f);
		
		Jornalizado jornalizado = new Jornalizado("aa", "bb", "321", 30000000, jefe);
		
		Categoria categoria = new Categoria("Trabajador Categoria 1", 400.f);
		
		Mensualizado mensualizado = new Mensualizado("aaa", "bbb", "456", 25000000, jefe, categoria); 
		
		myEmpresa.agregarTrabajador(jefe);
		myEmpresa.agregarTrabajador(mensualizado);
		myEmpresa.agregarTrabajador(jornalizado);
		
		Calendar fechaHoy = Calendar.getInstance();
		
		Jornada jornada = new Jornada(41, fechaHoy);
		HorasJornal horasJornal = new HorasJornal(10.f, 15.f, fechaHoy);
		
		jornalizado.addHorasJornal(horasJornal);
		jornalizado.addJornada(jornada);
		
		myEmpresa.calcularSueldos(fechaHoy);
	}
}
