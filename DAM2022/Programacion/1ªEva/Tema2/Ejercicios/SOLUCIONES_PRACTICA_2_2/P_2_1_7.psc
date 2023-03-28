Algoritmo FACTURA
	Definir PrecioUni Como Real
	Definir NumUnidades Como entero
	Definir PrecioBruto Como real
	Definir ImporteVenta como real
	Definir PrecioFinal como real
	Definir Iva como real
	Definir nombre como cadena 
	
	Escribir "FACTURA DE VENTA DE ARTÍCULOS"
	Escribir "============================="
	
	Escribir " Nombre de articulo "
	Leer nombre
	Escribir "Introduzca precio del articulo sin IVA "
	leer PrecioUni
	Escribir "Numero de unidades "
	leer NumUnidades
	
	ImporteVenta <- PrecioUni*NumUnidades
	Iva <- ImporteVenta*0.19
	
	Escribir "Iva ........." Iva
	PrecioBruto <- ImporteVenta + Iva
	Escribir "El Precio Bruto de la venta es : " PrecioBruto
	
	// PrecioBruto <- ImporteVenta + ImporteVenta*19/100
	
	Si PrecioBruto<13000 Entonces
		Escribir "El precio final es; " PrecioBruto
	SiNo
		PrecioFinal <- PrecioBruto*0.95
		Escribir "El precio aplicando el IVA y el 5% de descuento es: " PrecioFinal
		
	Fin Si
FinAlgoritmo
