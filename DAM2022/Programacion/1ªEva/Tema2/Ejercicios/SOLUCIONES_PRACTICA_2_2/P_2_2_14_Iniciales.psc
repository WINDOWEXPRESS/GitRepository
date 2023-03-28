//edir el nombre y los dos apellidos de una persona y 
//mostrar sus iniciales separadas por puntos

Proceso P_2_2_14_Iniciales
	//Entorno
	Definir nombre,Apellido1,Apellido2 como cadena;
	
	//Entrada de datos
	
	Escribir sin saltar "Introduzca en nombre: ";
	Leer nombre;
	Escribir sin saltar "Introduzca primer apellido: ";
	Leer Apellido1;
	Escribir sin saltar "Introduzca segundo apellido: ";
	Leer Apellido2;
		
	//Salida de datos
	Escribir " LAs iniciales de la persona son ",Mayusculas(Subcadena(nombre,0,0)),".",Mayusculas(Subcadena(apellido1,0,0)),".",Mayusculas(Subcadena(apellido2,0,0)),".";

FinProceso
