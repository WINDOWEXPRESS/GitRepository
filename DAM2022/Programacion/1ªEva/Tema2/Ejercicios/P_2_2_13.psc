Algoritmo P_2_2_13
	//Entorno
	Definir horaSalida Como Entero
	Definir minSalida Como Entero
	Definir segSalida Como Entero
	Definir tiempoSegLlegada Como Entero
	Definir segLlegada Como Entero
	Definir minLlegada Como Entero
	Definir horaLlegada Como Entero
	//horaSalida = -1
	//minSalida = -1
	//segSalida = -1
	
	//Entrada
		//Captar hora de salida
	//Mientras (horaSalida<0 | horaSalida>=24) & (minSalida<0 | minSalida>=60) & (segSalida<0 | segSalida>=60) Hacer
		Escribir "Parte de una ciudad A a las HH horas, MM minutos y SS segundos"
		Escribir "Horas : "
		Leer horaSalida
		Escribir "Minutos : "
		Leer minSalida
		Escribir "Segundos : "
		Leer segSalida
		//Captar llegada
		Escribir "Segundos de llegada :"
		Leer tiempoSegLlegada
	//Fin Mientras
		
	//Proceso 
	salidaEnSeg = salidaEnSeg + 3600 * horaSalida + 60 * minSalida + segSalida + tiempoSegLlegada

	horaLlegada = trunc(salidaEnSeg / 3600)
	Si horaLlegada>=24 Entonces
		horaLlegada = horaLlegada - 24
	Fin Si
	salidaEnSeg = salidaEnSeg mod 3600
	minLlegada = trunc (salidaEnSeg / 60 )
	salidaEnSeg = salidaEnSeg mod 60 
	segLlegada = salidaEnSeg 
		
	//Salida
	Escribir "La hora de llegada es " horaLlegada "H " minLlegada "M " segLlegada "S."
	
FinAlgoritmo
