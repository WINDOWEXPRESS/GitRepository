Algoritmo eje_12
	definir num1,num2 como reales
	
	Escribir "Introduce el primer n�mero"
	Leer num1
	
	Escribir "Introduce el segundo n�mero"
	Leer num2
	
	Si num1>num2 Entonces
		Escribir "La variable mayor es: ",num1
		Escribir "La variable menor es: ",num2
	SiNo
		Si num1 <num2
			Escribir "La variable mayor es: ",num2
			Escribir "La variable menor es: ",num1
		sino 
			Escribir "Los n�meros son iguales"
	Fin Si
	
FinAlgoritmo
