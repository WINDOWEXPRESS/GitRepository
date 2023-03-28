package Ejercicios;

import java.util.Scanner;
import java.util.Vector;

public class HUNDIR_LA_FLOTA {
	// Declarar variables
	static final char AGUA = 'A';
	static final char AGUA_NO_TOCADO = '·';
	static final char TOCADO = 'X';
	static final int TAMANNIO = 10;
	// Crear instancia de la clase Scanner.
	Scanner dato = new Scanner(System.in);

	public static void main(String[] args) {
		// Declarar variables
		int vidaOrdenador = 24;
		int vidaJugador = 24;
		boolean juegoTerminado = false;
		boolean tiroCorrecto = false;
		char[][] mapaUsuario = new char[TAMANNIO][TAMANNIO];
		char[][] mapaOrdenador = new char[TAMANNIO][TAMANNIO];
		char[][] mapaOrdenadorParaUsuario = new char[TAMANNIO][TAMANNIO];

		inicializacionMapa(mapaUsuario);
		registraBarcos(mapaUsuario);
		// do {

		// }while(juegoTerminado);

	}

	public static void inicializacionMapa(char[][] posicion) {
		for (int i = 0; i < posicion.length; i++) {
			for (int j = 0; j < posicion[i].length; j++) {
				posicion[i][j] = AGUA_NO_TOCADO;
			}
		}
		// funcion para visualizar
		/*
		 * for(char[]x : posicion) { for(char j : x) { System.out.print(j+"\t"); }
		 * System.out.println(); }
		 */

	}

	public static void registraBarcos(char[][] mapa) {
		// variables
		boolean finColocarTodosBarcos = false;
		boolean finColocarUnBarcos = false;

		// vector de los barcos
		Vector<Integer> vectorBarcos = new Vector();
		vectorBarcos.add(5);
		vectorBarcos.add(5);
		vectorBarcos.add(3);
		vectorBarcos.add(3);
		vectorBarcos.add(3);
		vectorBarcos.add(1);
		vectorBarcos.add(1);
		vectorBarcos.add(1);
		vectorBarcos.add(1);
		vectorBarcos.add(1);
		Vector<Character> vectorDirecciones = new Vector();
		vectorDirecciones.add('V');
		vectorDirecciones.add('H');

		// while(!finColocarTodosBarcos) {
		for (int i = 0; i < vectorBarcos.size(); i++) {
			// while(!finColocarUnBarcos) {
			int filaAleatorio = (int) (Math.random() * 10);
			int columnaAleatorio = (int) (Math.random() * 10);
			char direccionAleatorio = vectorDirecciones.elementAt((int) (Math.round(Math.random())));
			
			posocionarBarcos(mapa, vectorBarcos.elementAt(i), filaAleatorio, columnaAleatorio,direccionAleatorio);

			// }

		}

		// }

	}

	public static void posocionarBarcos(char[][] mapa, int vectorBarcos, int x, int y, char vectorDirecciones) {
		int numBarcos = vectorBarcos;
		boolean ejeSinBarcos = false;
		char value_char = (char) (vectorBarcos + '0');
		if (vectorDirecciones == 'V' && x + (vectorBarcos) <= TAMANNIO - 1) {
			// Para saber si el eje hay barco o no.
			for (int i = x; i < mapa.length; i++) {
				for (int j = y; j <= y; j++) {
					if (mapa[i][j] != AGUA_NO_TOCADO) {
						ejeSinBarcos = true;
					}
				}
			}
			if (ejeSinBarcos == false) {
				for (int i = x; i < mapa.length; i++) {
					for (int j = y; j <= y; j++) {
						// No conseguir convertir int a char guardando numero original
						mapa[i][j] = value_char;
						numBarcos--;
						if (numBarcos == 0) {
							break;
						}
					}
				}
				for (char[] a : mapa) {
					for (char j : a) {
						System.out.print(j + "\t");
					}
					System.out.println();
				}
			}

		}

	}

}
