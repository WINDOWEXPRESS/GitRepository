Algoritmo P_3_1_9
	//Entorno
	Definir num Como Entero
	Definir menorNum Como Entero
	menorNum = 99999999
	Definir contador Como Entero
	contador = 1 
	//Entrada
	Escribir "Determine el menor valor de 5 números introducidos por teclado."
	
	Mientras contador < 6 Hacer
		Escribir "Introducir " contador " numero:"
		Leer num
		Si num < menorNum Entonces
			menorNum = num
		Fin Si
		contador = contador + 1
	Fin Mientras
	
	//Salida
	Escribir "El menor numero introducido es : " menorNum
	
FinAlgoritmo
