Algoritmo P_2_2_17
	
	//Entorno
	Definir priCaliParciales Como Real
	Definir segCaliParciales Como Real
	Definir terceCaliParciales Como Real
	Definir examenFinal Como Real
	Definir trabajoFinal Como Real
	Definir notaFinal Como Real
	//Entrada
	Escribir "Calculo de la calificacion final"
	Escribir "Introducir nota de primer calificacion parcial : "
	Leer priCaliParciales
	Escribir "Introducir nota de segundo calificacion parcial : "
	Leer segCaliParciales
	Escribir "Introducir nota de tercero calificacion parcial : "
	Leer terceCaliParciales
	Escribir "Introducir nota de examen final : "
	Leer examenFinal
	Escribir "Introducir nota de trabajo final : "
	Leer trabajoFinal
	//Proceso 
	notaFinal = 0.55*((priCaliParciales+segCaliParciales+terceCaliParciales)/3) + 0.3*examenFinal + 0.15*trabajoFinal
	//Salida
	Escribir "Su calificacion final es :" notaFinal

FinAlgoritmo

