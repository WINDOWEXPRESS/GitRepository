
import java.util.Scanner;

public class P_3_8_3 {

	public static void main(String[] args) {
		// Declarar variables
		int longitud;
		char caracter = 169;
		// Crear objeto de las clases
		Scanner dato = new Scanner(System.in);

		System.out.println("Introducir la longitud del lado del cuadrado:");
		longitud = dato.nextInt();
		for(int p = longitud ; p >0 ;p--) {
			System.out.print(p+"  ");
		}
		System.out.println();
		for(int i = longitud; i>0;i--) {
			for(int j = longitud; j>0;j--) {
				if(i == longitud || i == 1) {
					System.out.print(caracter+"  ");
					caracter++;
				}else if(j == longitud) {
					System.out.print(caracter+"  ");
					caracter++;
				}else if(j == 1) {
					System.out.print(caracter+"  ");
					caracter++;
				}else {
					System.out.print("   ");
				}
			}
			System.out.println(i);
		}
		
	}

}
