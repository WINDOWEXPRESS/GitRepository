Algoritmo Practica2_2_10
	//entorno
	Definir num1 como real;
	Definir num2 como real;
	Definir num3 como real;
	Definir num4 como real;
	Definir num5 como real;
	Definir numMenor como real;
	
	//programacion
	Escribir "Escriba el primer numero:";
	Leer num1;
	Escribir "Escriba el segundo numero:";
	Leer num2;
	Escribir "Escriba el tercer numero:";
	Leer num3;
	Escribir "Escriba el cuarto numero:";
	Leer num4;
	Escribir "Escriba el quinto numero:";
	Leer num5;
	
	numMenor<-num1
	Si num2<numMenor Entonces
		numMenor<-num2
	Fin Si
	Si num3<numMenor Entonces
		numMenor<-num3
	Fin Si
	Si num4<numMenor Entonces
		numMenor<-num4
	Fin Si
	Si num5<numMenor Entonces
		numMenor<-num5
	Fin Si
	Escribir "el menor numero es:",numMenor;
	
FinAlgoritmo