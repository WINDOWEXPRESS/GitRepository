//algoritmo que nos diga el dinero que tenemos en euros y céntimos 
//después de pedirnos cuantas monedas tenemos de 2 euros, 1 euro, 50 céntimos, 
//20 céntimos y 10 céntimos

Algoritmo P_2_2_16_ContarDinero
	//ENTORNO
	Definir M2,M1,M50,M20,M10 Como Real;
	Definir TotalCentimos Como Real;
	Definir EurosFinales, CentimosFinales Como Real;
		
	//PROCESO
	Escribir sin saltar "introduzca cuantas monedas de dos euros tienes";
	Leer DOSeuro;
	Escribir sin saltar "introduzca cuantas monedas de 1 euro tienes";
	leer euro;
	Escribir sin saltar "introduzca cuantas monedas  50 centimos tienes";
	leer CINQcentimos;
	Escribir sin saltar "introduzca cuantas monedas de 20 centimos tienes";
	Leer VENTcentimos;
	Escribir sin saltar "introduzca cuantas monedas 10 centimos tienes";
	Leer DIEZcentimos;
	//operaciones
	
	DOSeuro<-(200*DOSeuro);
	euro<-(100*euro);
	CINQcentimos<-(50*CINQcentimos);
	VENTcentimos<-(20*VENTcentimos);
	DIEZcentimos<-(10*DIEZcentimos);
	
	CentTOTAL<-(DOSeuro + euro + CINQcentimos + VENTcentimos + DIEZcentimos);
	DineroTE<- (trunc (CentTOTAL/100));
	DineroTC<- (CentTOTAL mod 100);
	
	
	Escribir "EL DINERO TOTAL DE USTED EN CENTIMOS ES DE ", CentTOTAL;
	
	Escribir "el dinero total de usted es de ", DineroTE, " euros y ", DineroTC ," centimos";
	
	
FinAlgoritmo
