import java.util.Scanner;

public class P_4_1_4 {

	public static void main(String[] args) {
		// Declarar variables
		String primeraPalabra;
		String segundaPalabra;
		String terceraPalabra;

		// Crear objeto de la clase Scanner
		Scanner dato = new Scanner(System.in);
		
		System.out.println("Captura tres palabras por teclado y ordénalas de menor a mayor según el diccionario.");
		System.out.print("Primera palabra:");
		primeraPalabra = dato.nextLine();
		System.out.print("Segunda palabra:");
		segundaPalabra = dato.nextLine();
		System.out.print("Tercera palabra:");
		terceraPalabra = dato.nextLine();
		
		System.out.println(primeraPalabra.compareTo(segundaPalabra)+"****"+primeraPalabra.compareTo(terceraPalabra));
		
		
		//existe 6 casos diferentes
		if(nombre2.compareTo(nombre3)<0){
				System.out.println(nombre2);
				System.out.println(nombre3);
			}
			else{
				System.out.println(nombre3);
				System.out.println(nombre2);
			}
		}
		else{
			if(nombre2.compareTo(nombre1)<0 && nombre2.compareTo(nombre3)<0){
				System.out.println(nombre2);
				if(nombre1.compareTo(nombre3)<0){
					System.out.println(nombre1);
					System.out.println(nombre3);
				}
				else{
					System.out.println(nombre3);
					System.out.println(nombre1);
				}
			}else{
				System.out.println(nombre3);
				if(nombre1.compareTo(nombre2)<0){
					System.out.println(nombre1);
					System.out.println(nombre2);
				}else{
					System.out.println(nombre2);
					
					System.out.println(nombre1);
				}
			
			}
	}

}
