Algoritmo EJ2
	
	Definir n Como caracter
	Definir s,neto Como Real
	
	Escribir "Escriba el nombre"
	Leer n
	
	Repetir
		
		Escribir "El sueldo bruto de ", n ," es:" 
		Leer s
		
		Si s<= 0 Entonces
			
			Escribir "El sueldo debe ser positivo"
			Escribir "***************************"
			
		SiNo
			
			neto<- s-(s*0.12)-(s*0.052)
			Escribir "El sueldo neto de ", n ," es: ", neto , " euros"
			
			
		Fin Si
		
	Hasta Que s>0
	
FinAlgoritmo
