Algoritmo P_2_2_2
	//Entorno
	Definir nombre Como Caracter
	Definir sueldoBruto Como Real
	Definir sueldoNeto Como Real
	Definir Irpf Como Real
	Definir seguridadSocial Como Real
	Irpf = 12/100
	seguridadSocial = 5.20/100
	
	//Proceso 
	Escribir "Introduzca su nombre : "
	Leer nombre 
	Escribir "Introduzca su sueldo bruto :"
	Leer sueldoBruto
		//Operacion
	Irpf = Irpf * sueldoBruto
	seguridadSocial = sueldoBruto * seguridadSocial
	sueldoNeto = sueldoBruto - Irpf - seguridadSocial
	
	//Salida
	Escribir "El sueldo neto de " nombre " es " sueldoNeto " euros."
FinAlgoritmo
