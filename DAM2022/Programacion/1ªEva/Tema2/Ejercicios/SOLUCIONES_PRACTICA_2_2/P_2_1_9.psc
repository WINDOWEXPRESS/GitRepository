Algoritmo eje_9
	definir pies,pulgadas,yardas,metros,millas como reales

	Escribir "Introduce el numero de pies que deseas convertir a otras unidades de medida"
	Leer pies
	
	pulgadas<-pies*12
	yardas<-pies/3
	metros<-pulgadas*0.0254
	millas<-metros/1609
	
	Escribir ,pies," pies equivalen a: ",pulgadas," pulgadas "
	Escribir ,pies," pies equivalen a: ",yardas," yardas "
	Escribir ,pies," pies equivalen a: ",metros," metros "
	Escribir ,pies," pies equivalen a: ",millas," millas "
	
	
	
	
	
FinAlgoritmo
