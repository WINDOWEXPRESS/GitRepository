Algoritmo Practica_2_2_11
	Definir num1, num2, num3, numMenor, numMedio, numMayor Como Real;
	
	Escribir "Introduce primer numero";
	Leer num1;
	Escribir "Introduce segundo numero";
	Leer num2;
	Escribir "Introduce tercero numero";
	Leer num3;
	
	Si num1<=num2 y num1<=num3 Entonces
		numMenor<-num1
	SiNo
		Si num1>=num2 y num1>=num3 Entonces
			numMayor<-num1
		SiNo
			numMedio<-num1
		Fin Si
	Fin Si
	Si num2<=num1 y num2<=num3 Entonces
		numMenor<-num2
	SiNo
		Si num2>=num1 y num2>=num3 Entonces
			numMayor<-num2
		SiNo
			numMedio<-num2
		Fin Si
	Fin Si
	Si num3<=num2 y num3<=num1 Entonces
		numMenor<-num3
	SiNo
		Si num3>=num2 y num3>=num1 Entonces
			numMayor<-num3
		SiNo
			numMedio<-num3
		Fin Si
	Fin Si
	Escribir "Ordenados de mayor a menor ", numMayor,", " numMedio," y " numMenor;
	FinAlgoritmo