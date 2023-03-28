package Ejercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class P_5_2_2v1 {
	private static Scanner sc = new Scanner(System.in);
	private static final String[] PRODUCTO = { "AGUA", "REFRESCO", "ZUMO" };
	private static final int[] PRECIO = { 50, 75, 95, 0 };
	private static int[] cant_Monedas = { 20, 20, 20, 20, 0, 20 };
	private static int[] tipo_Monedas = { 200, 100, 50, 20, 10, 5 };
	private static int importe = 0;
	private static int cambio = 0;
	private static int opc = 0;

	public static void main(String[] args) {
		while (opc != 4) {
			opc = 0;
			importe = 0;
			while (opc < 1 || opc > 4) {
				menu();
			}
			if (opc != 4) {
				JOptionPane.showMessageDialog(null,"Introducir el valor de cada moneda expresada en centimos (0 para terminar). \nMaquina no acepta monedas de 2 cts y 1 cts.");
				importeIntroducido(PRECIO[opc - 1]);
			}
			cambio = importeIntroducido(PRECIO[opc - 1]) - PRECIO[opc - 1];
			monedaDevuelto(cambio);
		}
		visualizarCantidadMoneda();
	}

	public static void visualizarCantidadMoneda() {
		System.out.println("==============================================");
		for (int i = 0; i < tipo_Monedas.length; i++) {
			System.out.printf("Monedas total de %.2f euro: %d \n", (tipo_Monedas[i] / 100.0), cant_Monedas[i]);
		}
	}

	private static void aumentarCantMonedaIntroducido(int valorMoneda) {
		for (int i = 0; i < tipo_Monedas.length; i++) {
			if (valorMoneda == tipo_Monedas[i]) {
				cant_Monedas[i] += 1;
			}
		}
	}

	private static void monedaDevuelto(int cambio) {
		for (int i = 0; i < tipo_Monedas.length; i++) {
			if (cambio >= tipo_Monedas[i] && cant_Monedas[i] != 0) {
				System.out.println("Monedas de " + (tipo_Monedas[i] / 100.0) + " euros: " + cambio / tipo_Monedas[i]);
				cambio %= tipo_Monedas[i];
				cant_Monedas[i] -= cambio / tipo_Monedas[i];
			}
		}
	}

	private static boolean isImporteIntroducido_tipoMonedas(int valorMoneda) {
		for (int i = 0; i < tipo_Monedas.length; i++) {
			if (valorMoneda == tipo_Monedas[i]) {
				return true;
			}
		}
		return false;
	}

	private static int importeIntroducido(int precio) {
		int valorMoneda = 1;
		if (intro_Impor_Exacto()) {
			if (cant_Monedas[5] == 0) {//si cantidad de 5 cents esta a 0
				JOptionPane.showMessageDialog(null, "Solo acepta valor de 5 cts.");
				while (importe < precio) {
					do {
						valorMoneda = Integer.parseInt(JOptionPane.showInputDialog(
								"Precio:" + (precio / 100.0) + " euros\n Pendiente:" + ((precio - importe) / 100.0)));
						if (valorMoneda != 5) {
							JOptionPane.showMessageDialog(null, "Error!");
						}
					} while (valorMoneda != 5);
					aumentarCantMonedaIntroducido(valorMoneda);
					importe += valorMoneda;
				}
			}else if (cant_Monedas[4] == 0) {//si cantidad de 10 cents esta a 0
				JOptionPane.showMessageDialog(null,"INTRODUZCA IMPORTE EXACTO ");
				while (importe < precio) {
					do {
						valorMoneda = Integer.parseInt(JOptionPane.showInputDialog(
								"Precio:" + (precio / 100.0) + " euros\n Pendiente:" + ((precio - importe) / 100.0)));
					} while (valorMoneda < precio);
					if(valorMoneda > precio) {
						JOptionPane.showMessageDialog(null,"IMPORTE NO EXACTO!!!");
						System.exit(1);
					}
					aumentarCantMonedaIntroducido(valorMoneda);
					importe += valorMoneda;
				}
			}
			
		} else {
			// bucle para obtener importe introducido
			while (importe < precio) {
				// obtener importe
				do {
					valorMoneda = Integer.parseInt(JOptionPane.showInputDialog(
							"Precio:" + (precio / 100.0) + " euros\n Pendiente:" + ((precio - importe) / 100.0)));
					if (!isImporteIntroducido_tipoMonedas(valorMoneda)) {
						JOptionPane.showMessageDialog(null,
								"Valor introducido incorrecto por favor vuelve a introducirlo.");
					}
				} while (!isImporteIntroducido_tipoMonedas(valorMoneda));
				aumentarCantMonedaIntroducido(valorMoneda);

				importe += valorMoneda;
			}
		}
		return importe;
	}

	private static boolean intro_Impor_Exacto() {
		if (cant_Monedas[cant_Monedas.length - 1] == 0) {
			return true;
		}
		if (cant_Monedas[cant_Monedas.length - 2] == 0) {
			return true;
		}
		return false;
	}

	public static void menu() {
		String resp;
		resp = (JOptionPane.showInputDialog(
				"Introduzca una opcion valida\nLISTA DE PRODUCTOS\n1-Agua\n2-Refresco\n3-Zumo\n4-Salir\nElija la opcion"));
		 if(resp == null || resp.equals("")) {
			 JOptionPane.showMessageDialog(null, "La operacion ha sido cancelada");
		 	 System.exit (1);}
		 else {
			 opc = Integer.parseInt(resp);
		 }
	}
}
