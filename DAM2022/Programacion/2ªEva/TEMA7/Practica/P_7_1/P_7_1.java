package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P_7_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//Crear variables locales
		int altura;
		int base;
		int opc = 0;
		String signo = "";
		
		//Instanciar la clase rectangulo 
		Rectangulo rect = new Rectangulo();
		//invocar bufferedReader para capturar datos por teclado
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Introducir la altura de la rectangulo.");
		altura = Integer.parseInt(r.readLine());
		System.out.println("Introducir la base de la rectangulo.");
		base = Integer.parseInt(r.readLine());
		
		//Asigne los valores a los atributos de la instancia rect
		rect.setAltura(altura);
		rect.setBase(base);
		
		while(opc != 8){
			Rectangulo.menu();
			opc = Integer.parseInt(r.readLine());
			switch (opc){
			case 1 : 
				rect.pintar();
				break;
			case 2 : 
				System.out.println("Cambiar el carácter para dibujar el rectangulo.");
				signo = r.readLine();
				rect.pintarSigno(signo);
				break;
			case 3 : 
				rect.invertir();
				break;
			case 4 : 
				rect.centrarHorizontal();
				break;
			case 5 : 
				rect.centrarPantalla();
				break;
			case 6 : 
				System.out.println("La area es : "+rect.area());
				break;
			case 7 : 
				System.out.println("El perimetro es : "+rect.perimetro());
				break;
			case 8 : 
				break;
				
			}
		}
	}
}
