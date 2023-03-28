package Ejercicios;
import java.util.Scanner;
/**
 *
 * @author Zhouyi
 */
public class P_3_7_1 {
    public static void main(String[]Args){
        //declarar variables 
        int n ;
        int m ;
        int r ;
        //Crear el objeto de la clase scanner
        Scanner dato = new Scanner(System.in);
        //capturar datos
        do {
        	System.out.println("Calculadora del maximo comun divisor.");
        	System.out.println("Introducir primer numero:");
        	n = dato.nextInt();
        	System.out.println("Introducir segundo numero:");
        	m = dato.nextInt();
        }while(n <0 && m < 0);

        //calculo del M.C.D
        while(n % m != 0) {
        	if(n % m != 0) {
        		r = n % m;
            	n = m;
            	m = r;
        	}
        }
        if(n % m == 0){
        		n = m;
        	}
        //Mostrar mensaje 
        System.out.println("El M.C.D es "+n);
    }
    
}
