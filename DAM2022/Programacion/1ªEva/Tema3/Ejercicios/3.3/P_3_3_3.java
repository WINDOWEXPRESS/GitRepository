import java.util.Scanner;
public class P_3_3_3{
	public static void main (String []Args){
		//Declarar los variables 
		int anio ;
		int mes ;
		int dia ;
		boolean bisiesto = false;
		//Crear objeto de la clase Scanner.
		Scanner dato = new Scanner(System.in);
		//Entrada 
		System.out.println("Pedir el día, mes y año de una fecha e indicar si es correcta.");
		//Pedir dato de anio
		System.out.print("Introducir el año:");
		//restriccion de anio
		do{
			anio = dato.nextInt();
			if(anio<0 || anio>9999){
				System.out.println("Año introducido es menor que 0 o mayor que 9999 , vuelve introducirlo.");
			}
		}while(anio<0 || anio>9999);

		if(anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0 )){
			bisiesto = true;
		}
		//Pedir dato de mes
		System.out.print("Introducir el mes:");
		//restriccion de mes
		do{
			mes = dato.nextInt();
			if(mes<1 || mes>12){
				System.out.println("Mes introducido es menor que 1 o mayor que 12 , vuelve introducirlo.");
			}
		}while(mes<1 || mes>12);
		//Pedir dato de dia
		System.out.print("Introducir el dia:");
		//restriccion de dia
		if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
			do{
				dia = dato.nextInt();
				if(dia<1 || dia>31){
					System.out.println("Dia introducido es menor que 1 o mayor que 31 , vuelve introducirlo.");
				}
			}while(dia<1 || dia>12);
		}else if(mes==4 || mes==6 || mes==9 || mes==11){
			do{
				dia = dato.nextInt();
				if(dia<1 || dia>30){
					System.out.println("Dia introducido es menor que 1 o mayor que 30 , vuelve introducirlo.");
				}
			}while(dia<1 || dia>30);
		}else if(mes==2 && bisiesto ){
			do{
				dia = dato.nextInt();
				if(dia<1 || dia>29){
					System.out.println("Dia introducido es menor que 1 o mayor que 29 , vuelve introducirlo.");
				}
			}while(dia<1 || dia>29);
		}else{
			do{
				dia = dato.nextInt();
				if(dia<1 || dia>28){
					System.out.println("Dia introducido es menor que 1 o mayor que 28 , vuelve introducirlo.");
				}
			}while(dia<1 || dia>28);
			
		}
		System.out.println("FECHA: " + dia+"/"+mes+"/"+anio);
	}
}

//System.out.println();