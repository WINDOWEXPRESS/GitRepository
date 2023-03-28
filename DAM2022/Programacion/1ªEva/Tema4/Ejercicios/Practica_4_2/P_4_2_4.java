import java.util.Scanner;

public class P_4_2_4 {

	public static void main(String[] args) {
		// Declarar variables
		String palabra;
		

		// Crear objeto de la clase Scanner
		Scanner dato = new Scanner(System.in);

		// Capturar datos para los variables
		System.out.println("Introducir una palabra para saber si son infinitivos(acaban en ar-er-ir):");
		palabra = dato.next();
		
		//posibilidades sin diferenciar  con mayuscula
		if(palabra.toLowerCase().endsWith("ar")) {
			System.out.println("Termina en ar.");
		}else if(palabra.toLowerCase().endsWith("er")) {
			System.out.println("Termina en er.");
		}else if(palabra.toLowerCase().endsWith("ir")) {
			System.out.println("Termina en ir.");
		}else {
			System.out.println("No es infinitivo.");
		}
	}

}
