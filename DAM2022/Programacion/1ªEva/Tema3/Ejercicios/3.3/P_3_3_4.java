import java.util.Scanner;
public class P_3_3_4{
	public static void main (String []Args){
	//Declarar los variables
	int numAlumno;
	int precioViaje;
	int precioTotalBus = 4000;
	int numBus = 0; 
	String nombreCole;
	
	//Crear objeto de la clase Scanner.
	Scanner datoNumerico = new Scanner(System.in);
	Scanner datoGenerico = new Scanner(System.in);
	//Captar datos
	System.out.print("Introducir el nombre del instituto:");
	nombreCole = datoGenerico.nextLine();
	
	System.out.print("Introducir numero de los alumnos que quieren ir de viaje:");
	numAlumno = datoNumerico.nextInt();
	//Precio por numero de Alumnos
	if(numAlumno>=100){
		precioViaje = 65;
	}else if (numAlumno>=50){
		precioViaje = 70;
	}else if (numAlumno>=30){
		precioViaje = 95;
	}else{
		precioViaje = 105;
	}
	//Precio total del bus 
	numBus = numAlumno/60;
	if(numAlumno <60 || numAlumno % 60 !=0){
		numBus++;
	}
	precioTotalBus = precioTotalBus * numBus;
	
	//Salida
	System.out.println("Nombre del instituto: \t\t"+nombreCole);
	System.out.println("Numero de los alumnos: \t\t"+numAlumno);
	System.out.println("Precio cada alumno: \t\t"+precioViaje+" Euros");
	System.out.println("Numero de Buses : \t\t"+ numBus);
	System.out.println("Precio bus: \t\t\t"+precioTotalBus+" Euros");
	System.out.println("El pago a la agencia: \t\t"+(numAlumno*precioViaje+precioTotalBus)+" Euros");
	System.out.printf("Precio total cada alumno:\t%.2f",(precioViaje+((float)precioTotalBus/numAlumno)));
	}
}
//System.out.println();