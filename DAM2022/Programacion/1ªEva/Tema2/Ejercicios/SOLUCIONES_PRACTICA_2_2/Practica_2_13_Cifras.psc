Algoritmo Practica_2_13_Cifras
	
	//Entorno
	
	Definir num como real
	
	//Proceso
	
	Escribir "Introduzca el n�mero";
	Leer num;
	
	Si num > -10 y num < 10
		Escribir "El n�mero tiene una cifra"
	SiNo
		Si num > -100 y num < 100
			Escribir "El n�mero tiene dos cifras"
		SiNo
			Si num > -1000 y num < 1000
				Escribir "El n�mero tiene tres cifras"
			SiNo
				Si num > -10000 y num < 10000
					Escribir "El n�mero tiene cuatro cifras"
				SiNo
					
					Escribir "El numero tiene m�s de cuatro cifras"
					
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo