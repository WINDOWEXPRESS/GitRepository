Algoritmo P_2_2_8
	//Entorno
	Definir opc Como Real
	Definir undPies Como Real
	
	//Proceso 
	Escribir "========Menu======="
	Escribir "1.Pasar Pies a Pulgadas"
	Escribir "2.Pasar Pies a Yardas"
	Escribir "3.Pasar Pies a Metros"
	Escribir "4.Pasar Pies a Millas"
	Leer opc
	Escribir "Numeros de pies :"
	Leer undPies
	
	//Salida
	Segun opc Hacer
		Opcion 1:
			undPies = undPies * 12
			Escribir undPies "pulgadas"
		opcion 2:
			undPies = undPies /3
			Escribir undPies "yardas"
		opcion 3:
			undPies = undPies * 12 * 0.0254
			Escribir undPies "metros"
		De Otro Modo:
			undPies = undPies * 12 *0.0254 / 1609
			Escribir undPies "milla"
	Fin Segun
FinAlgoritmo
