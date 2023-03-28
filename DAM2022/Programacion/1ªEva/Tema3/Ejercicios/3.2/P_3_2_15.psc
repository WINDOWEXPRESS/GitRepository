Algoritmo P_3_2_15
	//Entorno
	Definir numOriginal Como Entero
	Definir numCopia Como Entero
	Definir siNoPrimo Como Caracter
	//Entrada
	Escribir "Introducir un número por teclado y mostrar si el número es primo o no."
	Escribir Sin Saltar "Numero :"
	Leer numOriginal
	numCopia = numOriginal
	//Proceso 
	Para i = numOriginal - 1 Hasta 2 Con Paso -1 Hacer
		Si numOriginal mod i = 0 Entonces
			//No hay break 
			siNoPrimo = "El numero " + ConvertirATexto(numCopia) + " no es primo" 
			numOriginal= 0
		Sino
			siNoPrimo = "El numero " + ConvertirATexto(numCopia) + " es primo" 
		Fin Si
	Fin Para
	Si numOriginal = 2 Entonces
		siNoPrimo = "El numero " + ConvertirATexto(numCopia) + " es primo" 
	Fin Si
	//Salida
	Escribir siNoPrimo
FinAlgoritmo
