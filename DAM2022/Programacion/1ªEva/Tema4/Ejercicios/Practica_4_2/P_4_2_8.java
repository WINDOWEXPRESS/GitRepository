package Practica_4_2;

import java.util.Scanner;

public class P_4_2_8 {

	public static void main(String[] args) {
		// Declarar variables
		String frase;
		
		// Crear objeto de la clase Scanner
		Scanner dato = new Scanner(System.in);

		// Capturar datos para los variables
		System.out.println("Introducir una frase Y decir cuantas palabras contiene:");
		frase = dato.nextLine();

		System.out.println("la frase contiene "+fraseSinBlanco(frase)+" palabras.");
	}
	public static int fraseSinBlanco(String frase) {
		String[] fraseSeparadoPorEspacio;

		fraseSeparadoPorEspacio = frase.split(" ");
		
		return fraseSeparadoPorEspacio.length;		
	}
}
