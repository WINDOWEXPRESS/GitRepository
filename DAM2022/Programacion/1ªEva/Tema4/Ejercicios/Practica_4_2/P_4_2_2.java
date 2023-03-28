import java.util.Scanner;

public class P_4_2_2 {

	public static void main(String[] args) {
		// Declarar variables
		String frase;

		// Crear objeto de la clase Scanner
		Scanner dato = new Scanner(System.in);

		// Capturar datos para variable frase
		System.out.println("Introducir una frase:");
		frase = dato.nextLine();
		
		frase = frase.replace('a', 'A').replace('e', 'E').replace('i', 'I').replace('o', 'O').replace('u', 'U');
		/* frase = frase.replace('a', 'A');
		frase = frase.replace('e', 'E');
		frase = frase.replace('i', 'I');
		frase = frase.replace('o', 'O');
		frase = frase.replace('u', 'U'); */
		
		System.out.println(frase);

	}

}
