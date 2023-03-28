package Ejercicios;

import javax.swing.JOptionPane;

public class P_5_1_1 {

	public static void main(String[] args) {
		// Variables
		int max ;
		int contador = 0;
		int[] array = new int[10];
		
		//capturar datos y guardar en array
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(JOptionPane.showInputDialog("Introducir"+(i+1)+" numeros para 10 elementos:"));
		}
		
		max = array[0];
		for(int x: array) {
			if(x>max)
				max = x;
		}
		for(int x: array) {
			if(x==max)
				contador++;
		}
		System.out.println("El valor mayor es "+max+" se ha repetido "+ contador+" veces.");
		JOptionPane.showMessageDialog(null, "El valor mayor es "+max+" se ha repetido "+ contador+" veces.");
	}

}
