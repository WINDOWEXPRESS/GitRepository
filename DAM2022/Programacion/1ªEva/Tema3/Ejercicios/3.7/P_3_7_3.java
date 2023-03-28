package com.hecho_yo;

import java.util.Scanner;

public class P_3_7_3 {

	public static void main(String[] args) {
		// Declarar variables
		int dd ;
		int ddFinal = 0 ;
		int ddMaximo ;
		int mm ;
		int mmFinal = 0;
		int yyyy ;
		int yyyyFinal = 0 ;
		boolean anioBisiesto;
			
		// Crear objeto de las clases
		Scanner dato = new Scanner(System.in);
			
		//Pedir dato de anio
		System.out.print("Introducir el año:");
		//restriccion de anio
		do{
			yyyy = dato.nextInt();
			if(yyyy<0 || yyyy>9999){
				System.out.println("Año introducido es menor que 0 o mayor que 9999 , vuelve introducirlo.");
			}
		}while(yyyy<0 || yyyy>9999);
		
		anioBisiesto = VerificarFecha.verificarAnioBisisto(yyyy);
		if(VerificarFecha.verificarAnioBisisto(yyyy)) {
			System.out.println("Año Bisisto");
		}
		
		//Pedir dato de mes
		System.out.print("Introducir el mes:");
		//restriccion de mes
		do{
			mm = dato.nextInt();
			if(mm<1 || mm>12){
				System.out.println("Mes introducido es menor que 1 o mayor que 12 , vuelve introducirlo.");
			}
		}while(mm<1 || mm>12);
		
		//dia maximo de cada mes
		ddMaximo=VerificarFecha.diaMaximo(anioBisiesto, mm);
	
		//Pedir dato de dia
		System.out.print("Introducir el dia:");
		//restriccion de dia
		do{
			dd = dato.nextInt();
			if(dd<0 || dd>ddMaximo){
				System.out.println("Año introducido es menor que 0 o mayor que "+ddMaximo+" , vuelve introducirlo.");
			}
		}while(dd<0 || dd>ddMaximo);
		
		// visualizar dia mes anio
		System.out.println(dd+"\t"+mm+"\t"+yyyy);
		
		//dia siguiente de la fecha introducido
		if(dd == ddMaximo) {
			ddFinal = 1 ;
			if(mm == 12) {
				mmFinal = 1;
				yyyyFinal = yyyy+1;
			}else {
				mmFinal = mm +1;
				yyyyFinal = yyyy;
			}
		}else {
			ddFinal = dd+1;
			mmFinal = mm;
			yyyyFinal = yyyy;
		}
		
		
		// visualizar dia siguiente
		System.out.println("El dia siguiente es :" +ddFinal+ "/" +mmFinal+ "/" +yyyyFinal);
	}
}
