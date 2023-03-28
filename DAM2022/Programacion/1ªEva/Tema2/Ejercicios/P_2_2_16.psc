Algoritmo P_2_2_16
	//Entorno
	Definir nDosEuros Como Entero
	Definir nUnEuros Como Entero
	Definir n50Cent Como Entero
	Definir n20Cent Como Entero
	Definir n10Cent Como Entero
	Definir total Como Real
	//Entrada
	Escribir "Monedas de 2 euros : "
	Leer nDosEuros
	Escribir "Monedas de 1 euros :"
	Leer nUnEuros
	Escribir "Monedas de 50 centimos :"
	Leer n50Cent
	Escribir "Monedas de 20 centimos :"
	Leer n20Cent
	Escribir "Monedas de 10 centimos :"
	Leer n10Cent
	//Proceso 
	total = 2*nDosEuros + nUnEuros + 0.5*n50Cent + 0.2*n20Cent + 0.1*n10Cent
	//Salida
	Escribir "Tienes total de : " total " Euros"
FinAlgoritmo
