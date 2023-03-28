import java.util.Scanner;

public class P_4_1_3 {

	public static void main(String[] args) {
		// Declarar variables
		String primerPalabras;
		String restosPalabras;
		short contador = 0;

		// Crear objeto de la clase Scanner
		Scanner dato = new Scanner(System.in);
		
		System.out.println("Introducida palabra:");
		primerPalabras= dato.next();
		dato.nextLine();
		do {
			System.out.print("Introducida palabra:\n"+(contador+1)+"---");
			restosPalabras= dato.next();
			dato.nextLine();
			contador++;
		}while(!restosPalabras.equalsIgnoreCase(primerPalabras));
		System.out.println("El número de palabras distintas capturadas es: "+(contador-1));
	}

}
