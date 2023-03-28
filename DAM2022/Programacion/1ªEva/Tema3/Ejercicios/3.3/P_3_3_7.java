import java.util.Scanner;

public class P_3_3_7 {

	public static void main(String[] args) {
		// Declarar variables
		short mes = 0;
		short dia = 0;
		
		Scanner dato = new Scanner(System.in);
		
		//Capturar mes 
		System.out.println("un número entero entre uno y doce e imprima el número de días que tiene el mes correspondiente.");
		mes = dato.nextShort();
		//Posibilidades
		switch (mes) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			dia = 31;
			break;
		case 4: case 6: case 9:	case 11:
			dia = 30;
			break;
		default:
			dia = 28 ;
			break;
		}
		//Salida 
		System.out.println("Este mes tiene " + dia + " dias.");
	}

}
