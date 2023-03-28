Algoritmo P_2_2_12
	//Entorno
	Definir min Como Entero
	Definir hora Como Entero
	hora = 60
	Definir vecesHoras Como Entero
	//Entrada
	Escribir "Realiza el algoritmo de un programa que reciba una cantidad de minutos y muestre por pantalla cuántas horas y minutos son."
	Escribir "Cantidad de minutos : "
	Leer min
	
	//Proceso Salida
	Si min<60 Entonces
		Escribir "0 Horas y " min " minutos"
	SiNo
		vecesHoras = trunc(min / hora)
		min = min - hora * vecesHoras
		
		Escribir vecesHoras " Horas y " min " minutos"
	Fin Si	
	
FinAlgoritmo

