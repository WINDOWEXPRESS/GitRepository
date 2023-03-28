Algoritmo P_3_2_13
	//Entorno
	Definir base Como Real
	Definir exponente Como Entero
	Definir resultado Como Real
	resultado = 1
	//Entrada
	Escribir Sin Saltar "Introducir la base: "
	Leer base
	
	Repetir
		Escribir Sin Saltar "Introducir el exponente positivo: "
		Leer exponente
	Hasta Que exponente >= 0
	
	//Proceso 
	Para i <-exponente Hasta 1 Con Paso -1 Hacer
		resultado =  base * resultado
	Fin Para
	Si exponente = 0 Entonces
		resultado = 1
	Fin Si
	//Salida
	Escribir "Resultado es " resultado
FinAlgoritmo
