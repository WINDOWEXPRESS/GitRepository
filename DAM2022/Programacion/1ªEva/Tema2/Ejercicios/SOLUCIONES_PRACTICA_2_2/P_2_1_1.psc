Funcion variable_de_retorno <- Nombre ( Argumentos )
	
Fin Funcion

Algoritmo NombreNotas
	Definir Persona como cadena
	Definir Nota1, Nota2, Nota3 como entero
	Definir NotaF como real
	
	Escribir "Dame tu nombre"
	Leer Persona
	
	Escribir "Dime la primera nota"
	Leer Nota1
	
	Escribir "Dime la segunda nota"
	Leer Nota2
	
	Escribir "Dime la tercera nota"
	Leer Nota3
	
	NotaF <- (nota1+nota2+nota3)/3
	Escribir "La nota media de ", persona " es: ", NotaF
FinAlgoritmo
