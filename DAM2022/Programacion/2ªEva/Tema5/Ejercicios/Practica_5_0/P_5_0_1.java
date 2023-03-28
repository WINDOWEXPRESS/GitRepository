public class P_5_0_1 {
    public static void main(String[] args) {
        int[] arrayEjemplo = new int[10];
        for (int i = 0; i < arrayEjemplo.length; i++) arrayEjemplo[i] = ((int) (Math.random() * 50) +1);
        for (int x : arrayEjemplo) System.out.println(x);
    }
}
