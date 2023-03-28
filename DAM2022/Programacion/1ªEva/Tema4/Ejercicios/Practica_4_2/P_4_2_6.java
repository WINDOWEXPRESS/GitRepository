import java.util.Scanner;

public class P_4_2_6 {

	public static void main(String[] args) {
		// Declarar variables
		String palabra;
		String silaba;

		// Crear objeto de la clase Scanner
		Scanner dato = new Scanner(System.in);

		// Capturar datos para los variables
		System.out.println("Introducir una palabra:");
		palabra = dato.next();
		dato.nextLine();
		System.out.println("Introducir una silaba:");
		silaba = dato.next();
		
		if(palabra.startsWith(silaba)) {
			System.out.println("La palabra si empieza por silaba indicada.");
		}else {
			System.out.println("La palabra no empieza por silaba indicada.");
			
		}

	}

}
