Algoritmo P_2_2_7
	//Variable
	Definir a Como Entero
	Definir b Como Entero
	Definir c Como Entero
	Definir x1 Como Real
	Definir x2 Como Real
	Definir raizCuadrada como Real
	
	//Proceso
	Escribir "Ax^2 + Bx + C = 0"
	Escribir "Introducir A :"
	Leer a
	Escribir "Introducir B :"
	Leer b
	Escribir "Introducir C :"
	Leer c
	
	//Salida
	Si b = 0 Entonces
		x1 = raiz( -c / a)
		Escribir a "x^2 + " b "x + " c " = 0"
		Escribir "X = " x1
	FinSi
	
	//Calculo x = ( -b + raiz( (b^) - 4ac ) ) / 2a
	raizCuadrada = raiz( (b*b) - 4*a*c )
	x1 = ( -b + raizCuadrada ) / 2*a
	x2 = ( -b - raizCuadrada ) / 2*a
	
	//Salida
	Si a  <> 0 & b <> 0 & c <> 0 Entonces
		Escribir a "x^2 + " b "x + " c " = 0"
		Escribir "X1 = " x1 
		Escribir "X2 = " x2
	FinSi
	Si a = 0  Entonces
		x1 = -c / b
		Escribir a "x^2 + " b "x + " c " = 0"
		Escribir "X = " x1
	Fin Si
	Si c = 0 Entonces
		x1 = 0
		x2 = -b / a
		Escribir a "x^2 + " b "x + " c " = 0"
		Escribir "X1 = " x1
		Escribir "X2 = " x2
	FinSi

	
FinAlgoritmo
