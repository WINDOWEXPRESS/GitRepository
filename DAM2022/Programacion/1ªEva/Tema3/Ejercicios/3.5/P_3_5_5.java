import java.util.Scanner;

public class P_3_5_5 {

	public static void main(String[] args) {
		// Declarar variables
		int numEle;
		int posibilidades;

		// Crear objeto de las clases
		Scanner dato = new Scanner(System.in);
		P_3_Factorial fact = new P_3_Factorial();
		
		// Capturar datos
		System.out.println("Calcular combinaciones que podemos hacer de m elementos tomados de n en n.");
		System.out.print("Introducir numero de elementos:");
		numEle = dato.nextInt();
		System.out.print("Numero de n :");
		posibilidades = dato.nextInt();

		
		fact.calcularFactorial(numEle,posibilidades);
		fact.posiblesCombinaciones();
		System.out.print(fact.getPosiblesCombinaciones());
		

	}

}
