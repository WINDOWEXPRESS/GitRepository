Algoritmo MenorAMayor
	Definir num1, num2, num3, num4 Como Real
	
	Escribir "Primer valor"
	Leer num1
	Escribir "Segundo valor"
	leer num2
	Escribir "Tercer valor"
	Leer num3
	Escribir "Cuarto valor"
	Leer num4
	
	Si num1>num2 Entonces
		Si num1>num3 Entonces
			Si num2>num3 Entonces
				Si num1>num4 Entonces
					Si num2>num4 Entonces
						Si num3>num4 Entonces
							Escribir num1 ">" num2 ">" num3 ">" num4
						SiNo
							Escribir num1 ">" num2 ">" num4 ">" num3
						Fin Si	
					SiNo
						Escribir num1 ">" num4 ">" num2 ">" num3
					Fin Si
				SiNo
					Escribir num4 ">" num1 ">" num2 ">" num3
				Fin Si
			SiNo
				Si num1>num4 Entonces
					Si num3>num4 Entonces
						Si num4>num2 Entonces
							Escribir num1 ">" num3 ">" num4 ">" num2
						SiNo
							Escribir num1 ">" num3 ">" num2 ">" num4
						Fin Si
					SiNo
						Escribir num1 ">" num4 ">" num3 ">" num2
					Fin Si
				SiNo
					Escribir num4 ">" num1 ">" num3 ">" num2
				Fin si
			Fin Si
		SiNo
			Si num3>num4 Entonces
				Si num4>num1 Entonces
					Escribir num3 ">" num4 ">" num1 ">" num2
				SiNo
					Escribir num3 ">" num1 ">" num2 ">" num4
				Fin Si
			SiNo
				Escribir num4 ">" num3 ">" num1 ">" num2
			Fin Si
		Fin Si
	SiNo
		Si num2>num3 Entonces
			Si num1>num3 Entonces
				Si num2>num4 Entonces
					Si num1>num4 Entonces
						Si num3>num4 Entonces
							Escribir num2 ">" num1 ">" num3 ">" num4
						SiNo
							Escribir num2 ">" num1 ">" num4 ">" num3
						Fin Si
					SiNo
						Escribir num2 ">" num4 ">" num1 ">" num3
					Fin Si
				SiNo
					Escribir num4 ">" num2 ">" num1 ">" num3
				Fin Si
			SiNo
				Si num2>num4 Entonces
					Si num3>num4 Entonces
						Si num4>num1 Entonces
							Escribir num2 ">" num3 ">" num4 ">" num1
						SiNo
							Escribir num2 ">" num3 ">" num1 ">" num4
						Fin Si
					SiNo
						Escribir num2 ">" num4 ">" num3 ">" num1
					Fin Si
				SiNo
					Escribir num4 ">" num2 ">" num3 ">" num1
				Fin Si
			Fin Si
		SiNo
			Si num1>num4 Entonces
				Si num2>num1 Entonces
					Escribir num3 ">" num2 ">" num1 ">" num4
				SiNo
					Escribir num3 ">" num1 ">" num2 ">" num4
				Fin Si
			SiNo
				Si num3>num4 Entonces
					Escribir num3 ">" num4 ">" num2 ">" num1
				SiNo
					Escribir num4 ">" num3 ">" num2 ">" num1
				Fin Si	
			Fin Si
			
		Fin Si
	Fin Si	
FinAlgoritmo
