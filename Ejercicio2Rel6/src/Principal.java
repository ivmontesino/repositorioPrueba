import java.util.Scanner;

public class Principal {
	// Teclado
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Variables
		int saldo, operacion, dineroRetirado, dineroIngresado, totalIngresos = 0, totalReintegros = 0;
		char respuesta = 'N';

		// Inicio
		System.out.println("Introduce un saldo inicial: ");
		saldo = Integer.parseInt(teclado.nextLine());

		Cuenta cuentaPersonal = new Cuenta(saldo, totalIngresos, totalReintegros);

		do {
			System.out.println(
					"Elige alguna operación a realizar: 1-Hacer un reintegro, 2-Hacer un ingreso, 3- Consultar el saldo, 4-Finalizar operaciones: ");
			operacion = Integer.parseInt(teclado.nextLine());

			switch (operacion) {
			case 1:
				System.out.println("Introduce la cantidad a retirar: ");
				dineroRetirado = Integer.parseInt(teclado.nextLine());
				cuentaPersonal.sacarDinero(dineroRetirado);
				break;
			case 2:
				System.out.println("Introduce la cantidad a ingresar: ");
				dineroIngresado = Integer.parseInt(teclado.nextLine());
				cuentaPersonal.ingresarDinero(dineroIngresado);
				break;
			case 3:
				System.out.println("Saldo: " + cuentaPersonal.getSaldo());
				totalIngresos--;
				totalReintegros--;
				System.out.println("Número de reintegros: " + cuentaPersonal.getTotalReintegros());
				System.out.println("Número de ingresos: " + cuentaPersonal.getTotalIngresos());
				break;
			case 4:
				System.out.println("Confirmar salida: S/N");
				respuesta = teclado.nextLine().charAt(0);
				if (respuesta == 'S') {
					System.out.println("Saldo: " + cuentaPersonal.getSaldo());
				}
				break;
			}
		} while (respuesta == 'N');

	}

}
