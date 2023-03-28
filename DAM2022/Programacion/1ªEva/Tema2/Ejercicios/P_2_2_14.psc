Algoritmo P_2_2_14
	//Entorno
	Definir nombre Como Caracter
	Definir apellidoPrimero Como Caracter
	Definir apellidoSegundo Como Caracter
	//Entrada
	Escribir "Dame tu nombre:"
	Leer nombre
	Escribir "Dame tu apellido primero:"
	Leer apellidoPrimero
	Escribir "Dale t apellido segundo:"
	Leer apellidoSegundo
	//Proceso 
	nombre = Minusculas(nombre)
	nombre = Mayusculas(SubCadena(nombre,0,1)) + SubCadena(nombre,2,99)
	apellidoPrimero = Minusculas(apellidoPrimero)
	apellidoPrimero = Mayusculas(SubCadena(apellidoPrimero,0,1))
	apellidoSegundo = Mayusculas(SubCadena(apellidoSegundo,0,1))
	
	//Salida
	Escribir "Los iniciales de su apellidos es : " nombre "." apellidoPrimero "." apellidoSegundo 
FinAlgoritmo

