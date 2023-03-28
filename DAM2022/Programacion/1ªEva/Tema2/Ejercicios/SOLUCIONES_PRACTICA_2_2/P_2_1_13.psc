Algoritmo EJERCICIO13
	Definir Num como Entero
	Escribir "Escribe un numero"
	Leer Num
	Si Num<10 & Num>-10 Entonces
		Escribir "El numero tiene 1 cifra"
	SiNo
		Si Num<100 & Num>-100 Entonces
			Escribir "El numero tiene 2 cifras"
		SiNo
			Si Num<1000 & Num>-1000 Entonces
				Escribir "El numero tiene 3 cifras"
			SiNo
				Escribir "El numero tiene 4 cifras o más"
			fin Si
		Fin Si
	Fin Si
FinAlgoritmo
