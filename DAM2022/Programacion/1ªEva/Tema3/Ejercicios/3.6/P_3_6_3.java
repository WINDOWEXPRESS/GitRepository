import java.util.Scanner;
public class P_3_6_3 {

	public static void main(String[] args) {
		// Declarar variables
		short nNumeros = 0;
		float numero = 0f;
		float sumaTotal = 0f;
		// Crear objeto de las clases
		Scanner dato = new Scanner(System.in);
		
		//Capturar datos
		System.out.print("Sumar N números introducidos por teclado:");
		nNumeros = dato.nextShort();
			
		//calculo
		for(int i = 1 ; i<=nNumeros ; i++){
			System.out.print("Introducir el numero:");
			numero = dato.nextFloat();
			sumaTotal += numero; 
		}
		System.out.println("El total es :"+sumaTotal);
	}
}
//System.out.println();
