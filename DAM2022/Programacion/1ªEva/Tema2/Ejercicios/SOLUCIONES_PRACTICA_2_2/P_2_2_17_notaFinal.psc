//Un alumno desea saber cuál será su calificación final en la materia de Algoritmos.
//Dicha calificación se compone de los siguientes porcentajes:
//55% del promedio de sus tres calificaciones parciales
//30% de la calificación del examen final
//15% calificación del trabajo final

Proceso P_2_2_17_notaFinal
	//Entorno
	Definir nEv1,nEv2,nEv3,nTrabajo,nExaFinal como real;
	Definir notaFinalCurso como entero;
	
	//Entrada de datos
	
	Escribir sin saltar "Introduzca nota de 1ª Evaluación: ";
	Leer nEv1;
	Escribir sin saltar "Introduzca nota de 2ª Evaluación: ";
	Leer nEv2;
	Escribir sin saltar "Introduzca nota de 3ª Evaluación: ";
	Leer nEv3;
	Escribir sin saltar "Introduzca nota de Trabajo Final: ";
	Leer nTrabajo;
	Escribir sin saltar "Introduzca nota de Examen Final: ";
	Leer nExaFinal;
	
	//Cálculos
	notaFinalCurso<-redon((nEv1+nEv2+nEv3)/3*0.55+nTrabajo*0.15+nExaFinal*0.30);
	
	//Salida de datos
	Escribir " LA calificación Final de curso es ",notaFinalCurso;

FinProceso
