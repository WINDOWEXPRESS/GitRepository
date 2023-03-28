import java.util.Scanner;

public class P_4_2_7 {
	public static void main(String[] args) {
		// Declarar variables
		String frase;
		String fraseSinBlanco = "";
		String fraseInvertido = "";
		// Crear objeto de la clase Scanner
		Scanner dato = new Scanner(System.in);

		// Capturar datos para los variables
		System.out.println("Introducir una frase o numero para saber si es palindromo o capicua:");
		frase = dato.nextLine();

		fraseSinBlanco = fraseSinBlancoCambiarTildeASin(frase);

		fraseInvertido = fraseInvertido(fraseSinBlanco);

		if (fraseInvertido.equalsIgnoreCase(fraseSinBlanco)) {
			System.out.println("Frase sin espacio: " + fraseSinBlanco + "\nFrase invertido: " + fraseInvertido);
			System.out.println("Es palindromo o capicuo.");
		} else {
			System.out.println("Frase invertido sin espacio: " + fraseInvertido);
			System.out.println("No es palindromo o capicuo.");
		}
	}

	public static String fraseSinBlancoCambiarTildeASin(String frase) {
		String[] fraseSeparadoPorEspacio;
		String fraseSinBlanco = "";
		fraseSeparadoPorEspacio = frase.split(" ");
		for (String x : fraseSeparadoPorEspacio) {
			fraseSinBlanco += x;
		}
		fraseSinBlanco = fraseSinBlanco.replace('\u00E1', 'a').replace("\u00E9", "e").replace("\u00ED", "i").replace("\u00F3", "o").replace("\u00FA", "u");
		fraseSinBlanco = fraseSinBlanco.replace('à', 'a').replace("è", "e").replace("ì", "i").replace("ò", "o").replace("ù", "u");
		fraseSinBlanco = fraseSinBlanco.replace('Á', 'A').replace("É", "E").replace("Í", "I").replace("Ó", "O").replace("Ú", "U");
		fraseSinBlanco = fraseSinBlanco.replace('À', 'A').replace("È", "E").replace("Ì", "I").replace("Ò", "O").replace("Ù", "U");
		return fraseSinBlanco;
	}

	public static String fraseInvertido(String fraseSinBlanco) {
		String fraseInvertido = "";
		for (int i = fraseSinBlanco.length() - 1; i >= 0; i--) {
			fraseInvertido += fraseSinBlanco.charAt(i);
		}

		return fraseInvertido;
	}
}
