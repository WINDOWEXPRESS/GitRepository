import java.util.Scanner;

public class P_4_2_9 {

	public static void main(String[] args) {
		// Declarar variables
		String frase;
		
		// Crear objeto de la clase Scanner
		Scanner dato = new Scanner(System.in);

		// Capturar datos para los variables
		System.out.println("Introducir una frase y mostrar el resultado sin ultima palabra:");
		frase = dato.nextLine();
		System.out.println("la frase es: \n"+usandoIndex(frase));
		//System.out.println("la frase es: \n"+fraseSinBlanco(frase));
	}
	/* public static String fraseSinBlanco(String frase) {
		String[] fraseSeparadoPorEspacio;
		String frase1 = "";
		fraseSeparadoPorEspacio = frase.split(" ");
		
		for(int i = 0; i < fraseSeparadoPorEspacio.length-1;i++) {
			frase1 += fraseSeparadoPorEspacio[i]+" ";
		}
		
		return frase1;		
	} */
	public static String usandoIndex(String frase) {
		int posicionEspacio=0;
		char espacio = ' ';
		String fraseSinUltimaPalabra = "";
		for(int i = 0; i < frase.length()-1;i++) {
			if(frase.charAt(i)==(espacio)){
				posicionEspacio=i;
			}
		}

		for(int i = 0; i < frase.length()-(frase.length()-posicionEspacio);i++) {
			fraseSinUltimaPalabra += frase.charAt(i);
		}
		
		return fraseSinUltimaPalabra;		
	}
}
