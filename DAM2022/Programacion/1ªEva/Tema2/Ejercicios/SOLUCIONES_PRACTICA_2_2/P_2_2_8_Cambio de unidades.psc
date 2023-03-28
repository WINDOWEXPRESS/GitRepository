//Dada una cantidad expresada en pies. 
//Pasar dicho valor a las siguientes medidas: pulgadas, yardas, metros y a millas 

Proceso P_2_2_8_CambioUnidades
	//Entorno
	Definir pies como Real;
	Definir pulgadas, yardas, metros, millas como Real;
	
	//Entrada de datos
	Escribir sin saltar "Introduzca cantidad en pies:";
	Leer pies;
	
	//Cálculos
	pulgadas <- pies*12;
	yardas <- pies/3;
	metros <- pulgadas *0.0254;
	millas <- metros/1609;
	
	//Salida de datos
	Escribir pies," pies equivalen a ",pulgadas," pulgadas ";
	Escribir pies," pies equivalen a ",yardas," yardas ";
	Escribir pies," pies equivalen a ",metros," metros ";
	Escribir pies," pies equivalen a ",millas," millas ";	
FinProceso
