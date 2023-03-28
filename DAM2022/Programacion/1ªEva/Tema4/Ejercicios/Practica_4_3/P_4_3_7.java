import java.util.Scanner;
public class P_4_3_7{
	public static void main(String[]args){
		//Declarar variables
		double numeroReal ;
		
		//Crear obj de la clase Scanner
		Scanner dato = new Scanner(System.in);
		
		//Capturar datos
		System.out.print("Introducir un numero real para redondear al entero más próximo: ");
		numeroReal = dato.nextDouble();
		
		numeroReal = Math.round(numeroReal);
		System.out.println(numeroReal);
	}
}//System.out.println();