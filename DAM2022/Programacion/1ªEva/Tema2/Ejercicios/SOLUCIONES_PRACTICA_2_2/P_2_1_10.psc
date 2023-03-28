Algoritmo eje_10
	Definir v1,v2,v3,v4,v5, minimo Como Real
	Escribir 'Introduce el primer número'
	Leer v1
	Escribir 'Introduce el segundo número'
	Leer v2
	Escribir 'Introduce el tercer número'
	Leer v3
	Escribir 'Introduce el cuarto número'
	Leer v4
	Escribir 'Introduce el quinto número'
	Leer v5
	
	minimo <-v1
	
	Si v2 < minimo Entonces
		minimo<-v2
	Fin Si
	Si v3 < minimo Entonces
		minimo<-v3
	Fin Si
	Si v4<minimo Entonces
		minimo<-v4
	Fin Si
	Si v5<minimo Entonces
		minimo<-v5
	Fin Si
	
	Escribir "El número menor de todos es: ",minimo
	
	
	
FinAlgoritmo

