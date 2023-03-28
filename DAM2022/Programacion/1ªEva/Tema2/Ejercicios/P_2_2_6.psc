Algoritmo P_2_2_6
	//Entorno
	Definir articulo Como Caracter
	Definir precio Como Real
	Definir unidad Como Entero
	Definir precioFinal Como Real
	Definir precioBruto Como Real
	Definir iva Como Real
	iva = 19/100
	
	//Proceso
	Escribir "Introduzca nombre del articulo:"
	Leer articulo
	Escribir "El precio unidad:"
	Leer  precio
	Escribir "Nº de unidades:"
	Leer unidad
	
	//Calculo
	iva = precio * unidad * iva
	precioBruto = precio * unidad
	precioFinal = precioBruto + iva
	
	//Salida
	Escribir "=========Factura========"
	Escribir "Articulo ----------- " articulo
	Escribir "Precio ------------- " precio 
	Escribir "Unidad ------------- " unidad 
	Escribir "IVA ---------------- " iva
	Escribir "PrecioBruto -------- " precioBruto 
	Escribir "Precio final ------- " precioFinal
	
	
FinAlgoritmo
