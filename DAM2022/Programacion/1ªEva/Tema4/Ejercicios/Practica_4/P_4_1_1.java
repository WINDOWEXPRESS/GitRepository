package Ejercicios;

import java.util.Scanner;

public class P_4_1_1 {

	public static void main(String[] args) {
		// Declarar variables
		String nombreCapturado;
		String nombreMasLargo = "";
		String nombreMasCorto = "";

		// Crear el objeto de la clase Scanner
		Scanner dato = new Scanner(System.in);

		// Capturar nombre
		System.out.print("Dejar nombre vacio para salir.\n" + "Introducir el nombre: ");
		nombreCapturado = dato.nextLine();
		nombreMasCorto = nombreCapturado;
		nombreMasLargo = nombreCapturado;
		while (!nombreCapturado.isEmpty()) {
			System.out.print("Introducir el nombre: ");
			nombreCapturado = dato.nextLine();
			if (nombreCapturado.length() > nombreMasLargo.length())
				nombreMasLargo = nombreCapturado;
			if (nombreCapturado.length() < nombreMasCorto.length()&&!nombreCapturado.isEmpty())
				nombreMasCorto = nombreCapturado;
		}
		System.out.println("El nombre mas largo es :" + nombreMasLargo + "\nEl nombre mas corto es :" + nombreMasCorto);
		//mostrar con printf en mayuscula
		//System.out.printf("El nombre mas largo es :%S \nEl nombre mas corto es :%S", nombreMasLargo  , nombreMasCorto);
	}

}
