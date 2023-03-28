package Practica_4;

import java.util.Scanner;

public class P_4_1_2 {

	public static void main(String[] args) {
		// Declarar variables
		String nombreCompleto;

		try (
			// Crear objeto de la clase Scanner
			Scanner dato = new Scanner(System.in)) {
			do {
				// Capturar dato para variable nombreCompleto
				System.out.print("Escribe \"salir\" para terminar el programa. \nIntroducir su nombre :");
				nombreCompleto = dato.nextLine();
				if (!nombreCompleto.equalsIgnoreCase("salir")) {
					System.out.println("Nombre mayuscula:"+nombreMayuscula(nombreCompleto));
					System.out.println("Solo primer letra:"+soloPrimeraLetraMayuscula(nombreCompleto));
				}
			} while (!nombreCompleto.equalsIgnoreCase("salir"));
		}

	}

	public static String nombreMayuscula(String nombreCompleto) {
		return nombreCompleto.toUpperCase();
	}

	public static String soloPrimeraLetraMayuscula(String nombreCompleto) {
		String nombreCompleto1;
		// guardar primera letra mayuscula en tipo char
		char posicion1Mayuscula;
		nombreCompleto.toUpperCase().charAt(0);
		// concadenar todo
		posicion1Mayuscula = nombreCompleto.toUpperCase().charAt(0);
		;
		nombreCompleto1 = posicion1Mayuscula + nombreCompleto.substring(1);
		return nombreCompleto1;
	}
	public static String toMayusculas(String valor) {
	    if (valor == null || valor.isEmpty()) {
	        return valor;
	    } else {       
	        return  valor.toUpperCase().charAt(0) + valor.substring(1, valor.length()).toLowerCase();
	    }
	}

}
