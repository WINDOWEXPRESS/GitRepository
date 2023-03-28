import java.util.Scanner;

public class P_3_3_6 {

	public static void main(String[] args) {
	//Declarar variables
	short caraNumero = -1;
	String caraOpuestoLetra = "";
	
	Scanner dato = new Scanner(System.in);
	
	//Bucle
	do {
		//Restriccion
		do {
			//Captar datos
			System.out.println("Introduzca 0 para salir. ");
			System.out.print("Introduzca número del dado entre 1 - 6: ");
			caraNumero = dato.nextShort();
		} while (caraNumero<0 || caraNumero >6);
		
		//Posibiblidades
		switch (caraNumero) {
		case 1:
			caraOpuestoLetra = "seis";
			break;
		case 2:
			caraOpuestoLetra = "cinco";
			break;
		case 3:
			caraOpuestoLetra = "cuatro";
			break;
		case 4:
			caraOpuestoLetra = "tres";
			break;
		case 5:
			caraOpuestoLetra = "dos";
			break;
		case 6:
			caraOpuestoLetra = "uno";
			break;
		}
		
		//Salida
		System.out.println("====================================================================");
		if(caraNumero != 0)
			System.out.println("En la cara opuesta está el \""+caraOpuestoLetra+"\".");
	} while (caraNumero != 0);

	}

}
