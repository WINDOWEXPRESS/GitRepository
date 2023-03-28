Algoritmo P_3_1_6
	//Entorno
	Definir ladoA Como Entero
	Definir ladoB Como Entero
	Definir ladoC Como Entero
	//Entrada
	Escribir "Tipo de triangulo."
	Escribir "Lado A:"
	Leer ladoA
	Escribir "Lado B:"
	Leer ladoB
	Escribir "Lado C:"
	Leer ladoC
	//Salida
	Si ladoA == ladoB y ladoB == ladoC Entonces
		Escribir "Es un triangulo equilatero."
	Fin Si
	Si (ladoA == ladoB y ladoB <> ladoC) o (ladoC == ladoB y ladoB <> ladoA) o (ladoC == ladoA y ladoB <> ladoA) Entonces
		Escribir "Es un triangulo isosceles."
	Fin Si
	Si (ladoA <> ladoB y ladoB <> ladoC y ladoA <> ladoC) Entonces
		Escribir "Es un triangulo escaleno."
	Fin Si
	Si (ladoA^2 = ladoB^2 +ladoC^2) o (ladoB^2 = ladoA^2 +ladoC^2) o (ladoC^2 = ladoA^2 +ladoB^2) Entonces
		Escribir "Es un triangulo rectangulo."
	Fin Si
FinAlgoritmo
