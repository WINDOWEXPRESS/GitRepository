package Ejercicios;

public class P_5_1_2 {

	public static void main(String[] args) {
		//Declarar 3 array
		int[] vector1 = new int[15];
		int[] vector2 = new int[15];
		int[] vector3 = new int[15];
		for(int i = 0; i< vector1.length;i++) {
			vector1[i]=(int) (Math.random()*100);
			vector2[i]=(int) (Math.random()*100);
			vector3[i] =vector1[i]+vector2[i]; 
		}
		for(int x : vector1) {
			System.out.print(x+"\t");
		}
		System.out.println();
		for(int y : vector2) {
			System.out.print(y+"\t");
		}
		System.out.println();
		for(int z : vector3) {
			System.out.print(z+"\t");
		}

	}

}
