//10.	Capturar un n�mero de dos cifras y dise�ar un algoritmo que muestre el n�mero invertido
Proceso P_2_2_10_InvertirNumero
	//Entorno
	Definir num, unidades, decenas como entero;
	
	//Entrada de datos
	Escribir "INVERTIR UN N�MERO DE DOS CIFRAS";
	Escribir sin saltar "Introduzca el n�mero a invertir ";
	Leer num;
	
	//Proceso
	decenas <- trunc(num/10);
	unidades <- num % 10;
	
	//Salida de datos
	Escribir "El n�mero ",num, " invertido es ",unidades,decenas;

FinProceso
