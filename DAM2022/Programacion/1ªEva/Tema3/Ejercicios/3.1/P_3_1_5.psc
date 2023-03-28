Algoritmo P_3_1_5
	//Entorno
	Definir nota Como Entero
	Definir edad Como Entero
	Definir genero Como Caracter
	
	//Entrada
	Escribir "Introducir la nota:"
	Leer nota
	Escribir "Introduir la edad:"
	Leer edad
	Escribir "Introducir el genero: M/F"
	Leer genero
	genero = Mayusculas(genero)
	
	//Salida
	Si nota >= 5 y edad >= 18 y genero == "F" Entonces
		Escribir "ACEPTADA" 
	SiNo
		Si nota >= 5 y edad >= 18 y genero == "M" Entonces
			Escribir "ACEPTADO"
		SiNo
			Escribir "NO ACEPTADO/A" 
		Fin Si
	Fin Si
FinAlgoritmo
