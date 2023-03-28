package Practica_4_2;

import java.io.IOException;
import java.util.Scanner;

public class P_4_2_1 {
	public static void main(String[] arg) throws IOException {
		// Declarar variables
		String palabra;
		String silaba;
		char ContinuarPrograma = 'S';
		// Crear objeto de la clase Scanner
		Scanner dato = new Scanner(System.in);
		
		
		while(ContinuarPrograma != 'N' && ContinuarPrograma != 'n' ){
			// Capturar datos para variable frase
			System.out.println("Introducir una palabra:");
			palabra = dato.next();
			System.out.println(palabra);
			dato.nextLine();

			// Capturar datos para variable silaba
			System.out.println("Introducir una silaba:");
			silaba = dato.next();

			//posicion de la silaba en la palabra
			if(palabra.indexOf(silaba)!=-1)
				System.out.println("Se encuentra en la posiscion :"+ (palabra.indexOf(silaba)+1));	
			else
				System.out.println("La silaba no esta en la palabra");
			
			System.out.println("Quieres continuar ? S/N :");
			ContinuarPrograma = (char) System.in.read();
		}
		
		
	}
}
