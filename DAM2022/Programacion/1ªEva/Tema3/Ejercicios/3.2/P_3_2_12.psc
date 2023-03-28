Algoritmo P_3_2_12
	//Entorno
	Definir limiteInferior Como Entero
	Definir limiteSuperior Como Entero
	Definir num Como Entero
	Definir numDentroIntervalo Como Caracter
	Definir sumaNumDentroIntervalo Como Entero
	Definir numFueraIntervalo Como Caracter
	Definir numIgualIntervalo Como Caracter
	//Entrada
	Repetir
		Escribir "Pedir el limite inferior y superior de un intervalo."
		Escribir Sin Saltar "El limite inferior:"
		Leer limiteInferior
		Escribir Sin Saltar "El limite superior:"
		Leer limiteSuperior
		//Mensaje de si inferior es mas grande.
		Si limiteSuperior < limiteInferior Entonces
			Escribir "El límite inferior es mayor que el superior ,vuelve a introdcir."
		Fin Si
	Hasta Que limiteSuperior > limiteInferior
	Repetir
		Escribir "Introducir numeros que no sea 0."
		Escribir "Pulsa 0 para salir"
		Leer num
		Si num > limiteInferior y num <limiteSuperior Entonces
			sumaNumDentroIntervalo = sumaNumDentroIntervalo + num
			numDentroIntervalo = Concatenar(numDentroIntervalo,ConvertirATexto(num))
			numDentroIntervalo = numDentroIntervalo + " - "
		Fin Si
		Si (num < limiteInferior o num >limiteSuperior) y num<> 0 Entonces
			numFueraIntervalo = Concatenar(numFueraIntervalo,ConvertirATexto(num))
			numFueraIntervalo = numFueraIntervalo + " - "
		Fin Si
		Si (num = limiteInferior o num = limiteSuperior) Entonces
			numIgualIntervalo = Concatenar(numIgualIntervalo,ConvertirATexto(num))
			numIgualIntervalo = numIgualIntervalo + " - "
		Fin Si
	Hasta Que num = 0
	
	//Salida
	Escribir "La suma de los números que están dentro del intervalo : " sumaNumDentroIntervalo
	Escribir "Los numeros que están dentro del intervalo : " numDentroIntervalo
	Escribir "Los numeros que están fuera del intervalo : " numFueraIntervalo
	Escribir "Los numeros que es igual a los intervalos : " numIgualIntervalo
	
FinAlgoritmo
