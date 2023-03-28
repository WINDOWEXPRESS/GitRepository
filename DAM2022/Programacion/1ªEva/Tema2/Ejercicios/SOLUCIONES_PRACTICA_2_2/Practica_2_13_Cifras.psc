Algoritmo Practica_2_13_Cifras
	
	//Entorno
	
	Definir num como real
	
	//Proceso
	
	Escribir "Introduzca el número";
	Leer num;
	
	Si num > -10 y num < 10
		Escribir "El número tiene una cifra"
	SiNo
		Si num > -100 y num < 100
			Escribir "El número tiene dos cifras"
		SiNo
			Si num > -1000 y num < 1000
				Escribir "El número tiene tres cifras"
			SiNo
				Si num > -10000 y num < 10000
					Escribir "El número tiene cuatro cifras"
				SiNo
					
					Escribir "El numero tiene más de cuatro cifras"
					
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo