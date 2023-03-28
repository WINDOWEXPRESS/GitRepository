import java.util.Scanner;

public class P_3_3_8 {

	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		// Declarar variables
		short zona = 0;
		int peso = 0;
		int coste = 0;
		String[] lista = new String[5];

		// menu
		lista[0] = "1 \t\t\t América del Norte \t\t 24.00 euros/gramo";
		lista[1] = "2 \t\t\t América Central   \t\t 20.00 euros/gramo";
		lista[2] = "3 \t\t\t América del Sur   \t\t 21.00 euros/gramo";
		lista[3] = "4 \t\t\t Europa      	   \t\t 10.00 euros/gramo";
		lista[4] = "5 \t\t\t Asia		       \t\t 18.00 euros/gramo";

		System.out.println("==================Transporte internacional==================");
		System.out.println("Zona \t\t\t Ubicación \t\t\t Costo/gramo");
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
		// capturar zona
		do {
			System.out.print("Zona:");
			zona = dato.nextShort();
			if(zona < 0 || zona > 5) {
				System.out.println("Opcion invalido.");
			}
		} while (zona < 0 || zona > 5);

		// capturar gramo
		do {
			System.out.println("Paquete no superior a 5Kg.");
			System.out.print("Peso del paquete a gramo:");
			peso = dato.nextInt();
		} while (peso < 0 || peso > 5000);

		switch (zona) {
		case 1:
			coste = 24;
			break;
		case 2:
			coste = 20;
			break;
		case 3:
			coste = 21;
			break;
		case 4:
			coste = 10;
			break;
		default:
			coste = 18;
			break;
		}
		//Salida
		System.out.println("El precio es :"+(coste*peso) +" euros");
	}

}
