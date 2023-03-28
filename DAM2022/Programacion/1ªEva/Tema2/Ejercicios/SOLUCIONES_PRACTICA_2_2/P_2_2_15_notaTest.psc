//Algoritmo para calcular la nota final de un estudiante en un test 
//a partir de las respuestas correctas, incorrectas y en blanco, 
//considerando que, cada respuesta correcta vale 1 punto, cada incorrecta resta 0,25 
//y las respuestas en blanco valen 0

Proceso P_2_2_15_notaTest
	//Entorno
	Definir rCorrectas,rIncorrectas,rBlanco, numPreguntas como entero;
	Definir notaTest como real;
	
	//Entrada de datos
	
	Escribir sin saltar "Introduzca nº de respuestas correctas: ";
	Leer rCorrectas;
	Escribir sin saltar "Introduzca nº de respuestas incorrectas: ";
	Leer rIncorrectas;
	Escribir sin saltar "Introduzca nº de respuestas en blanco: ";
	Leer rBlanco;
	notaTest<-rCorrectas*1;
	notaTest<-rCorrectas*1-rIncorrectas+0.25;
	//Cálculos
	notaTest<-rCorrectas*1-rIncorrectas*0.25+rBlanco*0;
	numPreguntas<-rCorrectas+rIncorrectas+rBlanco;
	
	//Pasar a nota sobre 10
	notaTest<- (notaTest*10)/numPreguntas;
	
	//Salida de datos
	Escribir " LA calificación del test es ",notaTest;

FinProceso
