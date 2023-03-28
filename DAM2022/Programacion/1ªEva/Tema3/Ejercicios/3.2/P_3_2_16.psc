Algoritmo P_3_2_16
	//Entorno
	Definir numMostrar Como Entero
	Definir contarNPrimo Como Entero
	Definir siNoPrimo Como Caracter
	Definir contador Como Entero
	contador = 0
	contarNPrimo = 1
	//Entrada
	//168 numeros primos de 1 a 1000
	Escribir "Mostrar en pantalla los N primeros número primos. Se pide por teclado la cantidad de números primos que queremos mostrar."
	Escribir Sin Saltar "Numero :"
	Leer numMostrar
	//Proceso
	Para i = 1 Hasta 9999999 Con Paso 1 Hacer
		contador = 0
		Para j = 1 Hasta i Con Paso 1 Hacer
			Si i mod j = 0 Entonces
				contador = contador + 1
			Fin Si
		Fin Para
		//Guardar los numeros
		Si contador = 2 Entonces
			siNoPrimo = siNoPrimo + ConvertirATexto(i)  +  "      " 
			contarNPrimo = contarNPrimo + 1
		Fin Si
		Si contarNPrimo mod 3 = 0 Entonces
			Escribir " "
		Fin Si
		//Para salir de bucle
		Si contarNPrimo = (numMostrar + 1) Entonces
			i = 99999999
		Fin Si
	Fin Para
	//Salida
	Escribir siNoPrimo
FinAlgoritmo
