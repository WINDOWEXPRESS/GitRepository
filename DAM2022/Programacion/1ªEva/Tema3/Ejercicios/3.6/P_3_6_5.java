package Ejercicios;
import java.util.Scanner;

public class P_3_6_5 {

	public static void main(String[] args) {
		// Declarar variables
		int a1 = 1;
		int a2 = 1;
		int an ;
		int nSucesion;
		//crear objeto de la clase scanner
		Scanner dato = new Scanner(System.in);
		//Capturar datos
		do {
			System.out.println("Mostrar la sucesion hasta el Nesimo termino de la sucesion Fibonacci.");
			nSucesion = dato.nextInt();			
		}while(nSucesion<1);
		
		if(nSucesion == 1) {
			System.out.println("Suce 1 : "+a1);
		}else{
			for(int i = 1 ; i <= nSucesion ; i++) {
				System.out.println("Suce "+i+" : "+a1);
				an = a2 + a1; 
				a1 = a2;
				a2 = an;
				
			}
		}
		
		
	}

}
