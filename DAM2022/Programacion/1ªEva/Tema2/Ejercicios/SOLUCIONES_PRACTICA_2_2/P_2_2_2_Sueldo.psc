//	Vas a capturar el nombre de una persona y el sueldo bruto que va a cobrar.
//  Calcular el sueldo neto de dicha persona

Algoritmo P_2_2_2_Sueldo
	//Entorno
	Definir nombre Como caracter;
	Definir sueldoBruto,sueldoNeto Como Real;
	
	//Entrada de datos y proceso
	Escribir "Escriba el nombre";
	Leer nombre;
	
	
		
	Escribir "El sueldo bruto de ", nombre ," es:" ;
	Leer sueldoBruto;
	
	sueldoNeto<- sueldoBruto-(sueldoBruto*0.12)-(sueldoBruto*0.052);
	
	Escribir "El sueldo neto de ", nombre," es: ", sueldoNeto , " euros";	
	
FinAlgoritmo
