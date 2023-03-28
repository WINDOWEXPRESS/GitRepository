import java.util.Scanner;
class P_3_5_4{
	public static void main(String[]args){
		//Declarar variables
		int num = 0;
		int factorial = 1;
		String serieNum ="";
		//Crear el objeto de la clase Scanner;
		Scanner dato = new Scanner(System.in);
		
		//Capturar num
		do{
			System.out.println("Calcular el factorial de un número introducido:");
			num= dato.nextInt();
		}while(num<0);
		
		
		//Visualizar factorial
		for(int i = num ; i > 0; i--){
			if(i!=1){
				serieNum += i+"*";
			}else{
				serieNum +="1";
			}
			factorial *= i;
		}
		System.out.println("Factorial de "+num+" es "+serieNum+" = "+factorial);	
	}
}
//  System.out.println("");	