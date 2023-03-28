import java.util.Scanner;

public class P_4_2_5 {

	public static void main(String[] args) {
		// Declarar variables
		String palabra;
		String frase;

		// Crear objeto de la clase Scanner
		Scanner dato = new Scanner(System.in);

		// Capturar datos para los variables
		System.out.println("Introducir una frase:");
		frase = dato.nextLine();
		System.out.println("Introducir una palabra:");
		palabra = dato.next();

		if (frase.lastIndexOf(palabra) != -1)
			System.out.println("Posicion :" + frase.lastIndexOf(palabra));
		else
			System.out.println("no encuentra palabra.");
	}

}
