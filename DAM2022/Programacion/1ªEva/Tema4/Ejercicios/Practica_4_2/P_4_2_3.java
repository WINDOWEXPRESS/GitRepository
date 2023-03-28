import java.util.Scanner;

public class P_4_2_3 {

	public static void main(String[] args) {
		// Declarar variables
		String nombre;
		String apellido;
		String apellido1;
		String unicaCadena = "";

		// Crear objeto de la clase Scanner
		Scanner dato = new Scanner(System.in);

		// Capturar datos para los variables 
		System.out.println("Introducir su nombre:");
		nombre = dato.next();
		dato.nextLine();
		System.out.println("Introducir su primer apellido:");
		apellido = dato.next();
		dato.nextLine();
		System.out.println("Introducir su segundo apellido:");
		apellido1 = dato.next();
		dato.nextLine();
		
		//mostrar como resultado final que todo esté en una única cadena.
		System.out.println(unicaCadena.concat(nombre).concat(" ").concat(apellido)..concat(" ")concat(apellido1));

	}

}
