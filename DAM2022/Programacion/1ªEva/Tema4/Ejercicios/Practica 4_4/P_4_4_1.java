import java.util.Scanner;
public class P_4_4_1{
	public static void main(String[] args){
		//Declarar variables
		int numAleatorio =((int)Math.random()*899999+100000);
		String numToString = numAleatorio+"";
		String numBorrado = "";
		byte numBorrar;
		
		//Crear objeto de la clase Scanner
		Scanner dato = new Scanner(System.in);
		
		//Capturar datos 
		System.out.println("Numero aleatorio: "+numAleatorio);
		System.out.println("Introducir un digito con valor entre 0 a 9 para eliminar dicho dígito del número de 6 cifras.");
		do{
			System.out.print("El digito: ");
			numBorrar = dato.nextByte();	
		}while(numBorrar<0 || numBorrar>9);
		for(int i = 0; i<numToString.length();i++){
			if(numToString.charAt(i)==numBorrar){
				numBorrado+="*"; 
			}else{
				numBorrado+=numToString.charAt(i); 
			}
		}
		System.out.println(numBorrado);
	}
}
//System.out.println();