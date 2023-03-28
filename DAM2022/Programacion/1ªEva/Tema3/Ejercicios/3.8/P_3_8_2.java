package com.hecho_yo;

import java.util.Scanner;

public class P_3_8_2 {
	public static void main(String[] args) {
		//Declarar variables
		/*
		 * Integer decimal ; Integer binario ; Integer octal;
		 */
		int decimal;
		String binario = "";
		String inverso = "";
		String octal = "";
		String bCinco = "";
		short opc;
		// Crear objeto de las clases
		Scanner dato = new Scanner(System.in);

		// menu
		Menu();

		do {
			System.out.print("Opcion: ");
			opc = dato.nextShort();
			if (opc != 1 && opc != 2 && opc != 3)
				System.out.println("Opcion invalido.");
		} while (opc != 1 && opc != 2 && opc != 3);

		do {
			System.out.print("Decimal: ");
			decimal = dato.nextInt();
			if (decimal < 0)
				System.out.println("Decimal no puede ser inferior a 0.");
		} while (decimal < 0);
		switch (opc) {

		case 1:
			// calculo
			while (decimal != 0) {
				inverso += decimal % 2;
				decimal = decimal / 2;
			}
			// hacer inverso
			for (int i = inverso.length() - 1; i >= 0; i--) {
				// System.out.println(i + "---" + inverso.charAt(i));
				binario += inverso.charAt(i);
			}
			// visualizar
			System.out.println(binario);
			break;
		case 2:
			// hacer inverso
			while (decimal != 0) {
				inverso += decimal % 8;
				decimal = decimal / 8;
			}
			// hacer inverso
			if (decimal == 1)
				octal += decimal;
			for (int i = inverso.length() - 1; i >= 0; i--) {
				// System.out.println(i + "---" + inverso.charAt(i));
				octal += inverso.charAt(i);
			}

			// visualizar
			System.out.println(octal);
			break;
		case 3:
			// calculo
			while (decimal != 0) {
				inverso += decimal % 5;
				decimal = decimal / 5;
			}
			// hacer inverso
			for (int i = inverso.length() - 1; i >= 0; i--) {
				// System.out.println(i + "---" + inverso.charAt(i));
				bCinco += inverso.charAt(i);
			}
			// visualizar
			System.out.println(bCinco);
			break;
		}
		/*
		 * switch (opc) {
		 * case 1: System.out.println(Integer.toBinaryString(decimal)); break; 
		 * case 2:System.out.println(Integer.toOctalString(decimal)); break; 
		 * case 3: break; 
		 * }
		 */
	}

	public static void Menu() {
		System.out.println("============================================");
		System.out.println("||            1.Decimal a binario         ||");
		System.out.println("||            2.Decimal a octal           ||");
		System.out.println("||            3.Decimal a base cinco      ||");
		System.out.println("============================================");
	}

}