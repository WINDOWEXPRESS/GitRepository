import java.util.Scanner;
public class P_3_6_2 {

	public static void main(String[] args) {
		// Declarar variables
		int nTerminos = 0;
		int nTerminosCopia = 0;
		int terminoA = 0;
		int razonR = 0;
		int sumaTotal = 0;
		// Crear objeto de las clases
		Scanner dato = new Scanner(System.in);
		
		//Capturar datos
		System.out.print("N primeros términos de una progresión geométrica:");
		nTerminos = dato.nextInt();
		System.out.print("Término A:");
		terminoA = dato.nextInt();
		System.out.print("Razón R:");
		razonR = dato.nextInt();
		
		//calculo
		//formula				nTerminos = terminoA * (Math.pow(razonR,nTerminos-1));
		nTerminosCopia = nTerminos;	
		nTerminos = terminoA;
		System.out.print(nTerminos+"\t");
		sumaTotal = terminoA;
		for(int i = 2 ; i<=nTerminosCopia ; i++){
			nTerminos *= razonR; 
			sumaTotal += nTerminos;
			System.out.print(nTerminos+"\t");
		}
		System.out.println();
		System.out.println("El total es :"+sumaTotal);
	}
}
//System.out.println();
