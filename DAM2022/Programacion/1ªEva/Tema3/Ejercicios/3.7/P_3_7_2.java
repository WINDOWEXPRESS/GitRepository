package com.hecho_yo;

import java.util.Scanner;

public class P_3_7_2 {

	public static void main(String[] args) {
		// Declarar variables
		int n ;
		int d ;
		int sumaD = 0 ;
		
		// Crear objeto de las clases
		Scanner dato = new Scanner(System.in);
		
		//Capturar datos
		System.out.println("Dados dos números enteros positivos N y D decir si es o no perfecto.");
		System.out.print("N :");
		n = dato.nextInt();
		/*
			System.out.print("D :");
			d = dato.nextInt();
			
			if(n%d == 0) {
				System.out.println("N es perfecto");
			}else {
				System.out.println("N no es perfecto");
			}
		*/
		
		
		for(int i = 1 ; i < n ; i++) { 
			if(n % i == 0) { 
				//System.out.println(i+"\t");
				sumaD += i; 
			}
		}
		if(sumaD == n) {
			System.out.println("N es perfecto");
		}else {
			System.out.println("N no es perfecto");
		}
	}
}
