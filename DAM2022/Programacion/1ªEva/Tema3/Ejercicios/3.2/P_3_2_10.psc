Algoritmo P_3_2_10
	//Entorno
	Definir numAleatorio Como Entero
	Definir numAdivinar Como Entero
	numAleatorio =  azar(101)
	
	//Salida
	Escribir "El ordenador obtenga un número aleatorio comprendido entre 1 y 100 y tú tengas que adivinarlo."
	
	//Proceso 
	Repetir
		Escribir Sin Saltar "Introducir el numero : "
		Leer numAdivinar
		//Posibilidades de adivinar
		Si numAdivinar > numAleatorio  Entonces
			Escribir "El numero introducido es mayor."
		SiNo
			Escribir "El numero introducido es menor."
		FinSi
		
	Hasta Que numAdivinar = numAleatorio 
	Escribir "Correcto!!!"
FinAlgoritmo
