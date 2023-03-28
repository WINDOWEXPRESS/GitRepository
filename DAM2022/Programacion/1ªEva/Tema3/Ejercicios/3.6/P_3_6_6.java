package Ejercicios;
import java.util.Scanner;
public class P_3_6_6 {

	public static void main(String[] args) {
		//Declarar variables
		float importe = 0f;
		int iva ;
		float impuesto = 0f;
		float impuestoTotal = 0f;
		float precioTotal = 0f;
		int descuento;
		
		//crear objeto de la clase scanner
		Scanner dato = new Scanner(System.in);
		
		//Capturar importe e iva
		System.out.println("Introducir 0 para salir.");
		do {
			do {
				System.out.print("Importe :");
				importe = dato.nextFloat();
				System.out.println("Iva: 4% - 7 % - 16%");
				iva = dato.nextInt();
			}while(iva != 4 && iva != 7 && iva != 16  && importe<0);
			//calculo de impuesto , impuesto total e precio total sin iva
			impuesto =(importe*iva/100);
			impuestoTotal += impuesto;
			precioTotal += importe; 
			System.out.println("Importe :"+importe+"  \tI.V.A :"+iva+"\tImpuesto :"+impuesto);
		}while(importe != 0);
		System.out.println("===========================================================");
		System.out.println("Importe total :"+precioTotal+" \tImpuesto total:"+impuestoTotal);
		
		precioTotal += (importe+impuestoTotal); 
		if(precioTotal>=1000 && precioTotal<10000) {
			System.out.println("Aplicar 5% de descuento de "+precioTotal+" es "+(precioTotal*0.05));
			precioTotal -=(precioTotal*0.05);
			System.out.println("Precio final: "+precioTotal);
			
		}else if(precioTotal>10000 ) {
			System.out.println("Aplicar 10% de descuento de "+precioTotal+" es "+(precioTotal*0.1));
			precioTotal -=(precioTotal*0.1);
			System.out.println("Precio final: "+precioTotal);
		}else {
			System.out.println("Precio final: "+precioTotal);
		}
		
		
	}

}
