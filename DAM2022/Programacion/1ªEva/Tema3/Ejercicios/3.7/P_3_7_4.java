package com.hecho_yo;

import java.util.Scanner;

public class P_3_7_4 {

	public static void main(String[] args) {		
		// Declarar variables
		int horaTrabajado ;
		float salario ;
		float precioHora ;
		final float PRECIO_HORA_EXTRA = 1.5f;
		final short HORA_EXTRA_APARTIR = 40; 
		
		// Crear objeto de las clases
		Scanner dato = new Scanner(System.in);
		
		do {
			// Declarar variables
			salario = 0f;
			precioHora = 0f;
			
			System.out.print("Numero de horas trabajadas :");
			horaTrabajado = dato.nextInt();
			System.out.print("Precio/hora :");
			precioHora = dato.nextFloat();
			//
			if(horaTrabajado>HORA_EXTRA_APARTIR) {
				salario = HORA_EXTRA_APARTIR*precioHora+(horaTrabajado-HORA_EXTRA_APARTIR)*PRECIO_HORA_EXTRA*precioHora;
			}else {
				salario = horaTrabajado*precioHora;
			}
			
			System.out.println("Salario : "+salario);
		}while(horaTrabajado != 0);
	}

}
