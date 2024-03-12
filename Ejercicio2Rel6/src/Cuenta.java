
public class Cuenta {
	//Constantes
	private static final int CANTIDAD_MAXIMA=500;
	//private static final int CANTIDAD_MINIMA=0;
	//Atributos
	private double saldo;
	private int totalIngresos=0;
	private int totalReintegros=0;
	
	//Constructores
	public Cuenta(double saldoCuenta, int totalIngresosCuenta, int totalReintegrosCuenta) {
		saldo= saldoCuenta;
		ingresarDinero(totalReintegrosCuenta);
		sacarDinero(totalReintegrosCuenta);
	}
	public Cuenta(double saldoCuenta) {
		saldo=saldoCuenta;
	
	}
	//Metodos
	public double getSaldo() {
		return saldo;
	}
	public int getTotalIngresos() {
		return totalIngresos;
	}
	public int getTotalReintegros() {
		return totalReintegros;
	}
	public String toString() {
		return "saldo= " + saldo + " totalIngresos= " + totalIngresos + " totalReintegros= " + totalReintegros;
	}
	public void ingresarDinero(double cantidadAnadida) {
		if(cantidadAnadida<=CANTIDAD_MAXIMA) {
		saldo= saldo + cantidadAnadida;
		totalIngresos++;
		}else {
			System.out.println("Error");
		}
	}
	public void sacarDinero(double cantidadRetirada) {
		if(cantidadRetirada<=CANTIDAD_MAXIMA) {
		saldo= saldo-cantidadRetirada;
		totalReintegros++;
		}else {
			System.out.println("Error");
		}
	}
}
