package Practica_4;

import java.util.Scanner;

public class P_4_1_5 {

	public static void main(String[] args) {
		// Declarar variables
		String frase;

		// Crear objeto de la clase Scanner
		Scanner dato = new Scanner(System.in);

		//Capturar datos para variable frase
		System.out.println("Introducir una frase:");
		frase = dato.nextLine();
		
		//Visualizar frase de caracter a caracter
		for(int i = 0 ; i<frase.length();i++) {
			if(i!=frase.length()-1)
				System.out.print(frase.charAt(i)+"-");
			else
				System.out.println(frase.charAt(i));
		}
	}

}
