Algoritmo P_3_1_11
	//Entorno
	Definir num1 Como Entero
	Definir num2 Como Entero
	Definir num3 Como Entero
	Definir medio Como Entero
	Definir mayorNum Como Entero
	Definir menorNum Como Entero
	//Entrada
	Escribir "Capturamos tres números por teclado y debemos ordenarlos de mayor a menor."
	Escribir "Primer numero : "
	leer num1
	Escribir "Segundo numero : "
	leer num2
	Escribir "Tercer numero : "
	Leer num3
	//Proceso 
	//num1 es mayor que num2 ,num3
	Si (num2 < num1 ) y (num3 < num1 ) Entonces
		mayorNum = num1
		Si (num3 < num2 )  Entonces
			menorNum = num3
			medio = num2
		SiNo
			menorNum = num2
			medio = num3
		Fin Si
		Escribir "El orden de los numeros de menor a mayor es " menorNum " < " medio " < " mayorNum 
	Fin Si
	
	//num2 es mayor que num1 ,num3
	Si (num3 < num2 ) y (num1 < num2 ) Entonces
		mayorNum = num2
		Si (num3 < num1 )  Entonces
			menorNum = num3
			medio = num1
		SiNo
			menorNum = num1
			medio = num3
		Fin Si
		Escribir "El orden de los numeros de menor a mayor es " menorNum " < " medio " < " mayorNum 
	Fin Si
	//num3 es mayor que num1 ,num2
	Si (num1 < num3 ) y (num2 < num3 ) Entonces
		mayorNum = num3
		Si (num2 < num1 )  Entonces
			menorNum = num2
			medio = num1
		SiNo
			menorNum = num1
			medio = num2
		Fin Si
		Escribir "El orden de los numeros de menor a mayor es " menorNum " < " medio " < " mayorNum 
	Fin Si
	//Los tres numeros iguales
	Si (num1 = num3 ) y (num2 = num3 ) Entonces
		Escribir "El orden de los numeros de menor a mayor es " num1 " = " num2 " = " num3 
	Fin Si
	
FinAlgoritmo
//Entorno

//Entrada

//Proceso 

//Salida

//Escribir ""
