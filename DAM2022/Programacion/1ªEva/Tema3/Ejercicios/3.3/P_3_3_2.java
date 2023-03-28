import java.util.Scanner;
public class P_3_3_2{
	public static void main (String []Args){
		//Declarar los variables 
		int anio ;
		//Crear objeto de la clase Scanner.
		Scanner dato = new Scanner(System.in);
		//Entrada 
		System.out.println("Indicar si el año es bisiesto o no :");
		anio = dato.nextInt();
		//Condiciones 
		if(anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0 )){
			System.out.println("El año introducido es bisiesto.");
		}else{
			System.out.println("El año introducido no es bisiesto.");
		}
	}
}

//System.out.println();