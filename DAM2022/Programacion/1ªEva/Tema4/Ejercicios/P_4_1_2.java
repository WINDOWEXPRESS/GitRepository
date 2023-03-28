package Ejercicios;

import java.util.Scanner;

public class P_4_1_2 {

	public static void main(String[] args) {
		// Declarar variables
		String nombreCapturado;

		// Crear el objeto de la clase Scanner
		Scanner dato = new Scanner(System.in);

		do {
			// Captar nombre
			System.out.println("Escribe 0 para salir.\n" + "Introducir el nombre: ");
			nombreCapturado = dato.nextLine();

			// Mostrar nombre en mayus
			System.out.println(nombreCapturado.toUpperCase());
		} while (!nombreCapturado.equals("0"));
	}

}
