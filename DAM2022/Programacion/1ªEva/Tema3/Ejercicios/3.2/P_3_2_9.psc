Algoritmo P_3_2_9
	//Entorno
	Definir num Como Entero
	Definir resp Como Entero
	Definir numErro Como Entero
	Definir salirBucle Como Entero
	
	
	Mientras salirBucle <> 2 Hacer
		//Entrada
		Escribir "Captura por teclado un número y queremos que nos pregunte la tabla de multiplicar de dicho número."
		Escribir "Introduzca el numero:"
		Leer num
		
		//Repetir si tiene dos error
		Repetir
			numErro = 0
			Para i = 1 Hasta 9 Con Paso 1 Hacer
				Escribir i " * " num " = "
				Leer resp
				Si resp = i * num Entonces
					Escribir "Correcto."
				SiNo
					Escribir "Incorrecto."
					Escribir "La respuesta es : " i " * " num " = " i*num
					numErro = numErro + 1
				Fin Si
			Fin Para
			//Mensaje de errores
			Si numErro>=2 Entonces
				Escribir "Tienes " numErro " errores. Si los errores supera a 2 debes volver a intentarlo."
			SiNo
				Escribir "Te has equivocado " numErro " veces."
			Fin Si
			
		Hasta Que numErro <= 2
		
		//Continuar o no
		Mientras salirBucle<>1 y salirBucle <> 2 Hacer
			Escribir 'Deseas continuar?'
			Escribir '1.SI'
			Escribir '2.NO'
			Leer salirBucle
		FinMientras
	
		
	Fin Mientras
	
	
FinAlgoritmo
