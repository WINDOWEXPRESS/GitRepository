Algoritmo P_2_2_5
	//Entorno
	Definir num Como Real
	num = -1
	
	//Proceso 
	Mientras num<0 Hacer
		Escribir "Introduzca numero para hacer la raiz cuadrada:"
		Leer num
		Si num < 0 Entonces
			Escribir "Numero introducido es negativo."
		Fin Si
	Fin Mientras
		//calculo
	num = num * num
	
	//Salida
	Escribir "La raiz cuadrada del numero es " num
FinAlgoritmo


