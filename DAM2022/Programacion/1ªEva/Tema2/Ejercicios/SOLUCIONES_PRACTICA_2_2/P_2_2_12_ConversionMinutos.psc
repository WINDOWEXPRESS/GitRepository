//algoritmo de un programa que reciba una cantidad de minutos y 
//muestre por pantalla cuántas horas y minutos son

Proceso P_2_2_12_ConversionMinutos
	//Entorno
	Definir minTotales,hh, mm como entero;
	
	//Entrada de datos
	
	Escribir sin saltar "Introduzca la cantidad total de minutos: ";
	Leer minTotales;
	
	//Proceso
	hh<-trunc(minTotales/60);
	mm<-minTotales%60;
		
	//Salida de datos
	Escribir minTotales," minutos equivalen a ",hh, " horas y",mm," minutos";

FinProceso
