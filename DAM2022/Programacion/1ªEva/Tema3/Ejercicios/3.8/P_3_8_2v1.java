
import java.util.Scanner;

public class P_3_8_2v1 {

	public static void main(String[] args) {
		//Declarar variables
		int decimal = 0;
		short opc = 0;
		String salirPrograma ;
		// Crear objeto de las clases
		Scanner dato = new Scanner(System.in);
		
		do {
			// menu
			Menu();
			//Capturar datos
			do {
				System.out.print("Opcion: ");
				opc = dato.nextShort();
				if (opc != 1 && opc != 2 && opc != 3)
					System.out.println("Opcion invalido.");
			} while (opc != 1 && opc != 2 && opc != 3);
			do {
				System.out.print("Decimal: ");
				decimal = dato.nextInt();
				if (decimal < 0)
					System.out.println("Decimal no puede ser inferior a 0.");
			} while (decimal < 0);
			
			//Metodo para la conversion de decimal a opcion elegido
			System.out.println(Conversion(decimal,opc));
			
			//continuar programa?
			salirPrograma = dato.nextLine();
			do {
				System.out.print("Quieres continuar?(S/N) :");
				salirPrograma = dato.nextLine();
			}while(!salirPrograma.equalsIgnoreCase("S")&&!salirPrograma.equalsIgnoreCase("N"));	
		
		}while(!salirPrograma.equalsIgnoreCase("N") );
	}

	public static void Menu() {
		System.out.println("============================================");
		System.out.println("||            1.Decimal a binario         ||");
		System.out.println("||            2.Decimal a octal           ||");
		System.out.println("||            3.Decimal a base cinco      ||");
		System.out.println("============================================");
	}
	
	public static String Conversion(int decimal,short opc) {
		int base ;
		String inverso = "";
		if(opc==1) {
			base = 2;
		}else if(opc == 2) {
			base = 8;
		}else {
			base = 5;
		}
		//calculo
		while (decimal != 0) {
			inverso = decimal % base + inverso;
			decimal = decimal / base;
		}
		return inverso;
	}
	
}