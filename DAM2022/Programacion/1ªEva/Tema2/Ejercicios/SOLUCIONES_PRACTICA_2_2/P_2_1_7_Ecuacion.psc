// HAllar las raices de una ecuación de segundo grado a partir de sus coeficientes
//SIN COMPROBAR EL SIGNO DEL INTERIOR DE LA RAIZ CUADRADA

Algoritmo P_2_2_7_Ecuacion
	//ENTORNO
	Definir A,B,C,RaizPos,RaizNeg como real;
	
	//eNTRADA DE DATOS
	Escribir sin saltar "Dame el primer valor: ";
	Leer A;	
	Escribir sin saltar "Dame el segundo valor: ";
	Leer B;	
	Escribir sin saltar "Dame el tercer valor; ";
	Leer C;
	
	//PROCESO
	RaizPosPos <- ((-B + (rc (B^2-4*A*C)))/(2*A));
	RaizNeg <- ((-B - (rc (B^2-4*A*C)))/(2*A));
	
	Escribir "El resultado positivo es: " ,RaizPos;
	Escribir "El resultado negativo es: " ,RaizNeg;

FinAlgoritmo
