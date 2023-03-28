//Pide al usuario 2 números y muestra la istancia entre ellos
Proceso P_2_2_9_DistanciaNumeros
	//ENTORNO
	Definir num1, num2, distancia como enteros;
	
	//ENTRADA DE DATOS
	Escribir sin saltar "Introduzca el primer números ;";
	Leer num1;
	Escribir sin saltar "Introduzca el segundo número ;";
	Leer num2;
	
	//Proceso 
	distancia<-abs(num1-num2);
	
	//SALIDA DE DATOS
	Escribir "La distancia entre ",num1," y ",num2," es ",distancia;
FinProceso
