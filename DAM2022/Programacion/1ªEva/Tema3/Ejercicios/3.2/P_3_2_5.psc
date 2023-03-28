Algoritmo P_3_2_5
	// Entorno
	Definir nombre Como Caracter
	Definir sueldoBruto Como Real
	Definir sueldoNeto Como Real
	Definir Irpf Como Real
	Definir seguridadSocial Como Real
	Definir dineroTotalBruto Como Real
	Definir salirBucle Como Entero
	dineroTotalBruto <- 0
	// Proceso 
	Mientras salirBucle <> 2 Hacer
		sueldoBruto = 0
		sueldoNeto = 0
		Irpf <- 12/100
		seguridadSocial <- 5.20/100
		resp = 0
		Escribir 'Introduzca su nombre : ' Sin Saltar
		Leer nombre
		Mientras sueldoBruto<=0 Hacer
			Escribir 'Introduzca su sueldo bruto :' Sin Saltar
			Leer sueldoBruto
			Si sueldoBruto<=0 Entonces
				Escribir 'El sueldo introducido no debe ser negativo.'
			FinSi
		FinMientras
		// Operacion
		// Empreado
		Irpf <- Irpf*sueldoBruto
		seguridadSocial <- sueldoBruto*seguridadSocial
		sueldoNeto <- sueldoBruto-Irpf-seguridadSocial
		// Empresa
		dineroTotalBruto <- dineroTotalBruto+sueldoBruto
		// Mostrar 
		Escribir 'El sueldo neto de ',nombre,' es ',sueldoNeto,' euros.'
		Escribir 'El estado ha recaudado ',Irpf,' euros de I.R.P.F y ',seguridadSocial,' euros de S.S.'
		// continuar o no
		Mientras salirBucle<>1 y salirBucle <> 2 Hacer
			Escribir 'Deseas continuar?'
			Escribir '1.SI'
			Escribir '2.NO'
			Leer salirBucle
		FinMientras
	FinMientras
	
	Escribir 'La empresa tiene que pagar ',dineroTotalBruto,' de sueldo bruto de los empreados.'
FinAlgoritmo
