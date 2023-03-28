Algoritmo P_3_1_8
	//Entorno
	Definir num Como Real
	//Entrada
	Escribir "Calcule la raíz cuadrada del número que introduzca el usuario."
	Escribir "Introducir el numero:"
	Leer num
	
	//Si numero introducido es negativo
	Si num <= 0 Entonces
		Escribir "El numero introducido es negativo."
	Fin Si

	//Proceso 
	num = raiz(num)
	
	//Salida 
	Escribir "La raiz cuadrada de numero introducido es " num 
	
FinAlgoritmo
