package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class P_5_1_7 {
	public static void main(String[] args) {
		// Crear variables
		int[] TB_NUM = new int[100];
		int num ;
		
		//Crear ojb de la clase Scanner
		Scanner dato = new Scanner(System.in);
		
		//asignar valor aleatorio
		for(int i = 0; i<TB_NUM.length;i++) {
			TB_NUM[i]=(int) (Math.random()*100);
		}
		//ordenar arrays
		for (int i = 0; i < TB_NUM.length - 1; i++) {
            for (int j = 0; j < TB_NUM.length - i - 1; j++) {
                if (TB_NUM[j] > TB_NUM[j+1]) {
                    // cambiar TB_NUM[j] con TB_NUM[j+1]:
                    int tmp = TB_NUM[j];
                    TB_NUM[j] = TB_NUM[j+1];
                    TB_NUM[j+1] = tmp;
                }
            }
        }
		//Visualizar TB_NUM
		//System.out.println(Arrays.toString(TB_NUM));
		visualizarTabla(TB_NUM);
		
		do {
			System.out.println("Introducir un numero para intercalar: ");
			num =dato.nextInt() ;	
		}while(num<TB_NUM[0] || num > TB_NUM[TB_NUM.length-1]);
		
		//Intercalar el numero dentro de arrays
		for(int i = 0; i<TB_NUM.length;i++) {
			if(num < TB_NUM[i]) {
				System.out.println("Posicion :"+TB_NUM[i]);
				TB_NUM[i] = num;
				break;
			}
		}
		visualizarTabla(TB_NUM);
	}
	public static void visualizarTabla(int[] tabla) {
		int cont = 0;
		for(int x : tabla) {
			System.out.print(x+"\t");
			cont++;
			if(cont==10) {
				System.out.println();
				cont = 0;
			}
		}
	}
}
