//package com.hecho_yo;

import java.util.Scanner;

public class P_3_8_1 {

	public static void main(String[] args) {
		// Declarar variables
		float impuesto = 0 ;
		int	  impositivo ;
		float salarioAnual ;
		short deduccionHijo = 0 ;
		short numeroHijos ;
		
		String terminarPrograma = "S";
		// Crear objeto de las clases
		Scanner dato = new Scanner(System.in);
		
		//
		do {
			do {
				System.out.print("Introducir salario bruto anual: ");
				salarioAnual = dato.nextFloat();
			}while(salarioAnual<0);
			
			do {
				System.out.print("Introducir numero de hijos: ");
				numeroHijos = dato.nextShort();
			}while(numeroHijos<0);
			
			//dar valor a la variable deduccionHijo por numero de hijos
			if(numeroHijos>2) {
				deduccionHijo = 15 ;
			}else if (numeroHijos==1 || numeroHijos == 2 ) {
				deduccionHijo = 5 ;
			}
			
			//dar valor a la variable impositivo final
			impositivo = Impositivo(salarioAnual)-deduccionHijo;
			impuesto=Impuesto(impuesto,impositivo,salarioAnual);
			
			//Mensaje de impuesto
			System.out.println("Impuesto : "+impuesto);
			
			//Continuar o salir de programa
			System.out.print("Quiere continuar con otro caso (S/N): ");
			terminarPrograma = dato.next();
		}while(!terminarPrograma.equalsIgnoreCase("n"));
	}
	
	
	public static short Impositivo(float salarioAnual) {
		if(salarioAnual<20000) {
			return 15;
		}else if(salarioAnual>=20000 && salarioAnual < 30000) {
			return 18 ;
		}else {
			return 25;
		}
	}
	public static float Impuesto(float impuesto,int impositivo,float salarioAnual) {
		impuesto = salarioAnual*impositivo/100;
		return impuesto;
		
	}
}
