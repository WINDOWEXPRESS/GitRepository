Algoritmo P_3_1_10
	//Entorno
	Definir num1 Como Entero
	Definir num2 Como Entero
	Definir menorNum Como Entero
	Definir mayorNum Como Entero
	//Entrada
	Escribir "Introducimos dos números por teclado y queremos guardar el valor mayor en la variable MAYOR y el número menor en la variable MENOR."
	Escribir "Primer numero:"
	Leer num1
	Escribir "Segundo numero:"
	Leer num2
	//Proceso 
	Si num1 > num2 Entonces
		mayorNum = num1
		menorNum = num2
	SiNo
		mayorNum = num2
		menorNum = num1
	Fin Si
	//Salida
	Escribir "El mayor numero es " mayorNum " el menor numero es " menorNum
	
FinAlgoritmo
