Algoritmo sin_titulo
	Definir N1, N2, N3 como real 
	Escribir "Introduzca el primer número"
	Leer N1
	Escribir "Introduzca el segundo número"
	Leer N2
	Escribir "Introduzca el tercer número"
	Leer N3
	Si N1>N2 Entonces
		Si N1>N3
			Si N3>N2
				Escribir N1 " MAYOR " N3 " MAYOR " N2
			sino 
				Escribir N1 " MAYOR " N2 " MAYOR " N3
			FinSi
		SiNo
			Escribir N3 " MAYOR " N1 " MAYOR " N2
		FinSi
	sino
		Si N2 > N3 Entonces
			Si N1 > N3 Entonces
				Escribir N2 " MAYOR " N1 " MAYOR " N3
			sino 
				Escribir N2 " MAYOR " N3 " MAYOR " N1
			FinSi
		sino 
			Escribir N3 " MAYOR " N2 " MAYOR " N1
		Fin Si
	Fin Si
	
FinAlgoritmo
