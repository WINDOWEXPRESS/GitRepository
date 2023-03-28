public class P_3_6_1 {

	public static void main(String[] args) {
		// Declarar variables
		int potencia = 2;

		// Mostrar las potencias enteras de 2 de 0 a 9.
		for(int i = 0 ; i<10 ; i++){
			System.out.print("2^"+i+"="+Math.pow(2,i)+" \t\t");
			if(i == 4)
				System.out.println();
		}

	}
}
//System.out.println();
