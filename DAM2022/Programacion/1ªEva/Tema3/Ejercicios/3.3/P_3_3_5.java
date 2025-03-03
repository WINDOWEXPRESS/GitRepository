import java.util.Scanner;
public class P_3_3_5{
	public static void main (String []Args){
	//Declarar los variables
	int precio ;
	float precioTotal;
	int tiempo ;
	short impuesto = 0; 
	short diaN ;
	String diaL ="";
	short hora ;
	short minuto;
	String turno ;
	
	//Crear objeto de la clase Scanner.
	Scanner datoNumerico = new Scanner(System.in);
	Scanner datoGenerico = new Scanner(System.in);
	//Captar datos
	System.out.println("Determinar cuánto debe pagar por cada concepto una persona que realiza una llamada:");
	System.out.print("Minutos realizados :");
	tiempo = datoNumerico.nextInt();
	System.out.println("El dia de la semana realizado : \n1.Lunes \n2.Martes \n3.Miercoles \n4.Jueves \n5.Viernes \n6.Sabado \n7.Domingo ");
	do{
		diaN = datoNumerico.nextShort();
		if(diaN<0 || diaN > 7){
			System.out.println("El numero debe ser entre 1 a 7.");
		}
	}while (diaN<0 || diaN > 7);
	//Cambiar dia numerico a letra
	switch(diaN){
		case 1: diaL = "Lunes";		 break;
		case 2: diaL = "Martes";	 break;
		case 3: diaL = "Miercoles";	 break;
		case 4: diaL = "Jueves";	 break;
		case 5: diaL = "Viernes";	 break;
		case 6: diaL = "Sabado";	 break;
		case 7: diaL = "Domingo";	 break;
	}
	System.out.println("Hora de la llamada.");
	System.out.println("Hora:");
	do{
		hora = datoNumerico.nextShort();
		System.out.println("Minuto:");
		minuto = datoNumerico.nextShort();
		//Mensaje de error
		if((hora<1 || diaN > 24)&&(minuto<1 || minuto>60)){
			System.out.println("La hora debe ser entre 1 a 24.");
			System.out.println("El mituno debe ser entre 1 a 60.");
		}
		//Turno
		if(hora >1 && hora <= 13){
			turno = "maniana";
		}else{
			turno = "tarde";
		}
	}while ((hora<1 || diaN > 24)&&(minuto<1 || minuto>60));
	//Calculo precio minuto
	if(tiempo <= 5){
		precio = 100;
	}else if(tiempo <= 8){
		precio = 180;
	}else if(tiempo <= 10){
		precio = 250;
	}else{precio = 300;}
	//aplicar impuesto
	if(diaN == 7){
		impuesto = 3;
	}else if(turno.equals("maniana")){
		impuesto = 15;
	}else if(turno.equals("tarde")){
		impuesto = 10;
	}
	//Calculo precio total
	precioTotal = precio/100+precio*(float)impuesto/10000;
	
	//Salida
	System.out.println("==============================================================");
	System.out.println("Minutos realizado:\t\t"+tiempo+" Min");
	System.out.println("Dia realizado:\t\t\t"+diaL);
	System.out.println("Hora y minuto realizado:\t"+hora+":"+minuto+ "\nTurno :\t\t\t\t"+turno);
	System.out.println("Precio sin impuesto: \t\t"+precio/100+" Euro");
	System.out.println("Impuesto:\t\t\t"+impuesto+"%");
	System.out.println("El precio final es :\t\t" + precioTotal+" Euro");
	}
}
//System.out.println();