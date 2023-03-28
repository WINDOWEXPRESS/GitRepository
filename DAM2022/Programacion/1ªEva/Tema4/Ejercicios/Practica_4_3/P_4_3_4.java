import java.util.Scanner;
public class P_4_3_4{
	public static void main(String[]args){
		//Declarar variables
		double numeroReal ;
		
		//Crear obj de la clase Scanner
		Scanner dato = new Scanner(System.in);
		
		//Capturar datos
		System.out.print("Introducir un numero real para truncar: ");
		numeroReal = dato.nextDouble();
		
		//con metodo
		if(numeroReal>=0){
			numeroReal = Math.floor(numeroReal);
		}else{
			numeroReal = Math.ceil(numeroReal);
		}
		//sin metodo casting a int
		//System.out.printf("%.2f",numeroReal);
	}
}//System.out.println();