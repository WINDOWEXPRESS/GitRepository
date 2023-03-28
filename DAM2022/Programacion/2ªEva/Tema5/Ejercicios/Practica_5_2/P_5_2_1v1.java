package Ejercicios;

import java.util.Arrays;

public class P_5_2_1 {
    public static void main(String[] args) {
        int[][] bonoloto = new int[4][6];
        boolean existente = false;
        //Guardar datos aleatorios en arrays
        for (int i = 0; i < bonoloto.length; i++) {
            for (int j = 0; j < bonoloto[i].length; j++) {
             	bonoloto[i][j] = (int) (Math.random() * 99 + 1);
            	existente = existencia(bonoloto[i][j], bonoloto, i , j);
            	while(existente == true && j != 0) {
            		 bonoloto[i][j] = (int) (Math.random() * 99 + 1);
            		existente = existencia(bonoloto[i][j], bonoloto, i , j);	 
            	}
            }
            Arrays.sort(bonoloto[i]);
        }
        //Buscar si hay repeticiones si hay cambiar ------- sigue pudiendo haber repetido
       /* for (int k = 0; k < bonoloto.length; k++) {
            for (int l = 0; l < bonoloto[k].length; l++) {
                try {
                    if (l != bonoloto[k].length && bonoloto[k][l] == bonoloto[k][l + 1]) {
                        System.out.println("Numero igual " + bonoloto[k][l]);
                        bonoloto[k][l] = (int) (Math.random() * 99 + 1);
                    }
                //Lanza excepcion por que la comparacion supera al tamano de arrays
                } catch (Exception x) {
                }
            }
            //Arrays.sort(bonoloto[k]);
        }*/

        for (int[] x : bonoloto
        ) {
            for (int y : x
            ) {
                System.out.print(y + "\t");
            }
            System.out.println();
        }
    }
    public static boolean existencia(int num , int[][] v,int x,int y) {
        for (int j = 0; j < v[x].length; j++) {
        	if(num == v[x][j] && y != j )
        		return true;
        }
		return false;
	}
}
