Algoritmo P_2_2_10
	//Entorno
	Definir num Como Entero
	Definir numInvertido Como Real
	Definir primerNum Como Entero
	
	//Entrada
	Mientras num < 10 o num >99  Hacer
		Escribir "Introduzca un numero de dos cifras para invertir:"
		Leer num
	Fin Mientras
	
	//Proceso 
		primerNum = trunc(num / 10) 
		numInvertido =  ( num % 10) * 10 + primerNum
	
	//Salida
	Escribir "El numero invertido de " num " es " numInvertido
FinAlgoritmo
