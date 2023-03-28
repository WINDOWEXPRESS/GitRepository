Algoritmo P_3_1_3
	//Entorno
	Definir dividendo Como Entero
	Definir divisor Como Entero

	//Entrada
	Escribir "Pedir dos números y muestre su división si el segundo no es cero, o un mensaje de aviso en caso contrario."
	Escribir "Primer numero:"
	Leer dividendo
	Escribir "Segundo numero:"
	Leer divisor

	//Salida
	Si divisor <> 0 Entonces
		Escribir "Division de " dividendo " con " divisor " es " dividendo/divisor
	SiNo
		Escribir "mensaje de aviso"
	Fin Si
	
FinAlgoritmo
