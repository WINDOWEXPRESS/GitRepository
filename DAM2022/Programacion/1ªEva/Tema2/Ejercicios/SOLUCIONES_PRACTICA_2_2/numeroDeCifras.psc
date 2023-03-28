Algoritmo numeroDeCifras
	Definir num Como Real
	Definir numCifras Como Entero
	Escribir "Introduzca un numero"
	Leer num
	numCifras<-1
	Mientras num>=10 o num<=-10
		numCifras<-numCifras+1
		num<-num/10
	FinMientras
	Escribir "El numero tiene ", numCifras " cifras"
FinAlgoritmo