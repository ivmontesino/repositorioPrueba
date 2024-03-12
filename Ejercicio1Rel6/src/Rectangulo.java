
public class Rectangulo {
	
	//Atributos
	private double longitud=1;
	private double ancho=1;
	private static final int MAXIMO=20;
	private static final int MINIMO=0;
	
	
	//Constructores
	public Rectangulo(double longitudRectangulo, double anchoRectangulo) {
		longitud= longitudRectangulo;
		ancho= anchoRectangulo;
	}
	public Rectangulo() {
		
	}
	
	
	//Métodos
	public double getLongitud() {
		return longitud;
	}
	public double getAncho() {
		return ancho;
	}
	public void setLongitud(double longitudNueva) {
		if (longitudNueva>MINIMO && longitudNueva<MAXIMO) {
		longitud= longitudNueva;
		}
	}
	public void setAncho(double anchoNuevo) {
		if (anchoNuevo>MINIMO && anchoNuevo<MAXIMO) {
		ancho= anchoNuevo;
		}
	}
	public double calcularArea() {
		return longitud*ancho;
	}
	public double calcularPerimetro() {
		return (2*longitud)+(2*ancho);
	}
	public String toString() {
		return "Longitud " + longitud + " Ancho " + ancho;
	}

}
