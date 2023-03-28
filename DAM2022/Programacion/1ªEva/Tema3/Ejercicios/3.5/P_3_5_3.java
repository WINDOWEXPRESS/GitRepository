import java.util.Scanner;
class P_3_5_3{
	public static void main(String[]args){
		//Declarar variables
		int num ;
		//Crear el objeto de la clase Scanner;
		Scanner dato = new Scanner(System.in);
		
		//Capturar num
		do{
			System.out.println("Introducir un numero mayor 1 y sea entero:");
			num= dato.nextInt();
		}while(num<=1);
		
		//Visualizar pares
		for(int i = 1 ; i <= num; i++){
			if(i % 2 == 0 ){
				System.out.print(i+"\t");	
			}
		}
	}
}
//  System.out.println("");	