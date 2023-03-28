import java.util.Scanner;

public class P_5_1_10 {
    public static void main(String[] args) {
        //Declarar variables
        long num;
        //Crear obj de la clase Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Un número entero positivo de 10 cifras.");
        do {
            num = sc.nextLong();
        } while (num < Math.pow(10,9) || num >= Math.pow(10,11)-1);
        if (isCapicua(num)) {
            System.out.println("Es capicua");
        } else {
            System.out.println("No es capicua");
        }
    }
    public static boolean isCapicua(long num){
        long inverso = 0;
        long aux = num;
        long multiple10 = 1;
        while (aux!=0){
            inverso += aux % 10*multiple10;
            aux /=10;
            multiple10*=10;
        }
        System.out.println(inverso);
        return inverso == num;
    }
}
