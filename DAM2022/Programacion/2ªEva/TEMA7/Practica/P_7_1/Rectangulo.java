package Ejercicios;

public class Rectangulo {
	private int base;
	private int altura;

	public void setBase(int base) {
		this.base = base;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public void pintar() {
		for (int i = 1; i <= altura; i++) {
			for (int j = 1; j <= base; j++) {
				if (i == 1 || i == altura) {//Dibujar las dos lineas de arriba y de abajo
					System.out.print("* ");
				} else if (j == 1 || j == base) {//Dibujar las dos lineas de izquierda y de derecha
					System.out.print("* ");
				} else {
					System.out.print("  ");//Rellenar los huecos del rectangulos
				}

			}
			System.out.println();
		}
	}

	public void pintarSigno(String signo) {
		for (int i = 1; i <= altura; i++) {
			for (int j = 1; j <= base; j++) {
				if (i == 1 || i == altura) {
					System.out.print(signo + " ");
				} else if (j == 1 || j == base) {
					System.out.print(signo + " ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
	}

	public void invertir() {
		for (int i = 1; i <= base; i++) {
			for (int j = 1; j <= altura; j++) {
				if (i == 1 || i == base) {
					System.out.print("* ");
				} else if (j == 1 || j == altura) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
	}

	public void centrarPantalla() {
		int anchoPantalla = 80;
		int altoPantalla = 24;
		int a = 0;
		/*Comprobacion horizontal
		System.out.println("Comprobacion de Centrar pantalla.");
		for (int i = 0; i < anchoPantalla; i++) {
			if (i == anchoPantalla / 2 ||i == anchoPantalla / 2 +1) {//El punto medio de la pantalla
				System.out.print("*");
			} else {
				System.out.print("o");
			}
		}
		System.out.println();
		*/
		
		while (a <= (altoPantalla / 2) - (altura / 2)) {//contar la altura de la pantalla
			System.out.println();
			a++;
		}
		for (int i = 1; i <= altura; i++) {
			int k = 0;
			a++;
			while (k <= (anchoPantalla / 2) - (base)) {//Rellenar hueco para centrar el rectangulo
				System.out.print(" ");
				k++;
			}
			for (int j = 1; j <= base; j++) {

				if (i == 1 || i == altura) {
					System.out.print("* ");
				} else if (j == 1 || j == base) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
		while (a >= (altoPantalla / 2) - (altura / 2) && a < altoPantalla) {//contar la altura de la pantalla
			System.out.println();
			a++;
		}

	}

	public void centrarHorizontal() {
		int anchoPantalla = 80;
		/*Comprobacion horizontal
		System.out.println("Comprobacion de Centrar pantalla.");
		for (int i = 0; i < anchoPantalla; i++) {
			if (i == anchoPantalla / 2 ||i == anchoPantalla / 2 +1) {//El punto medio de la pantalla
				System.out.print("*");
			} else {
				System.out.print("o");
			}
		}
		System.out.println();
		*/
		System.out.println();

		for (int i = 1; i <= altura; i++) {
			int k = 0;
			for (int j = 1; j <= base; j++) {
				while (k <= (anchoPantalla / 2) - (base)) {//Rellenar hueco para centrar el rectangulo
					System.out.print(" ");
					k++;
				}
				if (i == 1 || i == altura) {
					System.out.print("* ");
				} else if (j == 1 || j == base) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}

	}
	
	public int area () {
		
		return altura*base;
		
	}
	public int perimetro () {
		
		return 2*altura+2*base;
		
	}
	
	public static void menu() {
		System.out.println("===================Menu===================");
		System.out.println("=        1.Dibujar el rectángulo         =");
		System.out.println("=        2.Pintar Signo                  =");
		System.out.println("=        3.Invertir el rectángulo        =");
		System.out.println("=        4.Centrar horizontal            =");
		System.out.println("=        5.Centrar pantalla              =");
		System.out.println("=        6.Area del rectángulo           =");
		System.out.println("=        7.Perimetro del rectángulo      =");
		System.out.println("=        8.Terminar                      =");
		System.out.println("==========================================");
	}

}
