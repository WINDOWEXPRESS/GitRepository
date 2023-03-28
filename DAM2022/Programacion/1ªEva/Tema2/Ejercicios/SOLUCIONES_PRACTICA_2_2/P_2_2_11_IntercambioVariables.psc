//Capturar dos cifras numéricas A y B, y 
//realizar un algoritmo que intercambie el valor de las citadas variables
Proceso P_2_2_11_IntercambioVariables
	//Entorno
	Definir A,B, aux como entero;
	
	//Entrada de datos
	
	Escribir sin saltar "Introduzca el valor de la primera cifra ";
	Leer A;
	
	Escribir sin saltar "Introduzca el valor de la segunda  cifra ";
	Leer B;
	//Proceso
	aux <-A;
	A<- B;
	B <- aux;
		
	//Salida de datos
	Escribir "El primera cifra ahora es ",A, " y la segunda ",B;

FinProceso
