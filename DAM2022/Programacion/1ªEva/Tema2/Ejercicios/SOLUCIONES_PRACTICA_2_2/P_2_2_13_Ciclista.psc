//Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos.
//El tiempo de viaje hasta llegar a otra ciudad B es de T segundos. 
//Escribir un algoritmo que determine la hora de llegada a la ciudad B. 

Proceso P_2_2_13_Ciclista
	//Entorno
	Definir segTotales,hhSalida, mmSalida, ssSalida,segDuracion como entero;
	Definir hhLlegada, mmLlegada, ssLlegada como entero;
	//Entrada de datos
	
	Escribir sin saltar "Introduzca la hora de salida : ";
	Leer hhSalida;
	Escribir sin saltar "Introduzca los minutos de salida : ";
	Leer mmSalida;
	Escribir sin saltar "Introduzca los segundos de salida : ";
	Leer ssSalida;
	
	Escribir sin saltar "¿Cúantos seguntos tarda en hacer el trayecto? : ";
	Leer segDuracion;
	
	//Proceso
	//Convertir la hora de salida a segundos
	segTotales<-hhSalida*3600+mmSalida*60+ssSalida+segDuracion;
	
	//Convertir segTotales a mm:ss
	mmLlegada<-trunc(segTotales/60);
	ssLlegada<-segTotales%60;
	
	//Convertir mmLlegada a hh:mm
	hhLlegada<-trunc(mmLlegada/60);
	mmLlegada<-mmLlegada%60;
		
	//Salida de datos
	Escribir " El ciclista llegará a las ",hhLlegada,":",mmLlegada,":",ssLlegada;

FinProceso
