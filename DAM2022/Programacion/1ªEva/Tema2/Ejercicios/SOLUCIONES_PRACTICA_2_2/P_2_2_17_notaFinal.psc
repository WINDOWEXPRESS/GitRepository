//Un alumno desea saber cu�l ser� su calificaci�n final en la materia de Algoritmos.
//Dicha calificaci�n se compone de los siguientes porcentajes:
//55% del promedio de sus tres calificaciones parciales
//30% de la calificaci�n del examen final
//15% calificaci�n del trabajo final

Proceso P_2_2_17_notaFinal
	//Entorno
	Definir nEv1,nEv2,nEv3,nTrabajo,nExaFinal como real;
	Definir notaFinalCurso como entero;
	
	//Entrada de datos
	
	Escribir sin saltar "Introduzca nota de 1� Evaluaci�n: ";
	Leer nEv1;
	Escribir sin saltar "Introduzca nota de 2� Evaluaci�n: ";
	Leer nEv2;
	Escribir sin saltar "Introduzca nota de 3� Evaluaci�n: ";
	Leer nEv3;
	Escribir sin saltar "Introduzca nota de Trabajo Final: ";
	Leer nTrabajo;
	Escribir sin saltar "Introduzca nota de Examen Final: ";
	Leer nExaFinal;
	
	//C�lculos
	notaFinalCurso<-redon((nEv1+nEv2+nEv3)/3*0.55+nTrabajo*0.15+nExaFinal*0.30);
	
	//Salida de datos
	Escribir " LA calificaci�n Final de curso es ",notaFinalCurso;

FinProceso
