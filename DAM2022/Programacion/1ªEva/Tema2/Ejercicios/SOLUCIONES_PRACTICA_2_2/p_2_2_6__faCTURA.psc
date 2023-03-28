// Algoritmo que permita emitir la factura correspondiente a una compra de un artículo determinado,
// del que se adquiere una o varias unidades. 
// IVA: 19% 

Algoritmo FACTURA
	//Entorno
	Definir nombre como cadena ;
	Definir PrecioUni Como Real;
	Definir NumUnidades Como entero;
	Definir ImporteFinal Como real;
	Definir ImporteVenta como real;
	Definir Iva como real;
	
	//Entrada de datos
	Escribir "INTRODUZCA DATOS DE  FACTURA";
	Escribir "============================";
	
	Escribir " Nombre de articulo ";
	Leer nombre;
	Escribir "Introduzca precio del articulo sin IVA ";
	leer PrecioUni;
	Escribir "Numero de unidades ";
	leer NumUnidades;
	
	//Proceso
	ImporteVenta <- PrecioUni*NumUnidades;
	Iva <- ImporteVenta*0.19;
	ImporteFinal <- ImporteVenta + Iva;
	//Salida de datos
	
	Escribir "           FACTURA         ";
	Escribir "============================";
	Escribir " ARTÍCULO                    ";
	Escribir "=============================";
	Escribir nombre;
	Escribir "Unidades vendidas:",NumUnidades;
	Escribir "Precio Unitario..:",PrecioUni;
	Escribir "IMPORTE VENTA..................: ",ImporteVenta;
	Escribir "Iva ...........................: " ,Iva;
	
	Escribir "TOTAL FACTURA..................: " ,ImporteFinal;
		
FinAlgoritmo
