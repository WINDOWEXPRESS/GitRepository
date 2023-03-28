// Capturar el nombre de un alumno y las calificaciones de tres evaluaciones
// Calcula y muestra su nota media 

Algoritmo P_2_2_1_NombreNotas
	//Entorno
	Definir nombre como cadena;
	Definir Nota1, Nota2, Nota3 como entero;
	Definir NotaF como real;
	
	//Entrada de datos
	Escribir "Dame tu nombre";
	Leer nombre;
	
	//PRoceso
	Escribir "Dime la primera nota";
	Leer Nota1;
	
	Escribir "Dime la segunda nota";
	Leer Nota2;
	
	Escribir "Dime la tercera nota";
	Leer Nota3;
	
	NotaF <- (nota1+nota2+nota3)/3;
	
	//Salida de datos
	Escribir "La nota media de ", nombre, " es: ", NotaF;
FinAlgoritmo
