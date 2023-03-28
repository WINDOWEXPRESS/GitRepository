package Ejercicios;

public class P_5_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declarar 3 array
		int[] array = new int[10];
		for(int i = 0; i< array.length;i++) {
			array[i]=(int) (Math.random()*100);
		}
		for(int x = 0; x< array.length;x++) {
			if (array[x]%2 == 0) {
				System.out.println("Numero : "+array[x]+" en el posicion : "+x);
			}
		}
	}
}
