Algoritmo P_3_2_10_1
	//Entorno
	Definir numAleatorio Como Entero
	Definir numAdivinar Como Entero
	numAleatorio =  azar(101)
	
	//Salida
	Escribir "El ordenador obtenga un número aleatorio comprendido entre 1 y 100 y tú tengas que adivinarlo."
	Escribir "::::::::::::::::::::: " numAleatorio
	//Proceso 
	Repetir
		Escribir Sin Saltar "Introducir el numero : "
		Leer numAdivinar
		//Posibilidades de adivinar
		//Estar lejo del numero por lado positivo
		Si (numAdivinar >= numAleatorio + 10 ) y (numAdivinar < numAleatorio + 20 ) Entonces
			Escribir "Frio!!!"
		Fin Si
		Si (numAdivinar >= numAleatorio + 20 ) y (numAdivinar < numAleatorio + 30 ) Entonces
			Escribir "Frio Frio!!!"
		Fin Si
		Si (numAdivinar >= numAleatorio + 30 )  Entonces
			Escribir "Frio Frio Frio!!!"
		Fin Si
		//Estar cercar del numero por lado positivo
		Si (numAdivinar > numAleatorio) y  (numAdivinar < numAleatorio + 10) y (numAdivinar > numAleatorio + 5) y ( numAdivinar <> numAleatorio ) Entonces
			Escribir "Caliente Caliente!!!"
		Fin Si
		Si (numAdivinar > numAleatorio) y  (numAdivinar <= numAleatorio + 5) y ( numAdivinar <> numAleatorio ) Entonces
			Escribir "Caliente Caliente Caliente!!!"
		Fin Si
		//Estar lejo del numero por lado positivo
		Si (numAdivinar <= numAleatorio - 10 ) y (numAdivinar > numAleatorio - 20 ) Entonces
			Escribir "Frio!!!"
		Fin Si
		Si (numAdivinar <= numAleatorio - 20 ) y (numAdivinar > numAleatorio - 30 ) Entonces
			Escribir "Frio Frio!!!"
		Fin Si
		Si (numAdivinar <= numAleatorio - 30 )  Entonces
			Escribir "Frio Frio Frio!!!"
		Fin Si
		//Estar cercar del numero por lado negativo
		Si ( numAdivinar + 10 < numAleatorio  )  Entonces
			Escribir "El numero introducido es menor."
		FinSi
		Si (numAdivinar < numAleatorio) y  (numAdivinar > numAleatorio - 10) y (numAdivinar < numAleatorio - 5) y ( numAdivinar <> numAleatorio ) Entonces
			Escribir "Caliente Caliente!!!"
		Fin Si
		Si (numAdivinar < numAleatorio) y  (numAdivinar >= numAleatorio - 5) y ( numAdivinar <> numAleatorio ) Entonces
			Escribir "Caliente Caliente Caliente!!!"
		Fin Si
		
		
	Hasta Que numAdivinar = numAleatorio 
	Escribir "CORRECTO!!!"

FinAlgoritmo
