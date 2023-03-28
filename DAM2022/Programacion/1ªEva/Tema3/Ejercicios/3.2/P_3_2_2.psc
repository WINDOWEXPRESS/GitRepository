Algoritmo P_3_2_2
	//Entorno
	Definir  nombre Como Caracter
	Definir  nota1,nota2,nota3 Como Real
	Definir  media Como Real
	Definir  mediaGrupo Como Real
	//Proceso 
	Para i<-1 Hasta 5 Con Paso 1 Hacer
		
		Escribir "Introduzca nombre del alumn@:"
		Leer nombre
		Escribir "Introduzca su nota de 1º Evaluacion:"
		Leer nota1
		Escribir "Introduzca su nota de 2º Evaluacion:"
		Leer nota2
		Escribir "Introduzca su nota de 3º Evaluacion:"
		Leer nota3
		
		//calculo de la nota media
		media = (nota1 + nota2 + nota3)/3
		
		//Salida
		Escribir "La nota media de " nombre " es " media
		mediaGrupo <- mediaGrupo + media
	Fin Para
	Escribir "La media de grupo es : " mediaGrupo / i
FinAlgoritmo

