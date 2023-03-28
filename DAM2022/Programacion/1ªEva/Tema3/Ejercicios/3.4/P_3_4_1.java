import java.util.Scanner;
class P_3_4_1{
	public static void main(String[] args){
		//Declarar variables
		short operador ;
		String oper = "";
		float num1 = 0f;
		float num2 = 0f;
		float resultado = 0f;
		
		//Crear objeto de la clase Scanner
		Scanner dato = new Scanner(System.in);
		do{
			System.out.println("=======================Calculadora=====================");
			System.out.println("Introduzca el número que corresponda a la operación.");
			System.out.println("1.+ \t\t\t 3.* \t\t\t 5.(MOD)Resto division entera");
			System.out.println("2.- \t\t\t 4./ \t\t\t 6.Division entera");
			System.out.println("0.Para salir.");
			do{
				operador=dato.nextShort();
				if(operador<0 || operador>6){
				System.out.println("Opcion invalido.");		
				}
				if(operador!=0){
				System.out.print("Primer valor numerico:");
				num1= dato.nextFloat();
				System.out.print("Segundo valor numerico:");
				num2= dato.nextFloat();
				}
			}while(operador<0 || operador>6);

			//Calculo
			switch(operador){
				case 1:
					resultado = num1 + num2;
					oper = "+" ;
					break;
				case 2:
					resultado = num1 - num2;
					oper = "-" ;
					break;
				case 3:
					resultado = num1 * num2;
					oper = "*" ;
					break;
				case 4:
					resultado = num1 / num2;
					oper = "/" ;
					break;
				case 5:
					resultado = num1 % num2;
					oper = "%" ;
					break;
				//Bloqueado sin entender division entera
				/* case 6:
					resultado = num1 / num2;
					resultado = (Math.trunc(resultado);
					oper = "División entera" ;
					break;	 */
			};
			// mostrar un mensaje con la operación realizada y su resultado. 
			if(operador==0){
				System.out.println("Fin del programa.");
			}else{
				System.out.println(num1 +" "+ oper +" "+ num2 +" = "+resultado);
			}
		}while(operador!=0);
		
	}
}


//System.out.println("");