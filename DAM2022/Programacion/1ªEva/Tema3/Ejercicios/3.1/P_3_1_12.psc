Algoritmo P_3_1_12
	//Entorno
	Definir num Como Entero
	Definir multipleDiez Como Entero
	multipleDiez = 10
	Definir contador Como Entero
	contador = 0
	//Entrada
	Escribir "Leer un número entero (positivo o negativo) y determine si tiene 1, 2,3, 4 o más cifras."
	Escribir "Introducir un numero : "
	Leer num
	//Proceso 
	Mientras num / multipleDiez <> 0 Hacer
		num =trunc( num / multipleDiez)
		contador = contador + 1
	Fin Mientras
	//Salida
	Escribir "El numero introducido tiene " contador " cifras."
	
FinAlgoritmo
