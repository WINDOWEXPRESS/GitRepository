Algoritmo P_3_2_3
	//Entorno
	Definir num Como Entero
	Definir resp Como Entero
	Definir numErro Como Entero
	//Entrada
	Escribir "Captura por teclado un número y queremos que nos pregunte la tabla de multiplicar de dicho número."
	Escribir "Introduzca el numero:"
	Leer num
	//Salida
	Para i = 1 Hasta 9 Con Paso paso Hacer
		Escribir i " * " num " = "
		Leer resp
		Si resp = i * num Entonces
			Escribir "Correcto."
		SiNo
			Escribir "Incorrecto."
			Escribir "La respuesta es : " i " * " num " = " i*num
			numErro = numErro + 1
		Fin Si
		i = i + 1
	Fin Para
	Escribir "Te has equivocado " numErro " veces."
	
FinAlgoritmo
