Algoritmo P_3_1_13
	//Entorno
	Definir num1 Como Entero
	Definir num2 Como Entero
	Definir resultado Como REal
	Definir opc Como Enteros
	//Entrada
	Escribir "=====Calculadora de dos numeros====="
	Escribir "1.Suma."
	Escribir "2.Resta."
	Escribir "3.Multiplicacion."
	Escribir "4.Division."
	Leer opc
	Escribir "Primer numero : "
	Leer num1
	Escribir "Segundo numero : "
	Leer num2
	
	//Salida
	Segun opc Hacer
		1:
			resultado = num1 + num2
			Escribir num1 " + " num2 " = " resultado
		2:
			resultado = num1 - num2
			Escribir num1 " - " num2 " = " resultado
		3:
			resultado = num1 * num2
			Escribir num1 " * " num2 " = " resultado
		De Otro Modo:
			resultado = num1 / num2
			Escribir num1 " / " num2 " = " resultado
	Fin Segun
FinAlgoritmo
