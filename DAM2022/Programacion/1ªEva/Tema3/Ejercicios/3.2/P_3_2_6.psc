Algoritmo P_3_2_6
	//Entorno
	Definir num Como Entero
	Definir contarPosi Como Entero
	Definir contarNega Como Entero
	Definir contarCero Como Entero
	contarCero = 0
	contarNega = 0
	contarPosi = 0
	Definir respBucle Como Entero
	Definir salirBucle Como Logico
	
	
	//Bucle 
	Repetir
		salirBucle = Falso
		Escribir "Dame un numero para decir si es positivo, negativo o cero."
		Leer num
		Si num = 0 Entonces
			Escribir "El numero introducido es CERO "
			contarCero = contarCero + 1
		Fin Si
		Si num > 0 Entonces
			Escribir "El numero introducido es POSITIVO "
			contarPosi = contarPosi + 1
		Fin Si
		Si num < 0 Entonces
			Escribir "El numero introducido es NEGATIVO "
			contarNega = contarNega + 1
		Fin Si
		
		//Si desear continuar o no
		Escribir "Deseas continuar?"
		Escribir "1.Si."
		Escribir "2.No."
		leer respBucle
		Si respBucle = 1 Entonces
			salirBucle = Verdadero
		Fin Si
	Hasta Que !salirBucle
	Escribir contarPosi " positivos , " contarNega " negativos , " contarCero " ceros."
	
FinAlgoritmo
