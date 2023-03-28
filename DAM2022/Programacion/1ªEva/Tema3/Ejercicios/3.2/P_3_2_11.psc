Algoritmo P_3_2_11
	//Entorno
	Definir numDecimal Como Entero
	Definir numBinario Como Caracter
	Definir decimal Como Entero
	//Entrada
	//numero decimal positivo
	Repetir
		Escribir "Expresar en binario un número decimal positivo."
		Leer numDecimal
		Si numDecimal <= 0 Entonces
			Escribir "EL NÚMERO DECIMAL INTRODUCIDO ES NEGATIVO"
		Fin Si
		Si numDecimal = 0 Entonces
			numBinario = "0"
		Fin Si
		decimal = numDecimal
	Hasta Que numDecimal >= 0
	//Proceso 
	Mientras numDecimal > 0 Hacer
		Si numDecimal mod 2= 0 Entonces
			numBinario = Concatenar("0",numBinario)
		SiNo
			numBinario = Concatenar("1",numBinario)
		Fin Si
		
		numDecimal = trunc(numDecimal / 2) 
	Fin Mientras
	
	//Salida
	Escribir "Decimal :" decimal " a Binario : " numBinario
FinAlgoritmo
