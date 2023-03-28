Algoritmo Practica2_2_10
	//Entorno
	Definir num1,num2,num3,num4,num5 como real;
	//Proceso
	Escribir "Introduzca el primer número";
	Leer num1;
	Escribir "Introduzca el segundo número";
	Leer num2;
	Escribir "Introduzca el tercer número";
	Leer num3;
	Escribir "Introduzca el cuarto número";
	Leer num4;
	Escribir "Introduzca el quinto número";
	Leer num5;
	
	Si num1 <= num2 y num1 <= num3 y num1 <= num4 y num1 <= num5 Entonces
		Escribir "El menor de los números ingresados es ",num1;
	SiNo
		Si  num2 <= num3 y num2 <= num4 y num2 <= num5 Entonces
			Escribir "El menor de los números ingresados es ",num2;
		SiNo
			Si num3 <= num4 y num3 <= num5 Entonces
				Escribir "El menor de los números ingresados es ",num3;
			SiNo
				Si num4 <= num1 y num4 <= num2 y num4 <= num3 y num4 <= num5 Entonces
					Escribir "El menor de los números ingresados es ",num4;
				SiNo
					Escribir "El menor de los números ingresados es ",num5;
				Fin Si
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo