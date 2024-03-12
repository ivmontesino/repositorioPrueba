import java.util.Scanner;

public class Principal {
	//Teclado
	private static Scanner teclado= new Scanner (System.in);

	public static void main(String[] args) {
		
		//Variables
		int longitud, ancho;
		
		//Inicio
		System.out.println("Introduce la longitud del rectángulo: ");
		longitud= Integer.parseInt(teclado.nextLine());
		
		System.out.println("Introduce el ancho del rectángulo: ");
		ancho= Integer.parseInt(teclado.nextLine());
		
		Rectangulo rectangulo1 = new Rectangulo(longitud, ancho);
		
		System.out.println("El area del rectángulo es: " + rectangulo1.calcularArea());
		
		System.out.println("El perímetro del rectángulo es: " + rectangulo1.calcularPerimetro());

	}

}
