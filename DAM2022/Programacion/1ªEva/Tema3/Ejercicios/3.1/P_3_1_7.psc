Algoritmo P_3_1_7
	//Entorno
	Definir anio Como Entero
	//Entrada
	Escribir "Indicar si un año es bisiesto o no."
	Escribir "Introducir un año:"
	Leer anio
	//Salida
	Si (anio mod 4 = 0 y anio / 100 <> 0) o (anio mod 400 = 0) Entonces
		Escribir "Es bisiesto."
	SiNo
		Escribir "No es bisiesto."
	Fin Si

FinAlgoritmo
