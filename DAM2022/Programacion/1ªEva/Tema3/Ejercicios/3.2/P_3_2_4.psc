Algoritmo P_3_2_4
	//Entorno
	Definir num Como Entero
	num = -1
	//Entrada
	Escribir "Calcular la raíz cuadrada del número que introduzca el usuario."
	Mientras num<=0 Hacer
		Escribir "Introduzca el numero:"
		Leer  num
		Si num<=0 Entonces
			Escribir "El numero introducido es negativo vuelve a introdcirlo:"
		Fin Si
	Fin Mientras
	
	//Salida
	
	Escribir "La raiz cuadrada del numero introducido es : " raiz(num) 
FinAlgoritmo
