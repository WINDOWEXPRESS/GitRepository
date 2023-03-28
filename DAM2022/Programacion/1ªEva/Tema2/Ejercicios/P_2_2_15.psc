Algoritmo P_2_2_15
	
	//Entorno
	Definir correctas Como Entero
	Definir incorrectas Como Entero
	Definir blanco Como Entero
	Definir nota como Real
	//Entrada
	Escribir "Numero de las respuestas correctas:"
	Leer correctas
	Escribir "Numero de las respuestas incorrectas:"
	Leer incorrectas
	Escribir "Numero que esta en blanco:"
	Leer blanco
	//Proceso 
	nota = correctas - 0.25 * incorrectas
	//Salida
	Escribir "Correctas 		: " correctas " Puntos"
	Escribir "Incorrectas 		: -" 0.25 * incorrectas  
	Escribir "Blancos 		: 0(" blanco ")"
	Escribir "Su nota final es	: " nota
FinAlgoritmo

