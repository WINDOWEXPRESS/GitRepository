//10.	Capturar un número de dos cifras y diseñar un algoritmo que muestre el número invertido
Proceso P_2_2_10_InvertirNumero
	//Entorno
	Definir num, unidades, decenas como entero;
	
	//Entrada de datos
	Escribir "INVERTIR UN NÚMERO DE DOS CIFRAS";
	Escribir sin saltar "Introduzca el número a invertir ";
	Leer num;
	
	//Proceso
	decenas <- trunc(num/10);
	unidades <- num % 10;
	
	//Salida de datos
	Escribir "El número ",num, " invertido es ",unidades,decenas;

FinProceso
