import java.util.Scanner;
public class P_3_6_4 {

	public static void main(String[] args) {
		// Declarar variables
		short opc = 0;
		int numero = 0;
		int sumaTotal = 0;
		int contador = 0;
		int n = 0;
		// Crear objeto de las clases
		Scanner dato = new Scanner(System.in);
		
		//Capturar datos
		System.out.println("==================================================");
		System.out.println("||1.Sumar los N primeros impares.               ||");
		System.out.println("||2.Sumar los N primeros pares.                 ||");
		System.out.println("||3.Sumar los N numeros con los múltiplos de 3. ||");
		System.out.println("==================================================");
		opc = dato.nextShort();
		System.out.println("Introducir N:");
		n = dato.nextInt();
	switch(opc){
		case 1:
			for(int i = 1 ; i<=9999 ; i++){
				if(i % 2 != 0){
					sumaTotal += i; 
					contador++;
					System.out.print(i+"\t");
				}
				if(contador == n){
					i = 10000;
				}
			}
			System.out.println();
			System.out.println("Suma total es :"+sumaTotal);
			break;
		case 2:
			for(int i = 1 ; i<=9999 ; i++){
				if(i % 2 == 0){
					sumaTotal += i; 
					contador++;
					System.out.print(i+"\t");
				}
				if(contador == n){
					i = 10000;
				}
			}
			System.out.println();
			System.out.println("Suma total es :"+sumaTotal);
			break;
		case 3:
			for(int i = 1 ; i<=9999 ; i++){
				if(i % 3 == 0){
					sumaTotal += i; 
					contador++;
					System.out.print(i+"\t");
				}
				if(contador == n){
					i = 10000;
				}
			}
			System.out.println();
			System.out.println("Suma total es :"+sumaTotal);
			break;
		}
		
	}
}
//System.out.println();
