import java.util.Scanner;

public class P_3_5_6 {

	public static void main(String[] args) {
		// Declarar variables
		float precioProducto = 0f;
		float precioTotal = 0f;
		float pago = 0f;
		float pagoCopia = 0f;
		// Crear objeto de las clases
		Scanner dato = new Scanner(System.in);

		// Capturar datos
		do{	
			System.out.println("Introducir 0 para salir.");
			System.out.println("Valor del producto(Maximo 50 euros):");
			do{
				precioProducto = dato.nextFloat();
				if(precioProducto < 0 || precioProducto>50){
					System.out.println("Precio no debe ser superio a 50 o inferio a 0.");
				}
			}while(precioProducto<0 || precioProducto>50);
			precioTotal += precioProducto ;
		}while(precioProducto!=0);
		//Mostrar precio total
		System.out.println("Precio total es:"+precioTotal);
		//Pago
		
		do{	
			System.out.print("Pago:");
				pago = dato.nextFloat();
				if(pago<=precioTotal){
					System.out.println("Pago inferior a precio total vuelve a introducirlo.");
				}
		}while(pago<=precioTotal);
		
		System.out.printf("Cambio:%.2f\n",(pago-precioTotal));
		//Calcular el cambio
		if(pago == precioProducto){
			System.out.println("Dinero justo.");
		}else{
			pago = pago-precioTotal;

			float multipleDiez = 1f;
			int valor50 = 50;
			int valor20 = 20;
			int valor10 = 10;			
			for(int i = 1 ; i < 5 ;i++){
				//Cambio de 50
				pagoCopia = pago / (50/multipleDiez);
				pago = pago % (50/multipleDiez);	
				System.out.print((valor50/multipleDiez)+" e : "+(int)pagoCopia + "\t\t\t");
				//Cambio de 20
				pagoCopia = pago / (20/multipleDiez);
				pago = pago % (20/multipleDiez);	
				System.out.print((valor20/multipleDiez)+" e : "+(int)pagoCopia+ "\t\t\t");
				//Cambio de 10
				pagoCopia = pago / (10/multipleDiez);
				pago = pago % (10/multipleDiez);	
				System.out.println((valor10/multipleDiez)+" e : "+(int)pagoCopia);
				
				multipleDiez = multipleDiez * 10;
			
			}
			
			/*    						Mucho codigo repetitivo
			//Cambio de 50
			pagoCopia = pago / 50;
			pago = pago % 50;	
			System.out.print("50e : "+(int)pagoCopia);
			//Cambio de 20
			pagoCopia = pago / 20;
			pago = pago % 20;	
			System.out.println("20e : "+(int)pagoCopia);
			//Cambio de 10
			pagoCopia = pago / 10;
			pago = pago % 10;	
			System.out.print("10 e : "+(int)pagoCopia);
			//Cambio de 5
			pagoCopia = pago / 5;
			pago = pago % 5;	
			System.out.println("5 e : "+(int)pagoCopia);
			//Cambio de 2
			pagoCopia = pago / 2;
			pago = pago % 2;	
			System.out.print("2 e : "+(int)pagoCopia);
			//Cambio de 1
			pagoCopia = pago / 1;
			pago = pago % 1;	
			System.out.println("1 e : "+(int)pagoCopia);
			//Cambio de 0.5
			pagoCopia = pago / 0.5f;
			pago = pago % 0.5f;	
			System.out.println("0.5cent : "+(int)pagoCopia);
			//Cambio de 0.2
			pagoCopia = pago / 0.2f;
			pago = pago % 0.2f;	
			System.out.print("0.2cent : "+(int)pagoCopia);
			//Cambio de 0.1
			pagoCopia = pago / 0.1f;
			pago = pago % 0.1f;	
			System.out.println("0.1cent : "+(int)pagoCopia);
			//Cambio de 0.05
			pagoCopia = pago / 0.05f;
			pago = pago % 0.05f;	
			System.out.print("0.05cent : "+(int)pagoCopia); 
			//Cambio de 0.02
			pagoCopia = pago / 0.02f;
			pago = pago % 0.02f;	
			System.out.println("0.02cent : "+(int)pagoCopia); 
			//Cambio de 0.01
			pagoCopia = pago / 0.01f;
			pago = pago % 0.01f;	
			System.out.print("0.01cent : "+(int)pagoCopia);  */
		}
	}
}
//System.out.println();
