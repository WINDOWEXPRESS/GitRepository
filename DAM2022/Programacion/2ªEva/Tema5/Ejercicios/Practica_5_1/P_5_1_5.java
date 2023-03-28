package Ejercicios;

import java.util.Scanner;

public class P_5_1_5 {

	public static void main(String[] args) {
		short nAlumnoClase ;
		double altura ;
		double media = 0;
		int masAltoMedia = 0;
		int masBajaMedia = 0;
		double[] arrayAltura;
		
		Scanner dato = new Scanner(System.in);
		
		System.out.println("Introduzca por teclado en número de alumnos de la clase.");
		nAlumnoClase = dato.nextShort();
		arrayAltura = new double[nAlumnoClase];
		
		for(int i = 0 ; i < nAlumnoClase;i++) {
			System.out.println("Introducir "+(i+1)+" dato de la altura del alumno.");
			altura = dato.nextDouble();
			arrayAltura[i]=altura;
			media += altura;
		}
		media = media/nAlumnoClase;
		for(double x:arrayAltura) {
			if(x>media) {
				masAltoMedia++;
			}else {
				masBajaMedia++;
			}
		}
		System.out.printf("La media de la clase es: %.2f\n",media);
		System.out.println("Numeros de alumnos mas altos que la media: "+masAltoMedia);
		System.out.println("Numeros de alumnos mas bajos que la media: "+masBajaMedia);
	}
}
