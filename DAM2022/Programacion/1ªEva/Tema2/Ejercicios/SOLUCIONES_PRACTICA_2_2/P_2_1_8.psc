Algoritmo Ecuación
	Definir A,B,C,APos,ANeg como real
		
	Escribir "dame el primer valor"
	Leer A
	
	Escribir "Dame el segundo valor"
	Leer B
	
	Escribir "Dame el tercer valor"
	Leer C
	
	Si (B^2-4*A*C) < 0
		Escribir "No se puede hacer la raiz de un número negativo"
	sino
		xPos <- ((-b + (rc (b^2-4*a*c)))/(2*a))
		xNeg <- ((-b - (rc (b^2-4*a*c)))/(2*a))
		Escribir "El resultado positivo es: " xPos
		Escribir "El resultado negativo es: " xNeg
	FinSi
	

FinAlgoritmo
